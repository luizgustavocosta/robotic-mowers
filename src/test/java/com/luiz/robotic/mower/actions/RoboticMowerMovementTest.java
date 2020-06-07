package com.luiz.robotic.mower.actions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class RoboticMowerMovementTest {

    @Test
    @DisplayName("Create a service when receive a new coordinate of the plateau")
    void shouldCreateAClientWhenReceiveNewCoordinateOfThePlateau() {
        final RoboticMowerMovement roboticMowerMovement = new RoboticMowerMovement("90 94");
        assertNotNull(roboticMowerMovement);
    }

    @Test
    @DisplayName("Send a new movement and receive a response")
    void shouldSendANewMovementAndReceiveAResponse() {
        final RoboticMowerMovement mowerMovement = new RoboticMowerMovement("90 94");
        final String finalPosition = mowerMovement.move("9 9 W", "LLLL");
        assertNotNull(finalPosition);
    }
}