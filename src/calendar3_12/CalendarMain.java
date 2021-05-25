package calendar3_12;

import java.util.Scanner;

public class CalendarMain {
	
	public static void main(String[] args) {
		System.out.println("년도를 입력하세요.");
		System.out.print("YEAR> ");
		Scanner scanner = new Scanner(System.in);
		int nYear = scanner.nextInt();
		
		System.out.println("달을 입력하세요.");
		System.out.print("MONTH> ");
		Scanner scanner2 = new Scanner(System.in);
		int nMonth = scanner2.nextInt();
		
		System.out.println("첫번째 요일을 입력하세요. (SU, MO, TU, WE, TH, FR, SA)");
		System.out.print("WEEKDAY> ");
		Scanner scanner3 = new Scanner(System.in);
		String sStartDay = scanner3.nextLine();
		
		PrintCal cal = new PrintCal();
		cal.printCalendar(nYear, nMonth, sStartDay);
	}
}
