/*
 * This file is generated by jOOQ.
 */
package jooq.performance_schema.tables;


import javax.annotation.Generated;

import jooq.performance_schema.PerformanceSchema;
import jooq.performance_schema.tables.records.EventsTransactionsSummaryByHostByEventNameRecord;

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
public class EventsTransactionsSummaryByHostByEventName extends TableImpl<EventsTransactionsSummaryByHostByEventNameRecord> {

    private static final long serialVersionUID = -1182680958;

    /**
     * The reference instance of <code>performance_schema.events_transactions_summary_by_host_by_event_name</code>
     */
    public static final EventsTransactionsSummaryByHostByEventName EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME = new EventsTransactionsSummaryByHostByEventName();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsTransactionsSummaryByHostByEventNameRecord> getRecordType() {
        return EventsTransactionsSummaryByHostByEventNameRecord.class;
    }

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.HOST</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, String> HOST = createField("HOST", org.jooq.impl.SQLDataType.CHAR(60), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.EVENT_NAME</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.COUNT_STAR</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, ULong> COUNT_STAR = createField("COUNT_STAR", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, ULong> SUM_TIMER_WAIT = createField("SUM_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, ULong> MIN_TIMER_WAIT = createField("MIN_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, ULong> AVG_TIMER_WAIT = createField("AVG_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, ULong> MAX_TIMER_WAIT = createField("MAX_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.COUNT_READ_WRITE</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, ULong> COUNT_READ_WRITE = createField("COUNT_READ_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.SUM_TIMER_READ_WRITE</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, ULong> SUM_TIMER_READ_WRITE = createField("SUM_TIMER_READ_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.MIN_TIMER_READ_WRITE</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, ULong> MIN_TIMER_READ_WRITE = createField("MIN_TIMER_READ_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.AVG_TIMER_READ_WRITE</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, ULong> AVG_TIMER_READ_WRITE = createField("AVG_TIMER_READ_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.MAX_TIMER_READ_WRITE</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, ULong> MAX_TIMER_READ_WRITE = createField("MAX_TIMER_READ_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.COUNT_READ_ONLY</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, ULong> COUNT_READ_ONLY = createField("COUNT_READ_ONLY", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.SUM_TIMER_READ_ONLY</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, ULong> SUM_TIMER_READ_ONLY = createField("SUM_TIMER_READ_ONLY", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.MIN_TIMER_READ_ONLY</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, ULong> MIN_TIMER_READ_ONLY = createField("MIN_TIMER_READ_ONLY", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.AVG_TIMER_READ_ONLY</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, ULong> AVG_TIMER_READ_ONLY = createField("AVG_TIMER_READ_ONLY", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_host_by_event_name.MAX_TIMER_READ_ONLY</code>.
     */
    public final TableField<EventsTransactionsSummaryByHostByEventNameRecord, ULong> MAX_TIMER_READ_ONLY = createField("MAX_TIMER_READ_ONLY", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>performance_schema.events_transactions_summary_by_host_by_event_name</code> table reference
     */
    public EventsTransactionsSummaryByHostByEventName() {
        this(DSL.name("events_transactions_summary_by_host_by_event_name"), null);
    }

    /**
     * Create an aliased <code>performance_schema.events_transactions_summary_by_host_by_event_name</code> table reference
     */
    public EventsTransactionsSummaryByHostByEventName(String alias) {
        this(DSL.name(alias), EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME);
    }

    /**
     * Create an aliased <code>performance_schema.events_transactions_summary_by_host_by_event_name</code> table reference
     */
    public EventsTransactionsSummaryByHostByEventName(Name alias) {
        this(alias, EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME);
    }

    private EventsTransactionsSummaryByHostByEventName(Name alias, Table<EventsTransactionsSummaryByHostByEventNameRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventsTransactionsSummaryByHostByEventName(Name alias, Table<EventsTransactionsSummaryByHostByEventNameRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> EventsTransactionsSummaryByHostByEventName(Table<O> child, ForeignKey<O, EventsTransactionsSummaryByHostByEventNameRecord> key) {
        super(child, key, EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME);
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
    public EventsTransactionsSummaryByHostByEventName as(String alias) {
        return new EventsTransactionsSummaryByHostByEventName(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryByHostByEventName as(Name alias) {
        return new EventsTransactionsSummaryByHostByEventName(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsTransactionsSummaryByHostByEventName rename(String name) {
        return new EventsTransactionsSummaryByHostByEventName(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsTransactionsSummaryByHostByEventName rename(Name name) {
        return new EventsTransactionsSummaryByHostByEventName(name, null);
    }
}
