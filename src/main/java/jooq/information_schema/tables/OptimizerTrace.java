/*
 * This file is generated by jOOQ.
 */
package jooq.information_schema.tables;


import javax.annotation.Generated;

import jooq.information_schema.InformationSchema;
import jooq.information_schema.tables.records.OptimizerTraceRecord;

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
public class OptimizerTrace extends TableImpl<OptimizerTraceRecord> {

    private static final long serialVersionUID = 439484906;

    /**
     * The reference instance of <code>information_schema.OPTIMIZER_TRACE</code>
     */
    public static final OptimizerTrace OPTIMIZER_TRACE = new OptimizerTrace();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OptimizerTraceRecord> getRecordType() {
        return OptimizerTraceRecord.class;
    }

    /**
     * The column <code>information_schema.OPTIMIZER_TRACE.QUERY</code>.
     */
    public final TableField<OptimizerTraceRecord, String> QUERY = createField("QUERY", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>information_schema.OPTIMIZER_TRACE.TRACE</code>.
     */
    public final TableField<OptimizerTraceRecord, String> TRACE = createField("TRACE", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>information_schema.OPTIMIZER_TRACE.MISSING_BYTES_BEYOND_MAX_MEM_SIZE</code>.
     */
    public final TableField<OptimizerTraceRecord, Integer> MISSING_BYTES_BEYOND_MAX_MEM_SIZE = createField("MISSING_BYTES_BEYOND_MAX_MEM_SIZE", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.OPTIMIZER_TRACE.INSUFFICIENT_PRIVILEGES</code>.
     */
    public final TableField<OptimizerTraceRecord, Byte> INSUFFICIENT_PRIVILEGES = createField("INSUFFICIENT_PRIVILEGES", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * Create a <code>information_schema.OPTIMIZER_TRACE</code> table reference
     */
    public OptimizerTrace() {
        this(DSL.name("OPTIMIZER_TRACE"), null);
    }

    /**
     * Create an aliased <code>information_schema.OPTIMIZER_TRACE</code> table reference
     */
    public OptimizerTrace(String alias) {
        this(DSL.name(alias), OPTIMIZER_TRACE);
    }

    /**
     * Create an aliased <code>information_schema.OPTIMIZER_TRACE</code> table reference
     */
    public OptimizerTrace(Name alias) {
        this(alias, OPTIMIZER_TRACE);
    }

    private OptimizerTrace(Name alias, Table<OptimizerTraceRecord> aliased) {
        this(alias, aliased, null);
    }

    private OptimizerTrace(Name alias, Table<OptimizerTraceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> OptimizerTrace(Table<O> child, ForeignKey<O, OptimizerTraceRecord> key) {
        super(child, key, OPTIMIZER_TRACE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OptimizerTrace as(String alias) {
        return new OptimizerTrace(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OptimizerTrace as(Name alias) {
        return new OptimizerTrace(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OptimizerTrace rename(String name) {
        return new OptimizerTrace(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OptimizerTrace rename(Name name) {
        return new OptimizerTrace(name, null);
    }
}
