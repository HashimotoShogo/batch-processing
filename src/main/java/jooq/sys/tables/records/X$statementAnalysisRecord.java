/*
 * This file is generated by jOOQ.
 */
package jooq.sys.tables.records;


import java.math.BigInteger;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.sys.tables.X$statementAnalysis;

import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


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
public class X$statementAnalysisRecord extends TableRecordImpl<X$statementAnalysisRecord> {

    private static final long serialVersionUID = -979075526;

    /**
     * Setter for <code>sys.x$statement_analysis.query</code>.
     */
    public void setQuery(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.query</code>.
     */
    public String getQuery() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.db</code>.
     */
    public void setDb(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.db</code>.
     */
    public String getDb() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.full_scan</code>.
     */
    public void setFullScan(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.full_scan</code>.
     */
    public String getFullScan() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.exec_count</code>.
     */
    public void setExecCount(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.exec_count</code>.
     */
    public ULong getExecCount() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.err_count</code>.
     */
    public void setErrCount(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.err_count</code>.
     */
    public ULong getErrCount() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.warn_count</code>.
     */
    public void setWarnCount(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.warn_count</code>.
     */
    public ULong getWarnCount() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.total_latency</code>.
     */
    public void setTotalLatency(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.total_latency</code>.
     */
    public ULong getTotalLatency() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.max_latency</code>.
     */
    public void setMaxLatency(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.max_latency</code>.
     */
    public ULong getMaxLatency() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.avg_latency</code>.
     */
    public void setAvgLatency(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.avg_latency</code>.
     */
    public ULong getAvgLatency() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.lock_latency</code>.
     */
    public void setLockLatency(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.lock_latency</code>.
     */
    public ULong getLockLatency() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.rows_sent</code>.
     */
    public void setRowsSent(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.rows_sent</code>.
     */
    public ULong getRowsSent() {
        return (ULong) get(10);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.rows_sent_avg</code>.
     */
    public void setRowsSentAvg(BigInteger value) {
        set(11, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.rows_sent_avg</code>.
     */
    public BigInteger getRowsSentAvg() {
        return (BigInteger) get(11);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.rows_examined</code>.
     */
    public void setRowsExamined(ULong value) {
        set(12, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.rows_examined</code>.
     */
    public ULong getRowsExamined() {
        return (ULong) get(12);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.rows_examined_avg</code>.
     */
    public void setRowsExaminedAvg(BigInteger value) {
        set(13, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.rows_examined_avg</code>.
     */
    public BigInteger getRowsExaminedAvg() {
        return (BigInteger) get(13);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.rows_affected</code>.
     */
    public void setRowsAffected(ULong value) {
        set(14, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.rows_affected</code>.
     */
    public ULong getRowsAffected() {
        return (ULong) get(14);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.rows_affected_avg</code>.
     */
    public void setRowsAffectedAvg(BigInteger value) {
        set(15, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.rows_affected_avg</code>.
     */
    public BigInteger getRowsAffectedAvg() {
        return (BigInteger) get(15);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.tmp_tables</code>.
     */
    public void setTmpTables(ULong value) {
        set(16, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.tmp_tables</code>.
     */
    public ULong getTmpTables() {
        return (ULong) get(16);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.tmp_disk_tables</code>.
     */
    public void setTmpDiskTables(ULong value) {
        set(17, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.tmp_disk_tables</code>.
     */
    public ULong getTmpDiskTables() {
        return (ULong) get(17);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.rows_sorted</code>.
     */
    public void setRowsSorted(ULong value) {
        set(18, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.rows_sorted</code>.
     */
    public ULong getRowsSorted() {
        return (ULong) get(18);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.sort_merge_passes</code>.
     */
    public void setSortMergePasses(ULong value) {
        set(19, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.sort_merge_passes</code>.
     */
    public ULong getSortMergePasses() {
        return (ULong) get(19);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.digest</code>.
     */
    public void setDigest(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.digest</code>.
     */
    public String getDigest() {
        return (String) get(20);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.first_seen</code>.
     */
    public void setFirstSeen(Timestamp value) {
        set(21, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.first_seen</code>.
     */
    public Timestamp getFirstSeen() {
        return (Timestamp) get(21);
    }

    /**
     * Setter for <code>sys.x$statement_analysis.last_seen</code>.
     */
    public void setLastSeen(Timestamp value) {
        set(22, value);
    }

    /**
     * Getter for <code>sys.x$statement_analysis.last_seen</code>.
     */
    public Timestamp getLastSeen() {
        return (Timestamp) get(22);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached X$statementAnalysisRecord
     */
    public X$statementAnalysisRecord() {
        super(X$statementAnalysis.X$STATEMENT_ANALYSIS);
    }

    /**
     * Create a detached, initialised X$statementAnalysisRecord
     */
    public X$statementAnalysisRecord(String query, String db, String fullScan, ULong execCount, ULong errCount, ULong warnCount, ULong totalLatency, ULong maxLatency, ULong avgLatency, ULong lockLatency, ULong rowsSent, BigInteger rowsSentAvg, ULong rowsExamined, BigInteger rowsExaminedAvg, ULong rowsAffected, BigInteger rowsAffectedAvg, ULong tmpTables, ULong tmpDiskTables, ULong rowsSorted, ULong sortMergePasses, String digest, Timestamp firstSeen, Timestamp lastSeen) {
        super(X$statementAnalysis.X$STATEMENT_ANALYSIS);

        set(0, query);
        set(1, db);
        set(2, fullScan);
        set(3, execCount);
        set(4, errCount);
        set(5, warnCount);
        set(6, totalLatency);
        set(7, maxLatency);
        set(8, avgLatency);
        set(9, lockLatency);
        set(10, rowsSent);
        set(11, rowsSentAvg);
        set(12, rowsExamined);
        set(13, rowsExaminedAvg);
        set(14, rowsAffected);
        set(15, rowsAffectedAvg);
        set(16, tmpTables);
        set(17, tmpDiskTables);
        set(18, rowsSorted);
        set(19, sortMergePasses);
        set(20, digest);
        set(21, firstSeen);
        set(22, lastSeen);
    }
}
