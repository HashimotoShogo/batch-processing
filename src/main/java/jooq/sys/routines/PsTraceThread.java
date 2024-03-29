/*
 * This file is generated by jOOQ.
 */
package jooq.sys.routines;


import java.math.BigDecimal;

import javax.annotation.Generated;

import jooq.sys.Sys;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.types.ULong;


/**
 * 
 *  Description
 *  
 *  Dumps all data within Performance Schema for an instrumented thread,
 *  to create a DOT formatted graph file. 
 *  
 *  Each resultset returned from the procedure should be used for a complete 
 * graph
 *  
 *  Requires the SUPER privilege for "SET sql_log_bin = 0;".
 *  
 *  Parameters
 *  
 *  in_thread_id (BIGINT UNSIGNED):
 *  The thread that you would like a stack trace for
 *  in_outfile  (VARCHAR(255)):
 *  The filename the dot file will be written to
 *  in_max_runtime (DECIMAL(20,2)):
 *  The maximum time to keep collecting data.
 *  Use NULL to get the default which is 60 seconds.
 *  in_interval (DECIMAL(20,2)): 
 *  How long to sleep between data collections. 
 *  Use NULL to get the default which is 1 second.
 *  in_start_fresh (BOOLEAN):
 *  Whether to reset all Performance Schema data before tracing.
 *  in_auto_setup (BOOLEAN):
 *  Whether to disable all other threads and enable all consumers/instruments. 
 * 
 *  This will also reset the settings at the end of the run.
 *  in_debug (BOOLEAN):
 *  Whether you would like to include file:lineno in the graph
 *  
 *  Example
 *  
 *  mysql&gt; CALL sys.ps_trace_thread(25, CONCAT('/tmp/stack-', REPLACE(NOW(), 
 * ' ', '-'), '.dot'), NULL, NULL, TRUE, TRUE, TRUE);
 *  +-------------------+
 *  | summary           |
 *  +-------------------+
 *  | Disabled 1 thread |
 *  +-------------------+
 *  1 row in set (0.00 sec)
 *  
 *  +---------------------------------------------+
 *  | Info                                        |
 *  +---------------------------------------------+
 *  | Data collection starting for THREAD_ID = 25 |
 *  +---------------------------------------------+
 *  1 row in set (0.03 sec)
 *  
 *  +-----------------------------------------------------------+
 *  | Info                                                      |
 *  +-----------------------------------------------------------+
 *  | Stack trace written to /tmp/stack-2014-02-16-21:18:41.dot |
 *  +-----------------------------------------------------------+
 *  1 row in set (60.07 sec)
 *  
 *  +-------------------------------------------------------------------+
 *  | Convert to PDF                                                    |
 *  +-------------------------------------------------------------------+
 *  | dot -Tpdf -o /tmp/stack_25.pdf /tmp/stack-2014-02-16-21:18:41.dot |
 *  +-------------------------------------------------------------------+
 *  1 row in set (60.07 sec)
 *  
 *  +-------------------------------------------------------------------+
 *  | Convert to PNG                                                    |
 *  +-------------------------------------------------------------------+
 *  | dot -Tpng -o /tmp/stack_25.png /tmp/stack-2014-02-16-21:18:41.dot |
 *  +-------------------------------------------------------------------+
 *  1 row in set (60.07 sec)
 *  
 *  +------------------+
 *  | summary          |
 *  +------------------+
 *  | Enabled 1 thread |
 *  +------------------+
 *  1 row in set (60.32 sec)
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
public class PsTraceThread extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 682629387;

    /**
     * The parameter <code>sys.ps_trace_thread.in_thread_id</code>.
     */
    public static final Parameter<ULong> IN_THREAD_ID = createParameter("in_thread_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, false, false);

    /**
     * The parameter <code>sys.ps_trace_thread.in_outfile</code>.
     */
    public static final Parameter<String> IN_OUTFILE = createParameter("in_outfile", org.jooq.impl.SQLDataType.VARCHAR(255), false, false);

    /**
     * The parameter <code>sys.ps_trace_thread.in_max_runtime</code>.
     */
    public static final Parameter<BigDecimal> IN_MAX_RUNTIME = createParameter("in_max_runtime", org.jooq.impl.SQLDataType.DECIMAL(20, 2), false, false);

    /**
     * The parameter <code>sys.ps_trace_thread.in_interval</code>.
     */
    public static final Parameter<BigDecimal> IN_INTERVAL = createParameter("in_interval", org.jooq.impl.SQLDataType.DECIMAL(20, 2), false, false);

    /**
     * The parameter <code>sys.ps_trace_thread.in_start_fresh</code>.
     */
    public static final Parameter<Byte> IN_START_FRESH = createParameter("in_start_fresh", org.jooq.impl.SQLDataType.TINYINT, false, false);

    /**
     * The parameter <code>sys.ps_trace_thread.in_auto_setup</code>.
     */
    public static final Parameter<Byte> IN_AUTO_SETUP = createParameter("in_auto_setup", org.jooq.impl.SQLDataType.TINYINT, false, false);

    /**
     * The parameter <code>sys.ps_trace_thread.in_debug</code>.
     */
    public static final Parameter<Byte> IN_DEBUG = createParameter("in_debug", org.jooq.impl.SQLDataType.TINYINT, false, false);

    /**
     * Create a new routine call instance
     */
    public PsTraceThread() {
        super("ps_trace_thread", Sys.SYS);

        addInParameter(IN_THREAD_ID);
        addInParameter(IN_OUTFILE);
        addInParameter(IN_MAX_RUNTIME);
        addInParameter(IN_INTERVAL);
        addInParameter(IN_START_FRESH);
        addInParameter(IN_AUTO_SETUP);
        addInParameter(IN_DEBUG);
    }

    /**
     * Set the <code>in_thread_id</code> parameter IN value to the routine
     */
    public void setInThreadId(ULong value) {
        setValue(IN_THREAD_ID, value);
    }

    /**
     * Set the <code>in_outfile</code> parameter IN value to the routine
     */
    public void setInOutfile(String value) {
        setValue(IN_OUTFILE, value);
    }

    /**
     * Set the <code>in_max_runtime</code> parameter IN value to the routine
     */
    public void setInMaxRuntime(BigDecimal value) {
        setValue(IN_MAX_RUNTIME, value);
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
     * Set the <code>in_auto_setup</code> parameter IN value to the routine
     */
    public void setInAutoSetup(Byte value) {
        setValue(IN_AUTO_SETUP, value);
    }

    /**
     * Set the <code>in_debug</code> parameter IN value to the routine
     */
    public void setInDebug(Byte value) {
        setValue(IN_DEBUG, value);
    }
}
