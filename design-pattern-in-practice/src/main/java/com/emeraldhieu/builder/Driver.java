package com.emeraldhieu.builder;

import java.util.Arrays;

public class Driver {

    public static void main(String[] args) {
        String sql = QueryBuilder.inWorkspace("website")
                .rootPath("/travel")
                .nodeTypes(Arrays.asList("mgnl:content", "mgnl:contentNode"))
                .build();
        System.out.println(sql);
    }
}
