package KaKaO2018신입.뉴스클러스링;

import java.util.HashMap;
import java.util.Map;

public class Sh {

	public static void main(String[] args) {
		String str1 = "handshake";
		String str2 = "handshake";
		
		int answer = solution(str1,str2);

	}

	// 3:29
	private static int solution(String str1, String str2) {
		int answer = 0;
		str1 = str1.toUpperCase().replaceAll("[^A-Z]","0");
		str2 = str2.toUpperCase().replaceAll("[^A-Z]","0");
		
		Map<String,Integer> str1Map = new HashMap<>();
		Map<String,Integer> str2Map = new HashMap<>();
		
		StringBuilder strb = new StringBuilder();
		for(int i=0; i<str1.length(); i++) {
			String temp = str1.substring(i,i+1);
			if(temp.equals("0")) {
				strb.delete(0, strb.length());
				continue;
			}
			else {
				strb.append(temp);
				if(strb.length()==2) {
					String str = strb.toString();
					str1Map.put(str,str1Map.getOrDefault(str, 0)+1);
					strb.delete(0, 2);
					i--;
				}
			}
				
		}
		
		strb.delete(0, strb.length());
		
		
		for(int i=0; i<str2.length(); i++) {
			String temp = str2.substring(i,i+1);
			if(temp.equals("0")) {
				strb.delete(0, strb.length());
				continue;
			}
			else {
				strb.append(temp);
				if(strb.length()==2) {
					String str = strb.toString();
					str2Map.put(str,str2Map.getOrDefault(str, 0)+1);
					strb.delete(0, 2);
					i--;
				}
			}
				
		}
		
		int hap = 0;
		int gyo = 0;
		
		for(String str : str2Map.keySet()) {
			if(str1Map.containsKey(str)) {
				int str1Num = str1Map.get(str);
				int str2Num = str2Map.get(str);
				int tempGyo = str1Num > str2Num ? str2Num : str1Num;
				int tempHap = str1Num > str2Num ? str1Num : str2Num;
				
				hap += tempHap;
				gyo += tempGyo;
				str1Map.remove(str);
			}
			else {
				hap += str2Map.get(str);
			}
		}
		
		for(String str : str1Map.keySet()) {
			hap+= str1Map.get(str);
		}
		
		if(gyo==0 && hap==0)
			return 65536;
		else if(gyo==0)
			return 0;
		
		answer = (int) ((gyo/(double)hap)*65536);
		return answer;
	}

}
