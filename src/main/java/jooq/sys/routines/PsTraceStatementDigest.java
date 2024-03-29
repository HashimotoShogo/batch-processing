/*
 * This file is generated by jOOQ.
 */
package jooq.sys.routines;


import java.math.BigDecimal;

import javax.annotation.Generated;

import jooq.sys.Sys;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * 
 *  Description
 *  
 *  Traces all instrumentation within Performance Schema for a specific
 *  Statement Digest. 
 *  
 *  When finding a statement of interest within the 
 *  performance_schema.events_statements_summary_by_digest table, feed
 *  the DIGEST MD5 value in to this procedure, set how long to poll for, 
 *  and at what interval to poll, and it will generate a report of all 
 *  statistics tracked within Performance Schema for that digest for the
 *  interval.
 *  
 *  It will also attempt to generate an EXPLAIN for the longest running 
 *  example of the digest during the interval. Note this may fail, as:
 *  
 *  * Performance Schema truncates long SQL_TEXT values (and hence the 
 *  EXPLAIN will fail due to parse errors)
 *  * the default schema is sys (so tables that are not fully qualified
 *  in the query may not be found)
 *  * some queries such as SHOW are not supported in EXPLAIN.
 *  
 *  When the EXPLAIN fails, the error will be ignored and no EXPLAIN
 *  output generated.
 *  
 *  Requires the SUPER privilege for "SET sql_log_bin = 0;".
 *  
 *  Parameters
 *  
 *  in_digest (VARCHAR(32)):
 *  The statement digest identifier you would like to analyze
 *  in_runtime (INT):
 *  The number of seconds to run analysis for
 *  in_interval (DECIMAL(2,2)):
 *  The interval (in seconds, may be fractional) at which to try
 *  and take snapshots
 *  in_start_fresh (BOOLEAN):
 *  Whether to TRUNCATE the events_statements_history_long and
 *  events_stages_history_long tables before starting
 *  in_auto_enable (BOOLEAN):
 *  Whether to automatically turn on required consumers
 *  
 *  Example
 *  
 *  mysql&gt; call ps_trace_statement_digest('891ec6860f98ba46d89dd20b0c03652c', 
 * 10, 0.1, true, true);
 *  +--------------------+
 *  | SUMMARY STATISTICS |
 *  +--------------------+
 *  | SUMMARY STATISTICS |
 *  +--------------------+
 *  1 row in set (9.11 sec)
 *  
 *  +------------+-----------+-----------+-----------+---------------+------------+------------+
 *  | executions | exec_time | lock_time | rows_sent | rows_examined | tmp_tables 
 * | full_scans |
 *  +------------+-----------+-----------+-----------+---------------+------------+------------+
 *  |         21 | 4.11 ms   | 2.00 ms   |         0 |            21 |    
 *       0 |          0 |
 *  +------------+-----------+-----------+-----------+---------------+------------+------------+
 *  1 row in set (9.11 sec)
 *  
 *  +------------------------------------------+-------+-----------+
 *  | event_name                               | count | latency   |
 *  +------------------------------------------+-------+-----------+
 *  | stage/sql/checking query cache for query |    16 | 724.37 us |
 *  | stage/sql/statistics                     |    16 | 546.92 us |
 *  | stage/sql/freeing items                  |    18 | 520.11 us |
 *  | stage/sql/init                           |    51 | 466.80 us |
 *  ...
 *  | stage/sql/cleaning up                    |    18 | 11.92 us  |
 *  | stage/sql/executing                      |    16 | 6.95 us   |
 *  +------------------------------------------+-------+-----------+
 *  17 rows in set (9.12 sec)
 *  
 *  +---------------------------+
 *  | LONGEST RUNNING STATEMENT |
 *  +---------------------------+
 *  | LONGEST RUNNING STATEMENT |
 *  +---------------------------+
 *  1 row in set (9.16 sec)
 *  
 *  +-----------+-----------+-----------+-----------+---------------+------------+-----------+
 *  | thread_id | exec_time | lock_time | rows_sent | rows_examined | tmp_tables 
 * | full_scan |
 *  +-----------+-----------+-----------+-----------+---------------+------------+-----------+
 *  |    166646 | 618.43 us | 1.00 ms   |         0 |             1 |     
 *      0 |         0 |
 *  +-----------+-----------+-----------+-----------+---------------+------------+-----------+
 *  1 row in set (9.16 sec)
 *  
 *  // Truncated for clarity...
 *  +-----------------------------------------------------------------+
 *  | sql_text                                                        |
 *  +-----------------------------------------------------------------+
 *  | select hibeventhe0_.id as id1382_, hibeventhe0_.createdTime ... |
 *  +-----------------------------------------------------------------+
 *  1 row in set (9.17 sec)
 *  
 *  +------------------------------------------+-----------+
 *  | event_name                               | latency   |
 *  +------------------------------------------+-----------+
 *  | stage/sql/init                           | 8.61 us   |
 *  | stage/sql/Waiting for query cache lock   | 453.23 us |
 *  | stage/sql/init                           | 331.07 ns |
 *  | stage/sql/checking query cache for query | 43.04 us  |
 *  ...
 *  | stage/sql/freeing items                  | 30.46 us  |
 *  | stage/sql/cleaning up                    | 662.13 ns |
 *  +------------------------------------------+-----------+
 *  18 rows in set (9.23 sec)
 *  
 *  +----+-------------+--------------+-------+---------------+-----------+---------+-------------+------+-------+
 *  | id | select_type | table        | type  | possible_keys | key       
 * | key_len | ref         | rows | Extra |
 *  +----+-------------+--------------+-------+---------------+-----------+---------+-------------+------+-------+
 *  |  1 | SIMPLE      | hibeventhe0_ | const | fixedTime     | fixedTime 
 * | 775     | const,const |    1 | NULL  |
 *  +----+-------------+--------------+-------+---------------+-----------+---------+-------------+------+-------+
 *  1 row in set (9.27 sec)
 *  
 *  Query OK, 0 rows affected (9.28 sec)
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
public class PsTraceStatementDigest extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -1676836699;

    /**
     * The parameter <code>sys.ps_trace_statement_digest.in_digest</code>.
     */
    public static final Parameter<String> IN_DIGEST = createParameter("in_digest", org.jooq.impl.SQLDataType.VARCHAR(32), false, false);

    /**
     * The parameter <code>sys.ps_trace_statement_digest.in_runtime</code>.
     */
    public static final Parameter<Integer> IN_RUNTIME = createParameter("in_runtime", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>sys.ps_trace_statement_digest.in_interval</code>.
     */
    public static final Parameter<BigDecimal> IN_INTERVAL = createParameter("in_interval", org.jooq.impl.SQLDataType.DECIMAL(2, 2), false, false);

    /**
     * The parameter <code>sys.ps_trace_statement_digest.in_start_fresh</code>.
     */
    public static final Parameter<Byte> IN_START_FRESH = createParameter("in_start_fresh", org.jooq.impl.SQLDataType.TINYINT, false, false);

    /**
     * The parameter <code>sys.ps_trace_statement_digest.in_auto_enable</code>.
     */
    public static final Parameter<Byte> IN_AUTO_ENABLE = createParameter("in_auto_enable", org.jooq.impl.SQLDataType.TINYINT, false, false);

    /**
     * Create a new routine call instance
     */
    public PsTraceStatementDigest() {
        super("ps_trace_statement_digest", Sys.SYS);

        addInParameter(IN_DIGEST);
        addInParameter(IN_RUNTIME);
        addInParameter(IN_INTERVAL);
        addInParameter(IN_START_FRESH);
        addInParameter(IN_AUTO_ENABLE);
    }

    /**
     * Set the <code>in_digest</code> parameter IN value to the routine
     */
    public void setInDigest(String value) {
        setValue(IN_DIGEST, value);
    }

    /**
     * Set the <code>in_runtime</code> parameter IN value to the routine
     */
    public void setInRuntime(Integer value) {
        setValue(IN_RUNTIME, value);
    }

    /**
     * Set the <code>in_interval</code> parameter IN value to the routine
     */
    public void setInInterval(BigDecimal value) {
        setValue(IN_INTERVAL, value);
    }

    /**
     * Set the <code>in_start_fresh</code> parameter IN value to the routine
     */
    public void setInStartFresh(Byte value) {
        setValue(IN_START_FRESH, value);
    }

    /**
     * Set the <code>in_auto_enable</code> parameter IN value to the routine
     */
    public void setInAutoEnable(Byte value) {
        setValue(IN_AUTO_ENABLE, value);
    }
}
