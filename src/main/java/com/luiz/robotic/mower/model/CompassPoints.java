package com.luiz.robotic.mower.model;

/**
 * The enum Compass points.
 * Four cardinal compass points (N, E, S, W)
 */
public enum CompassPoints {

    /**
     * North compass.
     */
    NORTH("N"),
    /**
     * East compass.
     */
    EAST("E"),
    /**
     * South compass.
     */
    SOUTH("S"),
    /**
     * West compass.
     */
    WEST("W");


    private final String direction;

    CompassPoints(String direction) {
        this.direction = direction;
    }

    /**
     * Gets direction.
     *
     * @return the direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Gets point.
     *
     * @param direction the direction
     * @return the point
     */
    public static CompassPoints getPoint(String direction) {
        for (CompassPoints compassPoint : values()) {
            if (direction.equals(compassPoint.getDirection())) {
                return compassPoint;
            }
        }
        return null;
    }
}
