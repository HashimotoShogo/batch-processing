/*
 * This file is generated by jOOQ.
 */
package jooq.performance_schema.tables;


import javax.annotation.Generated;

import jooq.performance_schema.PerformanceSchema;
import jooq.performance_schema.tables.records.EventsWaitsSummaryByAccountByEventNameRecord;

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
public class EventsWaitsSummaryByAccountByEventName extends TableImpl<EventsWaitsSummaryByAccountByEventNameRecord> {

    private static final long serialVersionUID = 1925547620;

    /**
     * The reference instance of <code>performance_schema.events_waits_summary_by_account_by_event_name</code>
     */
    public static final EventsWaitsSummaryByAccountByEventName EVENTS_WAITS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME = new EventsWaitsSummaryByAccountByEventName();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsWaitsSummaryByAccountByEventNameRecord> getRecordType() {
        return EventsWaitsSummaryByAccountByEventNameRecord.class;
    }

    /**
     * The column <code>performance_schema.events_waits_summary_by_account_by_event_name.USER</code>.
     */
    public final TableField<EventsWaitsSummaryByAccountByEventNameRecord, String> USER = createField("USER", org.jooq.impl.SQLDataType.CHAR(32), this, "");

    /**
     * The column <code>performance_schema.events_waits_summary_by_account_by_event_name.HOST</code>.
     */
    public final TableField<EventsWaitsSummaryByAccountByEventNameRecord, String> HOST = createField("HOST", org.jooq.impl.SQLDataType.CHAR(60), this, "");

    /**
     * The column <code>performance_schema.events_waits_summary_by_account_by_event_name.EVENT_NAME</code>.
     */
    public final TableField<EventsWaitsSummaryByAccountByEventNameRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_summary_by_account_by_event_name.COUNT_STAR</code>.
     */
    public final TableField<EventsWaitsSummaryByAccountByEventNameRecord, ULong> COUNT_STAR = createField("COUNT_STAR", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_summary_by_account_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public final TableField<EventsWaitsSummaryByAccountByEventNameRecord, ULong> SUM_TIMER_WAIT = createField("SUM_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_summary_by_account_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public final TableField<EventsWaitsSummaryByAccountByEventNameRecord, ULong> MIN_TIMER_WAIT = createField("MIN_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_summary_by_account_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public final TableField<EventsWaitsSummaryByAccountByEventNameRecord, ULong> AVG_TIMER_WAIT = createField("AVG_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_summary_by_account_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public final TableField<EventsWaitsSummaryByAccountByEventNameRecord, ULong> MAX_TIMER_WAIT = createField("MAX_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>performance_schema.events_waits_summary_by_account_by_event_name</code> table reference
     */
    public EventsWaitsSummaryByAccountByEventName() {
        this(DSL.name("events_waits_summary_by_account_by_event_name"), null);
    }

    /**
     * Create an aliased <code>performance_schema.events_waits_summary_by_account_by_event_name</code> table reference
     */
    public EventsWaitsSummaryByAccountByEventName(String alias) {
        this(DSL.name(alias), EVENTS_WAITS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME);
    }

    /**
     * Create an aliased <code>performance_schema.events_waits_summary_by_account_by_event_name</code> table reference
     */
    public EventsWaitsSummaryByAccountByEventName(Name alias) {
        this(alias, EVENTS_WAITS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME);
    }

    private EventsWaitsSummaryByAccountByEventName(Name alias, Table<EventsWaitsSummaryByAccountByEventNameRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventsWaitsSummaryByAccountByEventName(Name alias, Table<EventsWaitsSummaryByAccountByEventNameRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> EventsWaitsSummaryByAccountByEventName(Table<O> child, ForeignKey<O, EventsWaitsSummaryByAccountByEventNameRecord> key) {
        super(child, key, EVENTS_WAITS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME);
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
    public EventsWaitsSummaryByAccountByEventName as(String alias) {
        return new EventsWaitsSummaryByAccountByEventName(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsWaitsSummaryByAccountByEventName as(Name alias) {
        return new EventsWaitsSummaryByAccountByEventName(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsWaitsSummaryByAccountByEventName rename(String name) {
        return new EventsWaitsSummaryByAccountByEventName(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsWaitsSummaryByAccountByEventName rename(Name name) {
        return new EventsWaitsSummaryByAccountByEventName(name, null);
    }
}