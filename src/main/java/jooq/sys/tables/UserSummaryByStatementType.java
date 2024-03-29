/*
 * This file is generated by jOOQ.
 */
package jooq.sys.tables;


import javax.annotation.Generated;

import jooq.sys.Sys;
import jooq.sys.tables.records.UserSummaryByStatementTypeRecord;

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
public class UserSummaryByStatementType extends TableImpl<UserSummaryByStatementTypeRecord> {

    private static final long serialVersionUID = 317225786;

    /**
     * The reference instance of <code>sys.user_summary_by_statement_type</code>
     */
    public static final UserSummaryByStatementType USER_SUMMARY_BY_STATEMENT_TYPE = new UserSummaryByStatementType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserSummaryByStatementTypeRecord> getRecordType() {
        return UserSummaryByStatementTypeRecord.class;
    }

    /**
     * The column <code>sys.user_summary_by_statement_type.user</code>.
     */
    public final TableField<UserSummaryByStatementTypeRecord, String> USER = createField("user", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>sys.user_summary_by_statement_type.statement</code>.
     */
    public final TableField<UserSummaryByStatementTypeRecord, String> STATEMENT = createField("statement", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>sys.user_summary_by_statement_type.total</code>.
     */
    public final TableField<UserSummaryByStatementTypeRecord, ULong> TOTAL = createField("total", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.user_summary_by_statement_type.total_latency</code>.
     */
    public final TableField<UserSummaryByStatementTypeRecord, String> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.user_summary_by_statement_type.max_latency</code>.
     */
    public final TableField<UserSummaryByStatementTypeRecord, String> MAX_LATENCY = createField("max_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.user_summary_by_statement_type.lock_latency</code>.
     */
    public final TableField<UserSummaryByStatementTypeRecord, String> LOCK_LATENCY = createField("lock_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.user_summary_by_statement_type.rows_sent</code>.
     */
    public final TableField<UserSummaryByStatementTypeRecord, ULong> ROWS_SENT = createField("rows_sent", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.user_summary_by_statement_type.rows_examined</code>.
     */
    public final TableField<UserSummaryByStatementTypeRecord, ULong> ROWS_EXAMINED = createField("rows_examined", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.user_summary_by_statement_type.rows_affected</code>.
     */
    public final TableField<UserSummaryByStatementTypeRecord, ULong> ROWS_AFFECTED = createField("rows_affected", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.user_summary_by_statement_type.full_scans</code>.
     */
    public final TableField<UserSummaryByStatementTypeRecord, ULong> FULL_SCANS = createField("full_scans", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>sys.user_summary_by_statement_type</code> table reference
     */
    public UserSummaryByStatementType() {
        this(DSL.name("user_summary_by_statement_type"), null);
    }

    /**
     * Create an aliased <code>sys.user_summary_by_statement_type</code> table reference
     */
    public UserSummaryByStatementType(String alias) {
        this(DSL.name(alias), USER_SUMMARY_BY_STATEMENT_TYPE);
    }

    /**
     * Create an aliased <code>sys.user_summary_by_statement_type</code> table reference
     */
    public UserSummaryByStatementType(Name alias) {
        this(alias, USER_SUMMARY_BY_STATEMENT_TYPE);
    }

    private UserSummaryByStatementType(Name alias, Table<UserSummaryByStatementTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserSummaryByStatementType(Name alias, Table<UserSummaryByStatementTypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> UserSummaryByStatementType(Table<O> child, ForeignKey<O, UserSummaryByStatementTypeRecord> key) {
        super(child, key, USER_SUMMARY_BY_STATEMENT_TYPE);
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
    public UserSummaryByStatementType as(String alias) {
        return new UserSummaryByStatementType(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSummaryByStatementType as(Name alias) {
        return new UserSummaryByStatementType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserSummaryByStatementType rename(String name) {
        return new UserSummaryByStatementType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserSummaryByStatementType rename(Name name) {
        return new UserSummaryByStatementType(name, null);
    }
}
