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
import jooq.mysql.tables.records.PluginRecord;

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
 * MySQL plugins
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Plugin extends TableImpl<PluginRecord> {

    private static final long serialVersionUID = -611892618;

    /**
     * The reference instance of <code>mysql.plugin</code>
     */
    public static final Plugin PLUGIN = new Plugin();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PluginRecord> getRecordType() {
        return PluginRecord.class;
    }

    /**
     * The column <code>mysql.plugin.name</code>.
     */
    public final TableField<PluginRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.plugin.dl</code>.
     */
    public final TableField<PluginRecord, String> DL = createField("dl", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>mysql.plugin</code> table reference
     */
    public Plugin() {
        this(DSL.name("plugin"), null);
    }

    /**
     * Create an aliased <code>mysql.plugin</code> table reference
     */
    public Plugin(String alias) {
        this(DSL.name(alias), PLUGIN);
    }

    /**
     * Create an aliased <code>mysql.plugin</code> table reference
     */
    public Plugin(Name alias) {
        this(alias, PLUGIN);
    }

    private Plugin(Name alias, Table<PluginRecord> aliased) {
        this(alias, aliased, null);
    }

    private Plugin(Name alias, Table<PluginRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("MySQL plugins"));
    }

    public <O extends Record> Plugin(Table<O> child, ForeignKey<O, PluginRecord> key) {
        super(child, key, PLUGIN);
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
        return Arrays.<Index>asList(Indexes.PLUGIN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PluginRecord> getPrimaryKey() {
        return Keys.KEY_PLUGIN_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PluginRecord>> getKeys() {
        return Arrays.<UniqueKey<PluginRecord>>asList(Keys.KEY_PLUGIN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Plugin as(String alias) {
        return new Plugin(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Plugin as(Name alias) {
        return new Plugin(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Plugin rename(String name) {
        return new Plugin(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Plugin rename(Name name) {
        return new Plugin(name, null);
    }
}