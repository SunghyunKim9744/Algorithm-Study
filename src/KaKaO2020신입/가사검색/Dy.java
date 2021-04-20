package KaKaO2020신입.가사검색;

import java.util.HashMap;
import java.util.Map;

public class Dy {

	public static void main(String[] args) {
		String[] w = {"frodo", "front", "frost", "frozen", "frame", "kakao"};
		String[] q = {"fro??", "????o", "fr???", "fro???", "pro?"};
		solution(w,q);
	}
	
	public static int[] solution(String[] words, String[] queries) {
        int[] answer = new int[queries.length];
        Map<String,Integer> map = new HashMap<>();
        for(String key: words) {
        	for(int i=0; i<key.length(); i++) {
        		StringBuilder sb = new StringBuilder();
        		StringBuilder sb2 = new StringBuilder();
        		for(int j=0; j<i; j++) {
        			sb.append("?");
        		}
        		for(int j=0; j<key.length()-i-1; j++) {
        			sb2.append("?");
        		}
        		String before = sb.append(key.substring(i)).toString();
        		String after = sb2.insert(0,key.substring(0,i+1)).toString();
            	map.put(before, map.getOrDefault(before, 0) + 1);
            	map.put(after, map.getOrDefault(after,0) + 1);
        	}
        }
        for(int i=0; i<queries.length; i++) {
        	if(map.get(queries[i]) != null) {
            	answer[i] = map.get(queries[i]);
        	}else {
        		answer[i] = 0;
        	}
        }
        return answer;
    }

}
