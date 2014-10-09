package com.olbati.craftsmanship.berlinclock;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.olbati.craftsmanship.berlinclock.internal.BerlinHourConverter;
import com.olbati.craftsmanship.berlinclock.internal.BerlinMinuteConverter;
import com.olbati.craftsmanship.berlinclock.internal.BerlinSecondConverter;

/**
 * @author Nizar GARRACHE
 * 
 * @since Sep 25, 2014
 */
@RunWith(MockitoJUnitRunner.class)
public class BerlinClockTest {

	// ==========================================
	// SUT
	// ==========================================

	@InjectMocks
	private BerlinClock berlinClock;

	// ==========================================
	// Fixtures
	// ==========================================

	@Mock
	private BerlinHourConverter berlinHourConverterMock;

	@Mock
	private BerlinMinuteConverter berlinMinuteConverterMock;

	@Mock
	private BerlinSecondConverter berlinSecondConverterMock;

	// ==========================================
	// Tests
	// ==========================================

	@Test
	public void should_convert_time_to_berlin_clock_representation() {
		// Arrange
		when(berlinHourConverterMock.convert(13)).thenReturn(
				new String[] { "RROO", "RRRO" });
		when(berlinMinuteConverterMock.convert(17)).thenReturn(
				new String[] { "YYROOOOOOOO", "YYOO" });
		when(berlinSecondConverterMock.convert(1)).thenReturn("Y");

		// Act
		String[] actualBerlinRepresentation = berlinClock.convert(13, 17, 1);

		// Assert
		assertThat(actualBerlinRepresentation).hasSize(5);
		assertThat(actualBerlinRepresentation).containsExactly("Y", "RROO",
				"RRRO", "YYROOOOOOOO", "YYOO");
	}

	@Test(expected = IllegalArgumentException.class)
	public void should_throw_exception_when_convert_time_but_hours_lesser_than_0() {
		// Arrange

		// Act
		berlinClock.convert(-1, 17, 1);

		// Assert
	}

	@Test(expected = IllegalArgumentException.class)
	public void should_throw_exception_when_convert_time_but_hours_greater_than_24() {
		// Arrange

		// Act
		berlinClock.convert(25, 17, 1);

		// Assert
	}

	@Test(expected = IllegalArgumentException.class)
	public void should_throw_exception_when_convert_time_but_minutes_lesser_than_0() {
		// Arrange

		// Act
		berlinClock.convert(13, -1, 1);

		// Assert
	}

	@Test(expected = IllegalArgumentException.class)
	public void should_throw_exception_when_convert_time_but_minutes_greater_than_59() {
		// Arrange

		// Act
		berlinClock.convert(13, 60, 1);

		// Assert
	}

	@Test(expected = IllegalArgumentException.class)
	public void should_throw_exception_when_convert_time_but_seconds_lesser_than_0() {
		// Arrange

		// Act
		berlinClock.convert(13, 17, -1);

		// Assert
	}

	@Test(expected = IllegalArgumentException.class)
	public void should_throw_exception_when_convert_time_but_seconds_greater_than_59() {
		// Arrange

		// Act
		berlinClock.convert(13, 17, 60);

		// Assert
	}

}
