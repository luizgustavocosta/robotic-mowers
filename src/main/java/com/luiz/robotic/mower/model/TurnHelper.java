package com.luiz.robotic.mower.model;

import java.util.EnumMap;
import java.util.Map;

/**
 * The type Turn helper.
 */
public class TurnHelper {

    private TurnHelper() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * The constant TURN_LEFT.
     */
    private static final Map<CompassPoints, CompassPoints> TURN_LEFT
            = new EnumMap<>(CompassPoints.class);

    /**
     * The constant TURN_RIGHT.
     */
    private static final Map<CompassPoints, CompassPoints> TURN_RIGHT
            = new EnumMap<>(CompassPoints.class);

    static {
        TURN_LEFT.put(CompassPoints.NORTH, CompassPoints.WEST);
        TURN_LEFT.put(CompassPoints.WEST, CompassPoints.SOUTH);
        TURN_LEFT.put(CompassPoints.SOUTH, CompassPoints.EAST);
        TURN_LEFT.put(CompassPoints.EAST, CompassPoints.NORTH);

        TURN_RIGHT.put(CompassPoints.NORTH, CompassPoints.EAST);
        TURN_RIGHT.put(CompassPoints.EAST, CompassPoints.SOUTH);
        TURN_RIGHT.put(CompassPoints.SOUTH, CompassPoints.WEST);
        TURN_RIGHT.put(CompassPoints.WEST, CompassPoints.NORTH);
    }

    /**
     * Gets turn.
     *
     * @param direction the direction
     * @return the turn
     */
    public static Map<CompassPoints, CompassPoints> getTurn(String direction) {
        return MowerMovements.LEFT.getMovement().equals(direction) ? TURN_LEFT : TURN_RIGHT;
    }
}
