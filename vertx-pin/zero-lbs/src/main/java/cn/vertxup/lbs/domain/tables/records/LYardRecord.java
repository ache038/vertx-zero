/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.lbs.domain.tables.records;


import cn.vertxup.lbs.domain.tables.LYard;
import cn.vertxup.lbs.domain.tables.interfaces.ILYard;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LYardRecord extends UpdatableRecordImpl<LYardRecord> implements Record13<String, String, String, String, Integer, String, Boolean, String, String, LocalDateTime, String, LocalDateTime, String>, ILYard {

    private static final long serialVersionUID = 245874689;

    /**
     * Setter for <code>DB_ETERNAL.L_YARD.KEY</code>. 「key」- 主键
     */
    @Override
    public LYardRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_YARD.KEY</code>. 「key」- 主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.L_YARD.NAME</code>. 「name」- 名称
     */
    @Override
    public LYardRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_YARD.NAME</code>. 「name」- 名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.L_YARD.CODE</code>. 「code」- 编码
     */
    @Override
    public LYardRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_YARD.CODE</code>. 「code」- 编码
     */
    @Override
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.L_YARD.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public LYardRecord setMetadata(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_YARD.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.L_YARD.ORDER</code>. 「order」- 排序
     */
    @Override
    public LYardRecord setOrder(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_YARD.ORDER</code>. 「order」- 排序
     */
    @Override
    public Integer getOrder() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.L_YARD.LOCATION_ID</code>. 「locationId」- 关联地址ID
     */
    @Override
    public LYardRecord setLocationId(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_YARD.LOCATION_ID</code>. 「locationId」- 关联地址ID
     */
    @Override
    public String getLocationId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.L_YARD.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public LYardRecord setActive(Boolean value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_YARD.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.L_YARD.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public LYardRecord setSigma(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_YARD.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.L_YARD.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public LYardRecord setLanguage(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_YARD.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.L_YARD.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LYardRecord setCreatedAt(LocalDateTime value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_YARD.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.L_YARD.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public LYardRecord setCreatedBy(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_YARD.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.L_YARD.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LYardRecord setUpdatedAt(LocalDateTime value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_YARD.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.L_YARD.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public LYardRecord setUpdatedBy(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.L_YARD.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<String, String, String, String, Integer, String, Boolean, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<String, String, String, String, Integer, String, Boolean, String, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return LYard.L_YARD.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return LYard.L_YARD.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return LYard.L_YARD.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return LYard.L_YARD.METADATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return LYard.L_YARD.ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return LYard.L_YARD.LOCATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return LYard.L_YARD.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return LYard.L_YARD.SIGMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return LYard.L_YARD.LANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field10() {
        return LYard.L_YARD.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return LYard.L_YARD.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field12() {
        return LYard.L_YARD.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return LYard.L_YARD.UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getKey();
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
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component10() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component12() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getKey();
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
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value10() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value12() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LYardRecord value1(String value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LYardRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LYardRecord value3(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LYardRecord value4(String value) {
        setMetadata(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LYardRecord value5(Integer value) {
        setOrder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LYardRecord value6(String value) {
        setLocationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LYardRecord value7(Boolean value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LYardRecord value8(String value) {
        setSigma(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LYardRecord value9(String value) {
        setLanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LYardRecord value10(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LYardRecord value11(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LYardRecord value12(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LYardRecord value13(String value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LYardRecord values(String value1, String value2, String value3, String value4, Integer value5, String value6, Boolean value7, String value8, String value9, LocalDateTime value10, String value11, LocalDateTime value12, String value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ILYard from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setMetadata(from.getMetadata());
        setOrder(from.getOrder());
        setLocationId(from.getLocationId());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ILYard> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LYardRecord
     */
    public LYardRecord() {
        super(LYard.L_YARD);
    }

    /**
     * Create a detached, initialised LYardRecord
     */
    public LYardRecord(String key, String name, String code, String metadata, Integer order, String locationId, Boolean active, String sigma, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(LYard.L_YARD);

        set(0, key);
        set(1, name);
        set(2, code);
        set(3, metadata);
        set(4, order);
        set(5, locationId);
        set(6, active);
        set(7, sigma);
        set(8, language);
        set(9, createdAt);
        set(10, createdBy);
        set(11, updatedAt);
        set(12, updatedBy);
    }
}