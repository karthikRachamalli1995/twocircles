package com.techolution.twocircles;

import com.techolution.twocircles.manager.TwoCirclesManager;

public class TwocirclesApplication {

    public static void main(String[] args) {

        String[] relationships = TwoCirclesManager.circlesRelationship();

        for (String relationship : relationships) {
            System.out.println(relationship);
        }
    }
}
