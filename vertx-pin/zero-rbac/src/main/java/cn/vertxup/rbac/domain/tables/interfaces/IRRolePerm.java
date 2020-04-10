/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.rbac.domain.tables.interfaces;


import java.io.Serializable;

import javax.annotation.Generated;


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
public interface IRRolePerm extends Serializable {

    /**
     * Setter for <code>DB_ETERNAL.R_ROLE_PERM.PERM_ID</code>. 「permId」- 关联权限ID
     */
    public IRRolePerm setPermId(String value);

    /**
     * Getter for <code>DB_ETERNAL.R_ROLE_PERM.PERM_ID</code>. 「permId」- 关联权限ID
     */
    public String getPermId();

    /**
     * Setter for <code>DB_ETERNAL.R_ROLE_PERM.ROLE_ID</code>. 「roleId」- 关联角色ID
     */
    public IRRolePerm setRoleId(String value);

    /**
     * Getter for <code>DB_ETERNAL.R_ROLE_PERM.ROLE_ID</code>. 「roleId」- 关联角色ID
     */
    public String getRoleId();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IRRolePerm
     */
    public void from(cn.vertxup.rbac.domain.tables.interfaces.IRRolePerm from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IRRolePerm
     */
    public <E extends cn.vertxup.rbac.domain.tables.interfaces.IRRolePerm> E into(E into);

    default IRRolePerm fromJson(io.vertx.core.json.JsonObject json) {
        setPermId(json.getString("PERM_ID"));
        setRoleId(json.getString("ROLE_ID"));
        return this;
    }


    default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("PERM_ID",getPermId());
        json.put("ROLE_ID",getRoleId());
        return json;
    }

}