package com.olbati.craftsmanship.berlinclock;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

/**
 * @author Nizar GARRACHE
 * 
 * @since Sep 25, 2014
 */
public class BerlinClockUAT {

	// ==========================================
	// SUT
	// ==========================================

	private BerlinClock berlinClock = new BerlinClock();

	// ==========================================
	// Tests
	// ==========================================

	@Test
	public void should_convert_time_00_00_00_to_Y_OOOO_OOOO_OOOOOOOOOOO_OOOO() {
		// Arrange

		// Act
		String[] actualBerlinRepresentation = berlinClock.convert(0, 0, 0);

		// Assert
		assertThat(actualBerlinRepresentation).hasSize(5);
		assertThat(actualBerlinRepresentation).containsExactly("Y", "OOOO",
				"OOOO", "OOOOOOOOOOO", "OOOO");
	}

	@Test
	public void should_convert_time_13_17_01_to_Y_RROO_RRRO_YYROOOOOOOO_YYOO() {
		// Arrange

		// Act
		String[] actualBerlinRepresentation = berlinClock.convert(13, 17, 1);

		// Assert
		assertThat(actualBerlinRepresentation).hasSize(5);
		assertThat(actualBerlinRepresentation).containsExactly("O", "RROO",
				"RRRO", "YYROOOOOOOO", "YYOO");
	}

	@Test
	public void should_convert_time_23_59_59_to_O_RRRR_RRRO_YYRYYRYYRYY_YYYY() {
		// Arrange

		// Act
		String[] actualBerlinRepresentation = berlinClock.convert(23, 59, 59);

		// Assert
		assertThat(actualBerlinRepresentation).hasSize(5);
		assertThat(actualBerlinRepresentation).containsExactly("O", "RRRR",
				"RRRO", "YYRYYRYYRYY", "YYYY");
	}

	@Test
	public void should_convert_time_24_00_00_to_Y_RRRR_RRRR_OOOOOOOOOOO_OOOO() {
		// Arrange

		// Act
		String[] actualBerlinRepresentation = berlinClock.convert(24, 00, 00);

		// Assert
		assertThat(actualBerlinRepresentation).hasSize(5);
		assertThat(actualBerlinRepresentation).containsExactly("Y", "RRRR",
				"RRRR", "OOOOOOOOOOO", "OOOO");
	}
}
