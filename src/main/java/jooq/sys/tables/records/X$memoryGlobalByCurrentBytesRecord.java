/*
 * This file is generated by jOOQ.
 */
package jooq.sys.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import jooq.sys.tables.X$memoryGlobalByCurrentBytes;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class X$memoryGlobalByCurrentBytesRecord extends TableRecordImpl<X$memoryGlobalByCurrentBytesRecord> implements Record7<String, Long, Long, BigDecimal, Long, Long, BigDecimal> {

    private static final long serialVersionUID = -1313848455;

    /**
     * Setter for <code>sys.x$memory_global_by_current_bytes.event_name</code>.
     */
    public void setEventName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.x$memory_global_by_current_bytes.event_name</code>.
     */
    public String getEventName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.x$memory_global_by_current_bytes.current_count</code>.
     */
    public void setCurrentCount(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.x$memory_global_by_current_bytes.current_count</code>.
     */
    public Long getCurrentCount() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>sys.x$memory_global_by_current_bytes.current_alloc</code>.
     */
    public void setCurrentAlloc(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.x$memory_global_by_current_bytes.current_alloc</code>.
     */
    public Long getCurrentAlloc() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>sys.x$memory_global_by_current_bytes.current_avg_alloc</code>.
     */
    public void setCurrentAvgAlloc(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.x$memory_global_by_current_bytes.current_avg_alloc</code>.
     */
    public BigDecimal getCurrentAvgAlloc() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>sys.x$memory_global_by_current_bytes.high_count</code>.
     */
    public void setHighCount(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.x$memory_global_by_current_bytes.high_count</code>.
     */
    public Long getHighCount() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>sys.x$memory_global_by_current_bytes.high_alloc</code>.
     */
    public void setHighAlloc(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.x$memory_global_by_current_bytes.high_alloc</code>.
     */
    public Long getHighAlloc() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>sys.x$memory_global_by_current_bytes.high_avg_alloc</code>.
     */
    public void setHighAvgAlloc(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>sys.x$memory_global_by_current_bytes.high_avg_alloc</code>.
     */
    public BigDecimal getHighAvgAlloc() {
        return (BigDecimal) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, Long, Long, BigDecimal, Long, Long, BigDecimal> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, Long, Long, BigDecimal, Long, Long, BigDecimal> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return X$memoryGlobalByCurrentBytes.X$MEMORY_GLOBAL_BY_CURRENT_BYTES.EVENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return X$memoryGlobalByCurrentBytes.X$MEMORY_GLOBAL_BY_CURRENT_BYTES.CURRENT_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return X$memoryGlobalByCurrentBytes.X$MEMORY_GLOBAL_BY_CURRENT_BYTES.CURRENT_ALLOC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return X$memoryGlobalByCurrentBytes.X$MEMORY_GLOBAL_BY_CURRENT_BYTES.CURRENT_AVG_ALLOC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return X$memoryGlobalByCurrentBytes.X$MEMORY_GLOBAL_BY_CURRENT_BYTES.HIGH_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return X$memoryGlobalByCurrentBytes.X$MEMORY_GLOBAL_BY_CURRENT_BYTES.HIGH_ALLOC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return X$memoryGlobalByCurrentBytes.X$MEMORY_GLOBAL_BY_CURRENT_BYTES.HIGH_AVG_ALLOC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getEventName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getCurrentCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getCurrentAlloc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getCurrentAvgAlloc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getHighCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getHighAlloc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getHighAvgAlloc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getEventName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getCurrentCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getCurrentAlloc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getCurrentAvgAlloc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getHighCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getHighAlloc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getHighAvgAlloc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$memoryGlobalByCurrentBytesRecord value1(String value) {
        setEventName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$memoryGlobalByCurrentBytesRecord value2(Long value) {
        setCurrentCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$memoryGlobalByCurrentBytesRecord value3(Long value) {
        setCurrentAlloc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$memoryGlobalByCurrentBytesRecord value4(BigDecimal value) {
        setCurrentAvgAlloc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$memoryGlobalByCurrentBytesRecord value5(Long value) {
        setHighCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$memoryGlobalByCurrentBytesRecord value6(Long value) {
        setHighAlloc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$memoryGlobalByCurrentBytesRecord value7(BigDecimal value) {
        setHighAvgAlloc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$memoryGlobalByCurrentBytesRecord values(String value1, Long value2, Long value3, BigDecimal value4, Long value5, Long value6, BigDecimal value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached X$memoryGlobalByCurrentBytesRecord
     */
    public X$memoryGlobalByCurrentBytesRecord() {
        super(X$memoryGlobalByCurrentBytes.X$MEMORY_GLOBAL_BY_CURRENT_BYTES);
    }

    /**
     * Create a detached, initialised X$memoryGlobalByCurrentBytesRecord
     */
    public X$memoryGlobalByCurrentBytesRecord(String eventName, Long currentCount, Long currentAlloc, BigDecimal currentAvgAlloc, Long highCount, Long highAlloc, BigDecimal highAvgAlloc) {
        super(X$memoryGlobalByCurrentBytes.X$MEMORY_GLOBAL_BY_CURRENT_BYTES);

        set(0, eventName);
        set(1, currentCount);
        set(2, currentAlloc);
        set(3, currentAvgAlloc);
        set(4, highCount);
        set(5, highAlloc);
        set(6, highAvgAlloc);
    }
}
