/*
 * This file is generated by jOOQ.
 */
package jooq.sys.tables;


import java.math.BigDecimal;
import java.math.BigInteger;

import javax.annotation.Generated;

import jooq.sys.Sys;
import jooq.sys.tables.records.X$hostSummaryRecord;

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
public class X$hostSummary extends TableImpl<X$hostSummaryRecord> {

    private static final long serialVersionUID = 960772399;

    /**
     * The reference instance of <code>sys.x$host_summary</code>
     */
    public static final X$hostSummary X$HOST_SUMMARY = new X$hostSummary();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$hostSummaryRecord> getRecordType() {
        return X$hostSummaryRecord.class;
    }

    /**
     * The column <code>sys.x$host_summary.host</code>.
     */
    public final TableField<X$hostSummaryRecord, String> HOST = createField("host", org.jooq.impl.SQLDataType.VARCHAR(60), this, "");

    /**
     * The column <code>sys.x$host_summary.statements</code>.
     */
    public final TableField<X$hostSummaryRecord, BigInteger> STATEMENTS = createField("statements", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(64), this, "");

    /**
     * The column <code>sys.x$host_summary.statement_latency</code>.
     */
    public final TableField<X$hostSummaryRecord, BigInteger> STATEMENT_LATENCY = createField("statement_latency", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(64), this, "");

    /**
     * The column <code>sys.x$host_summary.statement_avg_latency</code>.
     */
    public final TableField<X$hostSummaryRecord, BigDecimal> STATEMENT_AVG_LATENCY = createField("statement_avg_latency", org.jooq.impl.SQLDataType.DECIMAL(65, 4), this, "");

    /**
     * The column <code>sys.x$host_summary.table_scans</code>.
     */
    public final TableField<X$hostSummaryRecord, BigInteger> TABLE_SCANS = createField("table_scans", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(65), this, "");

    /**
     * The column <code>sys.x$host_summary.file_ios</code>.
     */
    public final TableField<X$hostSummaryRecord, BigInteger> FILE_IOS = createField("file_ios", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(64), this, "");

    /**
     * The column <code>sys.x$host_summary.file_io_latency</code>.
     */
    public final TableField<X$hostSummaryRecord, BigInteger> FILE_IO_LATENCY = createField("file_io_latency", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(64), this, "");

    /**
     * The column <code>sys.x$host_summary.current_connections</code>.
     */
    public final TableField<X$hostSummaryRecord, BigInteger> CURRENT_CONNECTIONS = createField("current_connections", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(41), this, "");

    /**
     * The column <code>sys.x$host_summary.total_connections</code>.
     */
    public final TableField<X$hostSummaryRecord, BigInteger> TOTAL_CONNECTIONS = createField("total_connections", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(41), this, "");

    /**
     * The column <code>sys.x$host_summary.unique_users</code>.
     */
    public final TableField<X$hostSummaryRecord, Long> UNIQUE_USERS = createField("unique_users", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>sys.x$host_summary.current_memory</code>.
     */
    public final TableField<X$hostSummaryRecord, BigInteger> CURRENT_MEMORY = createField("current_memory", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(63), this, "");

    /**
     * The column <code>sys.x$host_summary.total_memory_allocated</code>.
     */
    public final TableField<X$hostSummaryRecord, BigInteger> TOTAL_MEMORY_ALLOCATED = createField("total_memory_allocated", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(64), this, "");

    /**
     * Create a <code>sys.x$host_summary</code> table reference
     */
    public X$hostSummary() {
        this(DSL.name("x$host_summary"), null);
    }

    /**
     * Create an aliased <code>sys.x$host_summary</code> table reference
     */
    public X$hostSummary(String alias) {
        this(DSL.name(alias), X$HOST_SUMMARY);
    }

    /**
     * Create an aliased <code>sys.x$host_summary</code> table reference
     */
    public X$hostSummary(Name alias) {
        this(alias, X$HOST_SUMMARY);
    }

    private X$hostSummary(Name alias, Table<X$hostSummaryRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$hostSummary(Name alias, Table<X$hostSummaryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> X$hostSummary(Table<O> child, ForeignKey<O, X$hostSummaryRecord> key) {
        super(child, key, X$HOST_SUMMARY);
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
    public X$hostSummary as(String alias) {
        return new X$hostSummary(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$hostSummary as(Name alias) {
        return new X$hostSummary(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$hostSummary rename(String name) {
        return new X$hostSummary(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$hostSummary rename(Name name) {
        return new X$hostSummary(name, null);
    }
}
