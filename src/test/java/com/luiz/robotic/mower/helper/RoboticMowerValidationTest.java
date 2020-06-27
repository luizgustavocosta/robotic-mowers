package com.luiz.robotic.mower.helper;

import com.luiz.robotic.mower.model.MowerMovements;
import com.luiz.robotic.mower.model.RoboticMowerValidation;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * The type Movement input validator test.
 */
class RoboticMowerValidationTest implements WithAssertions {

    /**
     * Validate valid position.
     *
     * @param position the position
     */
    @ParameterizedTest
    @ValueSource(strings = {"1 2 N", "3 3 E", "99 0 S", "42 42 W", "0 0 N"})
    @DisplayName("Validate valid position")
    void validateValidPosition(String position) {
        Throwable throwable = catchThrowable(() -> RoboticMowerValidation.validatePosition(position));
        assertNull(throwable);
    }

    /**
     * Validate invalid position.
     *
     * @param position the position
     */
    @ParameterizedTest
    @ValueSource(strings = {"1 2 M", "2 1 T", "N 1 2", "1 2 NN", "0 0 0"})
    @DisplayName("Validate invalid position")
    void validateInvalidPosition(String position) {
        assertThatIllegalArgumentException().isThrownBy(() -> RoboticMowerValidation.validatePosition(position));
    }

    /**
     * Validate movements.
     *
     * @param movements the movements
     * @see {@link MowerMovements}
     */
    @ParameterizedTest
    @ValueSource(strings = {"LM", "ML", "MRM", "RRR", "LLL"})
    @DisplayName("Accept supported movements")
    void validateMovements(String movements) {
        Throwable throwable = catchThrowable(() -> RoboticMowerValidation.validateMovement(movements));
        assertNull(throwable);
    }

    /**
     * Do not accept some movements.
     *
     * @param movement the movement
     * @see {@link MowerMovements}
     */
    @ParameterizedTest
    @ValueSource(strings = {"MMRA", "RMMX", "LLLA"})
    @DisplayName("Do not accept movements not supported")
    void doNotAcceptSomeMovements(String movement) {
        assertThatIllegalArgumentException().isThrownBy(() -> RoboticMowerValidation.validateMovement(movement));
    }
}