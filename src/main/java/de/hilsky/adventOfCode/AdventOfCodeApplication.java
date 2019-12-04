package de.hilsky.adventOfCode;

import de.hilsky.adventOfCode.Day1.RocketFuelCalculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static de.hilsky.adventOfCode.Data.DATA_DAY_1;

@SpringBootApplication
public class AdventOfCodeApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory
			.getLogger(AdventOfCodeApplication.class);

	public static void main(String[] args) {
		LOG.info("STARTING THE APPLICATION");
		SpringApplication.run(AdventOfCodeApplication.class, args);
		LOG.info("APPLICATION FINISHED");
	}

	@Override
	public void run(String... args) throws Exception {
		RocketFuelCalculator rocketFuelCalculator = new RocketFuelCalculator();
		int neededFuel = rocketFuelCalculator.calculateFuel(DATA_DAY_1);
		int neededFuelWithMore = rocketFuelCalculator.calculateFuelWithFuelForFuel(DATA_DAY_1);
		LOG.info("DAY01 - Fuel needed {}", neededFuel);
		LOG.info("DAY01 - Fuel needed with more fuel {}", neededFuelWithMore);
	}
}
