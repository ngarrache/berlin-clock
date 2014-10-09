package com.olbati.craftsmanship.berlinclock.internal;

import static com.olbati.craftsmanship.berlinclock.internal.BerlinClockConfiguration.*;

/**
 * @author Nizar GARRACHE
 * 
 * @since Oct 9, 2014
 */
public class BerlinHourConverter {

	// ==========================================
	// Public Methods
	// ==========================================

	public String[] convert(int hours) {
		char[] topRow = new char[] { LAMP_OFF, LAMP_OFF, LAMP_OFF, LAMP_OFF };
		int topRowRedLampCount = (int) Math.floor(hours / 5);
		for (int i = 0; i < topRowRedLampCount; i++) {
			topRow[i] = LAMP_RED;
		}

		char[] lowerRow = new char[] { LAMP_OFF, LAMP_OFF, LAMP_OFF, LAMP_OFF };
		int lowerRowRedLampCount = hours % 5;
		for (int i = 0; i < lowerRowRedLampCount; i++) {
			lowerRow[i] = LAMP_RED;
		}

		return new String[] { new String(topRow), new String(lowerRow) };
	}
}
