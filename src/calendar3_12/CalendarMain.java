package calendar3_12;

import java.util.Scanner;

public class CalendarMain {
	
	public static void main(String[] args) {
		int nYear = 0;

		while(true) {
			System.out.println("년도를 입력하세요.");
			System.out.print("YEAR> ");
			Scanner scanner = new Scanner(System.in);
			
			//년도 입력값이 int인지 체크
			while(!scanner.hasNextInt()) {
				scanner.next();
				System.out.println("숫자를 사용해 년도를 입력하세요.");
			}
		
			nYear = scanner.nextInt();
			
			if(nYear < 1 || nYear > 2021) {
				continue;
			}else {
				break;
			}
		}
		
		int nMonth = 0;

		while(true) {
			System.out.println("달을 입력하세요.");
			System.out.print("MONTH> ");
			Scanner scanner2 = new Scanner(System.in);
			
			//달 입력값이 int인지 체크
			while(!scanner2.hasNextInt()) {
				scanner2.next();
				System.out.println("숫자를 사용해 월을 입력하세요.");
			}
			
			nMonth = scanner2.nextInt();
			
			//1~12월 입력값만 받는다.
			if(nMonth < 1 || nMonth > 12) {
				continue;
			}else {
				break;
			}
		}
		
		String sStartDay = "";

		//입력값 체크
		while(true) {
			System.out.println("첫번째 요일을 입력하세요. (SU, MO, TU, WE, TH, FR, SA)");
			System.out.print("WEEKDAY> ");
			Scanner scanner3 = new Scanner(System.in);
			sStartDay = scanner3.nextLine();
			
			if(sStartDay.equals("SU") || sStartDay.equals("MO") || sStartDay.equals("TU") || sStartDay.equals("WE") || sStartDay.equals("TH") || sStartDay.equals("FR") || sStartDay.equals("SA")) {
				break;
			}else{
				continue;
			}
		}
		
		PrintCal cal = new PrintCal();
		cal.printCalendar(nYear, nMonth, sStartDay);
	}
}
