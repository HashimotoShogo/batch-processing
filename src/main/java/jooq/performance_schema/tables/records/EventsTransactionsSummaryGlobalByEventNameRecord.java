/*
 * This file is generated by jOOQ.
 */
package jooq.performance_schema.tables.records;


import javax.annotation.Generated;

import jooq.performance_schema.tables.EventsTransactionsSummaryGlobalByEventName;

import org.jooq.Field;
import org.jooq.Record16;
import org.jooq.Row16;
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
public class EventsTransactionsSummaryGlobalByEventNameRecord extends TableRecordImpl<EventsTransactionsSummaryGlobalByEventNameRecord> implements Record16<String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> {

    private static final long serialVersionUID = 169172169;

    /**
     * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.EVENT_NAME</code>.
     */
    public void setEventName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.EVENT_NAME</code>.
     */
    public String getEventName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.COUNT_STAR</code>.
     */
    public void setCountStar(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.COUNT_STAR</code>.
     */
    public ULong getCountStar() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public void setSumTimerWait(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public ULong getSumTimerWait() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public void setMinTimerWait(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public ULong getMinTimerWait() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public void setAvgTimerWait(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public ULong getAvgTimerWait() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public void setMaxTimerWait(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public ULong getMaxTimerWait() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.COUNT_READ_WRITE</code>.
     */
    public void setCountReadWrite(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.COUNT_READ_WRITE</code>.
     */
    public ULong getCountReadWrite() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.SUM_TIMER_READ_WRITE</code>.
     */
    public void setSumTimerReadWrite(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.SUM_TIMER_READ_WRITE</code>.
     */
    public ULong getSumTimerReadWrite() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.MIN_TIMER_READ_WRITE</code>.
     */
    public void setMinTimerReadWrite(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.MIN_TIMER_READ_WRITE</code>.
     */
    public ULong getMinTimerReadWrite() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.AVG_TIMER_READ_WRITE</code>.
     */
    public void setAvgTimerReadWrite(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.AVG_TIMER_READ_WRITE</code>.
     */
    public ULong getAvgTimerReadWrite() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.MAX_TIMER_READ_WRITE</code>.
     */
    public void setMaxTimerReadWrite(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.MAX_TIMER_READ_WRITE</code>.
     */
    public ULong getMaxTimerReadWrite() {
        return (ULong) get(10);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.COUNT_READ_ONLY</code>.
     */
    public void setCountReadOnly(ULong value) {
        set(11, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.COUNT_READ_ONLY</code>.
     */
    public ULong getCountReadOnly() {
        return (ULong) get(11);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.SUM_TIMER_READ_ONLY</code>.
     */
    public void setSumTimerReadOnly(ULong value) {
        set(12, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.SUM_TIMER_READ_ONLY</code>.
     */
    public ULong getSumTimerReadOnly() {
        return (ULong) get(12);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.MIN_TIMER_READ_ONLY</code>.
     */
    public void setMinTimerReadOnly(ULong value) {
        set(13, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.MIN_TIMER_READ_ONLY</code>.
     */
    public ULong getMinTimerReadOnly() {
        return (ULong) get(13);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.AVG_TIMER_READ_ONLY</code>.
     */
    public void setAvgTimerReadOnly(ULong value) {
        set(14, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.AVG_TIMER_READ_ONLY</code>.
     */
    public ULong getAvgTimerReadOnly() {
        return (ULong) get(14);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_summary_global_by_event_name.MAX_TIMER_READ_ONLY</code>.
     */
    public void setMaxTimerReadOnly(ULong value) {
        set(15, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_global_by_event_name.MAX_TIMER_READ_ONLY</code>.
     */
    public ULong getMaxTimerReadOnly() {
        return (ULong) get(15);
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.EVENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field2() {
        return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.COUNT_STAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field3() {
        return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.SUM_TIMER_WAIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.MIN_TIMER_WAIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field5() {
        return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.AVG_TIMER_WAIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field6() {
        return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.MAX_TIMER_WAIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field7() {
        return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.COUNT_READ_WRITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field8() {
        return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.SUM_TIMER_READ_WRITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field9() {
        return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.MIN_TIMER_READ_WRITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field10() {
        return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.AVG_TIMER_READ_WRITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field11() {
        return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.MAX_TIMER_READ_WRITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field12() {
        return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.COUNT_READ_ONLY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field13() {
        return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.SUM_TIMER_READ_ONLY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field14() {
        return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.MIN_TIMER_READ_ONLY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field15() {
        return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.AVG_TIMER_READ_ONLY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field16() {
        return EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME.MAX_TIMER_READ_ONLY;
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
        return getCountStar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component3() {
        return getSumTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component4() {
        return getMinTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component5() {
        return getAvgTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component6() {
        return getMaxTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component7() {
        return getCountReadWrite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component8() {
        return getSumTimerReadWrite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component9() {
        return getMinTimerReadWrite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component10() {
        return getAvgTimerReadWrite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component11() {
        return getMaxTimerReadWrite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component12() {
        return getCountReadOnly();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component13() {
        return getSumTimerReadOnly();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component14() {
        return getMinTimerReadOnly();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component15() {
        return getAvgTimerReadOnly();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component16() {
        return getMaxTimerReadOnly();
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
        return getCountStar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value3() {
        return getSumTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value4() {
        return getMinTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value5() {
        return getAvgTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value6() {
        return getMaxTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value7() {
        return getCountReadWrite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value8() {
        return getSumTimerReadWrite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value9() {
        return getMinTimerReadWrite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value10() {
        return getAvgTimerReadWrite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value11() {
        return getMaxTimerReadWrite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value12() {
        return getCountReadOnly();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value13() {
        return getSumTimerReadOnly();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value14() {
        return getMinTimerReadOnly();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value15() {
        return getAvgTimerReadOnly();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value16() {
        return getMaxTimerReadOnly();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryGlobalByEventNameRecord value1(String value) {
        setEventName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryGlobalByEventNameRecord value2(ULong value) {
        setCountStar(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryGlobalByEventNameRecord value3(ULong value) {
        setSumTimerWait(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryGlobalByEventNameRecord value4(ULong value) {
        setMinTimerWait(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryGlobalByEventNameRecord value5(ULong value) {
        setAvgTimerWait(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryGlobalByEventNameRecord value6(ULong value) {
        setMaxTimerWait(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryGlobalByEventNameRecord value7(ULong value) {
        setCountReadWrite(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryGlobalByEventNameRecord value8(ULong value) {
        setSumTimerReadWrite(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryGlobalByEventNameRecord value9(ULong value) {
        setMinTimerReadWrite(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryGlobalByEventNameRecord value10(ULong value) {
        setAvgTimerReadWrite(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryGlobalByEventNameRecord value11(ULong value) {
        setMaxTimerReadWrite(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryGlobalByEventNameRecord value12(ULong value) {
        setCountReadOnly(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryGlobalByEventNameRecord value13(ULong value) {
        setSumTimerReadOnly(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryGlobalByEventNameRecord value14(ULong value) {
        setMinTimerReadOnly(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryGlobalByEventNameRecord value15(ULong value) {
        setAvgTimerReadOnly(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryGlobalByEventNameRecord value16(ULong value) {
        setMaxTimerReadOnly(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryGlobalByEventNameRecord values(String value1, ULong value2, ULong value3, ULong value4, ULong value5, ULong value6, ULong value7, ULong value8, ULong value9, ULong value10, ULong value11, ULong value12, ULong value13, ULong value14, ULong value15, ULong value16) {
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
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EventsTransactionsSummaryGlobalByEventNameRecord
     */
    public EventsTransactionsSummaryGlobalByEventNameRecord() {
        super(EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME);
    }

    /**
     * Create a detached, initialised EventsTransactionsSummaryGlobalByEventNameRecord
     */
    public EventsTransactionsSummaryGlobalByEventNameRecord(String eventName, ULong countStar, ULong sumTimerWait, ULong minTimerWait, ULong avgTimerWait, ULong maxTimerWait, ULong countReadWrite, ULong sumTimerReadWrite, ULong minTimerReadWrite, ULong avgTimerReadWrite, ULong maxTimerReadWrite, ULong countReadOnly, ULong sumTimerReadOnly, ULong minTimerReadOnly, ULong avgTimerReadOnly, ULong maxTimerReadOnly) {
        super(EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME);

        set(0, eventName);
        set(1, countStar);
        set(2, sumTimerWait);
        set(3, minTimerWait);
        set(4, avgTimerWait);
        set(5, maxTimerWait);
        set(6, countReadWrite);
        set(7, sumTimerReadWrite);
        set(8, minTimerReadWrite);
        set(9, avgTimerReadWrite);
        set(10, maxTimerReadWrite);
        set(11, countReadOnly);
        set(12, sumTimerReadOnly);
        set(13, minTimerReadOnly);
        set(14, avgTimerReadOnly);
        set(15, maxTimerReadOnly);
    }
}
