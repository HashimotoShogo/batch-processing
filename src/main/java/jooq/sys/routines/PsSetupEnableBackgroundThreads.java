/*
 * This file is generated by jOOQ.
 */
package jooq.sys.routines;


import javax.annotation.Generated;

import jooq.sys.Sys;

import org.jooq.impl.AbstractRoutine;


/**
 * 
 *  Description
 *  
 *  Enable all background thread instrumentation within Performance Schema.
 *  
 *  Parameters
 *  
 *  None.
 *  
 *  Example
 *  
 *  mysql&gt; CALL sys.ps_setup_enable_background_threads();
 *  +-------------------------------+
 *  | summary                       |
 *  +-------------------------------+
 *  | Enabled 18 background threads |
 *  +-------------------------------+
 *  1 row in set (0.00 sec)
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
public class PsSetupEnableBackgroundThreads extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 691684599;

    /**
     * Create a new routine call instance
     */
    public PsSetupEnableBackgroundThreads() {
        super("ps_setup_enable_background_threads", Sys.SYS);
    }
}