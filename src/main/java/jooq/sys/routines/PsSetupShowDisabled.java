/*
 * This file is generated by jOOQ.
 */
package jooq.sys.routines;


import javax.annotation.Generated;

import jooq.sys.Sys;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * 
 *  Description
 *  
 *  Shows all currently disable Performance Schema configuration.
 *  
 *  Disabled users is only available for MySQL 5.7.6 and later.
 *  In earlier versions it was only possible to enable users.
 *  
 *  Parameters
 *  
 *  in_show_instruments (BOOLEAN):
 *  Whether to print disabled instruments (can print many items)
 *  
 *  in_show_threads (BOOLEAN):
 *  Whether to print disabled threads
 *  
 *  Example
 *  
 *  mysql&gt; CALL sys.ps_setup_show_disabled(TRUE, TRUE);
 *  +----------------------------+
 *  | performance_schema_enabled |
 *  +----------------------------+
 *  |                          1 |
 *  +----------------------------+
 *  1 row in set (0.00 sec)
 *  
 *  +--------------------+
 *  | disabled_users     |
 *  +--------------------+
 *  | 'mark'@'localhost' |
 *  +--------------------+
 *  1 row in set (0.00 sec)
 *  
 *  +-------------+----------------------+---------+-------+
 *  | object_type | objects              | enabled | timed |
 *  +-------------+----------------------+---------+-------+
 *  | EVENT       | mysql.%              | NO      | NO    |
 *  | EVENT       | performance_schema.% | NO      | NO    |
 *  | EVENT       | information_schema.% | NO      | NO    |
 *  | FUNCTION    | mysql.%              | NO      | NO    |
 *  | FUNCTION    | performance_schema.% | NO      | NO    |
 *  | FUNCTION    | information_schema.% | NO      | NO    |
 *  | PROCEDURE   | mysql.%              | NO      | NO    |
 *  | PROCEDURE   | performance_schema.% | NO      | NO    |
 *  | PROCEDURE   | information_schema.% | NO      | NO    |
 *  | TABLE       | mysql.%              | NO      | NO    |
 *  | TABLE       | performance_schema.% | NO      | NO    |
 *  | TABLE       | information_schema.% | NO      | NO    |
 *  | TRIGGER     | mysql.%              | NO      | NO    |
 *  | TRIGGER     | performance_schema.% | NO      | NO    |
 *  | TRIGGER     | information_schema.% | NO      | NO    |
 *  +-------------+----------------------+---------+-------+
 *  15 rows in set (0.00 sec)
 *  
 *  +----------------------------------+
 *  | disabled_consumers               |
 *  +----------------------------------+
 *  | events_stages_current            |
 *  | events_stages_history            |
 *  | events_stages_history_long       |
 *  | events_statements_history        |
 *  | events_statements_history_long   |
 *  | events_transactions_history      |
 *  | events_transactions_history_long |
 *  | events_waits_current             |
 *  | events_waits_history             |
 *  | events_waits_history_long        |
 *  +----------------------------------+
 *  10 rows in set (0.00 sec)
 *  
 *  Empty set (0.00 sec)
 *  
 *  +---------------------------------------------------------------------------------------+-------+
 *  | disabled_instruments                                                
 *                   | timed |
 *  +---------------------------------------------------------------------------------------+-------+
 *  | wait/synch/mutex/sql/TC_LOG_MMAP::LOCK_tc                           
 *                   | NO    |
 *  | wait/synch/mutex/sql/LOCK_des_key_file                              
 *                   | NO    |
 *  | wait/synch/mutex/sql/MYSQL_BIN_LOG::LOCK_commit                     
 *                   | NO    |
 *  ...
 *  | memory/sql/servers_cache                                            
 *                   | NO    |
 *  | memory/sql/udf_mem                                                  
 *                   | NO    |
 *  | wait/lock/metadata/sql/mdl                                          
 *                   | NO    |
 *  +---------------------------------------------------------------------------------------+-------+
 *  547 rows in set (0.00 sec)
 *  
 *  Query OK, 0 rows affected (0.01 sec)
 *  
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PsSetupShowDisabled extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -1412203170;

    /**
     * The parameter <code>sys.ps_setup_show_disabled.in_show_instruments</code>.
     */
    public static final Parameter<Byte> IN_SHOW_INSTRUMENTS = createParameter("in_show_instruments", org.jooq.impl.SQLDataType.TINYINT, false, false);

    /**
     * The parameter <code>sys.ps_setup_show_disabled.in_show_threads</code>.
     */
    public static final Parameter<Byte> IN_SHOW_THREADS = createParameter("in_show_threads", org.jooq.impl.SQLDataType.TINYINT, false, false);

    /**
     * Create a new routine call instance
     */
    public PsSetupShowDisabled() {
        super("ps_setup_show_disabled", Sys.SYS);

        addInParameter(IN_SHOW_INSTRUMENTS);
        addInParameter(IN_SHOW_THREADS);
    }

    /**
     * Set the <code>in_show_instruments</code> parameter IN value to the routine
     */
    public void setInShowInstruments(Byte value) {
        setValue(IN_SHOW_INSTRUMENTS, value);
    }

    /**
     * Set the <code>in_show_threads</code> parameter IN value to the routine
     */
    public void setInShowThreads(Byte value) {
        setValue(IN_SHOW_THREADS, value);
    }
}
