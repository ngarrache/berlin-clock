package com.olbati.craftsmanship.berlinclock.internal;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

import com.olbati.craftsmanship.berlinclock.internal.BerlinHourConverter;

/**
 * @author Nizar GARRACHE
 * 
 * @since Oct 9, 2014
 */
public class BerlinHourConverterTest {

	// ==========================================
	// SUT
	// ==========================================

	private BerlinHourConverter berlinHourConverter = new BerlinHourConverter();

	// ==========================================
	// Tests
	// ==========================================

	@Test
	public void should_convert_hours_to_berlin_clock_representation() {
		// Arrange

		// Act
		String[] actualHours = berlinHourConverter.convert(13);

		// Assert
		assertThat(actualHours).hasSize(2);
		assertThat(actualHours).containsExactly("RROO", "RRRO");
	}

}
