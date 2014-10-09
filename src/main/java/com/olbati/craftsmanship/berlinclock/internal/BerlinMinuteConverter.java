package com.olbati.craftsmanship.berlinclock.internal;

import static com.olbati.craftsmanship.berlinclock.internal.BerlinClockConfiguration.*;

/**
 * @author Nizar GARRACHE
 * 
 * @since Oct 9, 2014
 */
public class BerlinMinuteConverter {

	// ==========================================
	// Public Methods
	// ==========================================

	public String[] convert(int minutes) {
		char[] topRow = new char[] { LAMP_OFF, LAMP_OFF, LAMP_OFF, LAMP_OFF,
				LAMP_OFF, LAMP_OFF, LAMP_OFF, LAMP_OFF, LAMP_OFF, LAMP_OFF,
				LAMP_OFF };
		int topRowRedLampCount = (int) Math.floor(minutes / 5);
		for (int i = 0; i < topRowRedLampCount; i++) {
			if (isQuarterLamp(i + 1)) {
				topRow[i] = LAMP_RED;

			} else {
				topRow[i] = LAMP_YELLOW;

			}
		}

		char[] lowerRow = new char[] { LAMP_OFF, LAMP_OFF, LAMP_OFF, LAMP_OFF };
		int lowerRowRedLampCount = minutes % 5;
		for (int i = 0; i < lowerRowRedLampCount; i++) {
			lowerRow[i] = LAMP_YELLOW;
		}

		return new String[] { new String(topRow), new String(lowerRow) };
	}

	// ==========================================
	// Private Methods
	// ==========================================

	private boolean isQuarterLamp(int lampPosition) {
		return lampPosition % 3 == 0;
	}
}
