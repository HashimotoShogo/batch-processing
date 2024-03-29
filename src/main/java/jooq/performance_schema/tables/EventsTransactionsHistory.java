/*
 * This file is generated by jOOQ.
 */
package jooq.performance_schema.tables;


import javax.annotation.Generated;

import jooq.performance_schema.PerformanceSchema;
import jooq.performance_schema.enums.EventsTransactionsHistoryAccessMode;
import jooq.performance_schema.enums.EventsTransactionsHistoryAutocommit;
import jooq.performance_schema.enums.EventsTransactionsHistoryNestingEventType;
import jooq.performance_schema.enums.EventsTransactionsHistoryState;
import jooq.performance_schema.tables.records.EventsTransactionsHistoryRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
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
public class EventsTransactionsHistory extends TableImpl<EventsTransactionsHistoryRecord> {

    private static final long serialVersionUID = -1260508875;

    /**
     * The reference instance of <code>performance_schema.events_transactions_history</code>
     */
    public static final EventsTransactionsHistory EVENTS_TRANSACTIONS_HISTORY = new EventsTransactionsHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsTransactionsHistoryRecord> getRecordType() {
        return EventsTransactionsHistoryRecord.class;
    }

    /**
     * The column <code>performance_schema.events_transactions_history.THREAD_ID</code>.
     */
    public final TableField<EventsTransactionsHistoryRecord, ULong> THREAD_ID = createField("THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.EVENT_ID</code>.
     */
    public final TableField<EventsTransactionsHistoryRecord, ULong> EVENT_ID = createField("EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.END_EVENT_ID</code>.
     */
    public final TableField<EventsTransactionsHistoryRecord, ULong> END_EVENT_ID = createField("END_EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.EVENT_NAME</code>.
     */
    public final TableField<EventsTransactionsHistoryRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.STATE</code>.
     */
    public final TableField<EventsTransactionsHistoryRecord, EventsTransactionsHistoryState> STATE = createField("STATE", org.jooq.impl.SQLDataType.VARCHAR(11).asEnumDataType(jooq.performance_schema.enums.EventsTransactionsHistoryState.class), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.TRX_ID</code>.
     */
    public final TableField<EventsTransactionsHistoryRecord, ULong> TRX_ID = createField("TRX_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.GTID</code>.
     */
    public final TableField<EventsTransactionsHistoryRecord, String> GTID = createField("GTID", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.XID_FORMAT_ID</code>.
     */
    public final TableField<EventsTransactionsHistoryRecord, Integer> XID_FORMAT_ID = createField("XID_FORMAT_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.XID_GTRID</code>.
     */
    public final TableField<EventsTransactionsHistoryRecord, String> XID_GTRID = createField("XID_GTRID", org.jooq.impl.SQLDataType.VARCHAR(130), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.XID_BQUAL</code>.
     */
    public final TableField<EventsTransactionsHistoryRecord, String> XID_BQUAL = createField("XID_BQUAL", org.jooq.impl.SQLDataType.VARCHAR(130), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.XA_STATE</code>.
     */
    public final TableField<EventsTransactionsHistoryRecord, String> XA_STATE = createField("XA_STATE", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.SOURCE</code>.
     */
    public final TableField<EventsTransactionsHistoryRecord, String> SOURCE = createField("SOURCE", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.TIMER_START</code>.
     */
    public final TableField<EventsTransactionsHistoryRecord, ULong> TIMER_START = createField("TIMER_START", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.TIMER_END</code>.
     */
    public final TableField<EventsTransactionsHistoryRecord, ULong> TIMER_END = createField("TIMER_END", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.TIMER_WAIT</code>.
     */
    public final TableField<EventsTransactionsHistoryRecord, ULong> TIMER_WAIT = createField("TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.ACCESS_MODE</code>.
     */
    public final TableField<EventsTransactionsHistoryRecord, EventsTransactionsHistoryAccessMode> ACCESS_MODE = createField("ACCESS_MODE", org.jooq.impl.SQLDataType.VARCHAR(10).asEnumDataType(jooq.performance_schema.enums.EventsTransactionsHistoryAccessMode.class), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.ISOLATION_LEVEL</code>.
     */
    public final TableField<EventsTransactionsHistoryRecord, String> ISOLATION_LEVEL = createField("ISOLATION_LEVEL", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.AUTOCOMMIT</code>.
     */
    public final TableField<EventsTransactionsHistoryRecord, EventsTransactionsHistoryAutocommit> AUTOCOMMIT = createField("AUTOCOMMIT", org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false).asEnumDataType(jooq.performance_schema.enums.EventsTransactionsHistoryAutocommit.class), this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.NUMBER_OF_SAVEPOINTS</code>.
     */
    public final TableField<EventsTransactionsHistoryRecord, ULong> NUMBER_OF_SAVEPOINTS = createField("NUMBER_OF_SAVEPOINTS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.NUMBER_OF_ROLLBACK_TO_SAVEPOINT</code>.
     */
    public final TableField<EventsTransactionsHistoryRecord, ULong> NUMBER_OF_ROLLBACK_TO_SAVEPOINT = createField("NUMBER_OF_ROLLBACK_TO_SAVEPOINT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.NUMBER_OF_RELEASE_SAVEPOINT</code>.
     */
    public final TableField<EventsTransactionsHistoryRecord, ULong> NUMBER_OF_RELEASE_SAVEPOINT = createField("NUMBER_OF_RELEASE_SAVEPOINT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.OBJECT_INSTANCE_BEGIN</code>.
     */
    public final TableField<EventsTransactionsHistoryRecord, ULong> OBJECT_INSTANCE_BEGIN = createField("OBJECT_INSTANCE_BEGIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.NESTING_EVENT_ID</code>.
     */
    public final TableField<EventsTransactionsHistoryRecord, ULong> NESTING_EVENT_ID = createField("NESTING_EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_history.NESTING_EVENT_TYPE</code>.
     */
    public final TableField<EventsTransactionsHistoryRecord, EventsTransactionsHistoryNestingEventType> NESTING_EVENT_TYPE = createField("NESTING_EVENT_TYPE", org.jooq.impl.SQLDataType.VARCHAR(11).asEnumDataType(jooq.performance_schema.enums.EventsTransactionsHistoryNestingEventType.class), this, "");

    /**
     * Create a <code>performance_schema.events_transactions_history</code> table reference
     */
    public EventsTransactionsHistory() {
        this(DSL.name("events_transactions_history"), null);
    }

    /**
     * Create an aliased <code>performance_schema.events_transactions_history</code> table reference
     */
    public EventsTransactionsHistory(String alias) {
        this(DSL.name(alias), EVENTS_TRANSACTIONS_HISTORY);
    }

    /**
     * Create an aliased <code>performance_schema.events_transactions_history</code> table reference
     */
    public EventsTransactionsHistory(Name alias) {
        this(alias, EVENTS_TRANSACTIONS_HISTORY);
    }

    private EventsTransactionsHistory(Name alias, Table<EventsTransactionsHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventsTransactionsHistory(Name alias, Table<EventsTransactionsHistoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> EventsTransactionsHistory(Table<O> child, ForeignKey<O, EventsTransactionsHistoryRecord> key) {
        super(child, key, EVENTS_TRANSACTIONS_HISTORY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsHistory as(String alias) {
        return new EventsTransactionsHistory(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsHistory as(Name alias) {
        return new EventsTransactionsHistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsTransactionsHistory rename(String name) {
        return new EventsTransactionsHistory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsTransactionsHistory rename(Name name) {
        return new EventsTransactionsHistory(name, null);
    }
}
