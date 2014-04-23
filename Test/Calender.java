

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
		System.out.println("Input date:(Format:2030-5-10)");
		Scanner s = new Scanner(System.in);
		String userInput = s.nextLine();

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			GregorianCalendar date = new GregorianCalendar();
			date.setTime(formatter.parse(userInput));

			int day = date.get(Calendar.DAY_OF_MONTH);
			date.set(Calendar.DATE, 1);

			int w = date.get(Calendar.DAY_OF_WEEK);
			int maxDate = date.getActualMaximum(Calendar.DATE);

			System.out.println("Sun \t Mon \t Tue \t Wed \t Thu \t Fri \t Sat");

			for (int i = 0; i < w - 1; i++) {
				System.out.print("\t");
			}

			for (int i = 1; i <= maxDate; i++) {
				if (i == day) {
					System.out.print("*");
				}
				System.out.print(i + "\t");

				if ((i + w - 1) % 7 == 0) {
					System.out.println();
				}
			}

		} catch (ParseException e) {
			e.printStackTrace();
		}
		s.close();
	}
}
