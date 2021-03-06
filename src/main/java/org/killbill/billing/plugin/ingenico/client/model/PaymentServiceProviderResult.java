/*
 * Copyright 2014 Groupon, Inc
 *
 * Groupon licenses this file to you under the Apache License, version 2.0
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

package org.killbill.billing.plugin.ingenico.client.model;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.killbill.billing.payment.api.Payment;
import org.killbill.billing.payment.api.TransactionType;

public enum PaymentServiceProviderResult {

    AUTHORISED(new String[] {"CAPTURED", "CANCELLED", "REFUNDED", "CHARGEBACKED", "REVERSED", "PAID", "ACCOUNT_VERIFIED"}),
    REDIRECT_SHOPPER("REDIRECTED"), // authorize return code when using 3D-Secure
    RECEIVED(new String[]{"CREATED", "AUTHORIZATION_REQUESTED", "CAPTURE_REQUESTED"}), // direct debit, ideal payment response
    REFUSED(new String[] {"REJECTED_CAPTURE", "REJECTED"}),
    PENDING(new String[]{"PENDING_APPROVAL", "PENDING_PAYMENT", "PENDING_FRAUD_APPROVAL"}),
    ERROR(new String[]{"Error", "[error]"}),
    CANCELLED("");

    private static final Map<String, PaymentServiceProviderResult> REVERSE_LOOKUP = new HashMap<String, PaymentServiceProviderResult>();

    static {
        for (final PaymentServiceProviderResult providerResult : PaymentServiceProviderResult.values()) {
            for (final String response : providerResult.getResponses()) {
                REVERSE_LOOKUP.put(response, providerResult);
            }
        }
    }

    private final String[] responses;

    PaymentServiceProviderResult(final String response) {
        this(new String[]{response});
    }

    PaymentServiceProviderResult(final String[] responses) {
        this.responses = responses;
    }

    public static PaymentServiceProviderResult getPaymentResultForId(@Nullable final String id, final TransactionType transactionType) {
        if (id == null) {
            return ERROR;
        }

        PaymentServiceProviderResult result = REVERSE_LOOKUP.get(id);
        if (result != null) {
            if ((transactionType == TransactionType.AUTHORIZE
                 || transactionType == TransactionType.CAPTURE)
                    && id.equals("PENDING_APPROVAL")) {
                return PaymentServiceProviderResult.AUTHORISED;
            }

            return result;
        } else {
            throw new IllegalArgumentException("Unknown PaymentResultType id: " + id);
        }
    }

    public String[] getResponses() {
        return responses;
    }

    @Override
    public String toString() {
        return this.responses[0];
    }
}
