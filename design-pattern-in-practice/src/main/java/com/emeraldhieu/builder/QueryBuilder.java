package com.emeraldhieu.builder;

import java.util.List;

/**
 * Query builder.
 */
public class QueryBuilder {

    private final String workspace;
    private String rootPath;
    private List<String> nodeTypes;

    private QueryBuilder(String workspace) {
        this.workspace = workspace;
    }

    public static QueryBuilder inWorkspace(String workspace) {
        return new QueryBuilder(workspace);
    }

    public QueryBuilder rootPath(String rootPath) {
        this.rootPath = rootPath;
        return this;
    }

    public QueryBuilder nodeTypes(List<String> nodeTypes) {
        this.nodeTypes = nodeTypes;
        return this;
    }

    public String build() {
        String sql = String.format("SELECT * FROM %s", workspace);
        // TODO Take rootPath and nodeTypes into account.
        return sql;
    }
}
