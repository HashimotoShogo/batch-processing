/*
 * This file is generated by jOOQ.
 */
package jooq.sys.tables;


import java.math.BigInteger;

import javax.annotation.Generated;

import jooq.sys.Sys;
import jooq.sys.tables.records.HostSummaryRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class HostSummary extends TableImpl<HostSummaryRecord> {

    private static final long serialVersionUID = 2047333760;

    /**
     * The reference instance of <code>sys.host_summary</code>
     */
    public static final HostSummary HOST_SUMMARY = new HostSummary();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HostSummaryRecord> getRecordType() {
        return HostSummaryRecord.class;
    }

    /**
     * The column <code>sys.host_summary.host</code>.
     */
    public final TableField<HostSummaryRecord, String> HOST = createField("host", org.jooq.impl.SQLDataType.VARCHAR(60), this, "");

    /**
     * The column <code>sys.host_summary.statements</code>.
     */
    public final TableField<HostSummaryRecord, BigInteger> STATEMENTS = createField("statements", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(64), this, "");

    /**
     * The column <code>sys.host_summary.statement_latency</code>.
     */
    public final TableField<HostSummaryRecord, String> STATEMENT_LATENCY = createField("statement_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.host_summary.statement_avg_latency</code>.
     */
    public final TableField<HostSummaryRecord, String> STATEMENT_AVG_LATENCY = createField("statement_avg_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.host_summary.table_scans</code>.
     */
    public final TableField<HostSummaryRecord, BigInteger> TABLE_SCANS = createField("table_scans", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(65), this, "");

    /**
     * The column <code>sys.host_summary.file_ios</code>.
     */
    public final TableField<HostSummaryRecord, BigInteger> FILE_IOS = createField("file_ios", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(64), this, "");

    /**
     * The column <code>sys.host_summary.file_io_latency</code>.
     */
    public final TableField<HostSummaryRecord, String> FILE_IO_LATENCY = createField("file_io_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.host_summary.current_connections</code>.
     */
    public final TableField<HostSummaryRecord, BigInteger> CURRENT_CONNECTIONS = createField("current_connections", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(41), this, "");

    /**
     * The column <code>sys.host_summary.total_connections</code>.
     */
    public final TableField<HostSummaryRecord, BigInteger> TOTAL_CONNECTIONS = createField("total_connections", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(41), this, "");

    /**
     * The column <code>sys.host_summary.unique_users</code>.
     */
    public final TableField<HostSummaryRecord, Long> UNIQUE_USERS = createField("unique_users", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>sys.host_summary.current_memory</code>.
     */
    public final TableField<HostSummaryRecord, String> CURRENT_MEMORY = createField("current_memory", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.host_summary.total_memory_allocated</code>.
     */
    public final TableField<HostSummaryRecord, String> TOTAL_MEMORY_ALLOCATED = createField("total_memory_allocated", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>sys.host_summary</code> table reference
     */
    public HostSummary() {
        this(DSL.name("host_summary"), null);
    }

    /**
     * Create an aliased <code>sys.host_summary</code> table reference
     */
    public HostSummary(String alias) {
        this(DSL.name(alias), HOST_SUMMARY);
    }

    /**
     * Create an aliased <code>sys.host_summary</code> table reference
     */
    public HostSummary(Name alias) {
        this(alias, HOST_SUMMARY);
    }

    private HostSummary(Name alias, Table<HostSummaryRecord> aliased) {
        this(alias, aliased, null);
    }

    private HostSummary(Name alias, Table<HostSummaryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> HostSummary(Table<O> child, ForeignKey<O, HostSummaryRecord> key) {
        super(child, key, HOST_SUMMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HostSummary as(String alias) {
        return new HostSummary(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HostSummary as(Name alias) {
        return new HostSummary(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HostSummary rename(String name) {
        return new HostSummary(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public HostSummary rename(Name name) {
        return new HostSummary(name, null);
    }
}
