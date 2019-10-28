/*
 * This file is generated by jOOQ.
 */
package jooq.performance_schema.tables;


import javax.annotation.Generated;

import jooq.performance_schema.PerformanceSchema;
import jooq.performance_schema.tables.records.GlobalStatusRecord;

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
public class GlobalStatus extends TableImpl<GlobalStatusRecord> {

    private static final long serialVersionUID = 996025143;

    /**
     * The reference instance of <code>performance_schema.global_status</code>
     */
    public static final GlobalStatus GLOBAL_STATUS = new GlobalStatus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GlobalStatusRecord> getRecordType() {
        return GlobalStatusRecord.class;
    }

    /**
     * The column <code>performance_schema.global_status.VARIABLE_NAME</code>.
     */
    public final TableField<GlobalStatusRecord, String> VARIABLE_NAME = createField("VARIABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>performance_schema.global_status.VARIABLE_VALUE</code>.
     */
    public final TableField<GlobalStatusRecord, String> VARIABLE_VALUE = createField("VARIABLE_VALUE", org.jooq.impl.SQLDataType.VARCHAR(1024), this, "");

    /**
     * Create a <code>performance_schema.global_status</code> table reference
     */
    public GlobalStatus() {
        this(DSL.name("global_status"), null);
    }

    /**
     * Create an aliased <code>performance_schema.global_status</code> table reference
     */
    public GlobalStatus(String alias) {
        this(DSL.name(alias), GLOBAL_STATUS);
    }

    /**
     * Create an aliased <code>performance_schema.global_status</code> table reference
     */
    public GlobalStatus(Name alias) {
        this(alias, GLOBAL_STATUS);
    }

    private GlobalStatus(Name alias, Table<GlobalStatusRecord> aliased) {
        this(alias, aliased, null);
    }

    private GlobalStatus(Name alias, Table<GlobalStatusRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> GlobalStatus(Table<O> child, ForeignKey<O, GlobalStatusRecord> key) {
        super(child, key, GLOBAL_STATUS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GlobalStatus as(String alias) {
        return new GlobalStatus(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GlobalStatus as(Name alias) {
        return new GlobalStatus(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GlobalStatus rename(String name) {
        return new GlobalStatus(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GlobalStatus rename(Name name) {
        return new GlobalStatus(name, null);
    }
}
