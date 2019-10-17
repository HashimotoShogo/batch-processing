/*
 * This file is generated by jOOQ.
 */
package jooq.human;


import javax.annotation.Generated;

import jooq.human.tables.Address1;
import jooq.human.tables.People;
import jooq.human.tables.records.Address1Record;
import jooq.human.tables.records.PeopleRecord;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>human</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<Address1Record, Long> IDENTITY_ADDRESS1 = Identities0.IDENTITY_ADDRESS1;
    public static final Identity<PeopleRecord, Long> IDENTITY_PEOPLE = Identities0.IDENTITY_PEOPLE;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<Address1Record> KEY_ADDRESS1_PRIMARY = UniqueKeys0.KEY_ADDRESS1_PRIMARY;
    public static final UniqueKey<PeopleRecord> KEY_PEOPLE_PRIMARY = UniqueKeys0.KEY_PEOPLE_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<Address1Record, Long> IDENTITY_ADDRESS1 = Internal.createIdentity(Address1.ADDRESS1, Address1.ADDRESS1.ADDRESS_ID);
        public static Identity<PeopleRecord, Long> IDENTITY_PEOPLE = Internal.createIdentity(People.PEOPLE, People.PEOPLE.PERSON_ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<Address1Record> KEY_ADDRESS1_PRIMARY = Internal.createUniqueKey(Address1.ADDRESS1, "KEY_address1_PRIMARY", Address1.ADDRESS1.ADDRESS_ID);
        public static final UniqueKey<PeopleRecord> KEY_PEOPLE_PRIMARY = Internal.createUniqueKey(People.PEOPLE, "KEY_people_PRIMARY", People.PEOPLE.PERSON_ID);
    }
}