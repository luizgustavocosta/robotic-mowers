package com.luiz.robotic.mower;

import com.luiz.robotic.mower.infrastructure.CompassPoints;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CompassPointsTest {

    @ParameterizedTest
    @ValueSource(strings = {"N", "E", "S", "W"})
    void shouldHaveFourCardinalPoints(String cardinalPoint) {
        assertNotNull(CompassPoints.valueOf(cardinalPoint));
    }

    //Review it
    @ParameterizedTest
    @ValueSource(strings = {"M", "O", "R"})
    void shouldAcceptOnlyCardinalPoints(String cardinalPoint) {
        assertThrows(IllegalArgumentException.class, () -> CompassPoints.valueOf(cardinalPoint));
    }
}