/*
 * This file is generated by jOOQ.
 */
package jooq.sys.tables;


import java.math.BigInteger;

import javax.annotation.Generated;

import jooq.sys.Sys;
import jooq.sys.tables.records.UserSummaryByFileIoRecord;

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
public class UserSummaryByFileIo extends TableImpl<UserSummaryByFileIoRecord> {

    private static final long serialVersionUID = 1351691612;

    /**
     * The reference instance of <code>sys.user_summary_by_file_io</code>
     */
    public static final UserSummaryByFileIo USER_SUMMARY_BY_FILE_IO = new UserSummaryByFileIo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserSummaryByFileIoRecord> getRecordType() {
        return UserSummaryByFileIoRecord.class;
    }

    /**
     * The column <code>sys.user_summary_by_file_io.user</code>.
     */
    public final TableField<UserSummaryByFileIoRecord, String> USER = createField("user", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>sys.user_summary_by_file_io.ios</code>.
     */
    public final TableField<UserSummaryByFileIoRecord, BigInteger> IOS = createField("ios", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

    /**
     * The column <code>sys.user_summary_by_file_io.io_latency</code>.
     */
    public final TableField<UserSummaryByFileIoRecord, String> IO_LATENCY = createField("io_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>sys.user_summary_by_file_io</code> table reference
     */
    public UserSummaryByFileIo() {
        this(DSL.name("user_summary_by_file_io"), null);
    }

    /**
     * Create an aliased <code>sys.user_summary_by_file_io</code> table reference
     */
    public UserSummaryByFileIo(String alias) {
        this(DSL.name(alias), USER_SUMMARY_BY_FILE_IO);
    }

    /**
     * Create an aliased <code>sys.user_summary_by_file_io</code> table reference
     */
    public UserSummaryByFileIo(Name alias) {
        this(alias, USER_SUMMARY_BY_FILE_IO);
    }

    private UserSummaryByFileIo(Name alias, Table<UserSummaryByFileIoRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserSummaryByFileIo(Name alias, Table<UserSummaryByFileIoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> UserSummaryByFileIo(Table<O> child, ForeignKey<O, UserSummaryByFileIoRecord> key) {
        super(child, key, USER_SUMMARY_BY_FILE_IO);
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
    public UserSummaryByFileIo as(String alias) {
        return new UserSummaryByFileIo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSummaryByFileIo as(Name alias) {
        return new UserSummaryByFileIo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserSummaryByFileIo rename(String name) {
        return new UserSummaryByFileIo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserSummaryByFileIo rename(Name name) {
        return new UserSummaryByFileIo(name, null);
    }
}
