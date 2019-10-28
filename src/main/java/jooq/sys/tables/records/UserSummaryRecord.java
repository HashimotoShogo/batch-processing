/*
 * This file is generated by jOOQ.
 */
package jooq.sys.tables.records;


import java.math.BigInteger;

import javax.annotation.Generated;

import jooq.sys.tables.UserSummary;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
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
public class UserSummaryRecord extends TableRecordImpl<UserSummaryRecord> implements Record12<String, BigInteger, String, String, BigInteger, BigInteger, String, BigInteger, BigInteger, Long, String, String> {

    private static final long serialVersionUID = 1404147639;

    /**
     * Setter for <code>sys.user_summary.user</code>.
     */
    public void setUser(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.user_summary.user</code>.
     */
    public String getUser() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.user_summary.statements</code>.
     */
    public void setStatements(BigInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.user_summary.statements</code>.
     */
    public BigInteger getStatements() {
        return (BigInteger) get(1);
    }

    /**
     * Setter for <code>sys.user_summary.statement_latency</code>.
     */
    public void setStatementLatency(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.user_summary.statement_latency</code>.
     */
    public String getStatementLatency() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sys.user_summary.statement_avg_latency</code>.
     */
    public void setStatementAvgLatency(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.user_summary.statement_avg_latency</code>.
     */
    public String getStatementAvgLatency() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sys.user_summary.table_scans</code>.
     */
    public void setTableScans(BigInteger value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.user_summary.table_scans</code>.
     */
    public BigInteger getTableScans() {
        return (BigInteger) get(4);
    }

    /**
     * Setter for <code>sys.user_summary.file_ios</code>.
     */
    public void setFileIos(BigInteger value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.user_summary.file_ios</code>.
     */
    public BigInteger getFileIos() {
        return (BigInteger) get(5);
    }

    /**
     * Setter for <code>sys.user_summary.file_io_latency</code>.
     */
    public void setFileIoLatency(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>sys.user_summary.file_io_latency</code>.
     */
    public String getFileIoLatency() {
        return (String) get(6);
    }

    /**
     * Setter for <code>sys.user_summary.current_connections</code>.
     */
    public void setCurrentConnections(BigInteger value) {
        set(7, value);
    }

    /**
     * Getter for <code>sys.user_summary.current_connections</code>.
     */
    public BigInteger getCurrentConnections() {
        return (BigInteger) get(7);
    }

    /**
     * Setter for <code>sys.user_summary.total_connections</code>.
     */
    public void setTotalConnections(BigInteger value) {
        set(8, value);
    }

    /**
     * Getter for <code>sys.user_summary.total_connections</code>.
     */
    public BigInteger getTotalConnections() {
        return (BigInteger) get(8);
    }

    /**
     * Setter for <code>sys.user_summary.unique_hosts</code>.
     */
    public void setUniqueHosts(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>sys.user_summary.unique_hosts</code>.
     */
    public Long getUniqueHosts() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>sys.user_summary.current_memory</code>.
     */
    public void setCurrentMemory(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>sys.user_summary.current_memory</code>.
     */
    public String getCurrentMemory() {
        return (String) get(10);
    }

    /**
     * Setter for <code>sys.user_summary.total_memory_allocated</code>.
     */
    public void setTotalMemoryAllocated(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>sys.user_summary.total_memory_allocated</code>.
     */
    public String getTotalMemoryAllocated() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<String, BigInteger, String, String, BigInteger, BigInteger, String, BigInteger, BigInteger, Long, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<String, BigInteger, String, String, BigInteger, BigInteger, String, BigInteger, BigInteger, Long, String, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return UserSummary.USER_SUMMARY.USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field2() {
        return UserSummary.USER_SUMMARY.STATEMENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return UserSummary.USER_SUMMARY.STATEMENT_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return UserSummary.USER_SUMMARY.STATEMENT_AVG_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field5() {
        return UserSummary.USER_SUMMARY.TABLE_SCANS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field6() {
        return UserSummary.USER_SUMMARY.FILE_IOS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return UserSummary.USER_SUMMARY.FILE_IO_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field8() {
        return UserSummary.USER_SUMMARY.CURRENT_CONNECTIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field9() {
        return UserSummary.USER_SUMMARY.TOTAL_CONNECTIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return UserSummary.USER_SUMMARY.UNIQUE_HOSTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return UserSummary.USER_SUMMARY.CURRENT_MEMORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return UserSummary.USER_SUMMARY.TOTAL_MEMORY_ALLOCATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger component2() {
        return getStatements();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getStatementLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getStatementAvgLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger component5() {
        return getTableScans();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger component6() {
        return getFileIos();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getFileIoLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger component8() {
        return getCurrentConnections();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger component9() {
        return getTotalConnections();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component10() {
        return getUniqueHosts();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getCurrentMemory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getTotalMemoryAllocated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value2() {
        return getStatements();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getStatementLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getStatementAvgLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value5() {
        return getTableScans();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value6() {
        return getFileIos();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getFileIoLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value8() {
        return getCurrentConnections();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value9() {
        return getTotalConnections();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getUniqueHosts();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getCurrentMemory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getTotalMemoryAllocated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSummaryRecord value1(String value) {
        setUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSummaryRecord value2(BigInteger value) {
        setStatements(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSummaryRecord value3(String value) {
        setStatementLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSummaryRecord value4(String value) {
        setStatementAvgLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSummaryRecord value5(BigInteger value) {
        setTableScans(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSummaryRecord value6(BigInteger value) {
        setFileIos(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSummaryRecord value7(String value) {
        setFileIoLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSummaryRecord value8(BigInteger value) {
        setCurrentConnections(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSummaryRecord value9(BigInteger value) {
        setTotalConnections(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSummaryRecord value10(Long value) {
        setUniqueHosts(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSummaryRecord value11(String value) {
        setCurrentMemory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSummaryRecord value12(String value) {
        setTotalMemoryAllocated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSummaryRecord values(String value1, BigInteger value2, String value3, String value4, BigInteger value5, BigInteger value6, String value7, BigInteger value8, BigInteger value9, Long value10, String value11, String value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserSummaryRecord
     */
    public UserSummaryRecord() {
        super(UserSummary.USER_SUMMARY);
    }

    /**
     * Create a detached, initialised UserSummaryRecord
     */
    public UserSummaryRecord(String user, BigInteger statements, String statementLatency, String statementAvgLatency, BigInteger tableScans, BigInteger fileIos, String fileIoLatency, BigInteger currentConnections, BigInteger totalConnections, Long uniqueHosts, String currentMemory, String totalMemoryAllocated) {
        super(UserSummary.USER_SUMMARY);

        set(0, user);
        set(1, statements);
        set(2, statementLatency);
        set(3, statementAvgLatency);
        set(4, tableScans);
        set(5, fileIos);
        set(6, fileIoLatency);
        set(7, currentConnections);
        set(8, totalConnections);
        set(9, uniqueHosts);
        set(10, currentMemory);
        set(11, totalMemoryAllocated);
    }
}
