/*
 * This file is generated by jOOQ.
 */
package jooq.performance_schema.tables.records;


import javax.annotation.Generated;

import jooq.performance_schema.enums.ThreadsHistory;
import jooq.performance_schema.enums.ThreadsInstrumented;
import jooq.performance_schema.tables.Threads;

import org.jooq.Field;
import org.jooq.Record17;
import org.jooq.Row17;
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
public class ThreadsRecord extends TableRecordImpl<ThreadsRecord> implements Record17<ULong, String, String, ULong, String, String, String, String, Long, String, String, ULong, String, ThreadsInstrumented, ThreadsHistory, String, ULong> {

    private static final long serialVersionUID = 1346623245;

    /**
     * Setter for <code>performance_schema.threads.THREAD_ID</code>.
     */
    public void setThreadId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.threads.THREAD_ID</code>.
     */
    public ULong getThreadId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>performance_schema.threads.NAME</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.threads.NAME</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>performance_schema.threads.TYPE</code>.
     */
    public void setType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.threads.TYPE</code>.
     */
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>performance_schema.threads.PROCESSLIST_ID</code>.
     */
    public void setProcesslistId(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.threads.PROCESSLIST_ID</code>.
     */
    public ULong getProcesslistId() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>performance_schema.threads.PROCESSLIST_USER</code>.
     */
    public void setProcesslistUser(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.threads.PROCESSLIST_USER</code>.
     */
    public String getProcesslistUser() {
        return (String) get(4);
    }

    /**
     * Setter for <code>performance_schema.threads.PROCESSLIST_HOST</code>.
     */
    public void setProcesslistHost(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.threads.PROCESSLIST_HOST</code>.
     */
    public String getProcesslistHost() {
        return (String) get(5);
    }

    /**
     * Setter for <code>performance_schema.threads.PROCESSLIST_DB</code>.
     */
    public void setProcesslistDb(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.threads.PROCESSLIST_DB</code>.
     */
    public String getProcesslistDb() {
        return (String) get(6);
    }

    /**
     * Setter for <code>performance_schema.threads.PROCESSLIST_COMMAND</code>.
     */
    public void setProcesslistCommand(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>performance_schema.threads.PROCESSLIST_COMMAND</code>.
     */
    public String getProcesslistCommand() {
        return (String) get(7);
    }

    /**
     * Setter for <code>performance_schema.threads.PROCESSLIST_TIME</code>.
     */
    public void setProcesslistTime(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>performance_schema.threads.PROCESSLIST_TIME</code>.
     */
    public Long getProcesslistTime() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>performance_schema.threads.PROCESSLIST_STATE</code>.
     */
    public void setProcesslistState(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>performance_schema.threads.PROCESSLIST_STATE</code>.
     */
    public String getProcesslistState() {
        return (String) get(9);
    }

    /**
     * Setter for <code>performance_schema.threads.PROCESSLIST_INFO</code>.
     */
    public void setProcesslistInfo(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>performance_schema.threads.PROCESSLIST_INFO</code>.
     */
    public String getProcesslistInfo() {
        return (String) get(10);
    }

    /**
     * Setter for <code>performance_schema.threads.PARENT_THREAD_ID</code>.
     */
    public void setParentThreadId(ULong value) {
        set(11, value);
    }

    /**
     * Getter for <code>performance_schema.threads.PARENT_THREAD_ID</code>.
     */
    public ULong getParentThreadId() {
        return (ULong) get(11);
    }

    /**
     * Setter for <code>performance_schema.threads.ROLE</code>.
     */
    public void setRole(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>performance_schema.threads.ROLE</code>.
     */
    public String getRole() {
        return (String) get(12);
    }

    /**
     * Setter for <code>performance_schema.threads.INSTRUMENTED</code>.
     */
    public void setInstrumented(ThreadsInstrumented value) {
        set(13, value);
    }

    /**
     * Getter for <code>performance_schema.threads.INSTRUMENTED</code>.
     */
    public ThreadsInstrumented getInstrumented() {
        return (ThreadsInstrumented) get(13);
    }

    /**
     * Setter for <code>performance_schema.threads.HISTORY</code>.
     */
    public void setHistory(ThreadsHistory value) {
        set(14, value);
    }

    /**
     * Getter for <code>performance_schema.threads.HISTORY</code>.
     */
    public ThreadsHistory getHistory() {
        return (ThreadsHistory) get(14);
    }

    /**
     * Setter for <code>performance_schema.threads.CONNECTION_TYPE</code>.
     */
    public void setConnectionType(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>performance_schema.threads.CONNECTION_TYPE</code>.
     */
    public String getConnectionType() {
        return (String) get(15);
    }

    /**
     * Setter for <code>performance_schema.threads.THREAD_OS_ID</code>.
     */
    public void setThreadOsId(ULong value) {
        set(16, value);
    }

    /**
     * Getter for <code>performance_schema.threads.THREAD_OS_ID</code>.
     */
    public ULong getThreadOsId() {
        return (ULong) get(16);
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<ULong, String, String, ULong, String, String, String, String, Long, String, String, ULong, String, ThreadsInstrumented, ThreadsHistory, String, ULong> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<ULong, String, String, ULong, String, String, String, String, Long, String, String, ULong, String, ThreadsInstrumented, ThreadsHistory, String, ULong> valuesRow() {
        return (Row17) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return Threads.THREADS.THREAD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Threads.THREADS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Threads.THREADS.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return Threads.THREADS.PROCESSLIST_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Threads.THREADS.PROCESSLIST_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Threads.THREADS.PROCESSLIST_HOST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Threads.THREADS.PROCESSLIST_DB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Threads.THREADS.PROCESSLIST_COMMAND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return Threads.THREADS.PROCESSLIST_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Threads.THREADS.PROCESSLIST_STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Threads.THREADS.PROCESSLIST_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field12() {
        return Threads.THREADS.PARENT_THREAD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Threads.THREADS.ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ThreadsInstrumented> field14() {
        return Threads.THREADS.INSTRUMENTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ThreadsHistory> field15() {
        return Threads.THREADS.HISTORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return Threads.THREADS.CONNECTION_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field17() {
        return Threads.THREADS.THREAD_OS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component1() {
        return getThreadId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component4() {
        return getProcesslistId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getProcesslistUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getProcesslistHost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getProcesslistDb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getProcesslistCommand();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component9() {
        return getProcesslistTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getProcesslistState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getProcesslistInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component12() {
        return getParentThreadId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThreadsInstrumented component14() {
        return getInstrumented();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThreadsHistory component15() {
        return getHistory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getConnectionType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component17() {
        return getThreadOsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getThreadId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value4() {
        return getProcesslistId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getProcesslistUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getProcesslistHost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getProcesslistDb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getProcesslistCommand();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getProcesslistTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getProcesslistState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getProcesslistInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value12() {
        return getParentThreadId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThreadsInstrumented value14() {
        return getInstrumented();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThreadsHistory value15() {
        return getHistory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getConnectionType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value17() {
        return getThreadOsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThreadsRecord value1(ULong value) {
        setThreadId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThreadsRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThreadsRecord value3(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThreadsRecord value4(ULong value) {
        setProcesslistId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThreadsRecord value5(String value) {
        setProcesslistUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThreadsRecord value6(String value) {
        setProcesslistHost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThreadsRecord value7(String value) {
        setProcesslistDb(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThreadsRecord value8(String value) {
        setProcesslistCommand(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThreadsRecord value9(Long value) {
        setProcesslistTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThreadsRecord value10(String value) {
        setProcesslistState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThreadsRecord value11(String value) {
        setProcesslistInfo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThreadsRecord value12(ULong value) {
        setParentThreadId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThreadsRecord value13(String value) {
        setRole(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThreadsRecord value14(ThreadsInstrumented value) {
        setInstrumented(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThreadsRecord value15(ThreadsHistory value) {
        setHistory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThreadsRecord value16(String value) {
        setConnectionType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThreadsRecord value17(ULong value) {
        setThreadOsId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThreadsRecord values(ULong value1, String value2, String value3, ULong value4, String value5, String value6, String value7, String value8, Long value9, String value10, String value11, ULong value12, String value13, ThreadsInstrumented value14, ThreadsHistory value15, String value16, ULong value17) {
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
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ThreadsRecord
     */
    public ThreadsRecord() {
        super(Threads.THREADS);
    }

    /**
     * Create a detached, initialised ThreadsRecord
     */
    public ThreadsRecord(ULong threadId, String name, String type, ULong processlistId, String processlistUser, String processlistHost, String processlistDb, String processlistCommand, Long processlistTime, String processlistState, String processlistInfo, ULong parentThreadId, String role, ThreadsInstrumented instrumented, ThreadsHistory history, String connectionType, ULong threadOsId) {
        super(Threads.THREADS);

        set(0, threadId);
        set(1, name);
        set(2, type);
        set(3, processlistId);
        set(4, processlistUser);
        set(5, processlistHost);
        set(6, processlistDb);
        set(7, processlistCommand);
        set(8, processlistTime);
        set(9, processlistState);
        set(10, processlistInfo);
        set(11, parentThreadId);
        set(12, role);
        set(13, instrumented);
        set(14, history);
        set(15, connectionType);
        set(16, threadOsId);
    }
}
