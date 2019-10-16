/*
 * This file is generated by jOOQ.
 */
package jooq.sys.tables;


import java.math.BigInteger;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.sys.Sys;
import jooq.sys.tables.records.X$statementsWithTempTablesRecord;

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
public class X$statementsWithTempTables extends TableImpl<X$statementsWithTempTablesRecord> {

    private static final long serialVersionUID = -671396628;

    /**
     * The reference instance of <code>sys.x$statements_with_temp_tables</code>
     */
    public static final X$statementsWithTempTables X$STATEMENTS_WITH_TEMP_TABLES = new X$statementsWithTempTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$statementsWithTempTablesRecord> getRecordType() {
        return X$statementsWithTempTablesRecord.class;
    }

    /**
     * The column <code>sys.x$statements_with_temp_tables.query</code>.
     */
    public final TableField<X$statementsWithTempTablesRecord, String> QUERY = createField("query", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.x$statements_with_temp_tables.db</code>.
     */
    public final TableField<X$statementsWithTempTablesRecord, String> DB = createField("db", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.x$statements_with_temp_tables.exec_count</code>.
     */
    public final TableField<X$statementsWithTempTablesRecord, ULong> EXEC_COUNT = createField("exec_count", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$statements_with_temp_tables.total_latency</code>.
     */
    public final TableField<X$statementsWithTempTablesRecord, ULong> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$statements_with_temp_tables.memory_tmp_tables</code>.
     */
    public final TableField<X$statementsWithTempTablesRecord, ULong> MEMORY_TMP_TABLES = createField("memory_tmp_tables", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$statements_with_temp_tables.disk_tmp_tables</code>.
     */
    public final TableField<X$statementsWithTempTablesRecord, ULong> DISK_TMP_TABLES = createField("disk_tmp_tables", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$statements_with_temp_tables.avg_tmp_tables_per_query</code>.
     */
    public final TableField<X$statementsWithTempTablesRecord, BigInteger> AVG_TMP_TABLES_PER_QUERY = createField("avg_tmp_tables_per_query", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(21).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.DECIMAL_INTEGER)), this, "");

    /**
     * The column <code>sys.x$statements_with_temp_tables.tmp_tables_to_disk_pct</code>.
     */
    public final TableField<X$statementsWithTempTablesRecord, BigInteger> TMP_TABLES_TO_DISK_PCT = createField("tmp_tables_to_disk_pct", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(24).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.DECIMAL_INTEGER)), this, "");

    /**
     * The column <code>sys.x$statements_with_temp_tables.first_seen</code>.
     */
    public final TableField<X$statementsWithTempTablesRecord, Timestamp> FIRST_SEEN = createField("first_seen", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>sys.x$statements_with_temp_tables.last_seen</code>.
     */
    public final TableField<X$statementsWithTempTablesRecord, Timestamp> LAST_SEEN = createField("last_seen", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>sys.x$statements_with_temp_tables.digest</code>.
     */
    public final TableField<X$statementsWithTempTablesRecord, String> DIGEST = createField("digest", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * Create a <code>sys.x$statements_with_temp_tables</code> table reference
     */
    public X$statementsWithTempTables() {
        this(DSL.name("x$statements_with_temp_tables"), null);
    }

    /**
     * Create an aliased <code>sys.x$statements_with_temp_tables</code> table reference
     */
    public X$statementsWithTempTables(String alias) {
        this(DSL.name(alias), X$STATEMENTS_WITH_TEMP_TABLES);
    }

    /**
     * Create an aliased <code>sys.x$statements_with_temp_tables</code> table reference
     */
    public X$statementsWithTempTables(Name alias) {
        this(alias, X$STATEMENTS_WITH_TEMP_TABLES);
    }

    private X$statementsWithTempTables(Name alias, Table<X$statementsWithTempTablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$statementsWithTempTables(Name alias, Table<X$statementsWithTempTablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> X$statementsWithTempTables(Table<O> child, ForeignKey<O, X$statementsWithTempTablesRecord> key) {
        super(child, key, X$STATEMENTS_WITH_TEMP_TABLES);
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
    public X$statementsWithTempTables as(String alias) {
        return new X$statementsWithTempTables(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$statementsWithTempTables as(Name alias) {
        return new X$statementsWithTempTables(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$statementsWithTempTables rename(String name) {
        return new X$statementsWithTempTables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$statementsWithTempTables rename(Name name) {
        return new X$statementsWithTempTables(name, null);
    }
}
