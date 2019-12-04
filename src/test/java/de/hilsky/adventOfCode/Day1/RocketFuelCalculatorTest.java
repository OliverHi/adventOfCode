package de.hilsky.adventOfCode.Day1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RocketFuelCalculatorTest {

    private RocketFuelCalculator rocketFuelCalculator = new RocketFuelCalculator();

    @Test
    void calculateFuel() {
        List<Integer> modules = Arrays.asList(12, 14, 1969, 100756);
        assertEquals(2 + 2 + 654 + 33583, rocketFuelCalculator.calculateFuel(modules));
    }

    @Test
    void calculateFuelForModule() {
        assertEquals(-2, rocketFuelCalculator.calculateFuelForModule(2));
        assertEquals(-1, rocketFuelCalculator.calculateFuelForModule(3)); // are those expected?
        assertEquals(2, rocketFuelCalculator.calculateFuelForModule(12));
        assertEquals(2, rocketFuelCalculator.calculateFuelForModule(14));
        assertEquals(654, rocketFuelCalculator.calculateFuelForModule(1969));
        assertEquals(33583, rocketFuelCalculator.calculateFuelForModule(100756));
    }

    @Test
    void calculateRecursiveFuel() {
        assertEquals(2, rocketFuelCalculator.calculateRecursiveFuel(14));
        assertEquals(966, rocketFuelCalculator.calculateRecursiveFuel(1969));
        assertEquals(50346, rocketFuelCalculator.calculateRecursiveFuel(100756));
    }

    @Test
    void calculateFuelWithFuelForFuelForModule() {
        List<Integer> modules = Arrays.asList(12, 14, 1969, 100756);
        assertEquals(2 + 2 + 966 + 50346, rocketFuelCalculator.calculateFuelWithFuelForFuel(modules));
    }

}