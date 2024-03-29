/*
 * This file is generated by jOOQ.
 */
package jooq.performance_schema.tables.records;


import javax.annotation.Generated;

import jooq.performance_schema.tables.MemorySummaryGlobalByEventName;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


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
public class MemorySummaryGlobalByEventNameRecord extends TableRecordImpl<MemorySummaryGlobalByEventNameRecord> implements Record11<String, ULong, ULong, ULong, ULong, Long, Long, Long, Long, Long, Long> {

    private static final long serialVersionUID = 679608716;

    /**
     * Setter for <code>performance_schema.memory_summary_global_by_event_name.EVENT_NAME</code>.
     */
    public void setEventName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.memory_summary_global_by_event_name.EVENT_NAME</code>.
     */
    public String getEventName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.memory_summary_global_by_event_name.COUNT_ALLOC</code>.
     */
    public void setCountAlloc(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.memory_summary_global_by_event_name.COUNT_ALLOC</code>.
     */
    public ULong getCountAlloc() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>performance_schema.memory_summary_global_by_event_name.COUNT_FREE</code>.
     */
    public void setCountFree(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.memory_summary_global_by_event_name.COUNT_FREE</code>.
     */
    public ULong getCountFree() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>performance_schema.memory_summary_global_by_event_name.SUM_NUMBER_OF_BYTES_ALLOC</code>.
     */
    public void setSumNumberOfBytesAlloc(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.memory_summary_global_by_event_name.SUM_NUMBER_OF_BYTES_ALLOC</code>.
     */
    public ULong getSumNumberOfBytesAlloc() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>performance_schema.memory_summary_global_by_event_name.SUM_NUMBER_OF_BYTES_FREE</code>.
     */
    public void setSumNumberOfBytesFree(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.memory_summary_global_by_event_name.SUM_NUMBER_OF_BYTES_FREE</code>.
     */
    public ULong getSumNumberOfBytesFree() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>performance_schema.memory_summary_global_by_event_name.LOW_COUNT_USED</code>.
     */
    public void setLowCountUsed(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.memory_summary_global_by_event_name.LOW_COUNT_USED</code>.
     */
    public Long getLowCountUsed() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>performance_schema.memory_summary_global_by_event_name.CURRENT_COUNT_USED</code>.
     */
    public void setCurrentCountUsed(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.memory_summary_global_by_event_name.CURRENT_COUNT_USED</code>.
     */
    public Long getCurrentCountUsed() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>performance_schema.memory_summary_global_by_event_name.HIGH_COUNT_USED</code>.
     */
    public void setHighCountUsed(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>performance_schema.memory_summary_global_by_event_name.HIGH_COUNT_USED</code>.
     */
    public Long getHighCountUsed() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>performance_schema.memory_summary_global_by_event_name.LOW_NUMBER_OF_BYTES_USED</code>.
     */
    public void setLowNumberOfBytesUsed(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>performance_schema.memory_summary_global_by_event_name.LOW_NUMBER_OF_BYTES_USED</code>.
     */
    public Long getLowNumberOfBytesUsed() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>performance_schema.memory_summary_global_by_event_name.CURRENT_NUMBER_OF_BYTES_USED</code>.
     */
    public void setCurrentNumberOfBytesUsed(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>performance_schema.memory_summary_global_by_event_name.CURRENT_NUMBER_OF_BYTES_USED</code>.
     */
    public Long getCurrentNumberOfBytesUsed() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>performance_schema.memory_summary_global_by_event_name.HIGH_NUMBER_OF_BYTES_USED</code>.
     */
    public void setHighNumberOfBytesUsed(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>performance_schema.memory_summary_global_by_event_name.HIGH_NUMBER_OF_BYTES_USED</code>.
     */
    public Long getHighNumberOfBytesUsed() {
        return (Long) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, ULong, ULong, ULong, ULong, Long, Long, Long, Long, Long, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, ULong, ULong, ULong, ULong, Long, Long, Long, Long, Long, Long> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return MemorySummaryGlobalByEventName.MEMORY_SUMMARY_GLOBAL_BY_EVENT_NAME.EVENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field2() {
        return MemorySummaryGlobalByEventName.MEMORY_SUMMARY_GLOBAL_BY_EVENT_NAME.COUNT_ALLOC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field3() {
        return MemorySummaryGlobalByEventName.MEMORY_SUMMARY_GLOBAL_BY_EVENT_NAME.COUNT_FREE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return MemorySummaryGlobalByEventName.MEMORY_SUMMARY_GLOBAL_BY_EVENT_NAME.SUM_NUMBER_OF_BYTES_ALLOC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field5() {
        return MemorySummaryGlobalByEventName.MEMORY_SUMMARY_GLOBAL_BY_EVENT_NAME.SUM_NUMBER_OF_BYTES_FREE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return MemorySummaryGlobalByEventName.MEMORY_SUMMARY_GLOBAL_BY_EVENT_NAME.LOW_COUNT_USED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return MemorySummaryGlobalByEventName.MEMORY_SUMMARY_GLOBAL_BY_EVENT_NAME.CURRENT_COUNT_USED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return MemorySummaryGlobalByEventName.MEMORY_SUMMARY_GLOBAL_BY_EVENT_NAME.HIGH_COUNT_USED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return MemorySummaryGlobalByEventName.MEMORY_SUMMARY_GLOBAL_BY_EVENT_NAME.LOW_NUMBER_OF_BYTES_USED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return MemorySummaryGlobalByEventName.MEMORY_SUMMARY_GLOBAL_BY_EVENT_NAME.CURRENT_NUMBER_OF_BYTES_USED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return MemorySummaryGlobalByEventName.MEMORY_SUMMARY_GLOBAL_BY_EVENT_NAME.HIGH_NUMBER_OF_BYTES_USED;
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
    public ULong component2() {
        return getCountAlloc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component3() {
        return getCountFree();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component4() {
        return getSumNumberOfBytesAlloc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component5() {
        return getSumNumberOfBytesFree();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getLowCountUsed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component7() {
        return getCurrentCountUsed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component8() {
        return getHighCountUsed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component9() {
        return getLowNumberOfBytesUsed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component10() {
        return getCurrentNumberOfBytesUsed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component11() {
        return getHighNumberOfBytesUsed();
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
    public ULong value2() {
        return getCountAlloc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value3() {
        return getCountFree();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value4() {
        return getSumNumberOfBytesAlloc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value5() {
        return getSumNumberOfBytesFree();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getLowCountUsed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getCurrentCountUsed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getHighCountUsed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getLowNumberOfBytesUsed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getCurrentNumberOfBytesUsed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value11() {
        return getHighNumberOfBytesUsed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemorySummaryGlobalByEventNameRecord value1(String value) {
        setEventName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemorySummaryGlobalByEventNameRecord value2(ULong value) {
        setCountAlloc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemorySummaryGlobalByEventNameRecord value3(ULong value) {
        setCountFree(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemorySummaryGlobalByEventNameRecord value4(ULong value) {
        setSumNumberOfBytesAlloc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemorySummaryGlobalByEventNameRecord value5(ULong value) {
        setSumNumberOfBytesFree(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemorySummaryGlobalByEventNameRecord value6(Long value) {
        setLowCountUsed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemorySummaryGlobalByEventNameRecord value7(Long value) {
        setCurrentCountUsed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemorySummaryGlobalByEventNameRecord value8(Long value) {
        setHighCountUsed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemorySummaryGlobalByEventNameRecord value9(Long value) {
        setLowNumberOfBytesUsed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemorySummaryGlobalByEventNameRecord value10(Long value) {
        setCurrentNumberOfBytesUsed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemorySummaryGlobalByEventNameRecord value11(Long value) {
        setHighNumberOfBytesUsed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemorySummaryGlobalByEventNameRecord values(String value1, ULong value2, ULong value3, ULong value4, ULong value5, Long value6, Long value7, Long value8, Long value9, Long value10, Long value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MemorySummaryGlobalByEventNameRecord
     */
    public MemorySummaryGlobalByEventNameRecord() {
        super(MemorySummaryGlobalByEventName.MEMORY_SUMMARY_GLOBAL_BY_EVENT_NAME);
    }

    /**
     * Create a detached, initialised MemorySummaryGlobalByEventNameRecord
     */
    public MemorySummaryGlobalByEventNameRecord(String eventName, ULong countAlloc, ULong countFree, ULong sumNumberOfBytesAlloc, ULong sumNumberOfBytesFree, Long lowCountUsed, Long currentCountUsed, Long highCountUsed, Long lowNumberOfBytesUsed, Long currentNumberOfBytesUsed, Long highNumberOfBytesUsed) {
        super(MemorySummaryGlobalByEventName.MEMORY_SUMMARY_GLOBAL_BY_EVENT_NAME);

        set(0, eventName);
        set(1, countAlloc);
        set(2, countFree);
        set(3, sumNumberOfBytesAlloc);
        set(4, sumNumberOfBytesFree);
        set(5, lowCountUsed);
        set(6, currentCountUsed);
        set(7, highCountUsed);
        set(8, lowNumberOfBytesUsed);
        set(9, currentNumberOfBytesUsed);
        set(10, highNumberOfBytesUsed);
    }
}
