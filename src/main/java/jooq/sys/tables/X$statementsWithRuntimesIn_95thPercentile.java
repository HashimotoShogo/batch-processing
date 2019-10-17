/*
 * This file is generated by jOOQ.
 */
package jooq.sys.tables;


import java.math.BigInteger;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.sys.Sys;
import jooq.sys.tables.records.X$statementsWithRuntimesIn_95thPercentileRecord;

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
public class X$statementsWithRuntimesIn_95thPercentile extends TableImpl<X$statementsWithRuntimesIn_95thPercentileRecord> {

    private static final long serialVersionUID = -1133302433;

    /**
     * The reference instance of <code>sys.x$statements_with_runtimes_in_95th_percentile</code>
     */
    public static final X$statementsWithRuntimesIn_95thPercentile X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE = new X$statementsWithRuntimesIn_95thPercentile();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$statementsWithRuntimesIn_95thPercentileRecord> getRecordType() {
        return X$statementsWithRuntimesIn_95thPercentileRecord.class;
    }

    /**
     * The column <code>sys.x$statements_with_runtimes_in_95th_percentile.query</code>.
     */
    public final TableField<X$statementsWithRuntimesIn_95thPercentileRecord, String> QUERY = createField("query", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.x$statements_with_runtimes_in_95th_percentile.db</code>.
     */
    public final TableField<X$statementsWithRuntimesIn_95thPercentileRecord, String> DB = createField("db", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.x$statements_with_runtimes_in_95th_percentile.full_scan</code>.
     */
    public final TableField<X$statementsWithRuntimesIn_95thPercentileRecord, String> FULL_SCAN = createField("full_scan", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sys.x$statements_with_runtimes_in_95th_percentile.exec_count</code>.
     */
    public final TableField<X$statementsWithRuntimesIn_95thPercentileRecord, ULong> EXEC_COUNT = createField("exec_count", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$statements_with_runtimes_in_95th_percentile.err_count</code>.
     */
    public final TableField<X$statementsWithRuntimesIn_95thPercentileRecord, ULong> ERR_COUNT = createField("err_count", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$statements_with_runtimes_in_95th_percentile.warn_count</code>.
     */
    public final TableField<X$statementsWithRuntimesIn_95thPercentileRecord, ULong> WARN_COUNT = createField("warn_count", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$statements_with_runtimes_in_95th_percentile.total_latency</code>.
     */
    public final TableField<X$statementsWithRuntimesIn_95thPercentileRecord, ULong> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$statements_with_runtimes_in_95th_percentile.max_latency</code>.
     */
    public final TableField<X$statementsWithRuntimesIn_95thPercentileRecord, ULong> MAX_LATENCY = createField("max_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$statements_with_runtimes_in_95th_percentile.avg_latency</code>.
     */
    public final TableField<X$statementsWithRuntimesIn_95thPercentileRecord, ULong> AVG_LATENCY = createField("avg_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$statements_with_runtimes_in_95th_percentile.rows_sent</code>.
     */
    public final TableField<X$statementsWithRuntimesIn_95thPercentileRecord, ULong> ROWS_SENT = createField("rows_sent", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$statements_with_runtimes_in_95th_percentile.rows_sent_avg</code>.
     */
    public final TableField<X$statementsWithRuntimesIn_95thPercentileRecord, BigInteger> ROWS_SENT_AVG = createField("rows_sent_avg", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(21).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.DECIMAL_INTEGER)), this, "");

    /**
     * The column <code>sys.x$statements_with_runtimes_in_95th_percentile.rows_examined</code>.
     */
    public final TableField<X$statementsWithRuntimesIn_95thPercentileRecord, ULong> ROWS_EXAMINED = createField("rows_examined", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$statements_with_runtimes_in_95th_percentile.rows_examined_avg</code>.
     */
    public final TableField<X$statementsWithRuntimesIn_95thPercentileRecord, BigInteger> ROWS_EXAMINED_AVG = createField("rows_examined_avg", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(21).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.DECIMAL_INTEGER)), this, "");

    /**
     * The column <code>sys.x$statements_with_runtimes_in_95th_percentile.first_seen</code>.
     */
    public final TableField<X$statementsWithRuntimesIn_95thPercentileRecord, Timestamp> FIRST_SEEN = createField("first_seen", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>sys.x$statements_with_runtimes_in_95th_percentile.last_seen</code>.
     */
    public final TableField<X$statementsWithRuntimesIn_95thPercentileRecord, Timestamp> LAST_SEEN = createField("last_seen", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>sys.x$statements_with_runtimes_in_95th_percentile.digest</code>.
     */
    public final TableField<X$statementsWithRuntimesIn_95thPercentileRecord, String> DIGEST = createField("digest", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * Create a <code>sys.x$statements_with_runtimes_in_95th_percentile</code> table reference
     */
    public X$statementsWithRuntimesIn_95thPercentile() {
        this(DSL.name("x$statements_with_runtimes_in_95th_percentile"), null);
    }

    /**
     * Create an aliased <code>sys.x$statements_with_runtimes_in_95th_percentile</code> table reference
     */
    public X$statementsWithRuntimesIn_95thPercentile(String alias) {
        this(DSL.name(alias), X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE);
    }

    /**
     * Create an aliased <code>sys.x$statements_with_runtimes_in_95th_percentile</code> table reference
     */
    public X$statementsWithRuntimesIn_95thPercentile(Name alias) {
        this(alias, X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE);
    }

    private X$statementsWithRuntimesIn_95thPercentile(Name alias, Table<X$statementsWithRuntimesIn_95thPercentileRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$statementsWithRuntimesIn_95thPercentile(Name alias, Table<X$statementsWithRuntimesIn_95thPercentileRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> X$statementsWithRuntimesIn_95thPercentile(Table<O> child, ForeignKey<O, X$statementsWithRuntimesIn_95thPercentileRecord> key) {
        super(child, key, X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE);
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
    public X$statementsWithRuntimesIn_95thPercentile as(String alias) {
        return new X$statementsWithRuntimesIn_95thPercentile(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$statementsWithRuntimesIn_95thPercentile as(Name alias) {
        return new X$statementsWithRuntimesIn_95thPercentile(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$statementsWithRuntimesIn_95thPercentile rename(String name) {
        return new X$statementsWithRuntimesIn_95thPercentile(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$statementsWithRuntimesIn_95thPercentile rename(Name name) {
        return new X$statementsWithRuntimesIn_95thPercentile(name, null);
    }
}