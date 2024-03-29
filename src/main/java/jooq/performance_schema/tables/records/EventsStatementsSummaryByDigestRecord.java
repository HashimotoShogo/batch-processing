/*
 * This file is generated by jOOQ.
 */
package jooq.performance_schema.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.performance_schema.tables.EventsStatementsSummaryByDigest;

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
public class EventsStatementsSummaryByDigestRecord extends TableRecordImpl<EventsStatementsSummaryByDigestRecord> {

    private static final long serialVersionUID = 1907475298;

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_digest.SCHEMA_NAME</code>.
     */
    public void setSchemaName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_digest.SCHEMA_NAME</code>.
     */
    public String getSchemaName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_digest.DIGEST</code>.
     */
    public void setDigest(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_digest.DIGEST</code>.
     */
    public String getDigest() {
        return (String) get(1);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_digest.DIGEST_TEXT</code>.
     */
    public void setDigestText(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_digest.DIGEST_TEXT</code>.
     */
    public String getDigestText() {
        return (String) get(2);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_digest.COUNT_STAR</code>.
     */
    public void setCountStar(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_digest.COUNT_STAR</code>.
     */
    public ULong getCountStar() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_digest.SUM_TIMER_WAIT</code>.
     */
    public void setSumTimerWait(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_digest.SUM_TIMER_WAIT</code>.
     */
    public ULong getSumTimerWait() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_digest.MIN_TIMER_WAIT</code>.
     */
    public void setMinTimerWait(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_digest.MIN_TIMER_WAIT</code>.
     */
    public ULong getMinTimerWait() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_digest.AVG_TIMER_WAIT</code>.
     */
    public void setAvgTimerWait(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_digest.AVG_TIMER_WAIT</code>.
     */
    public ULong getAvgTimerWait() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_digest.MAX_TIMER_WAIT</code>.
     */
    public void setMaxTimerWait(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_digest.MAX_TIMER_WAIT</code>.
     */
    public ULong getMaxTimerWait() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_digest.SUM_LOCK_TIME</code>.
     */
    public void setSumLockTime(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_digest.SUM_LOCK_TIME</code>.
     */
    public ULong getSumLockTime() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_digest.SUM_ERRORS</code>.
     */
    public void setSumErrors(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_digest.SUM_ERRORS</code>.
     */
    public ULong getSumErrors() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_digest.SUM_WARNINGS</code>.
     */
    public void setSumWarnings(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_digest.SUM_WARNINGS</code>.
     */
    public ULong getSumWarnings() {
        return (ULong) get(10);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_digest.SUM_ROWS_AFFECTED</code>.
     */
    public void setSumRowsAffected(ULong value) {
        set(11, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_digest.SUM_ROWS_AFFECTED</code>.
     */
    public ULong getSumRowsAffected() {
        return (ULong) get(11);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_digest.SUM_ROWS_SENT</code>.
     */
    public void setSumRowsSent(ULong value) {
        set(12, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_digest.SUM_ROWS_SENT</code>.
     */
    public ULong getSumRowsSent() {
        return (ULong) get(12);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_digest.SUM_ROWS_EXAMINED</code>.
     */
    public void setSumRowsExamined(ULong value) {
        set(13, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_digest.SUM_ROWS_EXAMINED</code>.
     */
    public ULong getSumRowsExamined() {
        return (ULong) get(13);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_digest.SUM_CREATED_TMP_DISK_TABLES</code>.
     */
    public void setSumCreatedTmpDiskTables(ULong value) {
        set(14, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_digest.SUM_CREATED_TMP_DISK_TABLES</code>.
     */
    public ULong getSumCreatedTmpDiskTables() {
        return (ULong) get(14);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_digest.SUM_CREATED_TMP_TABLES</code>.
     */
    public void setSumCreatedTmpTables(ULong value) {
        set(15, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_digest.SUM_CREATED_TMP_TABLES</code>.
     */
    public ULong getSumCreatedTmpTables() {
        return (ULong) get(15);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_digest.SUM_SELECT_FULL_JOIN</code>.
     */
    public void setSumSelectFullJoin(ULong value) {
        set(16, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_digest.SUM_SELECT_FULL_JOIN</code>.
     */
    public ULong getSumSelectFullJoin() {
        return (ULong) get(16);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_digest.SUM_SELECT_FULL_RANGE_JOIN</code>.
     */
    public void setSumSelectFullRangeJoin(ULong value) {
        set(17, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_digest.SUM_SELECT_FULL_RANGE_JOIN</code>.
     */
    public ULong getSumSelectFullRangeJoin() {
        return (ULong) get(17);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_digest.SUM_SELECT_RANGE</code>.
     */
    public void setSumSelectRange(ULong value) {
        set(18, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_digest.SUM_SELECT_RANGE</code>.
     */
    public ULong getSumSelectRange() {
        return (ULong) get(18);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_digest.SUM_SELECT_RANGE_CHECK</code>.
     */
    public void setSumSelectRangeCheck(ULong value) {
        set(19, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_digest.SUM_SELECT_RANGE_CHECK</code>.
     */
    public ULong getSumSelectRangeCheck() {
        return (ULong) get(19);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_digest.SUM_SELECT_SCAN</code>.
     */
    public void setSumSelectScan(ULong value) {
        set(20, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_digest.SUM_SELECT_SCAN</code>.
     */
    public ULong getSumSelectScan() {
        return (ULong) get(20);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_digest.SUM_SORT_MERGE_PASSES</code>.
     */
    public void setSumSortMergePasses(ULong value) {
        set(21, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_digest.SUM_SORT_MERGE_PASSES</code>.
     */
    public ULong getSumSortMergePasses() {
        return (ULong) get(21);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_digest.SUM_SORT_RANGE</code>.
     */
    public void setSumSortRange(ULong value) {
        set(22, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_digest.SUM_SORT_RANGE</code>.
     */
    public ULong getSumSortRange() {
        return (ULong) get(22);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_digest.SUM_SORT_ROWS</code>.
     */
    public void setSumSortRows(ULong value) {
        set(23, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_digest.SUM_SORT_ROWS</code>.
     */
    public ULong getSumSortRows() {
        return (ULong) get(23);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_digest.SUM_SORT_SCAN</code>.
     */
    public void setSumSortScan(ULong value) {
        set(24, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_digest.SUM_SORT_SCAN</code>.
     */
    public ULong getSumSortScan() {
        return (ULong) get(24);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_digest.SUM_NO_INDEX_USED</code>.
     */
    public void setSumNoIndexUsed(ULong value) {
        set(25, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_digest.SUM_NO_INDEX_USED</code>.
     */
    public ULong getSumNoIndexUsed() {
        return (ULong) get(25);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_digest.SUM_NO_GOOD_INDEX_USED</code>.
     */
    public void setSumNoGoodIndexUsed(ULong value) {
        set(26, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_digest.SUM_NO_GOOD_INDEX_USED</code>.
     */
    public ULong getSumNoGoodIndexUsed() {
        return (ULong) get(26);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_digest.FIRST_SEEN</code>.
     */
    public void setFirstSeen(Timestamp value) {
        set(27, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_digest.FIRST_SEEN</code>.
     */
    public Timestamp getFirstSeen() {
        return (Timestamp) get(27);
    }

    /**
     * Setter for <code>performance_schema.events_statements_summary_by_digest.LAST_SEEN</code>.
     */
    public void setLastSeen(Timestamp value) {
        set(28, value);
    }

    /**
     * Getter for <code>performance_schema.events_statements_summary_by_digest.LAST_SEEN</code>.
     */
    public Timestamp getLastSeen() {
        return (Timestamp) get(28);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EventsStatementsSummaryByDigestRecord
     */
    public EventsStatementsSummaryByDigestRecord() {
        super(EventsStatementsSummaryByDigest.EVENTS_STATEMENTS_SUMMARY_BY_DIGEST);
    }

    /**
     * Create a detached, initialised EventsStatementsSummaryByDigestRecord
     */
    public EventsStatementsSummaryByDigestRecord(String schemaName, String digest, String digestText, ULong countStar, ULong sumTimerWait, ULong minTimerWait, ULong avgTimerWait, ULong maxTimerWait, ULong sumLockTime, ULong sumErrors, ULong sumWarnings, ULong sumRowsAffected, ULong sumRowsSent, ULong sumRowsExamined, ULong sumCreatedTmpDiskTables, ULong sumCreatedTmpTables, ULong sumSelectFullJoin, ULong sumSelectFullRangeJoin, ULong sumSelectRange, ULong sumSelectRangeCheck, ULong sumSelectScan, ULong sumSortMergePasses, ULong sumSortRange, ULong sumSortRows, ULong sumSortScan, ULong sumNoIndexUsed, ULong sumNoGoodIndexUsed, Timestamp firstSeen, Timestamp lastSeen) {
        super(EventsStatementsSummaryByDigest.EVENTS_STATEMENTS_SUMMARY_BY_DIGEST);

        set(0, schemaName);
        set(1, digest);
        set(2, digestText);
        set(3, countStar);
        set(4, sumTimerWait);
        set(5, minTimerWait);
        set(6, avgTimerWait);
        set(7, maxTimerWait);
        set(8, sumLockTime);
        set(9, sumErrors);
        set(10, sumWarnings);
        set(11, sumRowsAffected);
        set(12, sumRowsSent);
        set(13, sumRowsExamined);
        set(14, sumCreatedTmpDiskTables);
        set(15, sumCreatedTmpTables);
        set(16, sumSelectFullJoin);
        set(17, sumSelectFullRangeJoin);
        set(18, sumSelectRange);
        set(19, sumSelectRangeCheck);
        set(20, sumSelectScan);
        set(21, sumSortMergePasses);
        set(22, sumSortRange);
        set(23, sumSortRows);
        set(24, sumSortScan);
        set(25, sumNoIndexUsed);
        set(26, sumNoGoodIndexUsed);
        set(27, firstSeen);
        set(28, lastSeen);
    }
}
