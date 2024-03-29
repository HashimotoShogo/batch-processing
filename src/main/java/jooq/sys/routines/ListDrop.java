/*
 * This file is generated by jOOQ.
 */
package jooq.sys.routines;


import javax.annotation.Generated;

import jooq.sys.Sys;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * 
 *  Description
 *  
 *  Takes a list, and a value to attempt to remove from the list, and returns 
 * the resulting list.
 *  
 *  Useful for altering certain session variables, like sql_mode or optimizer_switch 
 * for instance.
 *  
 *  Parameters
 *  
 *  in_list (TEXT):
 *  The comma separated list to drop a value from
 *  
 *  in_drop_value (TEXT):
 *  The value to drop from the input list
 *  
 *  Returns
 *  
 *  TEXT
 *  
 *  Example
 *  
 *  mysql&gt; select @@sql_mode;
 *  +-----------------------------------------------------------------------------------------------+
 *  | @@sql_mode                                                          
 *                           |
 *  +-----------------------------------------------------------------------------------------------+
 *  | ANSI_QUOTES,ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION 
 * |
 *  +-----------------------------------------------------------------------------------------------+
 *  1 row in set (0.00 sec)
 *  
 *  mysql&gt; set sql_mode = sys.list_drop(@@sql_mode, 'ONLY_FULL_GROUP_BY');
 *  Query OK, 0 rows affected (0.03 sec)
 *  
 *  mysql&gt; select @@sql_mode;
 *  +----------------------------------------------------------------------------+
 *  | @@sql_mode                                                          
 *        |
 *  +----------------------------------------------------------------------------+
 *  | ANSI_QUOTES,STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION 
 * |
 *  +----------------------------------------------------------------------------+
 *  1 row in set (0.00 sec)
 *  
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
public class ListDrop extends AbstractRoutine<String> {

    private static final long serialVersionUID = 168752172;

    /**
     * The parameter <code>sys.list_drop.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>sys.list_drop.in_list</code>.
     */
    public static final Parameter<String> IN_LIST = createParameter("in_list", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>sys.list_drop.in_drop_value</code>.
     */
    public static final Parameter<String> IN_DROP_VALUE = createParameter("in_drop_value", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public ListDrop() {
        super("list_drop", Sys.SYS, org.jooq.impl.SQLDataType.CLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(IN_LIST);
        addInParameter(IN_DROP_VALUE);
    }

    /**
     * Set the <code>in_list</code> parameter IN value to the routine
     */
    public void setInList(String value) {
        setValue(IN_LIST, value);
    }

    /**
     * Set the <code>in_list</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setInList(Field<String> field) {
        setField(IN_LIST, field);
    }

    /**
     * Set the <code>in_drop_value</code> parameter IN value to the routine
     */
    public void setInDropValue(String value) {
        setValue(IN_DROP_VALUE, value);
    }

    /**
     * Set the <code>in_drop_value</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setInDropValue(Field<String> field) {
        setField(IN_DROP_VALUE, field);
    }
}
