/*
 * This file is generated by jOOQ.
 */
package jooq.mysql.tables.records;


import javax.annotation.Generated;

import jooq.mysql.tables.HelpCategory;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UShort;


/**
 * help categories
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HelpCategoryRecord extends UpdatableRecordImpl<HelpCategoryRecord> implements Record4<UShort, String, UShort, String> {

    private static final long serialVersionUID = 1791277904;

    /**
     * Setter for <code>mysql.help_category.help_category_id</code>.
     */
    public void setHelpCategoryId(UShort value) {
        set(0, value);
    }

    /**
     * Getter for <code>mysql.help_category.help_category_id</code>.
     */
    public UShort getHelpCategoryId() {
        return (UShort) get(0);
    }

    /**
     * Setter for <code>mysql.help_category.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mysql.help_category.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mysql.help_category.parent_category_id</code>.
     */
    public void setParentCategoryId(UShort value) {
        set(2, value);
    }

    /**
     * Getter for <code>mysql.help_category.parent_category_id</code>.
     */
    public UShort getParentCategoryId() {
        return (UShort) get(2);
    }

    /**
     * Setter for <code>mysql.help_category.url</code>.
     */
    public void setUrl(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mysql.help_category.url</code>.
     */
    public String getUrl() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UShort> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<UShort, String, UShort, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<UShort, String, UShort, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UShort> field1() {
        return HelpCategory.HELP_CATEGORY.HELP_CATEGORY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return HelpCategory.HELP_CATEGORY.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UShort> field3() {
        return HelpCategory.HELP_CATEGORY.PARENT_CATEGORY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return HelpCategory.HELP_CATEGORY.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UShort component1() {
        return getHelpCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UShort component3() {
        return getParentCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UShort value1() {
        return getHelpCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UShort value3() {
        return getParentCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HelpCategoryRecord value1(UShort value) {
        setHelpCategoryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HelpCategoryRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HelpCategoryRecord value3(UShort value) {
        setParentCategoryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HelpCategoryRecord value4(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HelpCategoryRecord values(UShort value1, String value2, UShort value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HelpCategoryRecord
     */
    public HelpCategoryRecord() {
        super(HelpCategory.HELP_CATEGORY);
    }

    /**
     * Create a detached, initialised HelpCategoryRecord
     */
    public HelpCategoryRecord(UShort helpCategoryId, String name, UShort parentCategoryId, String url) {
        super(HelpCategory.HELP_CATEGORY);

        set(0, helpCategoryId);
        set(1, name);
        set(2, parentCategoryId);
        set(3, url);
    }
}
