/*
 * This file is generated by jOOQ.
 */
package jooq.sys.tables;


import javax.annotation.Generated;

import jooq.sys.Sys;
import jooq.sys.tables.records.X$userSummaryByFileIoTypeRecord;

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
public class X$userSummaryByFileIoType extends TableImpl<X$userSummaryByFileIoTypeRecord> {

    private static final long serialVersionUID = -355616557;

    /**
     * The reference instance of <code>sys.x$user_summary_by_file_io_type</code>
     */
    public static final X$userSummaryByFileIoType X$USER_SUMMARY_BY_FILE_IO_TYPE = new X$userSummaryByFileIoType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$userSummaryByFileIoTypeRecord> getRecordType() {
        return X$userSummaryByFileIoTypeRecord.class;
    }

    /**
     * The column <code>sys.x$user_summary_by_file_io_type.user</code>.
     */
    public final TableField<X$userSummaryByFileIoTypeRecord, String> USER = createField("user", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>sys.x$user_summary_by_file_io_type.event_name</code>.
     */
    public final TableField<X$userSummaryByFileIoTypeRecord, String> EVENT_NAME = createField("event_name", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>sys.x$user_summary_by_file_io_type.total</code>.
     */
    public final TableField<X$userSummaryByFileIoTypeRecord, ULong> TOTAL = createField("total", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$user_summary_by_file_io_type.latency</code>.
     */
    public final TableField<X$userSummaryByFileIoTypeRecord, ULong> LATENCY = createField("latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$user_summary_by_file_io_type.max_latency</code>.
     */
    public final TableField<X$userSummaryByFileIoTypeRecord, ULong> MAX_LATENCY = createField("max_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>sys.x$user_summary_by_file_io_type</code> table reference
     */
    public X$userSummaryByFileIoType() {
        this(DSL.name("x$user_summary_by_file_io_type"), null);
    }

    /**
     * Create an aliased <code>sys.x$user_summary_by_file_io_type</code> table reference
     */
    public X$userSummaryByFileIoType(String alias) {
        this(DSL.name(alias), X$USER_SUMMARY_BY_FILE_IO_TYPE);
    }

    /**
     * Create an aliased <code>sys.x$user_summary_by_file_io_type</code> table reference
     */
    public X$userSummaryByFileIoType(Name alias) {
        this(alias, X$USER_SUMMARY_BY_FILE_IO_TYPE);
    }

    private X$userSummaryByFileIoType(Name alias, Table<X$userSummaryByFileIoTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$userSummaryByFileIoType(Name alias, Table<X$userSummaryByFileIoTypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> X$userSummaryByFileIoType(Table<O> child, ForeignKey<O, X$userSummaryByFileIoTypeRecord> key) {
        super(child, key, X$USER_SUMMARY_BY_FILE_IO_TYPE);
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
    public X$userSummaryByFileIoType as(String alias) {
        return new X$userSummaryByFileIoType(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$userSummaryByFileIoType as(Name alias) {
        return new X$userSummaryByFileIoType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$userSummaryByFileIoType rename(String name) {
        return new X$userSummaryByFileIoType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$userSummaryByFileIoType rename(Name name) {
        return new X$userSummaryByFileIoType(name, null);
    }
}