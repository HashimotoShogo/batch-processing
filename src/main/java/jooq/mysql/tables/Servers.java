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
import jooq.mysql.tables.records.ServersRecord;

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
 * MySQL Foreign Servers table
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Servers extends TableImpl<ServersRecord> {

    private static final long serialVersionUID = 1202132274;

    /**
     * The reference instance of <code>mysql.servers</code>
     */
    public static final Servers SERVERS = new Servers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ServersRecord> getRecordType() {
        return ServersRecord.class;
    }

    /**
     * The column <code>mysql.servers.Server_name</code>.
     */
    public final TableField<ServersRecord, String> SERVER_NAME = createField("Server_name", org.jooq.impl.SQLDataType.CHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.servers.Host</code>.
     */
    public final TableField<ServersRecord, String> HOST = createField("Host", org.jooq.impl.SQLDataType.CHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.servers.Db</code>.
     */
    public final TableField<ServersRecord, String> DB = createField("Db", org.jooq.impl.SQLDataType.CHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.servers.Username</code>.
     */
    public final TableField<ServersRecord, String> USERNAME = createField("Username", org.jooq.impl.SQLDataType.CHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.servers.Password</code>.
     */
    public final TableField<ServersRecord, String> PASSWORD = createField("Password", org.jooq.impl.SQLDataType.CHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.servers.Port</code>.
     */
    public final TableField<ServersRecord, Integer> PORT = createField("Port", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mysql.servers.Socket</code>.
     */
    public final TableField<ServersRecord, String> SOCKET = createField("Socket", org.jooq.impl.SQLDataType.CHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.servers.Wrapper</code>.
     */
    public final TableField<ServersRecord, String> WRAPPER = createField("Wrapper", org.jooq.impl.SQLDataType.CHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.servers.Owner</code>.
     */
    public final TableField<ServersRecord, String> OWNER = createField("Owner", org.jooq.impl.SQLDataType.CHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * Create a <code>mysql.servers</code> table reference
     */
    public Servers() {
        this(DSL.name("servers"), null);
    }

    /**
     * Create an aliased <code>mysql.servers</code> table reference
     */
    public Servers(String alias) {
        this(DSL.name(alias), SERVERS);
    }

    /**
     * Create an aliased <code>mysql.servers</code> table reference
     */
    public Servers(Name alias) {
        this(alias, SERVERS);
    }

    private Servers(Name alias, Table<ServersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Servers(Name alias, Table<ServersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("MySQL Foreign Servers table"));
    }

    public <O extends Record> Servers(Table<O> child, ForeignKey<O, ServersRecord> key) {
        super(child, key, SERVERS);
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
        return Arrays.<Index>asList(Indexes.SERVERS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ServersRecord> getPrimaryKey() {
        return Keys.KEY_SERVERS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ServersRecord>> getKeys() {
        return Arrays.<UniqueKey<ServersRecord>>asList(Keys.KEY_SERVERS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Servers as(String alias) {
        return new Servers(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Servers as(Name alias) {
        return new Servers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Servers rename(String name) {
        return new Servers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Servers rename(Name name) {
        return new Servers(name, null);
    }
}
