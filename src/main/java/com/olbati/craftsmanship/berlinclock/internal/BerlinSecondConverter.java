package com.olbati.craftsmanship.berlinclock.internal;

import static com.olbati.craftsmanship.berlinclock.internal.BerlinClockConfiguration.*;

/**
 * @author Nizar GARRACHE
 * 
 * @since Oct 9, 2014
 */
public class BerlinSecondConverter {

	// ==========================================
	// Public Methods
	// ==========================================

	public String convert(int seconds) {
		if (seconds % 2 == 0) {
			return String.valueOf(LAMP_YELLOW);

		} else {
			return String.valueOf(LAMP_OFF);

		}
	}

}
