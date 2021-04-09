package KaKaO2020Intern.보석쇼핑;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Dy {

	public static void main(String[] args) {
		String[] n = {"XYZ", "XYZ", "XYZ"};
		
		System.out.println(solution(n));

	}
	
	private static int[] solution(String[] gems) {
        int[] answer = {0, gems.length};
        
        Set<String> gemName = new HashSet<>();
        for(String key: gems) {
        	gemName.add(key);
        }
        int min = 0;
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<gems.length; i++) {
        	map.put(gems[i], map.getOrDefault(gems[i], 0) + 1);
        	if(map.size() == gemName.size()) {
        		for(int j = min; j<i+1; j++) {
        			if(map.get(gems[j]) == 1) {
        				min = j;
        				if(answer[1] - answer[0] > i - j) {
        					answer[0] = j;
        					answer[1] = i;
        				}
    					break;
        			}else {
        				map.put(gems[j], map.get(gems[j]) -1);
        			}
        		}
        	}
        }
        answer[0]++;
        answer[1]++;
        return answer;
    }

}
