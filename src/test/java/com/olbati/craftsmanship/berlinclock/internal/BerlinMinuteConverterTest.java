package com.olbati.craftsmanship.berlinclock.internal;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

import com.olbati.craftsmanship.berlinclock.internal.BerlinMinuteConverter;

/**
 * @author Nizar GARRACHE
 * 
 * @since Oct 9, 2014
 */
public class BerlinMinuteConverterTest {

	// ==========================================
	// SUT
	// ==========================================

	private BerlinMinuteConverter berlinMinuteConverter = new BerlinMinuteConverter();

	// ==========================================
	// Tests
	// ==========================================

	@Test
	public void should_convert_minutes_to_berlin_clock_representation() {
		// Arrange

		// Act
		String[] actualMinutes = berlinMinuteConverter.convert(17);

		// Assert
		assertThat(actualMinutes).hasSize(2);
		assertThat(actualMinutes).containsExactly("YYROOOOOOOO", "YYOO");
	}

}
