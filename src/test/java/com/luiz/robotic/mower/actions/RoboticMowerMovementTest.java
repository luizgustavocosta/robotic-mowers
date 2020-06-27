package com.luiz.robotic.mower.actions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * The type Robotic mower movement test.
 */
class RoboticMowerMovementTest {

    /**
     * Should create a client when receive new coordinate of the plateau.
     */
    @Test
    @DisplayName("Create a service when receive a new coordinate of the plateau")
    void shouldCreateAClientWhenReceiveNewCoordinateOfThePlateau() {
        final RoboticMowerMovement roboticMowerMovement = new RoboticMowerMovement("90 94");
        assertNotNull(roboticMowerMovement);
    }
}