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

package org.killbill.billing.plugin.ingenico.client.payment.converter;

import org.killbill.billing.plugin.ingenico.client.model.PaymentInfo;

import com.google.common.base.Strings;
import com.ingenico.connect.gateway.sdk.java.domain.payment.CreatePaymentRequest;

public class PaymentInfoConverter<T extends PaymentInfo> {

    /**
     * @param paymentInfo to convert
     * @return {@code true} if this converter is capable of handling the payment info
     */
    public boolean supportsPaymentInfo(final PaymentInfo paymentInfo) {
        return true;
    }

    /**
     * Convert a PaymentInfo Object into an Adyen PaymentRequest
     */
    public CreatePaymentRequest convertPaymentInfoToPaymentRequest(final T paymentInfo) {
        return initializePaymentInfo(paymentInfo);
    }

    private CreatePaymentRequest initializePaymentInfo(final PaymentInfo paymentInfo) {
        final CreatePaymentRequest paymentRequest = new CreatePaymentRequest();

        setInstallments(paymentInfo, paymentRequest);
        setBillingAddress(paymentInfo, paymentRequest);
        setAcquirer(paymentInfo, paymentRequest);

        return paymentRequest;
    }

    private void setInstallments(final PaymentInfo paymentInfo, final CreatePaymentRequest paymentRequest) {
//        if (paymentInfo.getInstallments() != null) {
//            final Installments installments = new Installments();
//            installments.setValue(paymentInfo.getInstallments().shortValue());
//            paymentRequest.setInstallments(installments);
//        }
    }

    private void setBillingAddress(final PaymentInfo paymentInfo, final CreatePaymentRequest paymentRequest) {
//        final Address address = new Address();
//        address.setStreet(paymentInfo.getStreet());
//        address.setHouseNumberOrName(paymentInfo.getHouseNumberOrName());
//        address.setCity(paymentInfo.getCity());
//        address.setPostalCode(paymentInfo.getPostalCode());
//        address.setStateOrProvince(paymentInfo.getStateOrProvince());
//
//        // Passing UK will result in: validation 134 Billing address problem (Country UK invalid)
//        final String adjustedCountry = "UK".equalsIgnoreCase(paymentInfo.getCountry()) ? "GB" : paymentInfo.getCountry();
//        address.setCountry(adjustedCountry);
//
//        // Required by Adyen
//        if (address.getHouseNumberOrName() != null && address.getCity() != null) {
//            paymentRequest.setBillingAddress(address);
//        }
    }

    private void setAcquirer(final PaymentInfo paymentInfo, final CreatePaymentRequest paymentRequest) {
//        final String acquirerName = paymentInfo.getAcquirer();
//        if (acquirerName != null) {
//            final AnyType2AnyTypeMap.Entry acquirerCode = new AnyType2AnyTypeMap.Entry();
//            acquirerCode.setKey("acquirerCode");
//            acquirerCode.setValue(acquirerName);
//            paymentRequest.getAdditionalData().getEntry().add(acquirerCode);
//
//            // If the acquirer has an authorisationMid set it to the request too
//            final String mid = paymentInfo.getAcquirerMID();
//            if (!Strings.isNullOrEmpty(mid)) {
//                final AnyType2AnyTypeMap.Entry authorisationMid = new AnyType2AnyTypeMap.Entry();
//                authorisationMid.setKey("authorisationMid");
//                authorisationMid.setValue(mid);
//                paymentRequest.getAdditionalData().getEntry().add(authorisationMid);
//            }
//        }
    }
}
