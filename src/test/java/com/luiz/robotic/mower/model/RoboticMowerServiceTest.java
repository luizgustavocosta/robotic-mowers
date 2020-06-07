package com.luiz.robotic.mower.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The type Robotic mower service test.
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RoboticMowerServiceTest {

    /**
     * Should send the movements and get the final position of the mower.
     */
    @Test
    @DisplayName("Should send the movements and get the final position of the mower")
    void shouldSendTheMovementsAndGetTheFinalPositionOfTheMower() {
        RoboticMowerService service = new RoboticMowerService(82, 86);
        final String expected = "5 1 E";
        final String finalPosition = service.execute("3 3 E", "MMRMMRMRRM");
        assertEquals(expected, finalPosition);
    }
}