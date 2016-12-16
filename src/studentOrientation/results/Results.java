package studentOrientation.results;

import studentOrientation.orientationSchedule.orientationScheduleInterface;
import studentOrientation.util.Logger;

public class Results {
	
	/**
	 * @param orientationscheduleIn orientationscheduleIn reference
	 */
	public static void displayOutput(orientationScheduleInterface orientationscheduleIn) {
				Logger.writeMessage(orientationscheduleIn.toString(), Logger.DebugLevel.RESULTS);
	}

}
