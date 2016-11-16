/**
 * This class is generated by jOOQ
 */
package org.killbill.billing.plugin.ingenico.dao.gen.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.0"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IngenicoResponsesRecord extends org.jooq.impl.UpdatableRecordImpl<org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoResponsesRecord> implements org.jooq.Record20<org.jooq.types.UInteger, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.String> {

	private static final long serialVersionUID = 635522007;

	/**
	 * Setter for <code>killbill.ingenico_responses.record_id</code>.
	 */
	public void setRecordId(org.jooq.types.UInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>killbill.ingenico_responses.record_id</code>.
	 */
	public org.jooq.types.UInteger getRecordId() {
		return (org.jooq.types.UInteger) getValue(0);
	}

	/**
	 * Setter for <code>killbill.ingenico_responses.kb_account_id</code>.
	 */
	public void setKbAccountId(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>killbill.ingenico_responses.kb_account_id</code>.
	 */
	public java.lang.String getKbAccountId() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>killbill.ingenico_responses.kb_payment_id</code>.
	 */
	public void setKbPaymentId(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>killbill.ingenico_responses.kb_payment_id</code>.
	 */
	public java.lang.String getKbPaymentId() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>killbill.ingenico_responses.kb_payment_transaction_id</code>.
	 */
	public void setKbPaymentTransactionId(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>killbill.ingenico_responses.kb_payment_transaction_id</code>.
	 */
	public java.lang.String getKbPaymentTransactionId() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>killbill.ingenico_responses.transaction_type</code>.
	 */
	public void setTransactionType(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>killbill.ingenico_responses.transaction_type</code>.
	 */
	public java.lang.String getTransactionType() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>killbill.ingenico_responses.amount</code>.
	 */
	public void setAmount(java.math.BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>killbill.ingenico_responses.amount</code>.
	 */
	public java.math.BigDecimal getAmount() {
		return (java.math.BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>killbill.ingenico_responses.currency</code>.
	 */
	public void setCurrency(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>killbill.ingenico_responses.currency</code>.
	 */
	public java.lang.String getCurrency() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>killbill.ingenico_responses.pg_merchant_id</code>.
	 */
	public void setPgMerchantId(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>killbill.ingenico_responses.pg_merchant_id</code>.
	 */
	public java.lang.String getPgMerchantId() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>killbill.ingenico_responses.pg_product_id</code>.
	 */
	public void setPgProductId(java.lang.Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>killbill.ingenico_responses.pg_product_id</code>.
	 */
	public java.lang.Integer getPgProductId() {
		return (java.lang.Integer) getValue(8);
	}

	/**
	 * Setter for <code>killbill.ingenico_responses.pg_status</code>.
	 */
	public void setPgStatus(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>killbill.ingenico_responses.pg_status</code>.
	 */
	public java.lang.String getPgStatus() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>killbill.ingenico_responses.pg_transaction_method</code>.
	 */
	public void setPgTransactionMethod(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>killbill.ingenico_responses.pg_transaction_method</code>.
	 */
	public java.lang.String getPgTransactionMethod() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>killbill.ingenico_responses.pg_reference</code>.
	 */
	public void setPgReference(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>killbill.ingenico_responses.pg_reference</code>.
	 */
	public java.lang.String getPgReference() {
		return (java.lang.String) getValue(11);
	}

	/**
	 * Setter for <code>killbill.ingenico_responses.pg_authorization_code</code>.
	 */
	public void setPgAuthorizationCode(java.lang.String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>killbill.ingenico_responses.pg_authorization_code</code>.
	 */
	public java.lang.String getPgAuthorizationCode() {
		return (java.lang.String) getValue(12);
	}

	/**
	 * Setter for <code>killbill.ingenico_responses.pg_error_code</code>.
	 */
	public void setPgErrorCode(java.lang.String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>killbill.ingenico_responses.pg_error_code</code>.
	 */
	public java.lang.String getPgErrorCode() {
		return (java.lang.String) getValue(13);
	}

	/**
	 * Setter for <code>killbill.ingenico_responses.pg_error_message</code>.
	 */
	public void setPgErrorMessage(java.lang.String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>killbill.ingenico_responses.pg_error_message</code>.
	 */
	public java.lang.String getPgErrorMessage() {
		return (java.lang.String) getValue(14);
	}

	/**
	 * Setter for <code>killbill.ingenico_responses.pg_fraud_avs_result</code>.
	 */
	public void setPgFraudAvsResult(java.lang.String value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>killbill.ingenico_responses.pg_fraud_avs_result</code>.
	 */
	public java.lang.String getPgFraudAvsResult() {
		return (java.lang.String) getValue(15);
	}

	/**
	 * Setter for <code>killbill.ingenico_responses.pg_fraud_cvv_result</code>.
	 */
	public void setPgFraudCvvResult(java.lang.String value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>killbill.ingenico_responses.pg_fraud_cvv_result</code>.
	 */
	public java.lang.String getPgFraudCvvResult() {
		return (java.lang.String) getValue(16);
	}

	/**
	 * Setter for <code>killbill.ingenico_responses.pg_fraud_result</code>.
	 */
	public void setPgFraudResult(java.lang.String value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>killbill.ingenico_responses.pg_fraud_result</code>.
	 */
	public java.lang.String getPgFraudResult() {
		return (java.lang.String) getValue(17);
	}

	/**
	 * Setter for <code>killbill.ingenico_responses.created_date</code>.
	 */
	public void setCreatedDate(java.sql.Timestamp value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>killbill.ingenico_responses.created_date</code>.
	 */
	public java.sql.Timestamp getCreatedDate() {
		return (java.sql.Timestamp) getValue(18);
	}

	/**
	 * Setter for <code>killbill.ingenico_responses.kb_tenant_id</code>.
	 */
	public void setKbTenantId(java.lang.String value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>killbill.ingenico_responses.kb_tenant_id</code>.
	 */
	public java.lang.String getKbTenantId() {
		return (java.lang.String) getValue(19);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<org.jooq.types.UInteger> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record20 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row20<org.jooq.types.UInteger, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.String> fieldsRow() {
		return (org.jooq.Row20) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row20<org.jooq.types.UInteger, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.String> valuesRow() {
		return (org.jooq.Row20) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UInteger> field1() {
		return org.killbill.billing.plugin.ingenico.dao.gen.tables.IngenicoResponses.INGENICO_RESPONSES.RECORD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.killbill.billing.plugin.ingenico.dao.gen.tables.IngenicoResponses.INGENICO_RESPONSES.KB_ACCOUNT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.killbill.billing.plugin.ingenico.dao.gen.tables.IngenicoResponses.INGENICO_RESPONSES.KB_PAYMENT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.killbill.billing.plugin.ingenico.dao.gen.tables.IngenicoResponses.INGENICO_RESPONSES.KB_PAYMENT_TRANSACTION_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.killbill.billing.plugin.ingenico.dao.gen.tables.IngenicoResponses.INGENICO_RESPONSES.TRANSACTION_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field6() {
		return org.killbill.billing.plugin.ingenico.dao.gen.tables.IngenicoResponses.INGENICO_RESPONSES.AMOUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return org.killbill.billing.plugin.ingenico.dao.gen.tables.IngenicoResponses.INGENICO_RESPONSES.CURRENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return org.killbill.billing.plugin.ingenico.dao.gen.tables.IngenicoResponses.INGENICO_RESPONSES.PG_MERCHANT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field9() {
		return org.killbill.billing.plugin.ingenico.dao.gen.tables.IngenicoResponses.INGENICO_RESPONSES.PG_PRODUCT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return org.killbill.billing.plugin.ingenico.dao.gen.tables.IngenicoResponses.INGENICO_RESPONSES.PG_STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return org.killbill.billing.plugin.ingenico.dao.gen.tables.IngenicoResponses.INGENICO_RESPONSES.PG_TRANSACTION_METHOD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field12() {
		return org.killbill.billing.plugin.ingenico.dao.gen.tables.IngenicoResponses.INGENICO_RESPONSES.PG_REFERENCE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field13() {
		return org.killbill.billing.plugin.ingenico.dao.gen.tables.IngenicoResponses.INGENICO_RESPONSES.PG_AUTHORIZATION_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field14() {
		return org.killbill.billing.plugin.ingenico.dao.gen.tables.IngenicoResponses.INGENICO_RESPONSES.PG_ERROR_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field15() {
		return org.killbill.billing.plugin.ingenico.dao.gen.tables.IngenicoResponses.INGENICO_RESPONSES.PG_ERROR_MESSAGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field16() {
		return org.killbill.billing.plugin.ingenico.dao.gen.tables.IngenicoResponses.INGENICO_RESPONSES.PG_FRAUD_AVS_RESULT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field17() {
		return org.killbill.billing.plugin.ingenico.dao.gen.tables.IngenicoResponses.INGENICO_RESPONSES.PG_FRAUD_CVV_RESULT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field18() {
		return org.killbill.billing.plugin.ingenico.dao.gen.tables.IngenicoResponses.INGENICO_RESPONSES.PG_FRAUD_RESULT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field19() {
		return org.killbill.billing.plugin.ingenico.dao.gen.tables.IngenicoResponses.INGENICO_RESPONSES.CREATED_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field20() {
		return org.killbill.billing.plugin.ingenico.dao.gen.tables.IngenicoResponses.INGENICO_RESPONSES.KB_TENANT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UInteger value1() {
		return getRecordId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getKbAccountId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getKbPaymentId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getKbPaymentTransactionId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getTransactionType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value6() {
		return getAmount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getCurrency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getPgMerchantId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value9() {
		return getPgProductId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getPgStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getPgTransactionMethod();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value12() {
		return getPgReference();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value13() {
		return getPgAuthorizationCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value14() {
		return getPgErrorCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value15() {
		return getPgErrorMessage();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value16() {
		return getPgFraudAvsResult();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value17() {
		return getPgFraudCvvResult();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value18() {
		return getPgFraudResult();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value19() {
		return getCreatedDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value20() {
		return getKbTenantId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IngenicoResponsesRecord value1(org.jooq.types.UInteger value) {
		setRecordId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IngenicoResponsesRecord value2(java.lang.String value) {
		setKbAccountId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IngenicoResponsesRecord value3(java.lang.String value) {
		setKbPaymentId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IngenicoResponsesRecord value4(java.lang.String value) {
		setKbPaymentTransactionId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IngenicoResponsesRecord value5(java.lang.String value) {
		setTransactionType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IngenicoResponsesRecord value6(java.math.BigDecimal value) {
		setAmount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IngenicoResponsesRecord value7(java.lang.String value) {
		setCurrency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IngenicoResponsesRecord value8(java.lang.String value) {
		setPgMerchantId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IngenicoResponsesRecord value9(java.lang.Integer value) {
		setPgProductId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IngenicoResponsesRecord value10(java.lang.String value) {
		setPgStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IngenicoResponsesRecord value11(java.lang.String value) {
		setPgTransactionMethod(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IngenicoResponsesRecord value12(java.lang.String value) {
		setPgReference(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IngenicoResponsesRecord value13(java.lang.String value) {
		setPgAuthorizationCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IngenicoResponsesRecord value14(java.lang.String value) {
		setPgErrorCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IngenicoResponsesRecord value15(java.lang.String value) {
		setPgErrorMessage(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IngenicoResponsesRecord value16(java.lang.String value) {
		setPgFraudAvsResult(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IngenicoResponsesRecord value17(java.lang.String value) {
		setPgFraudCvvResult(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IngenicoResponsesRecord value18(java.lang.String value) {
		setPgFraudResult(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IngenicoResponsesRecord value19(java.sql.Timestamp value) {
		setCreatedDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IngenicoResponsesRecord value20(java.lang.String value) {
		setKbTenantId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IngenicoResponsesRecord values(org.jooq.types.UInteger value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.math.BigDecimal value6, java.lang.String value7, java.lang.String value8, java.lang.Integer value9, java.lang.String value10, java.lang.String value11, java.lang.String value12, java.lang.String value13, java.lang.String value14, java.lang.String value15, java.lang.String value16, java.lang.String value17, java.lang.String value18, java.sql.Timestamp value19, java.lang.String value20) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached IngenicoResponsesRecord
	 */
	public IngenicoResponsesRecord() {
		super(org.killbill.billing.plugin.ingenico.dao.gen.tables.IngenicoResponses.INGENICO_RESPONSES);
	}

	/**
	 * Create a detached, initialised IngenicoResponsesRecord
	 */
	public IngenicoResponsesRecord(org.jooq.types.UInteger recordId, java.lang.String kbAccountId, java.lang.String kbPaymentId, java.lang.String kbPaymentTransactionId, java.lang.String transactionType, java.math.BigDecimal amount, java.lang.String currency, java.lang.String pgMerchantId, java.lang.Integer pgProductId, java.lang.String pgStatus, java.lang.String pgTransactionMethod, java.lang.String pgReference, java.lang.String pgAuthorizationCode, java.lang.String pgErrorCode, java.lang.String pgErrorMessage, java.lang.String pgFraudAvsResult, java.lang.String pgFraudCvvResult, java.lang.String pgFraudResult, java.sql.Timestamp createdDate, java.lang.String kbTenantId) {
		super(org.killbill.billing.plugin.ingenico.dao.gen.tables.IngenicoResponses.INGENICO_RESPONSES);

		setValue(0, recordId);
		setValue(1, kbAccountId);
		setValue(2, kbPaymentId);
		setValue(3, kbPaymentTransactionId);
		setValue(4, transactionType);
		setValue(5, amount);
		setValue(6, currency);
		setValue(7, pgMerchantId);
		setValue(8, pgProductId);
		setValue(9, pgStatus);
		setValue(10, pgTransactionMethod);
		setValue(11, pgReference);
		setValue(12, pgAuthorizationCode);
		setValue(13, pgErrorCode);
		setValue(14, pgErrorMessage);
		setValue(15, pgFraudAvsResult);
		setValue(16, pgFraudCvvResult);
		setValue(17, pgFraudResult);
		setValue(18, createdDate);
		setValue(19, kbTenantId);
	}
}
