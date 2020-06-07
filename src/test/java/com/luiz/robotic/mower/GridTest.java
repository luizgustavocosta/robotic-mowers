package com.luiz.robotic.mower;

import com.luiz.robotic.mower.infrastructure.Grid;
import org.junit.jupiter.api.Test;

class GridTest {

    @Test
    void shouldNotAllowNegativeNumber() {
        Grid grid = new Grid(-1, -3);

    }

}