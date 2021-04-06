package KaKaO2019WinterIntern.불량사용자;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Dy {

	public static void main(String[] args) {
		
		String[] s = {"frodo", "fradi", "crodo", "abc123", "frodoc"};
		String[] b = {"fr*d*", "*rodo", "******", "******"};
		System.out.println(solution(s,b));

	}

	private static int solution(String[] user_id, String[] banned_id) {
        int answer = 1;
        
        Map<String,LinkedList<String>> map = new HashMap<String,LinkedList<String>>();
        
        for(String key: banned_id) {
        	String[] temp = key.split("");
        	for(String key2: user_id) {
        		String[] temp2 = key2.split("");
        		if(key.length() == key2.length()) {
        			int num = 0;
        			for(int i=0; i<key.length(); i++) {
        				if(!temp[i].equals("*") && !temp[i].equals(temp2[i])) {
        					break;
        				}else {
        					num++;
        				}
        			}
        			if(num == key.length()) {
        				LinkedList<String> tempList = map.getOrDefault(key, new LinkedList<String>());
        				tempList.add(key2);
        				map.put(key, tempList);
        				
        			}
        		}
        	}
        }
        
        for(String key: banned_id) {
        	answer *= map.get(key).size();
        }
        
        for(int i=0; i<banned_id.length; i++) {
        	 for(int j=i+1; j<banned_id.length; j++) {
        		 int num = 0;
        		 for(String key: map.get(banned_id[i])){
        			 map.get(banned_id[j]).contains(key);
        		 }
             }
        }
        
        return answer;
    }

}
