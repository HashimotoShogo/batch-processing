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
 *  Outputs a textual histogram graph of the average latency values
 *  across all normalized queries tracked within the Performance Schema
 *  events_statements_summary_by_digest table.
 *  
 *  Can be used to show a very high level picture of what kind of 
 *  latency distribution statements running within this instance have.
 *  
 *  Parameters
 *  
 *  None.
 *  
 *  Example
 *  
 *  mysql&gt; CALL sys.ps_statement_avg_latency_histogram()\G
 *  *************************** 1. row ***************************
 *  Performance Schema Statement Digest Average Latency Histogram:
 *  
 *  . = 1 unit
 *  * = 2 units
 *  # = 3 units
 *  
 *  (0 - 38ms)     240 | ################################################################################
 *  (38 - 77ms)    38  | ......................................
 *  (77 - 115ms)   3   | ...
 *  (115 - 154ms)  62  | *******************************
 *  (154 - 192ms)  3   | ...
 *  (192 - 231ms)  0   |
 *  (231 - 269ms)  0   |
 *  (269 - 307ms)  0   |
 *  (307 - 346ms)  0   |
 *  (346 - 384ms)  1   | .
 *  (384 - 423ms)  1   | .
 *  (423 - 461ms)  0   |
 *  (461 - 499ms)  0   |
 *  (499 - 538ms)  0   |
 *  (538 - 576ms)  0   |
 *  (576 - 615ms)  1   | .
 *  
 *  Total Statements: 350; Buckets: 16; Bucket Size: 38 ms;
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
public class PsStatementAvgLatencyHistogram extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1270290055;

    /**
     * Create a new routine call instance
     */
    public PsStatementAvgLatencyHistogram() {
        super("ps_statement_avg_latency_histogram", Sys.SYS);
    }
}
