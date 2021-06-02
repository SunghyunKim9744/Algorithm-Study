package Level2Day04.두개이하로다른비트;

public class Sh {

	public static void main(String[] args) {
		long[] numbers = {2};
		
		long[] answer = solution(numbers);

	}

	private static long[] solution(long[] numbers) {
		long[] answer = new long[numbers.length];
		
		int idx = 0;
		for(long n : numbers) {
			StringBuilder s = new StringBuilder(Long.toBinaryString(n));
			long result = 0;
			int lastIdx = s.lastIndexOf("0");
			if(lastIdx < 0) {
				s.insert(0, "1");
				s.setCharAt(1, '0');
				result = Long.parseLong(s.toString(), 2);
				answer[idx++] = result;
			}
			else {
				int startIdx = s.indexOf("1",lastIdx);
				s.setCharAt(lastIdx, '1');
				if(startIdx > 0) {
					s.setCharAt(startIdx, '0');
				}
				result = Long.parseLong(s.toString(), 2);
				answer[idx++] = result;
					
			}
			
		}
		
		return answer;
	}

}
