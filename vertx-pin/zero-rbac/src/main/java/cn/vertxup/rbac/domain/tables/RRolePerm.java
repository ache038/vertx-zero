/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables;


import cn.vertxup.rbac.domain.Db;
import cn.vertxup.rbac.domain.Indexes;
import cn.vertxup.rbac.domain.Keys;
import cn.vertxup.rbac.domain.tables.records.RRolePermRecord;
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
public class RRolePerm extends TableImpl<RRolePermRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.R_ROLE_PERM</code>
     */
    public static final RRolePerm R_ROLE_PERM = new RRolePerm();
    private static final long serialVersionUID = -1574982602;
    /**
     * The column <code>DB_ETERNAL.R_ROLE_PERM.PERM_ID</code>. 「permId」- 关联权限ID
     */
    public final TableField<RRolePermRecord, String> PERM_ID = createField("PERM_ID", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「permId」- 关联权限ID");
    /**
     * The column <code>DB_ETERNAL.R_ROLE_PERM.ROLE_ID</code>. 「roleId」- 关联角色ID
     */
    public final TableField<RRolePermRecord, String> ROLE_ID = createField("ROLE_ID", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「roleId」- 关联角色ID");

    /**
     * Create a <code>DB_ETERNAL.R_ROLE_PERM</code> table reference
     */
    public RRolePerm() {
        this(DSL.name("R_ROLE_PERM"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.R_ROLE_PERM</code> table reference
     */
    public RRolePerm(String alias) {
        this(DSL.name(alias), R_ROLE_PERM);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.R_ROLE_PERM</code> table reference
     */
    public RRolePerm(Name alias) {
        this(alias, R_ROLE_PERM);
    }

    private RRolePerm(Name alias, Table<RRolePermRecord> aliased) {
        this(alias, aliased, null);
    }

    private RRolePerm(Name alias, Table<RRolePermRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RRolePermRecord> getRecordType() {
        return RRolePermRecord.class;
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
        return Arrays.<Index>asList(Indexes.R_ROLE_PERM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RRolePermRecord> getPrimaryKey() {
        return Keys.KEY_R_ROLE_PERM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RRolePermRecord>> getKeys() {
        return Arrays.<UniqueKey<RRolePermRecord>>asList(Keys.KEY_R_ROLE_PERM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RRolePerm as(String alias) {
        return new RRolePerm(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RRolePerm as(Name alias) {
        return new RRolePerm(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RRolePerm rename(String name) {
        return new RRolePerm(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RRolePerm rename(Name name) {
        return new RRolePerm(name, null);
    }
}