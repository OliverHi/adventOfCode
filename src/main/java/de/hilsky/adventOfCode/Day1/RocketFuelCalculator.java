package de.hilsky.adventOfCode.Day1;

import java.util.List;

public class RocketFuelCalculator {
    public int calculateFuel(List<Integer> modules) {
        return modules.stream().mapToInt(this::calculateFuelForModule).sum();
    }

    public int calculateFuelWithFuelForFuel(List<Integer> modules) {
        return modules.stream().mapToInt(this::calculateRecursiveFuel).sum();
    }

    public int calculateFuelForModule(Integer module) {
        return (module / 3) - 2;
    }

    public int calculateRecursiveFuel(Integer module) {
        int fuel = calculateFuelForModule(module);

        if (fuel <= 0) {
            return 0;
        } else {
            return fuel + calculateRecursiveFuel(fuel);
        }
    }
}
