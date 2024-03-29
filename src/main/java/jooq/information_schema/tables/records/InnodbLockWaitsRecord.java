/*
 * This file is generated by jOOQ.
 */
package jooq.information_schema.tables.records;


import javax.annotation.Generated;

import jooq.information_schema.tables.InnodbLockWaits;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbLockWaitsRecord extends TableRecordImpl<InnodbLockWaitsRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = 1014375823;

    /**
     * Setter for <code>information_schema.INNODB_LOCK_WAITS.requesting_trx_id</code>.
     */
    public void setRequestingTrxId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_LOCK_WAITS.requesting_trx_id</code>.
     */
    public String getRequestingTrxId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.INNODB_LOCK_WAITS.requested_lock_id</code>.
     */
    public void setRequestedLockId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_LOCK_WAITS.requested_lock_id</code>.
     */
    public String getRequestedLockId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.INNODB_LOCK_WAITS.blocking_trx_id</code>.
     */
    public void setBlockingTrxId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_LOCK_WAITS.blocking_trx_id</code>.
     */
    public String getBlockingTrxId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.INNODB_LOCK_WAITS.blocking_lock_id</code>.
     */
    public void setBlockingLockId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_LOCK_WAITS.blocking_lock_id</code>.
     */
    public String getBlockingLockId() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return InnodbLockWaits.INNODB_LOCK_WAITS.REQUESTING_TRX_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return InnodbLockWaits.INNODB_LOCK_WAITS.REQUESTED_LOCK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return InnodbLockWaits.INNODB_LOCK_WAITS.BLOCKING_TRX_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return InnodbLockWaits.INNODB_LOCK_WAITS.BLOCKING_LOCK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getRequestingTrxId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getRequestedLockId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getBlockingTrxId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getBlockingLockId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getRequestingTrxId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getRequestedLockId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getBlockingTrxId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getBlockingLockId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbLockWaitsRecord value1(String value) {
        setRequestingTrxId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbLockWaitsRecord value2(String value) {
        setRequestedLockId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbLockWaitsRecord value3(String value) {
        setBlockingTrxId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbLockWaitsRecord value4(String value) {
        setBlockingLockId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbLockWaitsRecord values(String value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbLockWaitsRecord
     */
    public InnodbLockWaitsRecord() {
        super(InnodbLockWaits.INNODB_LOCK_WAITS);
    }

    /**
     * Create a detached, initialised InnodbLockWaitsRecord
     */
    public InnodbLockWaitsRecord(String requestingTrxId, String requestedLockId, String blockingTrxId, String blockingLockId) {
        super(InnodbLockWaits.INNODB_LOCK_WAITS);

        set(0, requestingTrxId);
        set(1, requestedLockId);
        set(2, blockingTrxId);
        set(3, blockingLockId);
    }
}
