/*
 * This file is generated by jOOQ.
 */
package jooq.performance_schema.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.performance_schema.enums.ReplicationApplierStatusByWorkerServiceState;
import jooq.performance_schema.tables.ReplicationApplierStatusByWorker;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class ReplicationApplierStatusByWorkerRecord extends TableRecordImpl<ReplicationApplierStatusByWorkerRecord> implements Record8<String, ULong, ULong, ReplicationApplierStatusByWorkerServiceState, String, Integer, String, Timestamp> {

    private static final long serialVersionUID = -1531926691;

    /**
     * Setter for <code>performance_schema.replication_applier_status_by_worker.CHANNEL_NAME</code>.
     */
    public void setChannelName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_status_by_worker.CHANNEL_NAME</code>.
     */
    public String getChannelName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_status_by_worker.WORKER_ID</code>.
     */
    public void setWorkerId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_status_by_worker.WORKER_ID</code>.
     */
    public ULong getWorkerId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_status_by_worker.THREAD_ID</code>.
     */
    public void setThreadId(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_status_by_worker.THREAD_ID</code>.
     */
    public ULong getThreadId() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_status_by_worker.SERVICE_STATE</code>.
     */
    public void setServiceState(ReplicationApplierStatusByWorkerServiceState value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_status_by_worker.SERVICE_STATE</code>.
     */
    public ReplicationApplierStatusByWorkerServiceState getServiceState() {
        return (ReplicationApplierStatusByWorkerServiceState) get(3);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_status_by_worker.LAST_SEEN_TRANSACTION</code>.
     */
    public void setLastSeenTransaction(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_status_by_worker.LAST_SEEN_TRANSACTION</code>.
     */
    public String getLastSeenTransaction() {
        return (String) get(4);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_status_by_worker.LAST_ERROR_NUMBER</code>.
     */
    public void setLastErrorNumber(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_status_by_worker.LAST_ERROR_NUMBER</code>.
     */
    public Integer getLastErrorNumber() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_status_by_worker.LAST_ERROR_MESSAGE</code>.
     */
    public void setLastErrorMessage(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_status_by_worker.LAST_ERROR_MESSAGE</code>.
     */
    public String getLastErrorMessage() {
        return (String) get(6);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_status_by_worker.LAST_ERROR_TIMESTAMP</code>.
     */
    public void setLastErrorTimestamp(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_status_by_worker.LAST_ERROR_TIMESTAMP</code>.
     */
    public Timestamp getLastErrorTimestamp() {
        return (Timestamp) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, ULong, ULong, ReplicationApplierStatusByWorkerServiceState, String, Integer, String, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, ULong, ULong, ReplicationApplierStatusByWorkerServiceState, String, Integer, String, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ReplicationApplierStatusByWorker.REPLICATION_APPLIER_STATUS_BY_WORKER.CHANNEL_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field2() {
        return ReplicationApplierStatusByWorker.REPLICATION_APPLIER_STATUS_BY_WORKER.WORKER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field3() {
        return ReplicationApplierStatusByWorker.REPLICATION_APPLIER_STATUS_BY_WORKER.THREAD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ReplicationApplierStatusByWorkerServiceState> field4() {
        return ReplicationApplierStatusByWorker.REPLICATION_APPLIER_STATUS_BY_WORKER.SERVICE_STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ReplicationApplierStatusByWorker.REPLICATION_APPLIER_STATUS_BY_WORKER.LAST_SEEN_TRANSACTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return ReplicationApplierStatusByWorker.REPLICATION_APPLIER_STATUS_BY_WORKER.LAST_ERROR_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ReplicationApplierStatusByWorker.REPLICATION_APPLIER_STATUS_BY_WORKER.LAST_ERROR_MESSAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return ReplicationApplierStatusByWorker.REPLICATION_APPLIER_STATUS_BY_WORKER.LAST_ERROR_TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getChannelName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component2() {
        return getWorkerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component3() {
        return getThreadId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierStatusByWorkerServiceState component4() {
        return getServiceState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getLastSeenTransaction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getLastErrorNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getLastErrorMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getLastErrorTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getChannelName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value2() {
        return getWorkerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value3() {
        return getThreadId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierStatusByWorkerServiceState value4() {
        return getServiceState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLastSeenTransaction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getLastErrorNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getLastErrorMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getLastErrorTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierStatusByWorkerRecord value1(String value) {
        setChannelName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierStatusByWorkerRecord value2(ULong value) {
        setWorkerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierStatusByWorkerRecord value3(ULong value) {
        setThreadId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierStatusByWorkerRecord value4(ReplicationApplierStatusByWorkerServiceState value) {
        setServiceState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierStatusByWorkerRecord value5(String value) {
        setLastSeenTransaction(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierStatusByWorkerRecord value6(Integer value) {
        setLastErrorNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierStatusByWorkerRecord value7(String value) {
        setLastErrorMessage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierStatusByWorkerRecord value8(Timestamp value) {
        setLastErrorTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierStatusByWorkerRecord values(String value1, ULong value2, ULong value3, ReplicationApplierStatusByWorkerServiceState value4, String value5, Integer value6, String value7, Timestamp value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReplicationApplierStatusByWorkerRecord
     */
    public ReplicationApplierStatusByWorkerRecord() {
        super(ReplicationApplierStatusByWorker.REPLICATION_APPLIER_STATUS_BY_WORKER);
    }

    /**
     * Create a detached, initialised ReplicationApplierStatusByWorkerRecord
     */
    public ReplicationApplierStatusByWorkerRecord(String channelName, ULong workerId, ULong threadId, ReplicationApplierStatusByWorkerServiceState serviceState, String lastSeenTransaction, Integer lastErrorNumber, String lastErrorMessage, Timestamp lastErrorTimestamp) {
        super(ReplicationApplierStatusByWorker.REPLICATION_APPLIER_STATUS_BY_WORKER);

        set(0, channelName);
        set(1, workerId);
        set(2, threadId);
        set(3, serviceState);
        set(4, lastSeenTransaction);
        set(5, lastErrorNumber);
        set(6, lastErrorMessage);
        set(7, lastErrorTimestamp);
    }
}
