package Day01.완주하지못한선수;

import java.util.HashMap;
import java.util.Map;

public class Dy {

	public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String key : participant)
        	map.put(key, map.getOrDefault(key, 0)+1);
        
        for(String key : completion)
        	map.put(key, map.getOrDefault(key, 0)-1);
        
        for(String key : participant)
        	if(map.get(key) != 0)
        		answer = key;
        
        return answer;
    }

}
