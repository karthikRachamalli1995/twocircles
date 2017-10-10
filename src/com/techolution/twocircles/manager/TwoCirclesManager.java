package com.techolution.twocircles.manager;

import com.techolution.twocircles.model.Circle;
import com.techolution.twocircles.model.CirclePairRelation;
import com.techolution.twocircles.operations.TwoCircles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Two Circles Manager
 */
public class TwoCirclesManager {

    public static String[] circlesRelationship() {

        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        scanner.nextLine();

        TwoCircles twoCircles = new TwoCircles();
        List<CirclePairRelation> circlePairRelations = new ArrayList<>();

        for (int i = 0; i < testCases; i++) {
            String inputLine = scanner.nextLine();
            String[] testcaseValues = inputLine.split("\\s+");
            Circle circle1 = new Circle(testcaseValues[0], testcaseValues[1], testcaseValues[2]);
            Circle circle2 = new Circle(testcaseValues[3], testcaseValues[4], testcaseValues[5]);
            circlePairRelations.add(new CirclePairRelation(circle1, circle2));
        }
        twoCircles.relationShips(circlePairRelations);

        String[] result = new String[circlePairRelations.size()];
        for (int i = 0; i < circlePairRelations.size(); i++) {
            result[i] = circlePairRelations.get(i).getRelation().toString();
        }

        return result;
    }
}
