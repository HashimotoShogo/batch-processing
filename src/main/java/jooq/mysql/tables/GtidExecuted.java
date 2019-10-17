/*
 * This file is generated by jOOQ.
 */
package jooq.mysql.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.mysql.Indexes;
import jooq.mysql.Keys;
import jooq.mysql.Mysql;
import jooq.mysql.tables.records.GtidExecutedRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class GtidExecuted extends TableImpl<GtidExecutedRecord> {

    private static final long serialVersionUID = 727609144;

    /**
     * The reference instance of <code>mysql.gtid_executed</code>
     */
    public static final GtidExecuted GTID_EXECUTED = new GtidExecuted();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GtidExecutedRecord> getRecordType() {
        return GtidExecutedRecord.class;
    }

    /**
     * The column <code>mysql.gtid_executed.source_uuid</code>. uuid of the source where the transaction was originally executed.
     */
    public final TableField<GtidExecutedRecord, String> SOURCE_UUID = createField("source_uuid", org.jooq.impl.SQLDataType.CHAR(36).nullable(false), this, "uuid of the source where the transaction was originally executed.");

    /**
     * The column <code>mysql.gtid_executed.interval_start</code>. First number of interval.
     */
    public final TableField<GtidExecutedRecord, Long> INTERVAL_START = createField("interval_start", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "First number of interval.");

    /**
     * The column <code>mysql.gtid_executed.interval_end</code>. Last number of interval.
     */
    public final TableField<GtidExecutedRecord, Long> INTERVAL_END = createField("interval_end", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "Last number of interval.");

    /**
     * Create a <code>mysql.gtid_executed</code> table reference
     */
    public GtidExecuted() {
        this(DSL.name("gtid_executed"), null);
    }

    /**
     * Create an aliased <code>mysql.gtid_executed</code> table reference
     */
    public GtidExecuted(String alias) {
        this(DSL.name(alias), GTID_EXECUTED);
    }

    /**
     * Create an aliased <code>mysql.gtid_executed</code> table reference
     */
    public GtidExecuted(Name alias) {
        this(alias, GTID_EXECUTED);
    }

    private GtidExecuted(Name alias, Table<GtidExecutedRecord> aliased) {
        this(alias, aliased, null);
    }

    private GtidExecuted(Name alias, Table<GtidExecutedRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GtidExecuted(Table<O> child, ForeignKey<O, GtidExecutedRecord> key) {
        super(child, key, GTID_EXECUTED);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Mysql.MYSQL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.GTID_EXECUTED_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GtidExecutedRecord> getPrimaryKey() {
        return Keys.KEY_GTID_EXECUTED_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GtidExecutedRecord>> getKeys() {
        return Arrays.<UniqueKey<GtidExecutedRecord>>asList(Keys.KEY_GTID_EXECUTED_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtidExecuted as(String alias) {
        return new GtidExecuted(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtidExecuted as(Name alias) {
        return new GtidExecuted(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GtidExecuted rename(String name) {
        return new GtidExecuted(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GtidExecuted rename(Name name) {
        return new GtidExecuted(name, null);
    }
}