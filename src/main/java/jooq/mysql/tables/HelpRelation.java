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
import jooq.mysql.tables.records.HelpRelationRecord;

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
import org.jooq.types.UInteger;


/**
 * keyword-topic relation
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HelpRelation extends TableImpl<HelpRelationRecord> {

    private static final long serialVersionUID = -547374067;

    /**
     * The reference instance of <code>mysql.help_relation</code>
     */
    public static final HelpRelation HELP_RELATION = new HelpRelation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HelpRelationRecord> getRecordType() {
        return HelpRelationRecord.class;
    }

    /**
     * The column <code>mysql.help_relation.help_topic_id</code>.
     */
    public final TableField<HelpRelationRecord, UInteger> HELP_TOPIC_ID = createField("help_topic_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.help_relation.help_keyword_id</code>.
     */
    public final TableField<HelpRelationRecord, UInteger> HELP_KEYWORD_ID = createField("help_keyword_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>mysql.help_relation</code> table reference
     */
    public HelpRelation() {
        this(DSL.name("help_relation"), null);
    }

    /**
     * Create an aliased <code>mysql.help_relation</code> table reference
     */
    public HelpRelation(String alias) {
        this(DSL.name(alias), HELP_RELATION);
    }

    /**
     * Create an aliased <code>mysql.help_relation</code> table reference
     */
    public HelpRelation(Name alias) {
        this(alias, HELP_RELATION);
    }

    private HelpRelation(Name alias, Table<HelpRelationRecord> aliased) {
        this(alias, aliased, null);
    }

    private HelpRelation(Name alias, Table<HelpRelationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("keyword-topic relation"));
    }

    public <O extends Record> HelpRelation(Table<O> child, ForeignKey<O, HelpRelationRecord> key) {
        super(child, key, HELP_RELATION);
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
        return Arrays.<Index>asList(Indexes.HELP_RELATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HelpRelationRecord> getPrimaryKey() {
        return Keys.KEY_HELP_RELATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HelpRelationRecord>> getKeys() {
        return Arrays.<UniqueKey<HelpRelationRecord>>asList(Keys.KEY_HELP_RELATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HelpRelation as(String alias) {
        return new HelpRelation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HelpRelation as(Name alias) {
        return new HelpRelation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HelpRelation rename(String name) {
        return new HelpRelation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public HelpRelation rename(Name name) {
        return new HelpRelation(name, null);
    }
}
