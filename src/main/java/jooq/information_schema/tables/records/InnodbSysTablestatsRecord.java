/*
 * This file is generated by jOOQ.
 */
package jooq.information_schema.tables.records;


import javax.annotation.Generated;

import jooq.information_schema.tables.InnodbSysTablestats;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


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
public class InnodbSysTablestatsRecord extends TableRecordImpl<InnodbSysTablestatsRecord> implements Record9<ULong, String, String, ULong, ULong, ULong, ULong, ULong, Integer> {

    private static final long serialVersionUID = -1608397440;

    /**
     * Setter for <code>information_schema.INNODB_SYS_TABLESTATS.TABLE_ID</code>.
     */
    public void setTableId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_TABLESTATS.TABLE_ID</code>.
     */
    public ULong getTableId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_TABLESTATS.NAME</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_TABLESTATS.NAME</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_TABLESTATS.STATS_INITIALIZED</code>.
     */
    public void setStatsInitialized(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_TABLESTATS.STATS_INITIALIZED</code>.
     */
    public String getStatsInitialized() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_TABLESTATS.NUM_ROWS</code>.
     */
    public void setNumRows(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_TABLESTATS.NUM_ROWS</code>.
     */
    public ULong getNumRows() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_TABLESTATS.CLUST_INDEX_SIZE</code>.
     */
    public void setClustIndexSize(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_TABLESTATS.CLUST_INDEX_SIZE</code>.
     */
    public ULong getClustIndexSize() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_TABLESTATS.OTHER_INDEX_SIZE</code>.
     */
    public void setOtherIndexSize(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_TABLESTATS.OTHER_INDEX_SIZE</code>.
     */
    public ULong getOtherIndexSize() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_TABLESTATS.MODIFIED_COUNTER</code>.
     */
    public void setModifiedCounter(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_TABLESTATS.MODIFIED_COUNTER</code>.
     */
    public ULong getModifiedCounter() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_TABLESTATS.AUTOINC</code>.
     */
    public void setAutoinc(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_TABLESTATS.AUTOINC</code>.
     */
    public ULong getAutoinc() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_TABLESTATS.REF_COUNT</code>.
     */
    public void setRefCount(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_TABLESTATS.REF_COUNT</code>.
     */
    public Integer getRefCount() {
        return (Integer) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<ULong, String, String, ULong, ULong, ULong, ULong, ULong, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<ULong, String, String, ULong, ULong, ULong, ULong, ULong, Integer> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return InnodbSysTablestats.INNODB_SYS_TABLESTATS.TABLE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return InnodbSysTablestats.INNODB_SYS_TABLESTATS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return InnodbSysTablestats.INNODB_SYS_TABLESTATS.STATS_INITIALIZED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return InnodbSysTablestats.INNODB_SYS_TABLESTATS.NUM_ROWS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field5() {
        return InnodbSysTablestats.INNODB_SYS_TABLESTATS.CLUST_INDEX_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field6() {
        return InnodbSysTablestats.INNODB_SYS_TABLESTATS.OTHER_INDEX_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field7() {
        return InnodbSysTablestats.INNODB_SYS_TABLESTATS.MODIFIED_COUNTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field8() {
        return InnodbSysTablestats.INNODB_SYS_TABLESTATS.AUTOINC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return InnodbSysTablestats.INNODB_SYS_TABLESTATS.REF_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component1() {
        return getTableId();
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
    public String component3() {
        return getStatsInitialized();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component4() {
        return getNumRows();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component5() {
        return getClustIndexSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component6() {
        return getOtherIndexSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component7() {
        return getModifiedCounter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component8() {
        return getAutoinc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getRefCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getTableId();
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
    public String value3() {
        return getStatsInitialized();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value4() {
        return getNumRows();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value5() {
        return getClustIndexSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value6() {
        return getOtherIndexSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value7() {
        return getModifiedCounter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value8() {
        return getAutoinc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getRefCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysTablestatsRecord value1(ULong value) {
        setTableId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysTablestatsRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysTablestatsRecord value3(String value) {
        setStatsInitialized(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysTablestatsRecord value4(ULong value) {
        setNumRows(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysTablestatsRecord value5(ULong value) {
        setClustIndexSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysTablestatsRecord value6(ULong value) {
        setOtherIndexSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysTablestatsRecord value7(ULong value) {
        setModifiedCounter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysTablestatsRecord value8(ULong value) {
        setAutoinc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysTablestatsRecord value9(Integer value) {
        setRefCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysTablestatsRecord values(ULong value1, String value2, String value3, ULong value4, ULong value5, ULong value6, ULong value7, ULong value8, Integer value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbSysTablestatsRecord
     */
    public InnodbSysTablestatsRecord() {
        super(InnodbSysTablestats.INNODB_SYS_TABLESTATS);
    }

    /**
     * Create a detached, initialised InnodbSysTablestatsRecord
     */
    public InnodbSysTablestatsRecord(ULong tableId, String name, String statsInitialized, ULong numRows, ULong clustIndexSize, ULong otherIndexSize, ULong modifiedCounter, ULong autoinc, Integer refCount) {
        super(InnodbSysTablestats.INNODB_SYS_TABLESTATS);

        set(0, tableId);
        set(1, name);
        set(2, statsInitialized);
        set(3, numRows);
        set(4, clustIndexSize);
        set(5, otherIndexSize);
        set(6, modifiedCounter);
        set(7, autoinc);
        set(8, refCount);
    }
}
