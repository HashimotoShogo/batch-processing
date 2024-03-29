/*
 * This file is generated by jOOQ.
 */
package jooq.mysql.tables.records;


import javax.annotation.Generated;

import jooq.mysql.tables.GtidExecuted;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class GtidExecutedRecord extends UpdatableRecordImpl<GtidExecutedRecord> implements Record3<String, Long, Long> {

    private static final long serialVersionUID = 373936376;

    /**
     * Setter for <code>mysql.gtid_executed.source_uuid</code>. uuid of the source where the transaction was originally executed.
     */
    public void setSourceUuid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mysql.gtid_executed.source_uuid</code>. uuid of the source where the transaction was originally executed.
     */
    public String getSourceUuid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mysql.gtid_executed.interval_start</code>. First number of interval.
     */
    public void setIntervalStart(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>mysql.gtid_executed.interval_start</code>. First number of interval.
     */
    public Long getIntervalStart() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>mysql.gtid_executed.interval_end</code>. Last number of interval.
     */
    public void setIntervalEnd(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>mysql.gtid_executed.interval_end</code>. Last number of interval.
     */
    public Long getIntervalEnd() {
        return (Long) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<String, Long> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, Long, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, Long, Long> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return GtidExecuted.GTID_EXECUTED.SOURCE_UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return GtidExecuted.GTID_EXECUTED.INTERVAL_START;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return GtidExecuted.GTID_EXECUTED.INTERVAL_END;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getSourceUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getIntervalStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getIntervalEnd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getSourceUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getIntervalStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getIntervalEnd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtidExecutedRecord value1(String value) {
        setSourceUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtidExecutedRecord value2(Long value) {
        setIntervalStart(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtidExecutedRecord value3(Long value) {
        setIntervalEnd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtidExecutedRecord values(String value1, Long value2, Long value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GtidExecutedRecord
     */
    public GtidExecutedRecord() {
        super(GtidExecuted.GTID_EXECUTED);
    }

    /**
     * Create a detached, initialised GtidExecutedRecord
     */
    public GtidExecutedRecord(String sourceUuid, Long intervalStart, Long intervalEnd) {
        super(GtidExecuted.GTID_EXECUTED);

        set(0, sourceUuid);
        set(1, intervalStart);
        set(2, intervalEnd);
    }
}
