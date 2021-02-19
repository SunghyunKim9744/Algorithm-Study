package Day2.연도2016;

public class HJ {
	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		System.out.println(solution(a, b));
	}

	// 방법 2
	public static String solution(int a, int b) {
		int[] dayOfMonth = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] dayOfWeek = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		int totalDay = 0;

		// 총일수 구하기
		for (int i = 0; i < a; i++) {
			if (i == a - 1) {
				totalDay += b;
				break;
			}
			totalDay += dayOfMonth[i];
		}

		int numberOfWeek = ((totalDay % 7) + 11) % 7;
		return dayOfWeek[numberOfWeek];
	}

	// 방법 1
//	public static String solution(int a, int b) throws ParseException {
//		String criteria = "";
//		String aStr = "-" + a;
//		String bStr = "-" + b;
//		String[] dayOfWeek = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
//		
//		if(a < 10)
//			aStr = "-0" + a;
//
//		if(b < 10)
//			bStr = "-0" + b;
//		
//		criteria = "2016" + aStr + bStr;
//		
//		Date date = new SimpleDateFormat("yyyy-MM-dd").parse(criteria);
//		Calendar cal = Calendar.getInstance();
//	    cal.setTime(date);
//	    int numberOfWeek = cal.get(Calendar.DAY_OF_WEEK);
//
//		return dayOfWeek[numberOfWeek-1];
//	}
}
