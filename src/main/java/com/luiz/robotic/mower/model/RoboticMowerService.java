package com.luiz.robotic.mower.model;

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
    private final RoboticMowerPrint roboticPrint;

    /**
     * Instantiates a new Robotic mower service.
     *
     * @param x            the x
     * @param y            the y
     * @param roboticPrint the robotic print
     */
    public RoboticMowerService(int x, int y, RoboticMowerPrint roboticPrint) {
        this.roboticPrint = roboticPrint;
        this.grid = new Grid(x, y);
        this.roboticMower = new RoboticMower(grid);
    }

    /**
     * Move.
     *
     * @param position the position
     * @param movement the movement
     */
    public void execute(String position, String movement) {
        Objects.requireNonNull(position);
        Objects.requireNonNull(movement);
        RoboticMowerValidation.validatePosition(position);
        RoboticMowerValidation.validateMovement(movement);
        roboticMower.execute(position, movement);
    }

    /**
     * Print string.
     *
     * @return the string
     */
    public void print() {
        roboticPrint.print(this.roboticMower);
    }
}
