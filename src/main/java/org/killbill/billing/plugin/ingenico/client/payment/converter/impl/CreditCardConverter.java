/*
 * Copyright 2014-2016 Groupon, Inc
 * Copyright 2014-2016 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.killbill.billing.plugin.ingenico.client.payment.converter.impl;

import org.killbill.billing.plugin.ingenico.client.model.PaymentInfo;
import org.killbill.billing.plugin.ingenico.client.model.paymentinfo.Card;
import org.killbill.billing.plugin.ingenico.client.payment.converter.PaymentInfoConverter;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.Address;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.CardWithoutCvv;
import com.ingenico.connect.gateway.sdk.java.domain.payment.CreatePaymentRequest;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.CardPaymentMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.token.CreateTokenRequest;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.CustomerToken;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.TokenCard;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.TokenCardData;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.TokenNonSepaDirectDebit;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.TokenSepaDirectDebit;

public class CreditCardConverter extends PaymentInfoConverter<Card> {

    @Override
    public boolean supportsPaymentInfo(final PaymentInfo paymentInfo) {
        return paymentInfo instanceof Card;
    }

    @Override
    public CreatePaymentRequest convertPaymentInfoToPaymentRequest(final Card paymentInfo) {
        com.ingenico.connect.gateway.sdk.java.domain.definitions.Card card = new com.ingenico.connect.gateway.sdk.java.domain.definitions.Card();
        card.setCardNumber(paymentInfo.getNumber());
        card.setCardholderName(paymentInfo.getHolderName());
        card.setCvv(paymentInfo.getCvc());
        card.setExpiryDate(paymentInfo.getExpiryDate());

        CardPaymentMethodSpecificInput cardPaymentMethodSpecificInput = new CardPaymentMethodSpecificInput();
        cardPaymentMethodSpecificInput.setCard(card);

        //TODO: Check what to set here
        cardPaymentMethodSpecificInput.setToken(paymentInfo.getToken());
        cardPaymentMethodSpecificInput.setIsRecurring(false);
        //cardPaymentMethodSpecificInput.setRecurringPaymentSequenceIndicator("recurring|first");

        cardPaymentMethodSpecificInput.setPaymentProductId(paymentInfo.getPaymentProductId());
        cardPaymentMethodSpecificInput.setSkipAuthentication(!(cardPaymentMethodSpecificInput.getIsRecurring() && cardPaymentMethodSpecificInput.getRecurringPaymentSequenceIndicator() == "recurring"));

        final CreatePaymentRequest ingenicoRequest = super.convertPaymentInfoToPaymentRequest(paymentInfo);
        ingenicoRequest.setCardPaymentMethodSpecificInput(cardPaymentMethodSpecificInput);

        return ingenicoRequest;
    }

    @Override
    public CreateTokenRequest convertPaymentInfoToCreateTokenRequest(final Card paymentInfo) {
        final CreateTokenRequest ingenicoRequest = super.convertPaymentInfoToCreateTokenRequest(paymentInfo);

        if (paymentInfo.getNumber() != null) {
            CardWithoutCvv cardWithoutCvv = new CardWithoutCvv();
            cardWithoutCvv.setCardNumber(paymentInfo.getNumber());
            cardWithoutCvv.setCardholderName(paymentInfo.getHolderName());
            cardWithoutCvv.setExpiryDate(paymentInfo.getExpiryDate());

            TokenCard tokenCard = new TokenCard();
            TokenCardData tokenCardData = new TokenCardData();
            tokenCardData.setCardWithoutCvv(cardWithoutCvv);
            tokenCard.setData(tokenCardData);
            ingenicoRequest.setCard(tokenCard);
        }


        ingenicoRequest.setPaymentProductId(paymentInfo.getPaymentProductId());

        return ingenicoRequest;
    }
}
