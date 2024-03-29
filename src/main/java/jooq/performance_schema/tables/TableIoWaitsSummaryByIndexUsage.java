/*
 * This file is generated by jOOQ.
 */
package jooq.performance_schema.tables;


import javax.annotation.Generated;

import jooq.performance_schema.PerformanceSchema;
import jooq.performance_schema.tables.records.TableIoWaitsSummaryByIndexUsageRecord;

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
public class TableIoWaitsSummaryByIndexUsage extends TableImpl<TableIoWaitsSummaryByIndexUsageRecord> {

    private static final long serialVersionUID = -1177587749;

    /**
     * The reference instance of <code>performance_schema.table_io_waits_summary_by_index_usage</code>
     */
    public static final TableIoWaitsSummaryByIndexUsage TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE = new TableIoWaitsSummaryByIndexUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TableIoWaitsSummaryByIndexUsageRecord> getRecordType() {
        return TableIoWaitsSummaryByIndexUsageRecord.class;
    }

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.OBJECT_TYPE</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, String> OBJECT_TYPE = createField("OBJECT_TYPE", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.OBJECT_SCHEMA</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, String> OBJECT_SCHEMA = createField("OBJECT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.OBJECT_NAME</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, String> OBJECT_NAME = createField("OBJECT_NAME", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.INDEX_NAME</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, String> INDEX_NAME = createField("INDEX_NAME", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_STAR</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> COUNT_STAR = createField("COUNT_STAR", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_WAIT</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> SUM_TIMER_WAIT = createField("SUM_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_WAIT</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> MIN_TIMER_WAIT = createField("MIN_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_WAIT</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> AVG_TIMER_WAIT = createField("AVG_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_WAIT</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> MAX_TIMER_WAIT = createField("MAX_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_READ</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> COUNT_READ = createField("COUNT_READ", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_READ</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> SUM_TIMER_READ = createField("SUM_TIMER_READ", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_READ</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> MIN_TIMER_READ = createField("MIN_TIMER_READ", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_READ</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> AVG_TIMER_READ = createField("AVG_TIMER_READ", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_READ</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> MAX_TIMER_READ = createField("MAX_TIMER_READ", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_WRITE</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> COUNT_WRITE = createField("COUNT_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_WRITE</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> SUM_TIMER_WRITE = createField("SUM_TIMER_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_WRITE</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> MIN_TIMER_WRITE = createField("MIN_TIMER_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_WRITE</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> AVG_TIMER_WRITE = createField("AVG_TIMER_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_WRITE</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> MAX_TIMER_WRITE = createField("MAX_TIMER_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_FETCH</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> COUNT_FETCH = createField("COUNT_FETCH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_FETCH</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> SUM_TIMER_FETCH = createField("SUM_TIMER_FETCH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_FETCH</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> MIN_TIMER_FETCH = createField("MIN_TIMER_FETCH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_FETCH</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> AVG_TIMER_FETCH = createField("AVG_TIMER_FETCH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_FETCH</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> MAX_TIMER_FETCH = createField("MAX_TIMER_FETCH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_INSERT</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> COUNT_INSERT = createField("COUNT_INSERT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_INSERT</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> SUM_TIMER_INSERT = createField("SUM_TIMER_INSERT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_INSERT</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> MIN_TIMER_INSERT = createField("MIN_TIMER_INSERT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_INSERT</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> AVG_TIMER_INSERT = createField("AVG_TIMER_INSERT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_INSERT</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> MAX_TIMER_INSERT = createField("MAX_TIMER_INSERT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_UPDATE</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> COUNT_UPDATE = createField("COUNT_UPDATE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_UPDATE</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> SUM_TIMER_UPDATE = createField("SUM_TIMER_UPDATE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_UPDATE</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> MIN_TIMER_UPDATE = createField("MIN_TIMER_UPDATE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_UPDATE</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> AVG_TIMER_UPDATE = createField("AVG_TIMER_UPDATE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_UPDATE</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> MAX_TIMER_UPDATE = createField("MAX_TIMER_UPDATE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_DELETE</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> COUNT_DELETE = createField("COUNT_DELETE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_DELETE</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> SUM_TIMER_DELETE = createField("SUM_TIMER_DELETE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_DELETE</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> MIN_TIMER_DELETE = createField("MIN_TIMER_DELETE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_DELETE</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> AVG_TIMER_DELETE = createField("AVG_TIMER_DELETE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_DELETE</code>.
     */
    public final TableField<TableIoWaitsSummaryByIndexUsageRecord, ULong> MAX_TIMER_DELETE = createField("MAX_TIMER_DELETE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>performance_schema.table_io_waits_summary_by_index_usage</code> table reference
     */
    public TableIoWaitsSummaryByIndexUsage() {
        this(DSL.name("table_io_waits_summary_by_index_usage"), null);
    }

    /**
     * Create an aliased <code>performance_schema.table_io_waits_summary_by_index_usage</code> table reference
     */
    public TableIoWaitsSummaryByIndexUsage(String alias) {
        this(DSL.name(alias), TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE);
    }

    /**
     * Create an aliased <code>performance_schema.table_io_waits_summary_by_index_usage</code> table reference
     */
    public TableIoWaitsSummaryByIndexUsage(Name alias) {
        this(alias, TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE);
    }

    private TableIoWaitsSummaryByIndexUsage(Name alias, Table<TableIoWaitsSummaryByIndexUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private TableIoWaitsSummaryByIndexUsage(Name alias, Table<TableIoWaitsSummaryByIndexUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TableIoWaitsSummaryByIndexUsage(Table<O> child, ForeignKey<O, TableIoWaitsSummaryByIndexUsageRecord> key) {
        super(child, key, TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE);
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
    public TableIoWaitsSummaryByIndexUsage as(String alias) {
        return new TableIoWaitsSummaryByIndexUsage(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableIoWaitsSummaryByIndexUsage as(Name alias) {
        return new TableIoWaitsSummaryByIndexUsage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TableIoWaitsSummaryByIndexUsage rename(String name) {
        return new TableIoWaitsSummaryByIndexUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TableIoWaitsSummaryByIndexUsage rename(Name name) {
        return new TableIoWaitsSummaryByIndexUsage(name, null);
    }
}
