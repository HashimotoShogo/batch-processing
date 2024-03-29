/*
 * This file is generated by jOOQ.
 */
package jooq.information_schema.tables;


import javax.annotation.Generated;

import jooq.information_schema.InformationSchema;
import jooq.information_schema.tables.records.InnodbSysVirtualRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


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
public class InnodbSysVirtual extends TableImpl<InnodbSysVirtualRecord> {

    private static final long serialVersionUID = -329637425;

    /**
     * The reference instance of <code>information_schema.INNODB_SYS_VIRTUAL</code>
     */
    public static final InnodbSysVirtual INNODB_SYS_VIRTUAL = new InnodbSysVirtual();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbSysVirtualRecord> getRecordType() {
        return InnodbSysVirtualRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_SYS_VIRTUAL.TABLE_ID</code>.
     */
    public final TableField<InnodbSysVirtualRecord, ULong> TABLE_ID = createField("TABLE_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_VIRTUAL.POS</code>.
     */
    public final TableField<InnodbSysVirtualRecord, UInteger> POS = createField("POS", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_VIRTUAL.BASE_POS</code>.
     */
    public final TableField<InnodbSysVirtualRecord, UInteger> BASE_POS = createField("BASE_POS", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * Create a <code>information_schema.INNODB_SYS_VIRTUAL</code> table reference
     */
    public InnodbSysVirtual() {
        this(DSL.name("INNODB_SYS_VIRTUAL"), null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_VIRTUAL</code> table reference
     */
    public InnodbSysVirtual(String alias) {
        this(DSL.name(alias), INNODB_SYS_VIRTUAL);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_VIRTUAL</code> table reference
     */
    public InnodbSysVirtual(Name alias) {
        this(alias, INNODB_SYS_VIRTUAL);
    }

    private InnodbSysVirtual(Name alias, Table<InnodbSysVirtualRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbSysVirtual(Name alias, Table<InnodbSysVirtualRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> InnodbSysVirtual(Table<O> child, ForeignKey<O, InnodbSysVirtualRecord> key) {
        super(child, key, INNODB_SYS_VIRTUAL);
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
    public InnodbSysVirtual as(String alias) {
        return new InnodbSysVirtual(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysVirtual as(Name alias) {
        return new InnodbSysVirtual(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysVirtual rename(String name) {
        return new InnodbSysVirtual(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysVirtual rename(Name name) {
        return new InnodbSysVirtual(name, null);
    }
}
