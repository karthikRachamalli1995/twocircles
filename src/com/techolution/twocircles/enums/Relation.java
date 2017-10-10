package com.techolution.twocircles.enums;

/**
 * Circle Relationship enum
 */
public enum Relation {

    TOUCHING("Touching"),
    CONCENTRIC("Concentric"),
    INTERSECTING("Intersecting"),
    DISJOINT_OUTSIDE("Disjoint-Outside"),
    DISJOINT_INSIDE("Disjoint-Inside");

    private String relation;

    Relation(String relation) {
        this.relation = relation;
    }

    @Override
    public String toString() {
        return relation;
    }
}
