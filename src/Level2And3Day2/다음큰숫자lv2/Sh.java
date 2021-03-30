package Level2And3Day2.다음큰숫자lv2;

public class Sh {

	public static void main(String[] args) {
		int n1 = 37;
		int n2 = 15;
		
		solution(n1);

	}

	private static int solution(int n) {
		int answer = 0;
		
		int oneCnt = Integer.bitCount(n);
		String binary = Integer.toBinaryString(n);
		int lastIndexOne = binary.lastIndexOf("1");
		int lastIndexZero = binary.lastIndexOf("0", lastIndexOne);

		StringBuilder sb = new StringBuilder();
		for(int i=0; i<binary.length(); i++)
			sb.append("0");
		
		if(lastIndexZero == -1) {
			sb.setCharAt(0, '0');
			sb.insert(0, "1");
			oneCnt--;
		}
		
		else {
			sb = new StringBuilder(binary.substring(0,lastIndexZero+1));
			sb.setCharAt(lastIndexZero, '1');
			for(int i=0; i<binary.length()-lastIndexZero; i++)
				sb.append("0");
			oneCnt = lastIndexOne - lastIndexZero -1;
		}
		
		for(int i=0; i<oneCnt; i++)
			sb.setCharAt(sb.length()-1-i, '1');
		
		answer = Integer.valueOf(sb.toString(),2);
		System.out.println(answer);
		return answer;
		
	}

}
