package org.killbill.billing.plugin.ingenico.api;

import java.util.UUID;

import org.killbill.billing.plugin.api.payment.PluginPaymentMethodPlugin;
import org.killbill.billing.plugin.ingenico.dao.IngenicoDao;
import org.killbill.billing.plugin.ingenico.dao.gen.tables.records.IngenicoPaymentMethodsRecord;

/**
 * Created by otaviosoares on 15/11/16.
 */
public class IngenicoPaymentMethodPlugin extends PluginPaymentMethodPlugin {
    public IngenicoPaymentMethodPlugin(IngenicoPaymentMethodsRecord record) {
        super(record.getKbPaymentMethodId() == null ? null : UUID.fromString(record.getKbPaymentMethodId()),
                record.getToken(),
                (record.getIsDefault() != null) && IngenicoDao.TRUE == record.getIsDefault(),
                IngenicoModelPluginBase.buildPluginProperties(record.getAdditionalData()));
    }
}
