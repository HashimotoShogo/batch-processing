/*
 * This file is generated by jOOQ.
 */
package jooq.performance_schema.tables;


import javax.annotation.Generated;

import jooq.performance_schema.PerformanceSchema;
import jooq.performance_schema.tables.records.TableIoWaitsSummaryByTableRecord;

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
public class TableIoWaitsSummaryByTable extends TableImpl<TableIoWaitsSummaryByTableRecord> {

    private static final long serialVersionUID = -1868710106;

    /**
     * The reference instance of <code>performance_schema.table_io_waits_summary_by_table</code>
     */
    public static final TableIoWaitsSummaryByTable TABLE_IO_WAITS_SUMMARY_BY_TABLE = new TableIoWaitsSummaryByTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TableIoWaitsSummaryByTableRecord> getRecordType() {
        return TableIoWaitsSummaryByTableRecord.class;
    }

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.OBJECT_TYPE</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, String> OBJECT_TYPE = createField("OBJECT_TYPE", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.OBJECT_SCHEMA</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, String> OBJECT_SCHEMA = createField("OBJECT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.OBJECT_NAME</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, String> OBJECT_NAME = createField("OBJECT_NAME", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.COUNT_STAR</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> COUNT_STAR = createField("COUNT_STAR", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.SUM_TIMER_WAIT</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> SUM_TIMER_WAIT = createField("SUM_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.MIN_TIMER_WAIT</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> MIN_TIMER_WAIT = createField("MIN_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.AVG_TIMER_WAIT</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> AVG_TIMER_WAIT = createField("AVG_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.MAX_TIMER_WAIT</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> MAX_TIMER_WAIT = createField("MAX_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.COUNT_READ</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> COUNT_READ = createField("COUNT_READ", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.SUM_TIMER_READ</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> SUM_TIMER_READ = createField("SUM_TIMER_READ", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.MIN_TIMER_READ</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> MIN_TIMER_READ = createField("MIN_TIMER_READ", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.AVG_TIMER_READ</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> AVG_TIMER_READ = createField("AVG_TIMER_READ", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.MAX_TIMER_READ</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> MAX_TIMER_READ = createField("MAX_TIMER_READ", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.COUNT_WRITE</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> COUNT_WRITE = createField("COUNT_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.SUM_TIMER_WRITE</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> SUM_TIMER_WRITE = createField("SUM_TIMER_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.MIN_TIMER_WRITE</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> MIN_TIMER_WRITE = createField("MIN_TIMER_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.AVG_TIMER_WRITE</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> AVG_TIMER_WRITE = createField("AVG_TIMER_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.MAX_TIMER_WRITE</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> MAX_TIMER_WRITE = createField("MAX_TIMER_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.COUNT_FETCH</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> COUNT_FETCH = createField("COUNT_FETCH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.SUM_TIMER_FETCH</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> SUM_TIMER_FETCH = createField("SUM_TIMER_FETCH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.MIN_TIMER_FETCH</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> MIN_TIMER_FETCH = createField("MIN_TIMER_FETCH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.AVG_TIMER_FETCH</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> AVG_TIMER_FETCH = createField("AVG_TIMER_FETCH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.MAX_TIMER_FETCH</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> MAX_TIMER_FETCH = createField("MAX_TIMER_FETCH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.COUNT_INSERT</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> COUNT_INSERT = createField("COUNT_INSERT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.SUM_TIMER_INSERT</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> SUM_TIMER_INSERT = createField("SUM_TIMER_INSERT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.MIN_TIMER_INSERT</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> MIN_TIMER_INSERT = createField("MIN_TIMER_INSERT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.AVG_TIMER_INSERT</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> AVG_TIMER_INSERT = createField("AVG_TIMER_INSERT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.MAX_TIMER_INSERT</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> MAX_TIMER_INSERT = createField("MAX_TIMER_INSERT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.COUNT_UPDATE</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> COUNT_UPDATE = createField("COUNT_UPDATE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.SUM_TIMER_UPDATE</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> SUM_TIMER_UPDATE = createField("SUM_TIMER_UPDATE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.MIN_TIMER_UPDATE</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> MIN_TIMER_UPDATE = createField("MIN_TIMER_UPDATE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.AVG_TIMER_UPDATE</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> AVG_TIMER_UPDATE = createField("AVG_TIMER_UPDATE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.MAX_TIMER_UPDATE</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> MAX_TIMER_UPDATE = createField("MAX_TIMER_UPDATE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.COUNT_DELETE</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> COUNT_DELETE = createField("COUNT_DELETE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.SUM_TIMER_DELETE</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> SUM_TIMER_DELETE = createField("SUM_TIMER_DELETE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.MIN_TIMER_DELETE</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> MIN_TIMER_DELETE = createField("MIN_TIMER_DELETE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.AVG_TIMER_DELETE</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> AVG_TIMER_DELETE = createField("AVG_TIMER_DELETE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.table_io_waits_summary_by_table.MAX_TIMER_DELETE</code>.
     */
    public final TableField<TableIoWaitsSummaryByTableRecord, ULong> MAX_TIMER_DELETE = createField("MAX_TIMER_DELETE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>performance_schema.table_io_waits_summary_by_table</code> table reference
     */
    public TableIoWaitsSummaryByTable() {
        this(DSL.name("table_io_waits_summary_by_table"), null);
    }

    /**
     * Create an aliased <code>performance_schema.table_io_waits_summary_by_table</code> table reference
     */
    public TableIoWaitsSummaryByTable(String alias) {
        this(DSL.name(alias), TABLE_IO_WAITS_SUMMARY_BY_TABLE);
    }

    /**
     * Create an aliased <code>performance_schema.table_io_waits_summary_by_table</code> table reference
     */
    public TableIoWaitsSummaryByTable(Name alias) {
        this(alias, TABLE_IO_WAITS_SUMMARY_BY_TABLE);
    }

    private TableIoWaitsSummaryByTable(Name alias, Table<TableIoWaitsSummaryByTableRecord> aliased) {
        this(alias, aliased, null);
    }

    private TableIoWaitsSummaryByTable(Name alias, Table<TableIoWaitsSummaryByTableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TableIoWaitsSummaryByTable(Table<O> child, ForeignKey<O, TableIoWaitsSummaryByTableRecord> key) {
        super(child, key, TABLE_IO_WAITS_SUMMARY_BY_TABLE);
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
    public TableIoWaitsSummaryByTable as(String alias) {
        return new TableIoWaitsSummaryByTable(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableIoWaitsSummaryByTable as(Name alias) {
        return new TableIoWaitsSummaryByTable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TableIoWaitsSummaryByTable rename(String name) {
        return new TableIoWaitsSummaryByTable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TableIoWaitsSummaryByTable rename(Name name) {
        return new TableIoWaitsSummaryByTable(name, null);
    }
}
