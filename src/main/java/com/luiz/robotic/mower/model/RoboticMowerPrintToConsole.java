package com.luiz.robotic.mower.model;

/**
 * The type Robotic mower print to console.
 */
public class RoboticMowerPrintToConsole implements RoboticMowerPrint {

    @Override
    public void print(RoboticMower roboticMower) {
        System.out.println(String.format("%-2d%-2d%s",
                roboticMower.getOrientation().getX(),
                roboticMower.getOrientation().getY(),
                roboticMower.getOrientation().getCompassDirection().getDirection()));
    }
}
