/*
 * This file is generated by jOOQ.
 */
package jooq.performance_schema.tables;


import javax.annotation.Generated;

import jooq.performance_schema.PerformanceSchema;
import jooq.performance_schema.tables.records.HostsRecord;

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
public class Hosts extends TableImpl<HostsRecord> {

    private static final long serialVersionUID = 1019469143;

    /**
     * The reference instance of <code>performance_schema.hosts</code>
     */
    public static final Hosts HOSTS = new Hosts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HostsRecord> getRecordType() {
        return HostsRecord.class;
    }

    /**
     * The column <code>performance_schema.hosts.HOST</code>.
     */
    public final TableField<HostsRecord, String> HOST = createField("HOST", org.jooq.impl.SQLDataType.CHAR(60), this, "");

    /**
     * The column <code>performance_schema.hosts.CURRENT_CONNECTIONS</code>.
     */
    public final TableField<HostsRecord, Long> CURRENT_CONNECTIONS = createField("CURRENT_CONNECTIONS", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>performance_schema.hosts.TOTAL_CONNECTIONS</code>.
     */
    public final TableField<HostsRecord, Long> TOTAL_CONNECTIONS = createField("TOTAL_CONNECTIONS", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>performance_schema.hosts</code> table reference
     */
    public Hosts() {
        this(DSL.name("hosts"), null);
    }

    /**
     * Create an aliased <code>performance_schema.hosts</code> table reference
     */
    public Hosts(String alias) {
        this(DSL.name(alias), HOSTS);
    }

    /**
     * Create an aliased <code>performance_schema.hosts</code> table reference
     */
    public Hosts(Name alias) {
        this(alias, HOSTS);
    }

    private Hosts(Name alias, Table<HostsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Hosts(Name alias, Table<HostsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Hosts(Table<O> child, ForeignKey<O, HostsRecord> key) {
        super(child, key, HOSTS);
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
    public Hosts as(String alias) {
        return new Hosts(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Hosts as(Name alias) {
        return new Hosts(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Hosts rename(String name) {
        return new Hosts(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Hosts rename(Name name) {
        return new Hosts(name, null);
    }
}
