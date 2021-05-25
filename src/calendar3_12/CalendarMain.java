package calendar3_12;

import java.util.Scanner;

public class CalendarMain {
	
	public static void main(String[] args) {
		System.out.println("년도를 입력하세요.");
		System.out.print("YEAR> ");
		Scanner scanner = new Scanner(System.in);
		
		//년도 입력값이 int인지 체크
		while(!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("숫자를 사용해 년도를 입력하세요.");
		}
		
		int nYear = scanner.nextInt();
		
		System.out.println("달을 입력하세요.");
		System.out.print("MONTH> ");
		Scanner scanner2 = new Scanner(System.in);
		
		//달 입력값이 int인지 체크
		while(!scanner2.hasNextInt()) {
			scanner2.next();
			System.out.println("숫자를 사용해 월을 입력하세요.");
		}
		
		int nMonth = scanner2.nextInt();

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
