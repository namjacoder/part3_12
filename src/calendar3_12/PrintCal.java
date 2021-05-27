package calendar3_12;

public class PrintCal {
	private static final int[] MONTH_LAST_DAY = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};		//평년 월 마지막날
	private static final int[] LEAP_MONTH_LAST_DAY = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	//윤년 월 마지막날
	
	//달력 출력
	public void printCalendar(int nYear, int nMonth, int nStartDay) {
		nStartDay = nStartDay - 1;	//전달된 기준은 1~7, 사용하는 기준은 0~6. 고로 -1해서 사용해야 맞음.
		
		System.out.printf("     <<%d년 %d월>>\n", nYear, nMonth);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");

		//시작일수만큼 공백 만들기
		for(int i=1; i<=nStartDay; i++) {
			System.out.print("   ");
		}
		
		//달의 마지막날을 가져온다.
		int nLastDay = getMonthLastDay(nYear, nMonth);
		
		//달의 마지막날까지 loop 돌면서 출력
		for(int i=1; i<=nLastDay; i++) {
			System.out.printf("%3d", i);
			
			//i+nStartDay 결과값을 7로 나누어 떨어지면 줄바꿈.
			if((i+nStartDay)%7 == 0) {
				System.out.println();
			}
		}
	}

	//param1:년
	//param2:달
	public int getMonthLastDay(int param1, int param2) {
		if(isLeapYear(param1)) {
			return LEAP_MONTH_LAST_DAY[param2-1];
		}else {
			return MONTH_LAST_DAY[param2-1];
		}
	}
	
	//윤년 판단
	//param:년
	public boolean isLeapYear (int param) {
		
		//4로 나누어 떨어짐 && (100으로 나누어 떨어지면 안됨 || 400으로 나누어 떨어짐)
		if(param%4 == 0 && (param%100 != 0 || param%400 == 0)) {
			return true;
		}else {
			return false;
		}
	}
}
