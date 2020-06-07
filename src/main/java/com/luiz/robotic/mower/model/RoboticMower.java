package com.luiz.robotic.mower.model;

import com.luiz.robotic.mower.infrastructure.*;

import java.util.Optional;

/**
 * The type Robotic mower.
 */
public class RoboticMower {

    private final Grid grid;
    private Orientation orientation;

    /**
     * Instantiates a new Robotic mower.
     *
     * @param grid the grid
     */
    public RoboticMower(Grid grid) {
        this.grid = grid;
        this.orientation = new Orientation(CompassPoints.N, 0, 0);
    }

    /**
     * Deploy the mower into an specific position
     * @param positions String
     */
    private void deploy(String positions) {
        final String[] positionValues = positions.split(" ");
        this.orientation = new Orientation(CompassPoints.valueOf(positionValues[2]),
                Integer.parseInt(positionValues[0]), Integer.parseInt(positionValues[1]));
    }

    /**
     * Move.
     *
     * @param position the position
     * @param movement   the movement
     */
    public String execute(String position, String movement) {
        deploy(position);
        move(movement);
        return this.toString();
    }

    private void move(String movement) {
        for (String currentMovement : movement.split("")) {
            this.orientation = currentMovement.equals(MowerMovements.M.toString()) ?
                    movePosition(this.orientation) :
                    moveDirection(currentMovement);
        }
    }

    /**
     * Move the mower direction and return a new instance
     * @param currentMovement String
     * @return Orientation
     */
    private Orientation moveDirection(String currentMovement) {
        return new Orientation(TurnHelper.getTurn(currentMovement).get(orientation.getCompassDirection()),
                this.orientation.getX(), this.orientation.getY());
    }

    /**
     * Move the mower of axis and return a new instance
     * @param orientation Orientation
     * @return Orientation
     */
    private Orientation movePosition(Orientation orientation) {
        int x = orientation.getX();
        int y = orientation.getY();
        switch (orientation.getCompassDirection()) {
            case N:
                y = Optional.ofNullable((y + 1 > this.grid.getMaxAxisY()) ? null : y + 1)
                        .orElseThrow(IllegalStateException::new);break;
            case S:
                y = Optional.ofNullable((y - 1 < this.grid.getMinAxisY()) ? null : y - 1)
                        .orElseThrow(IllegalStateException::new);break;
            case W:
                x = Optional.ofNullable((x - 1 < this.grid.getMinAxisX()) ? null : x - 1)
                            .orElseThrow(IllegalStateException::new);break;
            case E:
                x = Optional.ofNullable((x + 1 > this.grid.getMaxAxisX()) ? null : x + 1)
                        .orElseThrow(IllegalStateException::new);break;
        }
        return new Orientation(orientation.getCompassDirection(), x, y);
    }

    /**
     * To string of this class
     * @return String
     */
    public String toString() {
        return String.format("%-2d%-2d%s", this.orientation.getX(), this.orientation.getY(),
                this.orientation.getCompassDirection());
    }
}
