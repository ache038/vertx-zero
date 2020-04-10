/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.rbac.domain.tables.pojos;


import cn.vertxup.rbac.domain.tables.interfaces.IRUserGroup;

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
public class RUserGroup implements IRUserGroup {

    private static final long serialVersionUID = 1470191423;

    private String  groupId;
    private String  userId;
    private Integer priority;

    public RUserGroup() {}

    public RUserGroup(RUserGroup value) {
        this.groupId = value.groupId;
        this.userId = value.userId;
        this.priority = value.priority;
    }

    public RUserGroup(
        String  groupId,
        String  userId,
        Integer priority
    ) {
        this.groupId = groupId;
        this.userId = userId;
        this.priority = priority;
    }

    @Override
    public String getGroupId() {
        return this.groupId;
    }

    @Override
    public RUserGroup setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    @Override
    public String getUserId() {
        return this.userId;
    }

    @Override
    public RUserGroup setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public Integer getPriority() {
        return this.priority;
    }

    @Override
    public RUserGroup setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RUserGroup (");

        sb.append(groupId);
        sb.append(", ").append(userId);
        sb.append(", ").append(priority);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IRUserGroup from) {
        setGroupId(from.getGroupId());
        setUserId(from.getUserId());
        setPriority(from.getPriority());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IRUserGroup> E into(E into) {
        into.from(this);
        return into;
    }

    public RUserGroup(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }
}