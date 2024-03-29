/*
 * This file is generated by jOOQ.
 */
package jooq.human.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.human.Human;
import jooq.human.Indexes;
import jooq.human.Keys;
import jooq.human.tables.records.PeopleRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class People extends TableImpl<PeopleRecord> {

    private static final long serialVersionUID = -494350145;

    /**
     * The reference instance of <code>human.people</code>
     */
    public static final People PEOPLE = new People();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PeopleRecord> getRecordType() {
        return PeopleRecord.class;
    }

    /**
     * The column <code>human.people.person_id</code>.
     */
    public final TableField<PeopleRecord, Long> PERSON_ID = createField("person_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>human.people.first_name</code>.
     */
    public final TableField<PeopleRecord, String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>human.people.last_name</code>.
     */
    public final TableField<PeopleRecord, String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * Create a <code>human.people</code> table reference
     */
    public People() {
        this(DSL.name("people"), null);
    }

    /**
     * Create an aliased <code>human.people</code> table reference
     */
    public People(String alias) {
        this(DSL.name(alias), PEOPLE);
    }

    /**
     * Create an aliased <code>human.people</code> table reference
     */
    public People(Name alias) {
        this(alias, PEOPLE);
    }

    private People(Name alias, Table<PeopleRecord> aliased) {
        this(alias, aliased, null);
    }

    private People(Name alias, Table<PeopleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> People(Table<O> child, ForeignKey<O, PeopleRecord> key) {
        super(child, key, PEOPLE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Human.HUMAN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PEOPLE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PeopleRecord, Long> getIdentity() {
        return Keys.IDENTITY_PEOPLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PeopleRecord> getPrimaryKey() {
        return Keys.KEY_PEOPLE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PeopleRecord>> getKeys() {
        return Arrays.<UniqueKey<PeopleRecord>>asList(Keys.KEY_PEOPLE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public People as(String alias) {
        return new People(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public People as(Name alias) {
        return new People(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public People rename(String name) {
        return new People(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public People rename(Name name) {
        return new People(name, null);
    }
}
