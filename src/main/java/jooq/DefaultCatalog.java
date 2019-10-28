/*
 * This file is generated by jOOQ.
 */
package jooq;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.human.Human;
import jooq.information_schema.InformationSchema;
import jooq.mysql.Mysql;
import jooq.performance_schema.PerformanceSchema;
import jooq.sys.Sys;

import org.jooq.Schema;
import org.jooq.impl.CatalogImpl;


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
public class DefaultCatalog extends CatalogImpl {

    private static final long serialVersionUID = -1142891310;

    /**
     * The reference instance of <code></code>
     */
    public static final DefaultCatalog DEFAULT_CATALOG = new DefaultCatalog();

    /**
     * The schema <code>information_schema</code>.
     */
    public final InformationSchema INFORMATION_SCHEMA = jooq.information_schema.InformationSchema.INFORMATION_SCHEMA;

    /**
     * The schema <code>human</code>.
     */
    public final Human HUMAN = jooq.human.Human.HUMAN;

    /**
     * The schema <code>mysql</code>.
     */
    public final Mysql MYSQL = jooq.mysql.Mysql.MYSQL;

    /**
     * The schema <code>performance_schema</code>.
     */
    public final PerformanceSchema PERFORMANCE_SCHEMA = jooq.performance_schema.PerformanceSchema.PERFORMANCE_SCHEMA;

    /**
     * The schema <code>sys</code>.
     */
    public final Sys SYS = jooq.sys.Sys.SYS;

    /**
     * No further instances allowed
     */
    private DefaultCatalog() {
        super("");
    }

    @Override
    public final List<Schema> getSchemas() {
        List result = new ArrayList();
        result.addAll(getSchemas0());
        return result;
    }

    private final List<Schema> getSchemas0() {
        return Arrays.<Schema>asList(
            InformationSchema.INFORMATION_SCHEMA,
            Human.HUMAN,
            Mysql.MYSQL,
            PerformanceSchema.PERFORMANCE_SCHEMA,
            Sys.SYS);
    }
}
