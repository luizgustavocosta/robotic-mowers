package com.luiz.robotic.mower.model;

/**
 * The type Orientation.
 * Representation of X and Y coordinates and the mower's orientation
 */
public class Orientation {

    private final CompassPoints compassDirection;
    private final int x;
    private final int y;

    /**
     * Instantiates a new Orientation.
     *
     * @param compassDirection the compass direction
     * @param x                the x
     * @param y                the y
     */
    public Orientation(CompassPoints compassDirection, int x, int y) {
        this.compassDirection = compassDirection;
        this.x = x;
        this.y = y;
    }

    /**
     * Gets compass direction.
     *
     * @return the compass direction
     */
    public CompassPoints getCompassDirection() {
        return compassDirection;
    }

    /**
     * Gets x.
     *
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * Gets y.
     *
     * @return the y
     */
    public int getY() {
        return y;
    }
}
