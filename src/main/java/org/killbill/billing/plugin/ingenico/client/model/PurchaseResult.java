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

package org.killbill.billing.plugin.ingenico.client.model;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.ingenico.connect.gateway.sdk.java.domain.payment.CreatePaymentResponse;

import org.killbill.billing.plugin.ingenico.client.payment.service.IngenicoCallErrorStatus;
import org.killbill.billing.plugin.ingenico.client.payment.service.IngenicoCallResult;

import javax.annotation.Nullable;

import java.util.Map;

public class PurchaseResult {

    public static final String INGENICO_CALL_ERROR_STATUS = "ingenicoCallErrorStatus";
    public static final String EXCEPTION_CLASS = "exceptionClass";
    public static final String EXCEPTION_MESSAGE = "exceptionMessage";
    public static final String UNKNOWN = "";

    private final Optional<PaymentServiceProviderResult> result;
    private final String paymentId;
    private final String status;
    private final String paymentReference;
    private final String authorisationCode;
    private final String paymentTransactionExternalKey;
    private final String avsResult;
    private final String cvvResult;
    private final String fraudServiceResult;
    private final IngenicoCallErrorStatus ingenicoCallErrorStatus;
    private final Map<String, String> additionalData;

    public PurchaseResult(final PaymentServiceProviderResult result,
                          final String paymentId,
                          final String status,
                          final String paymentReference,
                          final String authorisationCode,
                          final String avsResult,
                          final String cvvResult,
                          final String fraudServiceResult,
                          final String paymentTransactionExternalKey,
                          final Map<String, String> additionalData) {
        this(Optional.of(result), paymentId, status, paymentReference, authorisationCode, avsResult, cvvResult, fraudServiceResult, paymentTransactionExternalKey, null, additionalData);
    }

    public PurchaseResult(final String paymentTransactionExternalKey,
                          final String paymentId,
                          final String status,
                          final IngenicoCallResult<CreatePaymentResponse> ingenicoCallResult) {
        this(Optional.<PaymentServiceProviderResult>absent(),
             paymentId,
             status,
             null,
             null,
             null,
             null,
             null,
             paymentTransactionExternalKey,
             ingenicoCallResult.getResponseStatus().isPresent() ? ingenicoCallResult.getResponseStatus().get() : null,
             ImmutableMap.<String, String>of(INGENICO_CALL_ERROR_STATUS, ingenicoCallResult.getResponseStatus().isPresent() ? ingenicoCallResult.getResponseStatus().get().name() : UNKNOWN,
                                             EXCEPTION_CLASS, ingenicoCallResult.getExceptionClass().isPresent() ? ingenicoCallResult.getExceptionClass().get() : UNKNOWN,
                                             EXCEPTION_MESSAGE, ingenicoCallResult.getExceptionMessage().isPresent() ? ingenicoCallResult.getExceptionMessage().get() : UNKNOWN));
    }


    public PurchaseResult(final Optional<PaymentServiceProviderResult> result,
                          final String paymentId,
                          final String status,
                          final String paymentReference,
                          final String authorisationCode,
                          final String avsResult,
                          final String cvvResult,
                          final String fraudServiceResult,
                          final String paymentTransactionExternalKey,
                          @Nullable final IngenicoCallErrorStatus ingenicoCallErrorStatus,
                          final Map<String, String> additionalData) {
        this.ingenicoCallErrorStatus = ingenicoCallErrorStatus;
        this.result = result;
        this.paymentId = paymentId;
        this.status = status;
        this.paymentReference = paymentReference;
        this.authorisationCode = authorisationCode;
        this.avsResult = avsResult;
        this.cvvResult = cvvResult;
        this.fraudServiceResult = fraudServiceResult;
        this.paymentTransactionExternalKey = paymentTransactionExternalKey;
        this.additionalData = additionalData;
    }

    public Optional<IngenicoCallErrorStatus> getIngenicoCallErrorStatus() {
        return Optional.fromNullable(ingenicoCallErrorStatus);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PurchaseResult{");
//        sb.append("result='").append(result.isPresent() ? result.get() : null).append('\'');
//        sb.append(", authCode='").append(authCode).append('\'');
//        sb.append(", pspReference='").append(pspReference).append('\'');
//        sb.append(", reason='").append(reason).append('\'');
//        sb.append(", resultCode='").append(resultCode).append('\'');
//        sb.append(", reference='").append(reference).append('\'');
//        sb.append(", paymentTransactionExternalKey='").append(paymentTransactionExternalKey).append('\'');
//        sb.append(", adyenCallErrorStatus=").append(adyenCallErrorStatus);
//        sb.append(", additionalData={");
//        // Make sure to escape values, as they may contain spaces (e.g. avsResult='4 AVS not supported for this card type')
//        final Iterator<String> iterator = additionalData.keySet().iterator();
//        if (iterator.hasNext()) {
//            final String key = iterator.next();
//            sb.append(key).append("='").append(additionalData.get(key)).append("'");
//        }
//        while (iterator.hasNext()) {
//            final String key = iterator.next();
//            sb.append(", ")
//              .append(key)
//              .append("='")
//              .append(additionalData.get(key))
//              .append("'");
//        }
//        sb.append("}}");
        return sb.toString();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final PurchaseResult that = (PurchaseResult) o;

//        if (result != null ? !result.equals(that.result) : that.result != null) {
//            return false;
//        }
//        if (authCode != null ? !authCode.equals(that.authCode) : that.authCode != null) {
//            return false;
//        }
//        if (pspReference != null ? !pspReference.equals(that.pspReference) : that.pspReference != null) {
//            return false;
//        }
//        if (reason != null ? !reason.equals(that.reason) : that.reason != null) {
//            return false;
//        }
//        if (resultCode != null ? !resultCode.equals(that.resultCode) : that.resultCode != null) {
//            return false;
//        }
//        if (reference != null ? !reference.equals(that.reference) : that.reference != null) {
//            return false;
//        }
//        if (adyenCallErrorStatus != null ? !adyenCallErrorStatus.equals(that.adyenCallErrorStatus) : that.adyenCallErrorStatus != null) {
//            return false;
//        }
        //noinspection SimplifiableIfStatement
//        if (additionalData != null ? !additionalData.equals(that.additionalData) : that.additionalData != null) {
//            return false;
//        }
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
//        int result1 = result != null ? result.hashCode() : 0;
//        result1 = 31 * result1 + (authCode != null ? authCode.hashCode() : 0);
//        result1 = 31 * result1 + (pspReference != null ? pspReference.hashCode() : 0);
//        result1 = 31 * result1 + (reason != null ? reason.hashCode() : 0);
//        result1 = 31 * result1 + (resultCode != null ? resultCode.hashCode() : 0);
//        result1 = 31 * result1 + (reference != null ? reference.hashCode() : 0);
//        result1 = 31 * result1 + (paymentTransactionExternalKey != null ? paymentTransactionExternalKey.hashCode() : 0);
//        //result1 = 31 * result1 + (adyenCallErrorStatus != null ? adyenCallErrorStatus.hashCode() : 0);
//        result1 = 31 * result1 + (additionalData != null ? additionalData.hashCode() : 0);
//        return result1;
    }


    public Optional<PaymentServiceProviderResult> getResult() {
        return result;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public String getStatus() {
        return status;
    }

    public String getPaymentReference() {
        return paymentReference;
    }

    public String getAuthorizationCode() {
        return authorisationCode;
    }

    public String getPgFraudAvsResult() {
        return avsResult;
    }

    public String getPgFraudCvvResult() {
        return cvvResult;
    }

    public String getPgFraudResult() {
        return fraudServiceResult;
    }

    public String getPgErrorCode() {
        return "";
    }

    public String getPgErrorMessage() {
        return "";
    }

    public String getPaymentTransactionExternalKey() {
        return paymentTransactionExternalKey;
    }

    public Map<String, String> getAdditionalData() {
        return additionalData;
    }
}
