package com.techolution.twocircles.operations;

import com.techolution.twocircles.enums.Relation;
import com.techolution.twocircles.model.Circle;
import com.techolution.twocircles.model.CirclePairRelation;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Two Circles business logic
 */
public class TwoCircles {

    public List<CirclePairRelation> relationShips(List<CirclePairRelation> circlePairRelations) {
        return circlePairRelations
                .stream()
                .map(this::relationShip)
                .collect(toList());
    }

    private CirclePairRelation relationShip(CirclePairRelation circlePairRelation) {
        Circle circle1 = circlePairRelation.getCircle1();
        Circle circle2 = circlePairRelation.getCircle2();

        double distanceC1C2 = distanceBetweenTwoCircles(circle1, circle2);
        double radiusSum = radiusSum(circle1, circle2);
        double radiusSub = radiusSub(circle1, circle2);

        if (isTwoCirclesTouchingAtOnePoint(distanceC1C2, radiusSum, radiusSub)) {
            circlePairRelation.setRelation(Relation.TOUCHING);
            return circlePairRelation;
        }

        if (isTwoCirclesAreConcentric(circle1, circle2)) {
            circlePairRelation.setRelation(Relation.CONCENTRIC);
            return circlePairRelation;
        }

        if (isTwoCirclesIntersectingAtTwoPoints(distanceC1C2, radiusSum)) {
            circlePairRelation.setRelation(Relation.INTERSECTING);
            return circlePairRelation;
        }

        if (isTwoCirclesDisjointOutSide(distanceC1C2, radiusSum)) {
            circlePairRelation.setRelation(Relation.DISJOINT_OUTSIDE);
            return circlePairRelation;
        }

        if (isTwoCirclesDisjointInSide(distanceC1C2, radiusSub)) {
            circlePairRelation.setRelation(Relation.DISJOINT_INSIDE);
            return circlePairRelation;
        }
        return circlePairRelation;
    }

    private boolean isTwoCirclesTouchingAtOnePoint(double distanceC1C2,
                                                   double radiusSum,
                                                   double radiusSub) {
        return distanceC1C2 == radiusSum || distanceC1C2 == radiusSub;
    }

    private boolean isTwoCirclesAreConcentric(Circle circle1, Circle circle2) {
        double x0 = circle1.getxCoordinate();
        double y0 = circle1.getyCoordinate();
        double x1 = circle2.getxCoordinate();
        double y1 = circle2.getyCoordinate();
        return x0 == x1 && y0 == y1;
    }

    private boolean isTwoCirclesIntersectingAtTwoPoints(double distanceC1C2,
                                                        double radiusSum) {
        return distanceC1C2 < radiusSum;
    }

    private boolean isTwoCirclesDisjointOutSide(double distanceC1C2, double radiusSum) {
        return distanceC1C2 > radiusSum;
    }

    private boolean isTwoCirclesDisjointInSide(double distanceC1C2, double radiusSub) {
        return distanceC1C2 < radiusSub;
    }

    private double distanceBetweenTwoCircles(Circle circle1, Circle circle2) {
        double x0 = circle1.getxCoordinate();
        double y0 = circle1.getyCoordinate();
        double x1 = circle2.getxCoordinate();
        double y1 = circle2.getyCoordinate();

        // formula for distance between two circles d = sqrt(pow((x1-x0),2) + pow((y1-y0),2))
        return Math.hypot(x0 - x1, y0 - y1);
    }

    private double radiusSum(Circle circle1, Circle circle2) {
        return circle1.getRadius() + circle2.getRadius();
    }

    private double radiusSub(Circle circle1, Circle circle2) {
        return Math.abs(circle1.getRadius() - circle2.getRadius());
    }
}
