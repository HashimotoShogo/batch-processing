/*
 * This file is generated by jOOQ.
 */
package jooq.sys.tables;


import javax.annotation.Generated;

import jooq.sys.Sys;
import jooq.sys.tables.records.X$userSummaryByStatementTypeRecord;

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
public class X$userSummaryByStatementType extends TableImpl<X$userSummaryByStatementTypeRecord> {

    private static final long serialVersionUID = 1778055903;

    /**
     * The reference instance of <code>sys.x$user_summary_by_statement_type</code>
     */
    public static final X$userSummaryByStatementType X$USER_SUMMARY_BY_STATEMENT_TYPE = new X$userSummaryByStatementType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$userSummaryByStatementTypeRecord> getRecordType() {
        return X$userSummaryByStatementTypeRecord.class;
    }

    /**
     * The column <code>sys.x$user_summary_by_statement_type.user</code>.
     */
    public final TableField<X$userSummaryByStatementTypeRecord, String> USER = createField("user", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>sys.x$user_summary_by_statement_type.statement</code>.
     */
    public final TableField<X$userSummaryByStatementTypeRecord, String> STATEMENT = createField("statement", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>sys.x$user_summary_by_statement_type.total</code>.
     */
    public final TableField<X$userSummaryByStatementTypeRecord, ULong> TOTAL = createField("total", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$user_summary_by_statement_type.total_latency</code>.
     */
    public final TableField<X$userSummaryByStatementTypeRecord, ULong> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$user_summary_by_statement_type.max_latency</code>.
     */
    public final TableField<X$userSummaryByStatementTypeRecord, ULong> MAX_LATENCY = createField("max_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$user_summary_by_statement_type.lock_latency</code>.
     */
    public final TableField<X$userSummaryByStatementTypeRecord, ULong> LOCK_LATENCY = createField("lock_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$user_summary_by_statement_type.rows_sent</code>.
     */
    public final TableField<X$userSummaryByStatementTypeRecord, ULong> ROWS_SENT = createField("rows_sent", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$user_summary_by_statement_type.rows_examined</code>.
     */
    public final TableField<X$userSummaryByStatementTypeRecord, ULong> ROWS_EXAMINED = createField("rows_examined", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$user_summary_by_statement_type.rows_affected</code>.
     */
    public final TableField<X$userSummaryByStatementTypeRecord, ULong> ROWS_AFFECTED = createField("rows_affected", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$user_summary_by_statement_type.full_scans</code>.
     */
    public final TableField<X$userSummaryByStatementTypeRecord, ULong> FULL_SCANS = createField("full_scans", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>sys.x$user_summary_by_statement_type</code> table reference
     */
    public X$userSummaryByStatementType() {
        this(DSL.name("x$user_summary_by_statement_type"), null);
    }

    /**
     * Create an aliased <code>sys.x$user_summary_by_statement_type</code> table reference
     */
    public X$userSummaryByStatementType(String alias) {
        this(DSL.name(alias), X$USER_SUMMARY_BY_STATEMENT_TYPE);
    }

    /**
     * Create an aliased <code>sys.x$user_summary_by_statement_type</code> table reference
     */
    public X$userSummaryByStatementType(Name alias) {
        this(alias, X$USER_SUMMARY_BY_STATEMENT_TYPE);
    }

    private X$userSummaryByStatementType(Name alias, Table<X$userSummaryByStatementTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$userSummaryByStatementType(Name alias, Table<X$userSummaryByStatementTypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> X$userSummaryByStatementType(Table<O> child, ForeignKey<O, X$userSummaryByStatementTypeRecord> key) {
        super(child, key, X$USER_SUMMARY_BY_STATEMENT_TYPE);
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
    public X$userSummaryByStatementType as(String alias) {
        return new X$userSummaryByStatementType(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$userSummaryByStatementType as(Name alias) {
        return new X$userSummaryByStatementType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$userSummaryByStatementType rename(String name) {
        return new X$userSummaryByStatementType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$userSummaryByStatementType rename(Name name) {
        return new X$userSummaryByStatementType(name, null);
    }
}