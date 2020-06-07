package com.luiz.robotic.mower.infrastructure;

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
        TURN_LEFT.put(CompassPoints.N, CompassPoints.W);
        TURN_LEFT.put(CompassPoints.W, CompassPoints.S);
        TURN_LEFT.put(CompassPoints.S, CompassPoints.E);
        TURN_LEFT.put(CompassPoints.E, CompassPoints.N);

        TURN_RIGHT.put(CompassPoints.N, CompassPoints.E);
        TURN_RIGHT.put(CompassPoints.E, CompassPoints.S);
        TURN_RIGHT.put(CompassPoints.S, CompassPoints.W);
        TURN_RIGHT.put(CompassPoints.W, CompassPoints.N);
    }

    /**
     * Gets turn.
     *
     * @param direction the direction
     * @return the turn
     */
    public static Map<CompassPoints, CompassPoints> getTurn(String direction) {
        return MowerMovements.L.toString().equals(direction) ? TURN_LEFT : TURN_RIGHT;
    }
}
