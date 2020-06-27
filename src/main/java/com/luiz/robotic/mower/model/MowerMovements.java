package com.luiz.robotic.mower.model;

/**
 * The possible letter send to mower are: L (Left), R (Right) and M(Move)
 */
public enum MowerMovements {

    /**
     * Left mower movements.
     */
    LEFT("L"),
    /**
     * Right mower movements.
     */
    RIGHT("R"),
    /**
     * Move mower movements.
     */
    MOVE("M");

    private final String movement;

    MowerMovements(String movement) {
        this.movement = movement;
    }

    /**
     * Gets movement.
     *
     * @return the movement
     */
    public String getMovement() {
        return movement;
    }
}
