package Day4.자연수뒤집어배열로만들기;

public class Sh {
	public static void main(String[] args) {
		long n = 10000000000L;
		System.out.println(solution(n));
	}

//	public static int[] solution(long n) {
//        int[] answer = {};
//        String value = String.valueOf(n);
//        
//        StringBuilder str = new StringBuilder(value);
//        
//        str = str.reverse();
//        
//        String[] reverseStr = str.toString().split("");
//        
//        answer = new int[reverseStr.length];
//        
//        for(int i=0; i<answer.length; i++)
//        	answer[i] = Integer.parseInt(reverseStr[i]);
//        
//        return answer;
//    }

	public static int[] solution(long n) {
		int[] answer = {};
	
		char[] nums = String.valueOf(n).toCharArray();
		int lastIndex = nums.length - 1;
		int count = nums.length / 2;
		for (int i = 0; i < count; i++) {
			char temp = nums[i];
			nums[i] = nums[lastIndex - i];
			nums[lastIndex - i] = temp;
		}
		
		String[] reverseStr = String.valueOf(nums).split("");

		answer = new int[reverseStr.length];

		for (int i = 0; i < answer.length; i++)
			answer[i] = Integer.parseInt(reverseStr[i]);

		return answer;
	}
	
	
}
