package com.olbati.craftsmanship.berlinclock.internal;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

import com.olbati.craftsmanship.berlinclock.internal.BerlinSecondConverter;

/**
 * @author Nizar GARRACHE
 * 
 * @since Oct 9, 2014
 */
public class BerlinSecondConverterTest {

	// ==========================================
	// SUT
	// ==========================================

	private BerlinSecondConverter berlinSecondConverter = new BerlinSecondConverter();

	// ==========================================
	// Tests
	// ==========================================

	@Test
	public void should_convert_seconds_to_berlin_clock_representation() {
		// Arrange

		// Act
		String actualEvenSeconds = berlinSecondConverter.convert(0);
		String actualOddSeconds = berlinSecondConverter.convert(1);

		// Assert
		assertThat(actualEvenSeconds).isEqualTo("Y");
		assertThat(actualOddSeconds).isEqualTo("O");
	}

}
