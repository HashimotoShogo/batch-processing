/*
 * This file is generated by jOOQ.
 */
package jooq.performance_schema.tables.records;


import javax.annotation.Generated;

import jooq.performance_schema.tables.SocketSummaryByEventName;

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
public class SocketSummaryByEventNameRecord extends TableRecordImpl<SocketSummaryByEventNameRecord> {

    private static final long serialVersionUID = -289281010;

    /**
     * Setter for <code>performance_schema.socket_summary_by_event_name.EVENT_NAME</code>.
     */
    public void setEventName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.socket_summary_by_event_name.EVENT_NAME</code>.
     */
    public String getEventName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.socket_summary_by_event_name.COUNT_STAR</code>.
     */
    public void setCountStar(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.socket_summary_by_event_name.COUNT_STAR</code>.
     */
    public ULong getCountStar() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>performance_schema.socket_summary_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public void setSumTimerWait(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.socket_summary_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public ULong getSumTimerWait() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>performance_schema.socket_summary_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public void setMinTimerWait(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.socket_summary_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public ULong getMinTimerWait() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>performance_schema.socket_summary_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public void setAvgTimerWait(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.socket_summary_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public ULong getAvgTimerWait() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>performance_schema.socket_summary_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public void setMaxTimerWait(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.socket_summary_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public ULong getMaxTimerWait() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>performance_schema.socket_summary_by_event_name.COUNT_READ</code>.
     */
    public void setCountRead(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.socket_summary_by_event_name.COUNT_READ</code>.
     */
    public ULong getCountRead() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>performance_schema.socket_summary_by_event_name.SUM_TIMER_READ</code>.
     */
    public void setSumTimerRead(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>performance_schema.socket_summary_by_event_name.SUM_TIMER_READ</code>.
     */
    public ULong getSumTimerRead() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>performance_schema.socket_summary_by_event_name.MIN_TIMER_READ</code>.
     */
    public void setMinTimerRead(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>performance_schema.socket_summary_by_event_name.MIN_TIMER_READ</code>.
     */
    public ULong getMinTimerRead() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>performance_schema.socket_summary_by_event_name.AVG_TIMER_READ</code>.
     */
    public void setAvgTimerRead(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>performance_schema.socket_summary_by_event_name.AVG_TIMER_READ</code>.
     */
    public ULong getAvgTimerRead() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>performance_schema.socket_summary_by_event_name.MAX_TIMER_READ</code>.
     */
    public void setMaxTimerRead(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>performance_schema.socket_summary_by_event_name.MAX_TIMER_READ</code>.
     */
    public ULong getMaxTimerRead() {
        return (ULong) get(10);
    }

    /**
     * Setter for <code>performance_schema.socket_summary_by_event_name.SUM_NUMBER_OF_BYTES_READ</code>.
     */
    public void setSumNumberOfBytesRead(ULong value) {
        set(11, value);
    }

    /**
     * Getter for <code>performance_schema.socket_summary_by_event_name.SUM_NUMBER_OF_BYTES_READ</code>.
     */
    public ULong getSumNumberOfBytesRead() {
        return (ULong) get(11);
    }

    /**
     * Setter for <code>performance_schema.socket_summary_by_event_name.COUNT_WRITE</code>.
     */
    public void setCountWrite(ULong value) {
        set(12, value);
    }

    /**
     * Getter for <code>performance_schema.socket_summary_by_event_name.COUNT_WRITE</code>.
     */
    public ULong getCountWrite() {
        return (ULong) get(12);
    }

    /**
     * Setter for <code>performance_schema.socket_summary_by_event_name.SUM_TIMER_WRITE</code>.
     */
    public void setSumTimerWrite(ULong value) {
        set(13, value);
    }

    /**
     * Getter for <code>performance_schema.socket_summary_by_event_name.SUM_TIMER_WRITE</code>.
     */
    public ULong getSumTimerWrite() {
        return (ULong) get(13);
    }

    /**
     * Setter for <code>performance_schema.socket_summary_by_event_name.MIN_TIMER_WRITE</code>.
     */
    public void setMinTimerWrite(ULong value) {
        set(14, value);
    }

    /**
     * Getter for <code>performance_schema.socket_summary_by_event_name.MIN_TIMER_WRITE</code>.
     */
    public ULong getMinTimerWrite() {
        return (ULong) get(14);
    }

    /**
     * Setter for <code>performance_schema.socket_summary_by_event_name.AVG_TIMER_WRITE</code>.
     */
    public void setAvgTimerWrite(ULong value) {
        set(15, value);
    }

    /**
     * Getter for <code>performance_schema.socket_summary_by_event_name.AVG_TIMER_WRITE</code>.
     */
    public ULong getAvgTimerWrite() {
        return (ULong) get(15);
    }

    /**
     * Setter for <code>performance_schema.socket_summary_by_event_name.MAX_TIMER_WRITE</code>.
     */
    public void setMaxTimerWrite(ULong value) {
        set(16, value);
    }

    /**
     * Getter for <code>performance_schema.socket_summary_by_event_name.MAX_TIMER_WRITE</code>.
     */
    public ULong getMaxTimerWrite() {
        return (ULong) get(16);
    }

    /**
     * Setter for <code>performance_schema.socket_summary_by_event_name.SUM_NUMBER_OF_BYTES_WRITE</code>.
     */
    public void setSumNumberOfBytesWrite(ULong value) {
        set(17, value);
    }

    /**
     * Getter for <code>performance_schema.socket_summary_by_event_name.SUM_NUMBER_OF_BYTES_WRITE</code>.
     */
    public ULong getSumNumberOfBytesWrite() {
        return (ULong) get(17);
    }

    /**
     * Setter for <code>performance_schema.socket_summary_by_event_name.COUNT_MISC</code>.
     */
    public void setCountMisc(ULong value) {
        set(18, value);
    }

    /**
     * Getter for <code>performance_schema.socket_summary_by_event_name.COUNT_MISC</code>.
     */
    public ULong getCountMisc() {
        return (ULong) get(18);
    }

    /**
     * Setter for <code>performance_schema.socket_summary_by_event_name.SUM_TIMER_MISC</code>.
     */
    public void setSumTimerMisc(ULong value) {
        set(19, value);
    }

    /**
     * Getter for <code>performance_schema.socket_summary_by_event_name.SUM_TIMER_MISC</code>.
     */
    public ULong getSumTimerMisc() {
        return (ULong) get(19);
    }

    /**
     * Setter for <code>performance_schema.socket_summary_by_event_name.MIN_TIMER_MISC</code>.
     */
    public void setMinTimerMisc(ULong value) {
        set(20, value);
    }

    /**
     * Getter for <code>performance_schema.socket_summary_by_event_name.MIN_TIMER_MISC</code>.
     */
    public ULong getMinTimerMisc() {
        return (ULong) get(20);
    }

    /**
     * Setter for <code>performance_schema.socket_summary_by_event_name.AVG_TIMER_MISC</code>.
     */
    public void setAvgTimerMisc(ULong value) {
        set(21, value);
    }

    /**
     * Getter for <code>performance_schema.socket_summary_by_event_name.AVG_TIMER_MISC</code>.
     */
    public ULong getAvgTimerMisc() {
        return (ULong) get(21);
    }

    /**
     * Setter for <code>performance_schema.socket_summary_by_event_name.MAX_TIMER_MISC</code>.
     */
    public void setMaxTimerMisc(ULong value) {
        set(22, value);
    }

    /**
     * Getter for <code>performance_schema.socket_summary_by_event_name.MAX_TIMER_MISC</code>.
     */
    public ULong getMaxTimerMisc() {
        return (ULong) get(22);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SocketSummaryByEventNameRecord
     */
    public SocketSummaryByEventNameRecord() {
        super(SocketSummaryByEventName.SOCKET_SUMMARY_BY_EVENT_NAME);
    }

    /**
     * Create a detached, initialised SocketSummaryByEventNameRecord
     */
    public SocketSummaryByEventNameRecord(String eventName, ULong countStar, ULong sumTimerWait, ULong minTimerWait, ULong avgTimerWait, ULong maxTimerWait, ULong countRead, ULong sumTimerRead, ULong minTimerRead, ULong avgTimerRead, ULong maxTimerRead, ULong sumNumberOfBytesRead, ULong countWrite, ULong sumTimerWrite, ULong minTimerWrite, ULong avgTimerWrite, ULong maxTimerWrite, ULong sumNumberOfBytesWrite, ULong countMisc, ULong sumTimerMisc, ULong minTimerMisc, ULong avgTimerMisc, ULong maxTimerMisc) {
        super(SocketSummaryByEventName.SOCKET_SUMMARY_BY_EVENT_NAME);

        set(0, eventName);
        set(1, countStar);
        set(2, sumTimerWait);
        set(3, minTimerWait);
        set(4, avgTimerWait);
        set(5, maxTimerWait);
        set(6, countRead);
        set(7, sumTimerRead);
        set(8, minTimerRead);
        set(9, avgTimerRead);
        set(10, maxTimerRead);
        set(11, sumNumberOfBytesRead);
        set(12, countWrite);
        set(13, sumTimerWrite);
        set(14, minTimerWrite);
        set(15, avgTimerWrite);
        set(16, maxTimerWrite);
        set(17, sumNumberOfBytesWrite);
        set(18, countMisc);
        set(19, sumTimerMisc);
        set(20, minTimerMisc);
        set(21, avgTimerMisc);
        set(22, maxTimerMisc);
    }
}
