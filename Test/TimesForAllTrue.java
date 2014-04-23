

public class TimesForAllTrue {
	public static void main(String[] args) {
		for (int i = 100; i <= 100; i++) {
			double times = timesForAllTrueAverage(i);
			System.out.println(i + "\t" + times + "\t" + times / i);
		}
	}

	public static int timesForAllTrue(int number) {
		boolean[] booleanArray = new boolean[number];
		int count;
		for (count = 0; !checkAllTrue(booleanArray); count++)
			booleanArray[(int) (Math.random() * number)] = true;
		return count;
	}

	private static boolean checkAllTrue(boolean[] booleanArray) {
		for (boolean booleanValue : booleanArray)
			if (!booleanValue)
				return false;
		return true;
	}

	public static double timesForAllTrueAverage(int number) {
		return timesForAllTrueAverage(number, 100);
	}

	public static double timesForAllTrueAverage(int number, int repeatTimes) {
		double sum = 0;
		for (int j = 0; j < repeatTimes; j++)
			sum += timesForAllTrue(number);
		return sum / (double) repeatTimes;
	}
}