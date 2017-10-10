package com.techolution.twocircles.model;

import com.techolution.twocircles.enums.Relation;

/**
 * Circle pair relation POJO to accommodate the relation between circle1 and circle2
 */
public class CirclePairRelation {

    private Circle circle1;
    private Circle circle2;
    private Relation relation;

    public CirclePairRelation(Circle circle1, Circle circle2) {
        this.circle1 = circle1;
        this.circle2 = circle2;
    }

    public Circle getCircle1() {
        return circle1;
    }

    public void setCircle1(Circle circle1) {
        this.circle1 = circle1;
    }

    public Circle getCircle2() {
        return circle2;
    }

    public void setCircle2(Circle circle2) {
        this.circle2 = circle2;
    }

    public Relation getRelation() {
        return relation;
    }

    public void setRelation(Relation relation) {
        this.relation = relation;
    }
}
