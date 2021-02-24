package Day05.핸드폰번호가리기;

public class Sh {

	public static void main(String[] args) {
		String phone_number = "01033334444";
		
		String answer = solution(phone_number);

	}
	
	// (1.50ms, 52.2MB) - > (3.66ms, 52.8MB)
	public static String solution(String phone_number) {
        String answer = "";
        int len = phone_number.length();
        String first = phone_number.substring(0,len-4);
        String last = phone_number.substring(len-4,len);
        
        first = first.replaceAll("\\d", "*");
        answer = first+last;
        
        return answer;
    }
	
	// (0.02ms, 52.1MB) - > (0.04ms, 53.7MB)
//	public static String solution(String phone_number) {
//        String answer = "";
//        char[] numbers = phone_number.toCharArray();
//        for(int i=0; i<numbers.length-4; i++)
//        	numbers[i] = '*';
//        
//        answer = String.valueOf(numbers);
//        
//        return answer;
//    }

}
