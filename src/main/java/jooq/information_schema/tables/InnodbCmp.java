/*
 * This file is generated by jOOQ.
 */
package jooq.information_schema.tables;


import javax.annotation.Generated;

import jooq.information_schema.InformationSchema;
import jooq.information_schema.tables.records.InnodbCmpRecord;

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
public class InnodbCmp extends TableImpl<InnodbCmpRecord> {

    private static final long serialVersionUID = -268266737;

    /**
     * The reference instance of <code>information_schema.INNODB_CMP</code>
     */
    public static final InnodbCmp INNODB_CMP = new InnodbCmp();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbCmpRecord> getRecordType() {
        return InnodbCmpRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_CMP.page_size</code>.
     */
    public final TableField<InnodbCmpRecord, Integer> PAGE_SIZE = createField("page_size", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMP.compress_ops</code>.
     */
    public final TableField<InnodbCmpRecord, Integer> COMPRESS_OPS = createField("compress_ops", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMP.compress_ops_ok</code>.
     */
    public final TableField<InnodbCmpRecord, Integer> COMPRESS_OPS_OK = createField("compress_ops_ok", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMP.compress_time</code>.
     */
    public final TableField<InnodbCmpRecord, Integer> COMPRESS_TIME = createField("compress_time", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMP.uncompress_ops</code>.
     */
    public final TableField<InnodbCmpRecord, Integer> UNCOMPRESS_OPS = createField("uncompress_ops", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMP.uncompress_time</code>.
     */
    public final TableField<InnodbCmpRecord, Integer> UNCOMPRESS_TIME = createField("uncompress_time", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>information_schema.INNODB_CMP</code> table reference
     */
    public InnodbCmp() {
        this(DSL.name("INNODB_CMP"), null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_CMP</code> table reference
     */
    public InnodbCmp(String alias) {
        this(DSL.name(alias), INNODB_CMP);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_CMP</code> table reference
     */
    public InnodbCmp(Name alias) {
        this(alias, INNODB_CMP);
    }

    private InnodbCmp(Name alias, Table<InnodbCmpRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbCmp(Name alias, Table<InnodbCmpRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> InnodbCmp(Table<O> child, ForeignKey<O, InnodbCmpRecord> key) {
        super(child, key, INNODB_CMP);
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
    public InnodbCmp as(String alias) {
        return new InnodbCmp(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbCmp as(Name alias) {
        return new InnodbCmp(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbCmp rename(String name) {
        return new InnodbCmp(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbCmp rename(Name name) {
        return new InnodbCmp(name, null);
    }
}
