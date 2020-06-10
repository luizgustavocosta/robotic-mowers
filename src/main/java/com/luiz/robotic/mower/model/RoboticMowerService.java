package com.luiz.robotic.mower.model;

import com.luiz.robotic.mower.infrastructure.Grid;

import java.util.Objects;

/**
 * The type Robotic mower service.
 */
public class RoboticMowerService {

    /**
     * The Grid.
     */
    private final Grid grid;
    private final RoboticMower roboticMower;

    /**
     * Instantiates a new Robotic mower service.
     *
     * @param x the x
     * @param y the y
     */
    public RoboticMowerService(int x, int y) {
        this.grid = new Grid(x, y);
        this.roboticMower = new RoboticMower(grid);
    }

    /**
     * Move.
     *
     * @param position the position
     * @param movement the movement
     * @return the string
     */
    public String execute(String position, String movement) {
        Objects.requireNonNull(position);
        Objects.requireNonNull(movement);
        RoboticMowerValidation.validatePosition(position);
        RoboticMowerValidation.validateMovement(movement);
        return roboticMower.execute(position, movement).getCurrentCoordinates();
    }
}
