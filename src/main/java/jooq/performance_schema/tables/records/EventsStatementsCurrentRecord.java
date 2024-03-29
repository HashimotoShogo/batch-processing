/*
 * This file is generated by jOOQ.
 */
package jooq.performance_schema.tables.records;


import javax.annotation.Generated;

import jooq.performance_schema.enums.EventsStatementsCurrentNestingEventType;
import jooq.performance_schema.tables.EventsStatementsCurrent;

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
public class EventsStatementsCurrentRecord extends TableRecordImpl<EventsStatementsCurrentRecord> {

    private static final long serialVersionUID = 1841637767;

    /**
     * Setter for <code>performance_schema.events_statements_current.THREAD_ID</code>.
     */
    public void setThreadId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.THREAD_ID</code>.
     */
    public ULong getThreadId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.EVENT_ID</code>.
     */
    public void setEventId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.EVENT_ID</code>.
     */
    public ULong getEventId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.END_EVENT_ID</code>.
     */
    public void setEndEventId(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.END_EVENT_ID</code>.
     */
    public ULong getEndEventId() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.EVENT_NAME</code>.
     */
    public void setEventName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.EVENT_NAME</code>.
     */
    public String getEventName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.SOURCE</code>.
     */
    public void setSource(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.SOURCE</code>.
     */
    public String getSource() {
        return (String) get(4);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.TIMER_START</code>.
     */
    public void setTimerStart(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.TIMER_START</code>.
     */
    public ULong getTimerStart() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.TIMER_END</code>.
     */
    public void setTimerEnd(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.TIMER_END</code>.
     */
    public ULong getTimerEnd() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.TIMER_WAIT</code>.
     */
    public void setTimerWait(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.TIMER_WAIT</code>.
     */
    public ULong getTimerWait() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.LOCK_TIME</code>.
     */
    public void setLockTime(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.LOCK_TIME</code>.
     */
    public ULong getLockTime() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.SQL_TEXT</code>.
     */
    public void setSqlText(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.SQL_TEXT</code>.
     */
    public String getSqlText() {
        return (String) get(9);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.DIGEST</code>.
     */
    public void setDigest(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.DIGEST</code>.
     */
    public String getDigest() {
        return (String) get(10);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.DIGEST_TEXT</code>.
     */
    public void setDigestText(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.DIGEST_TEXT</code>.
     */
    public String getDigestText() {
        return (String) get(11);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.CURRENT_SCHEMA</code>.
     */
    public void setCurrentSchema(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.CURRENT_SCHEMA</code>.
     */
    public String getCurrentSchema() {
        return (String) get(12);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.OBJECT_TYPE</code>.
     */
    public void setObjectType(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.OBJECT_TYPE</code>.
     */
    public String getObjectType() {
        return (String) get(13);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.OBJECT_SCHEMA</code>.
     */
    public void setObjectSchema(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.OBJECT_SCHEMA</code>.
     */
    public String getObjectSchema() {
        return (String) get(14);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.OBJECT_NAME</code>.
     */
    public void setObjectName(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.OBJECT_NAME</code>.
     */
    public String getObjectName() {
        return (String) get(15);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.OBJECT_INSTANCE_BEGIN</code>.
     */
    public void setObjectInstanceBegin(ULong value) {
        set(16, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.OBJECT_INSTANCE_BEGIN</code>.
     */
    public ULong getObjectInstanceBegin() {
        return (ULong) get(16);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.MYSQL_ERRNO</code>.
     */
    public void setMysqlErrno(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.MYSQL_ERRNO</code>.
     */
    public Integer getMysqlErrno() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.RETURNED_SQLSTATE</code>.
     */
    public void setReturnedSqlstate(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.RETURNED_SQLSTATE</code>.
     */
    public String getReturnedSqlstate() {
        return (String) get(18);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.MESSAGE_TEXT</code>.
     */
    public void setMessageText(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.MESSAGE_TEXT</code>.
     */
    public String getMessageText() {
        return (String) get(19);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.ERRORS</code>.
     */
    public void setErrors(ULong value) {
        set(20, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.ERRORS</code>.
     */
    public ULong getErrors() {
        return (ULong) get(20);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.WARNINGS</code>.
     */
    public void setWarnings(ULong value) {
        set(21, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.WARNINGS</code>.
     */
    public ULong getWarnings() {
        return (ULong) get(21);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.ROWS_AFFECTED</code>.
     */
    public void setRowsAffected(ULong value) {
        set(22, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.ROWS_AFFECTED</code>.
     */
    public ULong getRowsAffected() {
        return (ULong) get(22);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.ROWS_SENT</code>.
     */
    public void setRowsSent(ULong value) {
        set(23, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.ROWS_SENT</code>.
     */
    public ULong getRowsSent() {
        return (ULong) get(23);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.ROWS_EXAMINED</code>.
     */
    public void setRowsExamined(ULong value) {
        set(24, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.ROWS_EXAMINED</code>.
     */
    public ULong getRowsExamined() {
        return (ULong) get(24);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.CREATED_TMP_DISK_TABLES</code>.
     */
    public void setCreatedTmpDiskTables(ULong value) {
        set(25, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.CREATED_TMP_DISK_TABLES</code>.
     */
    public ULong getCreatedTmpDiskTables() {
        return (ULong) get(25);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.CREATED_TMP_TABLES</code>.
     */
    public void setCreatedTmpTables(ULong value) {
        set(26, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.CREATED_TMP_TABLES</code>.
     */
    public ULong getCreatedTmpTables() {
        return (ULong) get(26);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.SELECT_FULL_JOIN</code>.
     */
    public void setSelectFullJoin(ULong value) {
        set(27, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.SELECT_FULL_JOIN</code>.
     */
    public ULong getSelectFullJoin() {
        return (ULong) get(27);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.SELECT_FULL_RANGE_JOIN</code>.
     */
    public void setSelectFullRangeJoin(ULong value) {
        set(28, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.SELECT_FULL_RANGE_JOIN</code>.
     */
    public ULong getSelectFullRangeJoin() {
        return (ULong) get(28);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.SELECT_RANGE</code>.
     */
    public void setSelectRange(ULong value) {
        set(29, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.SELECT_RANGE</code>.
     */
    public ULong getSelectRange() {
        return (ULong) get(29);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.SELECT_RANGE_CHECK</code>.
     */
    public void setSelectRangeCheck(ULong value) {
        set(30, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.SELECT_RANGE_CHECK</code>.
     */
    public ULong getSelectRangeCheck() {
        return (ULong) get(30);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.SELECT_SCAN</code>.
     */
    public void setSelectScan(ULong value) {
        set(31, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.SELECT_SCAN</code>.
     */
    public ULong getSelectScan() {
        return (ULong) get(31);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.SORT_MERGE_PASSES</code>.
     */
    public void setSortMergePasses(ULong value) {
        set(32, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.SORT_MERGE_PASSES</code>.
     */
    public ULong getSortMergePasses() {
        return (ULong) get(32);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.SORT_RANGE</code>.
     */
    public void setSortRange(ULong value) {
        set(33, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.SORT_RANGE</code>.
     */
    public ULong getSortRange() {
        return (ULong) get(33);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.SORT_ROWS</code>.
     */
    public void setSortRows(ULong value) {
        set(34, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.SORT_ROWS</code>.
     */
    public ULong getSortRows() {
        return (ULong) get(34);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.SORT_SCAN</code>.
     */
    public void setSortScan(ULong value) {
        set(35, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.SORT_SCAN</code>.
     */
    public ULong getSortScan() {
        return (ULong) get(35);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.NO_INDEX_USED</code>.
     */
    public void setNoIndexUsed(ULong value) {
        set(36, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.NO_INDEX_USED</code>.
     */
    public ULong getNoIndexUsed() {
        return (ULong) get(36);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.NO_GOOD_INDEX_USED</code>.
     */
    public void setNoGoodIndexUsed(ULong value) {
        set(37, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.NO_GOOD_INDEX_USED</code>.
     */
    public ULong getNoGoodIndexUsed() {
        return (ULong) get(37);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.NESTING_EVENT_ID</code>.
     */
    public void setNestingEventId(ULong value) {
        set(38, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.NESTING_EVENT_ID</code>.
     */
    public ULong getNestingEventId() {
        return (ULong) get(38);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.NESTING_EVENT_TYPE</code>.
     */
    public void setNestingEventType(EventsStatementsCurrentNestingEventType value) {
        set(39, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.NESTING_EVENT_TYPE</code>.
     */
    public EventsStatementsCurrentNestingEventType getNestingEventType() {
        return (EventsStatementsCurrentNestingEventType) get(39);
    }

    /**
     * Setter for <code>performance_schema.events_statements_current.NESTING_EVENT_LEVEL</code>.
     */
    public void setNestingEventLevel(Integer value) {
        set(40, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_current.NESTING_EVENT_LEVEL</code>.
     */
    public Integer getNestingEventLevel() {
        return (Integer) get(40);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EventsStatementsCurrentRecord
     */
    public EventsStatementsCurrentRecord() {
        super(EventsStatementsCurrent.EVENTS_STATEMENTS_CURRENT);
    }

    /**
     * Create a detached, initialised EventsStatementsCurrentRecord
     */
    public EventsStatementsCurrentRecord(ULong threadId, ULong eventId, ULong endEventId, String eventName, String source, ULong timerStart, ULong timerEnd, ULong timerWait, ULong lockTime, String sqlText, String digest, String digestText, String currentSchema, String objectType, String objectSchema, String objectName, ULong objectInstanceBegin, Integer mysqlErrno, String returnedSqlstate, String messageText, ULong errors, ULong warnings, ULong rowsAffected, ULong rowsSent, ULong rowsExamined, ULong createdTmpDiskTables, ULong createdTmpTables, ULong selectFullJoin, ULong selectFullRangeJoin, ULong selectRange, ULong selectRangeCheck, ULong selectScan, ULong sortMergePasses, ULong sortRange, ULong sortRows, ULong sortScan, ULong noIndexUsed, ULong noGoodIndexUsed, ULong nestingEventId, EventsStatementsCurrentNestingEventType nestingEventType, Integer nestingEventLevel) {
        super(EventsStatementsCurrent.EVENTS_STATEMENTS_CURRENT);

        set(0, threadId);
        set(1, eventId);
        set(2, endEventId);
        set(3, eventName);
        set(4, source);
        set(5, timerStart);
        set(6, timerEnd);
        set(7, timerWait);
        set(8, lockTime);
        set(9, sqlText);
        set(10, digest);
        set(11, digestText);
        set(12, currentSchema);
        set(13, objectType);
        set(14, objectSchema);
        set(15, objectName);
        set(16, objectInstanceBegin);
        set(17, mysqlErrno);
        set(18, returnedSqlstate);
        set(19, messageText);
        set(20, errors);
        set(21, warnings);
        set(22, rowsAffected);
        set(23, rowsSent);
        set(24, rowsExamined);
        set(25, createdTmpDiskTables);
        set(26, createdTmpTables);
        set(27, selectFullJoin);
        set(28, selectFullRangeJoin);
        set(29, selectRange);
        set(30, selectRangeCheck);
        set(31, selectScan);
        set(32, sortMergePasses);
        set(33, sortRange);
        set(34, sortRows);
        set(35, sortScan);
        set(36, noIndexUsed);
        set(37, noGoodIndexUsed);
        set(38, nestingEventId);
        set(39, nestingEventType);
        set(40, nestingEventLevel);
    }
}
