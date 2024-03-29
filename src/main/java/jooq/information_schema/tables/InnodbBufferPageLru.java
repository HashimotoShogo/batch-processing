/*
 * This file is generated by jOOQ.
 */
package jooq.information_schema.tables;


import javax.annotation.Generated;

import jooq.information_schema.InformationSchema;
import jooq.information_schema.tables.records.InnodbBufferPageLruRecord;

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
public class InnodbBufferPageLru extends TableImpl<InnodbBufferPageLruRecord> {

    private static final long serialVersionUID = -439072487;

    /**
     * The reference instance of <code>information_schema.INNODB_BUFFER_PAGE_LRU</code>
     */
    public static final InnodbBufferPageLru INNODB_BUFFER_PAGE_LRU = new InnodbBufferPageLru();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbBufferPageLruRecord> getRecordType() {
        return InnodbBufferPageLruRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.POOL_ID</code>.
     */
    public final TableField<InnodbBufferPageLruRecord, ULong> POOL_ID = createField("POOL_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.LRU_POSITION</code>.
     */
    public final TableField<InnodbBufferPageLruRecord, ULong> LRU_POSITION = createField("LRU_POSITION", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.SPACE</code>.
     */
    public final TableField<InnodbBufferPageLruRecord, ULong> SPACE = createField("SPACE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.PAGE_NUMBER</code>.
     */
    public final TableField<InnodbBufferPageLruRecord, ULong> PAGE_NUMBER = createField("PAGE_NUMBER", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.PAGE_TYPE</code>.
     */
    public final TableField<InnodbBufferPageLruRecord, String> PAGE_TYPE = createField("PAGE_TYPE", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.FLUSH_TYPE</code>.
     */
    public final TableField<InnodbBufferPageLruRecord, ULong> FLUSH_TYPE = createField("FLUSH_TYPE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.FIX_COUNT</code>.
     */
    public final TableField<InnodbBufferPageLruRecord, ULong> FIX_COUNT = createField("FIX_COUNT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.IS_HASHED</code>.
     */
    public final TableField<InnodbBufferPageLruRecord, String> IS_HASHED = createField("IS_HASHED", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.NEWEST_MODIFICATION</code>.
     */
    public final TableField<InnodbBufferPageLruRecord, ULong> NEWEST_MODIFICATION = createField("NEWEST_MODIFICATION", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.OLDEST_MODIFICATION</code>.
     */
    public final TableField<InnodbBufferPageLruRecord, ULong> OLDEST_MODIFICATION = createField("OLDEST_MODIFICATION", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.ACCESS_TIME</code>.
     */
    public final TableField<InnodbBufferPageLruRecord, ULong> ACCESS_TIME = createField("ACCESS_TIME", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.TABLE_NAME</code>.
     */
    public final TableField<InnodbBufferPageLruRecord, String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR(1024), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.INDEX_NAME</code>.
     */
    public final TableField<InnodbBufferPageLruRecord, String> INDEX_NAME = createField("INDEX_NAME", org.jooq.impl.SQLDataType.VARCHAR(1024), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.NUMBER_RECORDS</code>.
     */
    public final TableField<InnodbBufferPageLruRecord, ULong> NUMBER_RECORDS = createField("NUMBER_RECORDS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.DATA_SIZE</code>.
     */
    public final TableField<InnodbBufferPageLruRecord, ULong> DATA_SIZE = createField("DATA_SIZE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.COMPRESSED_SIZE</code>.
     */
    public final TableField<InnodbBufferPageLruRecord, ULong> COMPRESSED_SIZE = createField("COMPRESSED_SIZE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.COMPRESSED</code>.
     */
    public final TableField<InnodbBufferPageLruRecord, String> COMPRESSED = createField("COMPRESSED", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.IO_FIX</code>.
     */
    public final TableField<InnodbBufferPageLruRecord, String> IO_FIX = createField("IO_FIX", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.IS_OLD</code>.
     */
    public final TableField<InnodbBufferPageLruRecord, String> IS_OLD = createField("IS_OLD", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.INNODB_BUFFER_PAGE_LRU.FREE_PAGE_CLOCK</code>.
     */
    public final TableField<InnodbBufferPageLruRecord, ULong> FREE_PAGE_CLOCK = createField("FREE_PAGE_CLOCK", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>information_schema.INNODB_BUFFER_PAGE_LRU</code> table reference
     */
    public InnodbBufferPageLru() {
        this(DSL.name("INNODB_BUFFER_PAGE_LRU"), null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_BUFFER_PAGE_LRU</code> table reference
     */
    public InnodbBufferPageLru(String alias) {
        this(DSL.name(alias), INNODB_BUFFER_PAGE_LRU);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_BUFFER_PAGE_LRU</code> table reference
     */
    public InnodbBufferPageLru(Name alias) {
        this(alias, INNODB_BUFFER_PAGE_LRU);
    }

    private InnodbBufferPageLru(Name alias, Table<InnodbBufferPageLruRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbBufferPageLru(Name alias, Table<InnodbBufferPageLruRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> InnodbBufferPageLru(Table<O> child, ForeignKey<O, InnodbBufferPageLruRecord> key) {
        super(child, key, INNODB_BUFFER_PAGE_LRU);
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
    public InnodbBufferPageLru as(String alias) {
        return new InnodbBufferPageLru(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbBufferPageLru as(Name alias) {
        return new InnodbBufferPageLru(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbBufferPageLru rename(String name) {
        return new InnodbBufferPageLru(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbBufferPageLru rename(Name name) {
        return new InnodbBufferPageLru(name, null);
    }
}
