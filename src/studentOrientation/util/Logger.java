package studentOrientation.util;

/**
 * @author shashiupadhyay
 *
 */
public class Logger {
	public static enum DebugLevel {
		NO_OUTPUT, RESULTS;
	};

	/*
	 * Debug level
	 */
	private static DebugLevel debugLevel;

/*
 * @param DEBUG_VALUE choice for DEBUG_VALUE
 */
	public static void setDebugValue(int DEBUG_VALUE) {
		switch (DEBUG_VALUE) {
		case 0:
			// No output will be displayed
			debugLevel = DebugLevel.NO_OUTPUT;
			break;
		case 1:
			debugLevel = DebugLevel.RESULTS;
			break;
		}
	}

	/*
	 * @param DebugLevel choice for DebugLevel
	 */	
	public static void setDebugValue(DebugLevel DEBUG_VALUEIn) {
		debugLevel = DEBUG_VALUEIn;
	}

	/*
	 * @param DebugLevel choice for DEBUG_VALUE
	 * @param messageIn  choice for DebugLevel
	 */
	public static void writeMessage(String messageIn, DebugLevel DEBUG_VALUEIn) {
		if (messageIn != null || DEBUG_VALUEIn != null) {
			if (DEBUG_VALUEIn == debugLevel) {
				System.out.println(messageIn);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Enabled DUBEG LEVEL : " + debugLevel;
	}
}
