/*
 * This file is generated by jOOQ.
 */
package jooq.mysql;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.DefaultCatalog;
import jooq.mysql.tables.ColumnsPriv;
import jooq.mysql.tables.Db;
import jooq.mysql.tables.EngineCost;
import jooq.mysql.tables.Event;
import jooq.mysql.tables.Func;
import jooq.mysql.tables.GeneralLog;
import jooq.mysql.tables.GtidExecuted;
import jooq.mysql.tables.HelpCategory;
import jooq.mysql.tables.HelpKeyword;
import jooq.mysql.tables.HelpRelation;
import jooq.mysql.tables.HelpTopic;
import jooq.mysql.tables.InnodbIndexStats;
import jooq.mysql.tables.InnodbTableStats;
import jooq.mysql.tables.NdbBinlogIndex;
import jooq.mysql.tables.Plugin;
import jooq.mysql.tables.Proc;
import jooq.mysql.tables.ProcsPriv;
import jooq.mysql.tables.ProxiesPriv;
import jooq.mysql.tables.ServerCost;
import jooq.mysql.tables.Servers;
import jooq.mysql.tables.SlaveMasterInfo;
import jooq.mysql.tables.SlaveRelayLogInfo;
import jooq.mysql.tables.SlaveWorkerInfo;
import jooq.mysql.tables.SlowLog;
import jooq.mysql.tables.TablesPriv;
import jooq.mysql.tables.TimeZone;
import jooq.mysql.tables.TimeZoneLeapSecond;
import jooq.mysql.tables.TimeZoneName;
import jooq.mysql.tables.TimeZoneTransition;
import jooq.mysql.tables.TimeZoneTransitionType;
import jooq.mysql.tables.User;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Mysql extends SchemaImpl {

    private static final long serialVersionUID = -1592901238;

    /**
     * The reference instance of <code>mysql</code>
     */
    public static final Mysql MYSQL = new Mysql();

    /**
     * Column privileges
     */
    public final ColumnsPriv COLUMNS_PRIV = jooq.mysql.tables.ColumnsPriv.COLUMNS_PRIV;

    /**
     * Database privileges
     */
    public final Db DB = jooq.mysql.tables.Db.DB;

    /**
     * The table <code>mysql.engine_cost</code>.
     */
    public final EngineCost ENGINE_COST = jooq.mysql.tables.EngineCost.ENGINE_COST;

    /**
     * Events
     */
    public final Event EVENT = jooq.mysql.tables.Event.EVENT;

    /**
     * User defined functions
     */
    public final Func FUNC = jooq.mysql.tables.Func.FUNC;

    /**
     * General log
     */
    public final GeneralLog GENERAL_LOG = jooq.mysql.tables.GeneralLog.GENERAL_LOG;

    /**
     * The table <code>mysql.gtid_executed</code>.
     */
    public final GtidExecuted GTID_EXECUTED = jooq.mysql.tables.GtidExecuted.GTID_EXECUTED;

    /**
     * help categories
     */
    public final HelpCategory HELP_CATEGORY = jooq.mysql.tables.HelpCategory.HELP_CATEGORY;

    /**
     * help keywords
     */
    public final HelpKeyword HELP_KEYWORD = jooq.mysql.tables.HelpKeyword.HELP_KEYWORD;

    /**
     * keyword-topic relation
     */
    public final HelpRelation HELP_RELATION = jooq.mysql.tables.HelpRelation.HELP_RELATION;

    /**
     * help topics
     */
    public final HelpTopic HELP_TOPIC = jooq.mysql.tables.HelpTopic.HELP_TOPIC;

    /**
     * The table <code>mysql.innodb_index_stats</code>.
     */
    public final InnodbIndexStats INNODB_INDEX_STATS = jooq.mysql.tables.InnodbIndexStats.INNODB_INDEX_STATS;

    /**
     * The table <code>mysql.innodb_table_stats</code>.
     */
    public final InnodbTableStats INNODB_TABLE_STATS = jooq.mysql.tables.InnodbTableStats.INNODB_TABLE_STATS;

    /**
     * The table <code>mysql.ndb_binlog_index</code>.
     */
    public final NdbBinlogIndex NDB_BINLOG_INDEX = jooq.mysql.tables.NdbBinlogIndex.NDB_BINLOG_INDEX;

    /**
     * MySQL plugins
     */
    public final Plugin PLUGIN = jooq.mysql.tables.Plugin.PLUGIN;

    /**
     * Stored Procedures
     */
    public final Proc PROC = jooq.mysql.tables.Proc.PROC;

    /**
     * Procedure privileges
     */
    public final ProcsPriv PROCS_PRIV = jooq.mysql.tables.ProcsPriv.PROCS_PRIV;

    /**
     * User proxy privileges
     */
    public final ProxiesPriv PROXIES_PRIV = jooq.mysql.tables.ProxiesPriv.PROXIES_PRIV;

    /**
     * MySQL Foreign Servers table
     */
    public final Servers SERVERS = jooq.mysql.tables.Servers.SERVERS;

    /**
     * The table <code>mysql.server_cost</code>.
     */
    public final ServerCost SERVER_COST = jooq.mysql.tables.ServerCost.SERVER_COST;

    /**
     * Master Information
     */
    public final SlaveMasterInfo SLAVE_MASTER_INFO = jooq.mysql.tables.SlaveMasterInfo.SLAVE_MASTER_INFO;

    /**
     * Relay Log Information
     */
    public final SlaveRelayLogInfo SLAVE_RELAY_LOG_INFO = jooq.mysql.tables.SlaveRelayLogInfo.SLAVE_RELAY_LOG_INFO;

    /**
     * Worker Information
     */
    public final SlaveWorkerInfo SLAVE_WORKER_INFO = jooq.mysql.tables.SlaveWorkerInfo.SLAVE_WORKER_INFO;

    /**
     * Slow log
     */
    public final SlowLog SLOW_LOG = jooq.mysql.tables.SlowLog.SLOW_LOG;

    /**
     * Table privileges
     */
    public final TablesPriv TABLES_PRIV = jooq.mysql.tables.TablesPriv.TABLES_PRIV;

    /**
     * Time zones
     */
    public final TimeZone TIME_ZONE = jooq.mysql.tables.TimeZone.TIME_ZONE;

    /**
     * Leap seconds information for time zones
     */
    public final TimeZoneLeapSecond TIME_ZONE_LEAP_SECOND = jooq.mysql.tables.TimeZoneLeapSecond.TIME_ZONE_LEAP_SECOND;

    /**
     * Time zone names
     */
    public final TimeZoneName TIME_ZONE_NAME = jooq.mysql.tables.TimeZoneName.TIME_ZONE_NAME;

    /**
     * Time zone transitions
     */
    public final TimeZoneTransition TIME_ZONE_TRANSITION = jooq.mysql.tables.TimeZoneTransition.TIME_ZONE_TRANSITION;

    /**
     * Time zone transition types
     */
    public final TimeZoneTransitionType TIME_ZONE_TRANSITION_TYPE = jooq.mysql.tables.TimeZoneTransitionType.TIME_ZONE_TRANSITION_TYPE;

    /**
     * Users and global privileges
     */
    public final User USER = jooq.mysql.tables.User.USER;

    /**
     * No further instances allowed
     */
    private Mysql() {
        super("mysql", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            ColumnsPriv.COLUMNS_PRIV,
            Db.DB,
            EngineCost.ENGINE_COST,
            Event.EVENT,
            Func.FUNC,
            GeneralLog.GENERAL_LOG,
            GtidExecuted.GTID_EXECUTED,
            HelpCategory.HELP_CATEGORY,
            HelpKeyword.HELP_KEYWORD,
            HelpRelation.HELP_RELATION,
            HelpTopic.HELP_TOPIC,
            InnodbIndexStats.INNODB_INDEX_STATS,
            InnodbTableStats.INNODB_TABLE_STATS,
            NdbBinlogIndex.NDB_BINLOG_INDEX,
            Plugin.PLUGIN,
            Proc.PROC,
            ProcsPriv.PROCS_PRIV,
            ProxiesPriv.PROXIES_PRIV,
            Servers.SERVERS,
            ServerCost.SERVER_COST,
            SlaveMasterInfo.SLAVE_MASTER_INFO,
            SlaveRelayLogInfo.SLAVE_RELAY_LOG_INFO,
            SlaveWorkerInfo.SLAVE_WORKER_INFO,
            SlowLog.SLOW_LOG,
            TablesPriv.TABLES_PRIV,
            TimeZone.TIME_ZONE,
            TimeZoneLeapSecond.TIME_ZONE_LEAP_SECOND,
            TimeZoneName.TIME_ZONE_NAME,
            TimeZoneTransition.TIME_ZONE_TRANSITION,
            TimeZoneTransitionType.TIME_ZONE_TRANSITION_TYPE,
            User.USER);
    }
}
