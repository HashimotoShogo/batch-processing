/*
 * This file is generated by jOOQ.
 */
package jooq.performance_schema.tables.records;


import javax.annotation.Generated;

import jooq.performance_schema.tables.EventsWaitsSummaryByInstance;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class EventsWaitsSummaryByInstanceRecord extends TableRecordImpl<EventsWaitsSummaryByInstanceRecord> implements Record7<String, ULong, ULong, ULong, ULong, ULong, ULong> {

    private static final long serialVersionUID = -1922640760;

    /**
     * Setter for <code>performance_schema.events_waits_summary_by_instance.EVENT_NAME</code>.
     */
    public void setEventName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.events_waits_summary_by_instance.EVENT_NAME</code>.
     */
    public String getEventName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.events_waits_summary_by_instance.OBJECT_INSTANCE_BEGIN</code>.
     */
    public void setObjectInstanceBegin(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.events_waits_summary_by_instance.OBJECT_INSTANCE_BEGIN</code>.
     */
    public ULong getObjectInstanceBegin() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>performance_schema.events_waits_summary_by_instance.COUNT_STAR</code>.
     */
    public void setCountStar(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.events_waits_summary_by_instance.COUNT_STAR</code>.
     */
    public ULong getCountStar() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>performance_schema.events_waits_summary_by_instance.SUM_TIMER_WAIT</code>.
     */
    public void setSumTimerWait(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.events_waits_summary_by_instance.SUM_TIMER_WAIT</code>.
     */
    public ULong getSumTimerWait() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>performance_schema.events_waits_summary_by_instance.MIN_TIMER_WAIT</code>.
     */
    public void setMinTimerWait(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.events_waits_summary_by_instance.MIN_TIMER_WAIT</code>.
     */
    public ULong getMinTimerWait() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>performance_schema.events_waits_summary_by_instance.AVG_TIMER_WAIT</code>.
     */
    public void setAvgTimerWait(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.events_waits_summary_by_instance.AVG_TIMER_WAIT</code>.
     */
    public ULong getAvgTimerWait() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>performance_schema.events_waits_summary_by_instance.MAX_TIMER_WAIT</code>.
     */
    public void setMaxTimerWait(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.events_waits_summary_by_instance.MAX_TIMER_WAIT</code>.
     */
    public ULong getMaxTimerWait() {
        return (ULong) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, ULong, ULong, ULong, ULong, ULong, ULong> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, ULong, ULong, ULong, ULong, ULong, ULong> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return EventsWaitsSummaryByInstance.EVENTS_WAITS_SUMMARY_BY_INSTANCE.EVENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field2() {
        return EventsWaitsSummaryByInstance.EVENTS_WAITS_SUMMARY_BY_INSTANCE.OBJECT_INSTANCE_BEGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field3() {
        return EventsWaitsSummaryByInstance.EVENTS_WAITS_SUMMARY_BY_INSTANCE.COUNT_STAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return EventsWaitsSummaryByInstance.EVENTS_WAITS_SUMMARY_BY_INSTANCE.SUM_TIMER_WAIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field5() {
        return EventsWaitsSummaryByInstance.EVENTS_WAITS_SUMMARY_BY_INSTANCE.MIN_TIMER_WAIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field6() {
        return EventsWaitsSummaryByInstance.EVENTS_WAITS_SUMMARY_BY_INSTANCE.AVG_TIMER_WAIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field7() {
        return EventsWaitsSummaryByInstance.EVENTS_WAITS_SUMMARY_BY_INSTANCE.MAX_TIMER_WAIT;
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
        return getObjectInstanceBegin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component3() {
        return getCountStar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component4() {
        return getSumTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component5() {
        return getMinTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component6() {
        return getAvgTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component7() {
        return getMaxTimerWait();
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
        return getObjectInstanceBegin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value3() {
        return getCountStar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value4() {
        return getSumTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value5() {
        return getMinTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value6() {
        return getAvgTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value7() {
        return getMaxTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsWaitsSummaryByInstanceRecord value1(String value) {
        setEventName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsWaitsSummaryByInstanceRecord value2(ULong value) {
        setObjectInstanceBegin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsWaitsSummaryByInstanceRecord value3(ULong value) {
        setCountStar(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsWaitsSummaryByInstanceRecord value4(ULong value) {
        setSumTimerWait(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsWaitsSummaryByInstanceRecord value5(ULong value) {
        setMinTimerWait(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsWaitsSummaryByInstanceRecord value6(ULong value) {
        setAvgTimerWait(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsWaitsSummaryByInstanceRecord value7(ULong value) {
        setMaxTimerWait(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsWaitsSummaryByInstanceRecord values(String value1, ULong value2, ULong value3, ULong value4, ULong value5, ULong value6, ULong value7) {
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
     * Create a detached EventsWaitsSummaryByInstanceRecord
     */
    public EventsWaitsSummaryByInstanceRecord() {
        super(EventsWaitsSummaryByInstance.EVENTS_WAITS_SUMMARY_BY_INSTANCE);
    }

    /**
     * Create a detached, initialised EventsWaitsSummaryByInstanceRecord
     */
    public EventsWaitsSummaryByInstanceRecord(String eventName, ULong objectInstanceBegin, ULong countStar, ULong sumTimerWait, ULong minTimerWait, ULong avgTimerWait, ULong maxTimerWait) {
        super(EventsWaitsSummaryByInstance.EVENTS_WAITS_SUMMARY_BY_INSTANCE);

        set(0, eventName);
        set(1, objectInstanceBegin);
        set(2, countStar);
        set(3, sumTimerWait);
        set(4, minTimerWait);
        set(5, avgTimerWait);
        set(6, maxTimerWait);
    }
}
