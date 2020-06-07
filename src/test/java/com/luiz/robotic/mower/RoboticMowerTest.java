package com.luiz.robotic.mower;

import com.luiz.robotic.mower.infrastructure.Grid;
import com.luiz.robotic.mower.model.RoboticMower;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The type Robotic mower test.
 */
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@DisplayName("Robotic Mower test")
class RoboticMowerTest {

    /**
     * The Robotic mower.
     */
    RoboticMower roboticMower;

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
        Grid grid = new Grid(100, 200);
        roboticMower = new RoboticMower(grid);
    }

    /**
     * Should start the mower on initial position.
     */
    @Test
    @DisplayName("Initial position")
    void shouldStartTheMowerOnInitialPosition() {
        assertEquals("0 0 N", roboticMower.toString(), "The initial position should be 0 0 N");
    }

    /**
     * Should deploy a mower to a new position.
     *
     * @param coordinate the coordinate
     * @param movement   the movement
     * @param expected   the expected
     */
    @ParameterizedTest
    @CsvSource({
            "1 2 N, LMLMLMLMM, 1 3 N",
            "3 3 E, MMRMMRMRRM, 5 1 E"
    })
    @DisplayName("Move the Robotic Mower")
    void shouldDeployAMowerToANewPosition(String coordinate, String movement, String expected) {
        this.roboticMower.execute(coordinate, movement);
        assertEquals(expected, roboticMower.toString(), "New deploy position");
    }
}