package Level2And3Day1.가장긴팰린드롬lv3;

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
	
//	public static int solution(String s) {
//        int answer = 1;
//        int len = s.length();
//        char[] a = s.toCharArray();
//
//        int[][] dp = new int[len][len];
//
//        // 1. 1자리
//        for (int i = 0; i < len; i++)
//            dp[i][i] = 1;
//
//        // 2. 2자리
//        for (int i = 0; i < len-1; i++) {
//            if( a[i] == a[i+1] ) {
//                dp[i][i + 1] = 1;
//                answer = 2;
//            }
//        }
//        // 3. 3자리 이상
//        for (int k = 3; k <= len; k++) {
//            for (int i = 0; i <= len-k ; i++) {
//                int j = i+k-1; // k길이 만큼 떨어진 index
//                if( a[i] == a[j] && dp[i+1][j-1] == 1 ) { // 문자열이 같고, [i-1][j+1] 가 팰린드롬이라면
//                    dp[i][j] = 1;
//                    answer = Math.max(answer,k);
//                }
//            }
//        }
//
//        return answer;
//    }

}
