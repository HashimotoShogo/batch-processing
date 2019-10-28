/*
 * This file is generated by jOOQ.
 */
package jooq.information_schema.tables;


import javax.annotation.Generated;

import jooq.information_schema.InformationSchema;
import jooq.information_schema.tables.records.InnodbSysForeignColsRecord;

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
public class InnodbSysForeignCols extends TableImpl<InnodbSysForeignColsRecord> {

    private static final long serialVersionUID = 661873200;

    /**
     * The reference instance of <code>information_schema.INNODB_SYS_FOREIGN_COLS</code>
     */
    public static final InnodbSysForeignCols INNODB_SYS_FOREIGN_COLS = new InnodbSysForeignCols();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbSysForeignColsRecord> getRecordType() {
        return InnodbSysForeignColsRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_SYS_FOREIGN_COLS.ID</code>.
     */
    public final TableField<InnodbSysForeignColsRecord, String> ID = createField("ID", org.jooq.impl.SQLDataType.VARCHAR(193).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_FOREIGN_COLS.FOR_COL_NAME</code>.
     */
    public final TableField<InnodbSysForeignColsRecord, String> FOR_COL_NAME = createField("FOR_COL_NAME", org.jooq.impl.SQLDataType.VARCHAR(193).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_FOREIGN_COLS.REF_COL_NAME</code>.
     */
    public final TableField<InnodbSysForeignColsRecord, String> REF_COL_NAME = createField("REF_COL_NAME", org.jooq.impl.SQLDataType.VARCHAR(193).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_FOREIGN_COLS.POS</code>.
     */
    public final TableField<InnodbSysForeignColsRecord, UInteger> POS = createField("POS", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * Create a <code>information_schema.INNODB_SYS_FOREIGN_COLS</code> table reference
     */
    public InnodbSysForeignCols() {
        this(DSL.name("INNODB_SYS_FOREIGN_COLS"), null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_FOREIGN_COLS</code> table reference
     */
    public InnodbSysForeignCols(String alias) {
        this(DSL.name(alias), INNODB_SYS_FOREIGN_COLS);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_FOREIGN_COLS</code> table reference
     */
    public InnodbSysForeignCols(Name alias) {
        this(alias, INNODB_SYS_FOREIGN_COLS);
    }

    private InnodbSysForeignCols(Name alias, Table<InnodbSysForeignColsRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbSysForeignCols(Name alias, Table<InnodbSysForeignColsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> InnodbSysForeignCols(Table<O> child, ForeignKey<O, InnodbSysForeignColsRecord> key) {
        super(child, key, INNODB_SYS_FOREIGN_COLS);
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
    public InnodbSysForeignCols as(String alias) {
        return new InnodbSysForeignCols(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysForeignCols as(Name alias) {
        return new InnodbSysForeignCols(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysForeignCols rename(String name) {
        return new InnodbSysForeignCols(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysForeignCols rename(Name name) {
        return new InnodbSysForeignCols(name, null);
    }
}
