package Level2And3Day1.가장긴팰린드롬;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sh {

	public static void main(String[] args) {
		
		String s = "ecdabbeadc";
		
		System.out.println(solution(s));

	}

	private static int solution(String s) {
		int answer = 0;
		
		String reverse = new StringBuilder(s).reverse().toString();
		Map<String,Integer[]> map = new HashMap<>();
		
		int max = 1;
		int len = s.length();
		for(int i=0; i<s.length(); i++) {
			StringBuilder temp = new StringBuilder(s.substring(i,i+1));
			for(int j=i+1; j<s.length(); j++) {
				temp = temp.append(s.substring(j,j+1));
				if(reverse.contains(temp)) {
					//if(max<temp.length()) {
					//	max = temp.length();
						map.put(temp.toString(), new Integer[] {i,j});
					//}
						
				}
				else {
					break;
				}
					
			}
		}
		
		Object[] key = map.keySet().toArray();
		
		Arrays.sort(key,(o1,o2)->((String)o2).length()-((String)o1).length());
		
		for(Object ob : key) {
			String s1 = (String)ob;
			Integer[] temp = map.get(s1);
			int begin = len-temp[1]-1;
			int end = len-temp[0];
			String reverseStr = reverse.substring(begin,end);
			if(reverseStr.equals(s1)) {
				return s1.length();
			}
		}
		return max;
		
	}

}
