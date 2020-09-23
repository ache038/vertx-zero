/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables;


import cn.vertxup.ambient.domain.Db;
import cn.vertxup.ambient.domain.Indexes;
import cn.vertxup.ambient.domain.Keys;
import cn.vertxup.ambient.domain.tables.records.XActivityRecord;
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
public class XActivity extends TableImpl<XActivityRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.X_ACTIVITY</code>
     */
    public static final XActivity X_ACTIVITY = new XActivity();
    private static final long serialVersionUID = -1827152555;
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY.KEY</code>. 「key」- 操作行为主键
     */
    public final TableField<XActivityRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 操作行为主键");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY.TYPE</code>. 「type」- 操作类型
     */
    public final TableField<XActivityRecord, String> TYPE = createField("TYPE", org.jooq.impl.SQLDataType.VARCHAR(64), this, "「type」- 操作类型");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY.SERIAL</code>. 「serial」- 变更记录号
     */
    public final TableField<XActivityRecord, String> SERIAL = createField("SERIAL", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「serial」- 变更记录号");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY.DESCRIPTION</code>. 「description」- 操作描述信息
     */
    public final TableField<XActivityRecord, String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.CLOB, this, "「description」- 操作描述信息");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY.MODEL_ID</code>. 「modelId」- 组所关联的模型identifier，用于描述
     */
    public final TableField<XActivityRecord, String> MODEL_ID = createField("MODEL_ID", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「modelId」- 组所关联的模型identifier，用于描述");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY.MODEL_KEY</code>. 「modelKey」- 组所关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public final TableField<XActivityRecord, String> MODEL_KEY = createField("MODEL_KEY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「modelKey」- 组所关联的模型记录ID，用于描述哪一个Model中的记录");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY.RECORD_OLD</code>. 「recordOld」- 变更之前的数据（用于回滚）
     */
    public final TableField<XActivityRecord, String> RECORD_OLD = createField("RECORD_OLD", org.jooq.impl.SQLDataType.CLOB, this, "「recordOld」- 变更之前的数据（用于回滚）");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY.RECORD_NEW</code>. 「recordNew」- 变更之后的数据（用于更新）
     */
    public final TableField<XActivityRecord, String> RECORD_NEW = createField("RECORD_NEW", org.jooq.impl.SQLDataType.CLOB, this, "「recordNew」- 变更之后的数据（用于更新）");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY.SIGMA</code>. 「sigma」- 用户组绑定的统一标识
     */
    public final TableField<XActivityRecord, String> SIGMA = createField("SIGMA", org.jooq.impl.SQLDataType.VARCHAR(128), this, "「sigma」- 用户组绑定的统一标识");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<XActivityRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<XActivityRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<XActivityRecord, String> METADATA = createField("METADATA", org.jooq.impl.SQLDataType.CLOB, this, "「metadata」- 附加配置数据");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<XActivityRecord, LocalDateTime> CREATED_AT = createField("CREATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<XActivityRecord, String> CREATED_BY = createField("CREATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<XActivityRecord, LocalDateTime> UPDATED_AT = createField("UPDATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.X_ACTIVITY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<XActivityRecord, String> UPDATED_BY = createField("UPDATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    /**
     * Create a <code>DB_ETERNAL.X_ACTIVITY</code> table reference
     */
    public XActivity() {
        this(DSL.name("X_ACTIVITY"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.X_ACTIVITY</code> table reference
     */
    public XActivity(String alias) {
        this(DSL.name(alias), X_ACTIVITY);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.X_ACTIVITY</code> table reference
     */
    public XActivity(Name alias) {
        this(alias, X_ACTIVITY);
    }

    private XActivity(Name alias, Table<XActivityRecord> aliased) {
        this(alias, aliased, null);
    }

    private XActivity(Name alias, Table<XActivityRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<XActivityRecord> getRecordType() {
        return XActivityRecord.class;
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
        return Arrays.<Index>asList(Indexes.X_ACTIVITY_IDXM_X_ACTIVITY_MODEL_ID_MODEL_KEY, Indexes.X_ACTIVITY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<XActivityRecord> getPrimaryKey() {
        return Keys.KEY_X_ACTIVITY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<XActivityRecord>> getKeys() {
        return Arrays.<UniqueKey<XActivityRecord>>asList(Keys.KEY_X_ACTIVITY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XActivity as(String alias) {
        return new XActivity(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XActivity as(Name alias) {
        return new XActivity(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public XActivity rename(String name) {
        return new XActivity(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public XActivity rename(Name name) {
        return new XActivity(name, null);
    }
}
