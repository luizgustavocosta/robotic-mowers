package com.luiz.robotic.mower.infrastructure;

/**
 * The plateau is divided up into a grid to simply the navigation
 */
public class Grid {

    private final int minAxisX;
    private final int minAxisY;
    private final int maxAxisX;
    private final int maxAxisY;
    private final int initialValue = 0;

    /**
     * Instantiates a new Grid.
     *
     * @param maxAxisX the max axis x
     * @param maxAxisY the max axis y
     */
    public Grid(int maxAxisX, int maxAxisY) {
        this.maxAxisX = maxAxisX;
        this.minAxisX = initialValue;
        this.maxAxisY = maxAxisY;
        this.minAxisY = initialValue;
    }

    /**
     * Gets min axis x.
     *
     * @return the min axis x
     */
    public int getMinAxisX() {
        return minAxisX;
    }

    /**
     * Gets min axis y.
     *
     * @return the min axis y
     */
    public int getMinAxisY() {
        return minAxisY;
    }

    /**
     * Gets max axis x.
     *
     * @return the max axis x
     */
    public int getMaxAxisX() {
        return maxAxisX;
    }

    /**
     * Gets max axis y.
     *
     * @return the max axis y
     */
    public int getMaxAxisY() {
        return maxAxisY;
    }
}
