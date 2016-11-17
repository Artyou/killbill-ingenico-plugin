/**
 * This class is generated by jOOQ
 */
package org.killbill.billing.plugin.ingenico.dao.gen.tables;

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
public class IngenicoResponses extends org.jooq.impl.TableImpl<org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoResponsesRecord> {

	private static final long serialVersionUID = 1548555830;

	/**
	 * The reference instance of <code>killbill.ingenico_responses</code>
	 */
	public static final org.killbill.billing.plugin.ingenico.dao.gen.tables.IngenicoResponses INGENICO_RESPONSES = new org.killbill.billing.plugin.ingenico.dao.gen.tables.IngenicoResponses();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoResponsesRecord> getRecordType() {
		return org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoResponsesRecord.class;
	}

	/**
	 * The column <code>killbill.ingenico_responses.record_id</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoResponsesRecord, org.jooq.types.UInteger> RECORD_ID = createField("record_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>killbill.ingenico_responses.kb_account_id</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoResponsesRecord, java.lang.String> KB_ACCOUNT_ID = createField("kb_account_id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

	/**
	 * The column <code>killbill.ingenico_responses.kb_payment_id</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoResponsesRecord, java.lang.String> KB_PAYMENT_ID = createField("kb_payment_id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

	/**
	 * The column <code>killbill.ingenico_responses.kb_payment_transaction_id</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoResponsesRecord, java.lang.String> KB_PAYMENT_TRANSACTION_ID = createField("kb_payment_transaction_id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

	/**
	 * The column <code>killbill.ingenico_responses.transaction_type</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoResponsesRecord, java.lang.String> TRANSACTION_TYPE = createField("transaction_type", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

	/**
	 * The column <code>killbill.ingenico_responses.amount</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoResponsesRecord, java.math.BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.DECIMAL.precision(15, 9), this, "");

	/**
	 * The column <code>killbill.ingenico_responses.currency</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoResponsesRecord, java.lang.String> CURRENCY = createField("currency", org.jooq.impl.SQLDataType.CHAR.length(3), this, "");

	/**
	 * The column <code>killbill.ingenico_responses.pg_merchant_id</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoResponsesRecord, java.lang.String> PG_MERCHANT_ID = createField("pg_merchant_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>killbill.ingenico_responses.pg_transaction_id</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoResponsesRecord, java.lang.String> PG_TRANSACTION_ID = createField("pg_transaction_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>killbill.ingenico_responses.pg_status</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoResponsesRecord, java.lang.String> PG_STATUS = createField("pg_status", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>killbill.ingenico_responses.pg_transaction_method</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoResponsesRecord, java.lang.String> PG_TRANSACTION_METHOD = createField("pg_transaction_method", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>killbill.ingenico_responses.pg_reference</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoResponsesRecord, java.lang.String> PG_REFERENCE = createField("pg_reference", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>killbill.ingenico_responses.pg_authorization_code</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoResponsesRecord, java.lang.String> PG_AUTHORIZATION_CODE = createField("pg_authorization_code", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>killbill.ingenico_responses.pg_product_id</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoResponsesRecord, java.lang.Integer> PG_PRODUCT_ID = createField("pg_product_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>killbill.ingenico_responses.pg_error_code</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoResponsesRecord, java.lang.String> PG_ERROR_CODE = createField("pg_error_code", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>killbill.ingenico_responses.pg_error_message</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoResponsesRecord, java.lang.String> PG_ERROR_MESSAGE = createField("pg_error_message", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>killbill.ingenico_responses.pg_fraud_avs_result</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoResponsesRecord, java.lang.String> PG_FRAUD_AVS_RESULT = createField("pg_fraud_avs_result", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>killbill.ingenico_responses.pg_fraud_cvv_result</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoResponsesRecord, java.lang.String> PG_FRAUD_CVV_RESULT = createField("pg_fraud_cvv_result", org.jooq.impl.SQLDataType.CHAR.length(1), this, "");

	/**
	 * The column <code>killbill.ingenico_responses.pg_fraud_result</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoResponsesRecord, java.lang.String> PG_FRAUD_RESULT = createField("pg_fraud_result", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>killbill.ingenico_responses.created_date</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoResponsesRecord, java.sql.Timestamp> CREATED_DATE = createField("created_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

	/**
	 * The column <code>killbill.ingenico_responses.kb_tenant_id</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoResponsesRecord, java.lang.String> KB_TENANT_ID = createField("kb_tenant_id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

	/**
	 * Create a <code>killbill.ingenico_responses</code> table reference
	 */
	public IngenicoResponses() {
		this("ingenico_responses", null);
	}

	/**
	 * Create an aliased <code>killbill.ingenico_responses</code> table reference
	 */
	public IngenicoResponses(java.lang.String alias) {
		this(alias, org.killbill.billing.plugin.ingenico.dao.gen.tables.IngenicoResponses.INGENICO_RESPONSES);
	}

	private IngenicoResponses(java.lang.String alias, org.jooq.Table<org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoResponsesRecord> aliased) {
		this(alias, aliased, null);
	}

	private IngenicoResponses(java.lang.String alias, org.jooq.Table<org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoResponsesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.killbill.billing.plugin.ingenico.dao.gen.Killbill.KILLBILL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoResponsesRecord, org.jooq.types.UInteger> getIdentity() {
		return org.killbill.billing.plugin.ingenico.dao.gen.Keys.IDENTITY_INGENICO_RESPONSES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoResponsesRecord> getPrimaryKey() {
		return org.killbill.billing.plugin.ingenico.dao.gen.Keys.KEY_INGENICO_RESPONSES_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoResponsesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoResponsesRecord>>asList(org.killbill.billing.plugin.ingenico.dao.gen.Keys.KEY_INGENICO_RESPONSES_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.killbill.billing.plugin.ingenico.dao.gen.tables.IngenicoResponses as(java.lang.String alias) {
		return new org.killbill.billing.plugin.ingenico.dao.gen.tables.IngenicoResponses(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.killbill.billing.plugin.ingenico.dao.gen.tables.IngenicoResponses rename(java.lang.String name) {
		return new org.killbill.billing.plugin.ingenico.dao.gen.tables.IngenicoResponses(name, null);
	}
}
