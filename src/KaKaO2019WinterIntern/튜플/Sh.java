package KaKaO2019WinterIntern.튜플;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Sh {

	public static void main(String[] args) {
		String s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
		
		int[] answer = solution(s);

	}

	// 3:06
	private static int[] solution(String s) {
		int[] answer = null;
		s = s.substring(1,s.length()-1);
		int len = s.split("[}]").length;
		answer = new int[len];
		
		StringBuilder strb = new StringBuilder();
		Map<Integer,String> map = new HashMap<>();
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == '}') {
				String temp = strb.toString();
				temp = temp.replaceAll("[{]", "");
				int key = temp.split(",").length;
				map.put(key, temp);
				i++;
				strb.delete(0,strb.length());
				continue;
			}
			strb.append(ch);
			
		}
		
		Set<Integer> set = new HashSet<>();
		for(int i=1; i<=len; i++) {
			String strTemp = map.get(i);
			String[] strs = strTemp.split(",");
			int[] tempInt = new int[strs.length];
			for(int j=0; j<tempInt.length; j++) {
				tempInt[j] = Integer.parseInt(strs[j]);
				if(!set.contains(tempInt[j])) {
					set.add(tempInt[j]);
					answer[i-1] = tempInt[j];
					break;
				}
					
			}
		}
		
		for(Integer i : answer)
			System.out.println(i);
		return answer;
		
		
	}

}
