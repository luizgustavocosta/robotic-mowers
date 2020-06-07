package com.luiz.robotic.mower.model;

import com.luiz.robotic.mower.infrastructure.CompassPoints;
import com.luiz.robotic.mower.infrastructure.MowerMovements;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The type Movement input validator.
 */
public class RoboticMowerValidation {

    private static final String REGEX_COORDINATE;
    private static final String REGEX_MOVEMENT;
    private static final String REGEX_POSITION;

    static {
        REGEX_COORDINATE = "\\d+\\s\\d+";

        REGEX_MOVEMENT = Stream.of(MowerMovements.values())
                .map(MowerMovements::toString)
                .collect(Collectors.joining(".*", "[.*","]+"));

        REGEX_POSITION = "\\d+\\s\\d+\\s" + Stream.of(CompassPoints.values())
                .map(CompassPoints::toString)
                .collect(Collectors.joining(".*", "[.*","]"));

    }

    /**
     * Utility class don't instantiate
     */
    private RoboticMowerValidation() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Validate position boolean.
     *
     * @param position the position
     */
    public static void validatePosition(String position) {
        Objects.requireNonNull(position);
        if (!position.trim().matches(REGEX_POSITION)) {
            throw new IllegalArgumentException("Invalid position .:" +position);
        }
    }

    /**
     * Validate movements boolean.
     *
     * @param movement the movements
     */
    public static void validateMovement(String movement) {
        Objects.requireNonNull(movement);
        if (!movement.trim().matches(REGEX_MOVEMENT)) {
            throw new IllegalArgumentException("Invalid movement .:" +movement);
        }
    }

    /**
     * Validate coordinate.
     *
     * @param coordinate the coordinate
     */
    public static void validateCoordinate(String coordinate) {
        Objects.requireNonNull(coordinate);
        if (!coordinate.trim().matches(REGEX_COORDINATE)) {
            throw new IllegalArgumentException("Invalid coordinate .:"+coordinate);
        }
    }
}
