/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ui.domain.tables;


import cn.vertxup.ui.domain.Db;
import cn.vertxup.ui.domain.Indexes;
import cn.vertxup.ui.domain.Keys;
import cn.vertxup.ui.domain.tables.records.UiFieldRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


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
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class UiField extends TableImpl<UiFieldRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.UI_FIELD</code>
     */
    public static final UiField UI_FIELD = new UiField();
    private static final long serialVersionUID = -1570481169;
    /**
     * The column <code>DB_ETERNAL.UI_FIELD.KEY</code>. 「key」- 字段主键
     */
    public final TableField<UiFieldRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 字段主键");
    /**
     * The column <code>DB_ETERNAL.UI_FIELD.X_POINT</code>. 「xPoint] - 字段的X坐标（列）
     */
    public final TableField<UiFieldRecord, Integer> X_POINT = createField("X_POINT", org.jooq.impl.SQLDataType.INTEGER, this, "「xPoint] - 字段的X坐标（列）");
    /**
     * The column <code>DB_ETERNAL.UI_FIELD.Y_POINT</code>. 「yPoint」- 字段的Y坐标（行）
     */
    public final TableField<UiFieldRecord, Integer> Y_POINT = createField("Y_POINT", org.jooq.impl.SQLDataType.INTEGER, this, "「yPoint」- 字段的Y坐标（行）");
    /**
     * The column <code>DB_ETERNAL.UI_FIELD.LABEL</code>. 「label」- 字段标签
     */
    public final TableField<UiFieldRecord, String> LABEL = createField("LABEL", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「label」- 字段标签");
    /**
     * The column <code>DB_ETERNAL.UI_FIELD.NAME</code>. 「name」- 字段名称
     */
    public final TableField<UiFieldRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「name」- 字段名称");
    /**
     * The column <code>DB_ETERNAL.UI_FIELD.SPAN</code>. 「span」- 字段宽度
     */
    public final TableField<UiFieldRecord, Integer> SPAN = createField("SPAN", org.jooq.impl.SQLDataType.INTEGER, this, "「span」- 字段宽度");
    /**
     * The column <code>DB_ETERNAL.UI_FIELD.HIDDEN</code>. 「hidden」- button专用
     */
    public final TableField<UiFieldRecord, Boolean> HIDDEN = createField("HIDDEN", org.jooq.impl.SQLDataType.BIT, this, "「hidden」- button专用");
    /**
     * The column <code>DB_ETERNAL.UI_FIELD.RENDER</code>. 「render」- 使用的Render函数
     */
    public final TableField<UiFieldRecord, String> RENDER = createField("RENDER", org.jooq.impl.SQLDataType.VARCHAR(64), this, "「render」- 使用的Render函数");
    /**
     * The column <code>DB_ETERNAL.UI_FIELD.OPTION_JSX</code>. 「optionJsx」- 字段专用配置
     */
    public final TableField<UiFieldRecord, String> OPTION_JSX = createField("OPTION_JSX", org.jooq.impl.SQLDataType.CLOB, this, "「optionJsx」- 字段专用配置");
    /**
     * The column <code>DB_ETERNAL.UI_FIELD.OPTION_CONFIG</code>. 「optionConfig」- 字段专用配置
     */
    public final TableField<UiFieldRecord, String> OPTION_CONFIG = createField("OPTION_CONFIG", org.jooq.impl.SQLDataType.CLOB, this, "「optionConfig」- 字段专用配置");
    /**
     * The column <code>DB_ETERNAL.UI_FIELD.OPTION_ITEM</code>. 「optionItem」- 字段专用配置
     */
    public final TableField<UiFieldRecord, String> OPTION_ITEM = createField("OPTION_ITEM", org.jooq.impl.SQLDataType.CLOB, this, "「optionItem」- 字段专用配置");
    /**
     * The column <code>DB_ETERNAL.UI_FIELD.RULES</code>. 「rules」- optionConfig.rules 验证专用的配置，描述规则
     */
    public final TableField<UiFieldRecord, String> RULES = createField("RULES", org.jooq.impl.SQLDataType.CLOB, this, "「rules」- optionConfig.rules 验证专用的配置，描述规则");
    /**
     * The column <code>DB_ETERNAL.UI_FIELD.CONTROL_ID</code>. 「controlId」- 关联的表单ID
     */
    public final TableField<UiFieldRecord, String> CONTROL_ID = createField("CONTROL_ID", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「controlId」- 关联的表单ID");
    /**
     * The column <code>DB_ETERNAL.UI_FIELD.ROW_TYPE</code>. 「rowType」- 行类型
     */
    public final TableField<UiFieldRecord, String> ROW_TYPE = createField("ROW_TYPE", org.jooq.impl.SQLDataType.VARCHAR(20), this, "「rowType」- 行类型");
    /**
     * The column <code>DB_ETERNAL.UI_FIELD.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<UiFieldRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.UI_FIELD.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<UiFieldRecord, String> SIGMA = createField("SIGMA", org.jooq.impl.SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>DB_ETERNAL.UI_FIELD.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<UiFieldRecord, String> METADATA = createField("METADATA", org.jooq.impl.SQLDataType.CLOB, this, "「metadata」- 附加配置");
    /**
     * The column <code>DB_ETERNAL.UI_FIELD.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<UiFieldRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.UI_FIELD.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<UiFieldRecord, LocalDateTime> CREATED_AT = createField("CREATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.UI_FIELD.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<UiFieldRecord, String> CREATED_BY = createField("CREATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.UI_FIELD.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<UiFieldRecord, LocalDateTime> UPDATED_AT = createField("UPDATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.UI_FIELD.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<UiFieldRecord, String> UPDATED_BY = createField("UPDATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    /**
     * Create a <code>DB_ETERNAL.UI_FIELD</code> table reference
     */
    public UiField() {
        this(DSL.name("UI_FIELD"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.UI_FIELD</code> table reference
     */
    public UiField(String alias) {
        this(DSL.name(alias), UI_FIELD);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.UI_FIELD</code> table reference
     */
    public UiField(Name alias) {
        this(alias, UI_FIELD);
    }

    private UiField(Name alias, Table<UiFieldRecord> aliased) {
        this(alias, aliased, null);
    }

    private UiField(Name alias, Table<UiFieldRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UiFieldRecord> getRecordType() {
        return UiFieldRecord.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Db.DB_ETERNAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.UI_FIELD_CONTROL_ID, Indexes.UI_FIELD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UiFieldRecord> getPrimaryKey() {
        return Keys.KEY_UI_FIELD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UiFieldRecord>> getKeys() {
        return Arrays.<UniqueKey<UiFieldRecord>>asList(Keys.KEY_UI_FIELD_PRIMARY, Keys.KEY_UI_FIELD_CONTROL_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiField as(String alias) {
        return new UiField(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UiField as(Name alias) {
        return new UiField(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UiField rename(String name) {
        return new UiField(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UiField rename(Name name) {
        return new UiField(name, null);
    }
}