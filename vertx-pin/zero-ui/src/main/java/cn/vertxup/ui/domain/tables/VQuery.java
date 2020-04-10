/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ui.domain.tables;


import cn.vertxup.ui.domain.Db;
import cn.vertxup.ui.domain.Indexes;
import cn.vertxup.ui.domain.Keys;
import cn.vertxup.ui.domain.tables.records.VQueryRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
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
public class VQuery extends TableImpl<VQueryRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.V_QUERY</code>
     */
    public static final VQuery V_QUERY = new VQuery();
    private static final long serialVersionUID = 196386368;
    /**
     * The column <code>DB_ETERNAL.V_QUERY.KEY</code>. 「key」- 选项主键
     */
    public final TableField<VQueryRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 选项主键");
    /**
     * The column <code>DB_ETERNAL.V_QUERY.PROJECTION</code>. 「projection」- query/projection:[], 默认列过滤项
     */
    public final TableField<VQueryRecord, String> PROJECTION = createField("PROJECTION", org.jooq.impl.SQLDataType.CLOB, this, "「projection」- query/projection:[], 默认列过滤项");
    /**
     * The column <code>DB_ETERNAL.V_QUERY.PAGER</code>. 「pager」- query/pager:{}, 分页选项
     */
    public final TableField<VQueryRecord, String> PAGER = createField("PAGER", org.jooq.impl.SQLDataType.CLOB, this, "「pager」- query/pager:{}, 分页选项");
    /**
     * The column <code>DB_ETERNAL.V_QUERY.SORTER</code>. 「sorter」- query/sorter:[], 排序选项
     */
    public final TableField<VQueryRecord, String> SORTER = createField("SORTER", org.jooq.impl.SQLDataType.CLOB, this, "「sorter」- query/sorter:[], 排序选项");
    /**
     * The column <code>DB_ETERNAL.V_QUERY.CRITERIA</code>. 「criteria」- query/criteria:{}, 查询条件选项
     */
    public final TableField<VQueryRecord, String> CRITERIA = createField("CRITERIA", org.jooq.impl.SQLDataType.CLOB, this, "「criteria」- query/criteria:{}, 查询条件选项");

    /**
     * Create a <code>DB_ETERNAL.V_QUERY</code> table reference
     */
    public VQuery() {
        this(DSL.name("V_QUERY"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.V_QUERY</code> table reference
     */
    public VQuery(String alias) {
        this(DSL.name(alias), V_QUERY);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.V_QUERY</code> table reference
     */
    public VQuery(Name alias) {
        this(alias, V_QUERY);
    }

    private VQuery(Name alias, Table<VQueryRecord> aliased) {
        this(alias, aliased, null);
    }

    private VQuery(Name alias, Table<VQueryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VQueryRecord> getRecordType() {
        return VQueryRecord.class;
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
        return Arrays.<Index>asList(Indexes.V_QUERY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<VQueryRecord> getPrimaryKey() {
        return Keys.KEY_V_QUERY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<VQueryRecord>> getKeys() {
        return Arrays.<UniqueKey<VQueryRecord>>asList(Keys.KEY_V_QUERY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VQuery as(String alias) {
        return new VQuery(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VQuery as(Name alias) {
        return new VQuery(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VQuery rename(String name) {
        return new VQuery(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VQuery rename(Name name) {
        return new VQuery(name, null);
    }
}