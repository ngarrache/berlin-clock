package com.olbati.craftsmanship.berlinclock;

import com.google.common.base.Preconditions;
import com.olbati.craftsmanship.berlinclock.internal.BerlinHourConverter;
import com.olbati.craftsmanship.berlinclock.internal.BerlinMinuteConverter;
import com.olbati.craftsmanship.berlinclock.internal.BerlinSecondConverter;

/**
 * @author Nizar GARRACHE
 * 
 * @since Oct 9, 2014
 */
public class BerlinClock {

	// ==========================================
	// Dependencies
	// ==========================================

	private BerlinHourConverter berlinHourConverter = new BerlinHourConverter();

	private BerlinMinuteConverter berlinMinuteConverter = new BerlinMinuteConverter();

	private BerlinSecondConverter berlinSecondConverter = new BerlinSecondConverter();

	// ==========================================
	// Public Methods
	// ==========================================

	public String[] convert(int hours, int minutes, int seconds) {
		Preconditions.checkArgument(hours >= 0 && hours <= 24,
				"Hours [%s] must be between 0 and 24", hours);
		Preconditions.checkArgument(minutes >= 0 && minutes <= 59,
				"Minutes [%s] must be between 0 and 59", minutes);
		Preconditions.checkArgument(seconds >= 0 && seconds <= 59,
				"Seconds [%s] must be between 0 and 59", seconds);

		String[] berlinHours = berlinHourConverter.convert(hours);
		String[] berlinMinutes = berlinMinuteConverter.convert(minutes);
		String berlinSeconds = berlinSecondConverter.convert(seconds);

		return new String[] { berlinSeconds, berlinHours[0], berlinHours[1],
				berlinMinutes[0], berlinMinutes[1] };
	}

}
