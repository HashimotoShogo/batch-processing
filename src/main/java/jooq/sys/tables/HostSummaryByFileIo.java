/*
 * This file is generated by jOOQ.
 */
package jooq.sys.tables;


import java.math.BigInteger;

import javax.annotation.Generated;

import jooq.sys.Sys;
import jooq.sys.tables.records.HostSummaryByFileIoRecord;

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
public class HostSummaryByFileIo extends TableImpl<HostSummaryByFileIoRecord> {

    private static final long serialVersionUID = 821578275;

    /**
     * The reference instance of <code>sys.host_summary_by_file_io</code>
     */
    public static final HostSummaryByFileIo HOST_SUMMARY_BY_FILE_IO = new HostSummaryByFileIo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HostSummaryByFileIoRecord> getRecordType() {
        return HostSummaryByFileIoRecord.class;
    }

    /**
     * The column <code>sys.host_summary_by_file_io.host</code>.
     */
    public final TableField<HostSummaryByFileIoRecord, String> HOST = createField("host", org.jooq.impl.SQLDataType.VARCHAR(60), this, "");

    /**
     * The column <code>sys.host_summary_by_file_io.ios</code>.
     */
    public final TableField<HostSummaryByFileIoRecord, BigInteger> IOS = createField("ios", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

    /**
     * The column <code>sys.host_summary_by_file_io.io_latency</code>.
     */
    public final TableField<HostSummaryByFileIoRecord, String> IO_LATENCY = createField("io_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>sys.host_summary_by_file_io</code> table reference
     */
    public HostSummaryByFileIo() {
        this(DSL.name("host_summary_by_file_io"), null);
    }

    /**
     * Create an aliased <code>sys.host_summary_by_file_io</code> table reference
     */
    public HostSummaryByFileIo(String alias) {
        this(DSL.name(alias), HOST_SUMMARY_BY_FILE_IO);
    }

    /**
     * Create an aliased <code>sys.host_summary_by_file_io</code> table reference
     */
    public HostSummaryByFileIo(Name alias) {
        this(alias, HOST_SUMMARY_BY_FILE_IO);
    }

    private HostSummaryByFileIo(Name alias, Table<HostSummaryByFileIoRecord> aliased) {
        this(alias, aliased, null);
    }

    private HostSummaryByFileIo(Name alias, Table<HostSummaryByFileIoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> HostSummaryByFileIo(Table<O> child, ForeignKey<O, HostSummaryByFileIoRecord> key) {
        super(child, key, HOST_SUMMARY_BY_FILE_IO);
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
    public HostSummaryByFileIo as(String alias) {
        return new HostSummaryByFileIo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HostSummaryByFileIo as(Name alias) {
        return new HostSummaryByFileIo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HostSummaryByFileIo rename(String name) {
        return new HostSummaryByFileIo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public HostSummaryByFileIo rename(Name name) {
        return new HostSummaryByFileIo(name, null);
    }
}
