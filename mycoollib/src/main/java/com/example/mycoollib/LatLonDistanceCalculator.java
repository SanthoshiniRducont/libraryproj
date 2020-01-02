package com.example.mycoollib;

public class LatLonDistanceCalculator {

    private static final int EARTH_RADIUS_IN_KILOMETERS = 6371;

    public static float calculateDistance(Point pointA,
                                          Point pointB) {

        double dLat = Math.toRadians(pointB.getMLatitude()
                - pointA.getMLatitude());

        double dLng = Math.toRadians(pointB.getMLongitude()
                - pointA.getMLongitude());

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(Math.toRadians(pointA.getMLatitude())) *
                        Math.cos(Math.toRadians(pointB.getMLatitude())) *
                        Math.sin(dLng / 2) * Math.sin(dLng / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return (float) (EARTH_RADIUS_IN_KILOMETERS * c);
    }

}
