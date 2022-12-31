package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AVGPriceCalculationTest {

    @org.junit.jupiter.api.Test
    void actualCalculation() {
        AVGPriceCalculation calculation = new AVGPriceCalculation();
        String expected = "48.70";
        String actualPrice = calculation.avgPriceCalculation(
                "40.86",
                "395",
                "41.30",
                "124",
                "70.48",
                "93",
                "55.50",
                "293"
                );
        assertEquals(expected, actualPrice);

    }
}