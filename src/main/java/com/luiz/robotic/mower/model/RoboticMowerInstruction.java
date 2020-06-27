package com.luiz.robotic.mower.model;

/**
 * The type Robotic mower instruction.
 */
public class RoboticMowerInstruction {

    private String position;
    private String movements;

    private RoboticMowerInstruction() {
    }

    /**
     * Gets position.
     *
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * Gets movements.
     *
     * @return the movements
     */
    public String getMovements() {
        return movements;
    }

    /**
     * The type Robotic mower instruction builder.
     */
    public static final class RoboticMowerInstructionBuilder {
        private String position;
        private String movements;

        private RoboticMowerInstructionBuilder() {
        }

        /**
         * A robotic mower instruction robotic mower instruction builder.
         *
         * @return the robotic mower instruction builder
         */
        public static RoboticMowerInstructionBuilder aRoboticMowerInstruction() {
            return new RoboticMowerInstructionBuilder();
        }

        /**
         * With position robotic mower instruction builder.
         *
         * @param position the position
         * @return the robotic mower instruction builder
         */
        public RoboticMowerInstructionBuilder withPosition(String position) {
            this.position = position;
            return this;
        }

        /**
         * With movements robotic mower instruction builder.
         *
         * @param movements the movements
         * @return the robotic mower instruction builder
         */
        public RoboticMowerInstructionBuilder withMovements(String movements) {
            this.movements = movements;
            return this;
        }

        /**
         * Build robotic mower instruction.
         *
         * @return the robotic mower instruction
         */
        public RoboticMowerInstruction build() {
            RoboticMowerInstruction roboticMowerInstruction = new RoboticMowerInstruction();
            roboticMowerInstruction.movements = this.movements;
            roboticMowerInstruction.position = this.position;
            return roboticMowerInstruction;
        }
    }
}
