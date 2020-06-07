package com.luiz.robotic.mower.actions;

import com.luiz.robotic.mower.model.RoboticMowerService;
import com.luiz.robotic.mower.model.RoboticMowerValidation;

/**
 * The type Robotic mower movement.
 */
public class RoboticMowerMovement {

    private final RoboticMowerService service;

    /**
     * Instantiates a new Robotic mower coordinate.
     *
     * @param coordinate the coordinate
     */
    public RoboticMowerMovement(String coordinate) {
        RoboticMowerValidation.validateCoordinate(coordinate);
        final String[] coordinates = coordinate.split(" ");
        this.service = new RoboticMowerService(
                Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1]));
    }

    /**
     * Move string.
     *
     * @param position the deploy coordinate
     * @param movements        the movements
     * @return the string
     */
    public String move(String position, String movements) {
        return service.execute(position, movements);
    }
}
