/*
 * This file is generated by jOOQ.
 */
package jooq.sys.tables.records;


import java.sql.Time;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.sys.tables.InnodbLockWaits;

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
public class InnodbLockWaitsRecord extends TableRecordImpl<InnodbLockWaitsRecord> {

    private static final long serialVersionUID = -1928746988;

    /**
     * Setter for <code>sys.innodb_lock_waits.wait_started</code>.
     */
    public void setWaitStarted(Timestamp value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.innodb_lock_waits.wait_started</code>.
     */
    public Timestamp getWaitStarted() {
        return (Timestamp) get(0);
    }

    /**
     * Setter for <code>sys.innodb_lock_waits.wait_age</code>.
     */
    public void setWaitAge(Time value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.innodb_lock_waits.wait_age</code>.
     */
    public Time getWaitAge() {
        return (Time) get(1);
    }

    /**
     * Setter for <code>sys.innodb_lock_waits.wait_age_secs</code>.
     */
    public void setWaitAgeSecs(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.innodb_lock_waits.wait_age_secs</code>.
     */
    public Long getWaitAgeSecs() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>sys.innodb_lock_waits.locked_table</code>.
     */
    public void setLockedTable(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.innodb_lock_waits.locked_table</code>.
     */
    public String getLockedTable() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sys.innodb_lock_waits.locked_index</code>.
     */
    public void setLockedIndex(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.innodb_lock_waits.locked_index</code>.
     */
    public String getLockedIndex() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sys.innodb_lock_waits.locked_type</code>.
     */
    public void setLockedType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.innodb_lock_waits.locked_type</code>.
     */
    public String getLockedType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sys.innodb_lock_waits.waiting_trx_id</code>.
     */
    public void setWaitingTrxId(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>sys.innodb_lock_waits.waiting_trx_id</code>.
     */
    public String getWaitingTrxId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>sys.innodb_lock_waits.waiting_trx_started</code>.
     */
    public void setWaitingTrxStarted(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>sys.innodb_lock_waits.waiting_trx_started</code>.
     */
    public Timestamp getWaitingTrxStarted() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>sys.innodb_lock_waits.waiting_trx_age</code>.
     */
    public void setWaitingTrxAge(Time value) {
        set(8, value);
    }

    /**
     * Getter for <code>sys.innodb_lock_waits.waiting_trx_age</code>.
     */
    public Time getWaitingTrxAge() {
        return (Time) get(8);
    }

    /**
     * Setter for <code>sys.innodb_lock_waits.waiting_trx_rows_locked</code>.
     */
    public void setWaitingTrxRowsLocked(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>sys.innodb_lock_waits.waiting_trx_rows_locked</code>.
     */
    public ULong getWaitingTrxRowsLocked() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>sys.innodb_lock_waits.waiting_trx_rows_modified</code>.
     */
    public void setWaitingTrxRowsModified(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>sys.innodb_lock_waits.waiting_trx_rows_modified</code>.
     */
    public ULong getWaitingTrxRowsModified() {
        return (ULong) get(10);
    }

    /**
     * Setter for <code>sys.innodb_lock_waits.waiting_pid</code>.
     */
    public void setWaitingPid(ULong value) {
        set(11, value);
    }

    /**
     * Getter for <code>sys.innodb_lock_waits.waiting_pid</code>.
     */
    public ULong getWaitingPid() {
        return (ULong) get(11);
    }

    /**
     * Setter for <code>sys.innodb_lock_waits.waiting_query</code>.
     */
    public void setWaitingQuery(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>sys.innodb_lock_waits.waiting_query</code>.
     */
    public String getWaitingQuery() {
        return (String) get(12);
    }

    /**
     * Setter for <code>sys.innodb_lock_waits.waiting_lock_id</code>.
     */
    public void setWaitingLockId(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>sys.innodb_lock_waits.waiting_lock_id</code>.
     */
    public String getWaitingLockId() {
        return (String) get(13);
    }

    /**
     * Setter for <code>sys.innodb_lock_waits.waiting_lock_mode</code>.
     */
    public void setWaitingLockMode(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>sys.innodb_lock_waits.waiting_lock_mode</code>.
     */
    public String getWaitingLockMode() {
        return (String) get(14);
    }

    /**
     * Setter for <code>sys.innodb_lock_waits.blocking_trx_id</code>.
     */
    public void setBlockingTrxId(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>sys.innodb_lock_waits.blocking_trx_id</code>.
     */
    public String getBlockingTrxId() {
        return (String) get(15);
    }

    /**
     * Setter for <code>sys.innodb_lock_waits.blocking_pid</code>.
     */
    public void setBlockingPid(ULong value) {
        set(16, value);
    }

    /**
     * Getter for <code>sys.innodb_lock_waits.blocking_pid</code>.
     */
    public ULong getBlockingPid() {
        return (ULong) get(16);
    }

    /**
     * Setter for <code>sys.innodb_lock_waits.blocking_query</code>.
     */
    public void setBlockingQuery(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>sys.innodb_lock_waits.blocking_query</code>.
     */
    public String getBlockingQuery() {
        return (String) get(17);
    }

    /**
     * Setter for <code>sys.innodb_lock_waits.blocking_lock_id</code>.
     */
    public void setBlockingLockId(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>sys.innodb_lock_waits.blocking_lock_id</code>.
     */
    public String getBlockingLockId() {
        return (String) get(18);
    }

    /**
     * Setter for <code>sys.innodb_lock_waits.blocking_lock_mode</code>.
     */
    public void setBlockingLockMode(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>sys.innodb_lock_waits.blocking_lock_mode</code>.
     */
    public String getBlockingLockMode() {
        return (String) get(19);
    }

    /**
     * Setter for <code>sys.innodb_lock_waits.blocking_trx_started</code>.
     */
    public void setBlockingTrxStarted(Timestamp value) {
        set(20, value);
    }

    /**
     * Getter for <code>sys.innodb_lock_waits.blocking_trx_started</code>.
     */
    public Timestamp getBlockingTrxStarted() {
        return (Timestamp) get(20);
    }

    /**
     * Setter for <code>sys.innodb_lock_waits.blocking_trx_age</code>.
     */
    public void setBlockingTrxAge(Time value) {
        set(21, value);
    }

    /**
     * Getter for <code>sys.innodb_lock_waits.blocking_trx_age</code>.
     */
    public Time getBlockingTrxAge() {
        return (Time) get(21);
    }

    /**
     * Setter for <code>sys.innodb_lock_waits.blocking_trx_rows_locked</code>.
     */
    public void setBlockingTrxRowsLocked(ULong value) {
        set(22, value);
    }

    /**
     * Getter for <code>sys.innodb_lock_waits.blocking_trx_rows_locked</code>.
     */
    public ULong getBlockingTrxRowsLocked() {
        return (ULong) get(22);
    }

    /**
     * Setter for <code>sys.innodb_lock_waits.blocking_trx_rows_modified</code>.
     */
    public void setBlockingTrxRowsModified(ULong value) {
        set(23, value);
    }

    /**
     * Getter for <code>sys.innodb_lock_waits.blocking_trx_rows_modified</code>.
     */
    public ULong getBlockingTrxRowsModified() {
        return (ULong) get(23);
    }

    /**
     * Setter for <code>sys.innodb_lock_waits.sql_kill_blocking_query</code>.
     */
    public void setSqlKillBlockingQuery(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>sys.innodb_lock_waits.sql_kill_blocking_query</code>.
     */
    public String getSqlKillBlockingQuery() {
        return (String) get(24);
    }

    /**
     * Setter for <code>sys.innodb_lock_waits.sql_kill_blocking_connection</code>.
     */
    public void setSqlKillBlockingConnection(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>sys.innodb_lock_waits.sql_kill_blocking_connection</code>.
     */
    public String getSqlKillBlockingConnection() {
        return (String) get(25);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbLockWaitsRecord
     */
    public InnodbLockWaitsRecord() {
        super(InnodbLockWaits.INNODB_LOCK_WAITS);
    }

    /**
     * Create a detached, initialised InnodbLockWaitsRecord
     */
    public InnodbLockWaitsRecord(Timestamp waitStarted, Time waitAge, Long waitAgeSecs, String lockedTable, String lockedIndex, String lockedType, String waitingTrxId, Timestamp waitingTrxStarted, Time waitingTrxAge, ULong waitingTrxRowsLocked, ULong waitingTrxRowsModified, ULong waitingPid, String waitingQuery, String waitingLockId, String waitingLockMode, String blockingTrxId, ULong blockingPid, String blockingQuery, String blockingLockId, String blockingLockMode, Timestamp blockingTrxStarted, Time blockingTrxAge, ULong blockingTrxRowsLocked, ULong blockingTrxRowsModified, String sqlKillBlockingQuery, String sqlKillBlockingConnection) {
        super(InnodbLockWaits.INNODB_LOCK_WAITS);

        set(0, waitStarted);
        set(1, waitAge);
        set(2, waitAgeSecs);
        set(3, lockedTable);
        set(4, lockedIndex);
        set(5, lockedType);
        set(6, waitingTrxId);
        set(7, waitingTrxStarted);
        set(8, waitingTrxAge);
        set(9, waitingTrxRowsLocked);
        set(10, waitingTrxRowsModified);
        set(11, waitingPid);
        set(12, waitingQuery);
        set(13, waitingLockId);
        set(14, waitingLockMode);
        set(15, blockingTrxId);
        set(16, blockingPid);
        set(17, blockingQuery);
        set(18, blockingLockId);
        set(19, blockingLockMode);
        set(20, blockingTrxStarted);
        set(21, blockingTrxAge);
        set(22, blockingTrxRowsLocked);
        set(23, blockingTrxRowsModified);
        set(24, sqlKillBlockingQuery);
        set(25, sqlKillBlockingConnection);
    }
}
