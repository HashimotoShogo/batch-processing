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
 *  Shows all currently disabled instruments.
 *  
 *  Parameters
 *  
 *  None
 *  
 *  Example
 *  
 *  mysql&gt; CALL sys.ps_setup_show_disabled_instruments();
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
public class PsSetupShowDisabledInstruments extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1965211226;

    /**
     * Create a new routine call instance
     */
    public PsSetupShowDisabledInstruments() {
        super("ps_setup_show_disabled_instruments", Sys.SYS);
    }
}
