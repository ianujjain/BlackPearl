package BlackPearl.Controller.Helper;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public final class ControllerHelper {

	public static String GetRandomText(final int length) {
		StringBuffer randStr = new StringBuffer();
		try {
			if (length <= 0) {
			}
			for (int i = 0; i < length; i++) {
				int number = RandomIntNumber();
				char ch = ControllerConfig.CHARLIST.charAt(number);
				randStr.append(ch);
			}
			return randStr.toString();
		} catch (Exception objException) {
			return "";
		}
	}

	private static int RandomIntNumber() {
		int randomInt = 0;
		Random randomGenerator = new Random();
		randomInt = randomGenerator.nextInt(ControllerConfig.CHARLIST.length());
		if (randomInt - 1 == -1) {
			return randomInt;
		} else {
			return randomInt - 1;
		}
	}

	public static int GetRandomIntNumber(final int min, final int max) {
		try {
			if (min >= max) {
				// Log.error("Max Must Be Greater Than Min...");
			}
			Random r = new Random();
			return r.nextInt((max - min) + 1) + min;
		} catch (Exception objException) {
			// Log.error(objException.getMessage());
			return 0;
		}
	}

	public static String RandomDoubleNumber(int min, int max) {
		Random rand = new Random();
		double result = rand.nextDouble() * (max - min) + min;
		DecimalFormat f = new DecimalFormat("##.00");
		return f.format(result);
	}

	public static String Timestamp() {
		String timestamp;
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
		timestamp = "_" + (((ft.format(dNow).toString()).replace(" ", "_")).replace(":", "_")).replace(".", "_");
		return timestamp;
	}

	public static String TimestampYYYYMMDD() {
		String timestamp;
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy");
		timestamp = (((ft.format(dNow).toString()).replace(" ", "-")).replace(":", "-")).replace(".", "-");
		return timestamp;
	}
}