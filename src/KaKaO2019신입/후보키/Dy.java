package KaKaO2019신입.후보키;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Dy {

	public static void main(String[] args) {
		String[][] r = {{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};
		solution(r);
	}
	
	public static int solution(String[][] relation) {
        int answer = 0;
        Set<Integer> set = new HashSet<Integer>();
        answer = solution2(relation, 0, set, relation.length);
        System.out.println(answer);
        return answer;
    }
	

	
	public static int solution2(String[][] relation, int num, Set set, int max) {
        int answer = 0;
        
        for(int j=num; j<relation[0].length; j++) {
        	Map<String, List<Integer>> map = new HashMap<>();
        	Set<Integer> set1 = new HashSet<Integer>();
	        for(int i=0; i<relation.length; i++) {
	        	if(!set.isEmpty() && !set.contains(i)) {
	        		continue;
	        	}
	        	List<Integer> temp = map.getOrDefault(relation[i][j], new ArrayList<Integer>());
	        	temp.add(i);
	        	map.put(relation[i][j], temp);
	        	if(temp.size() != 1) {
	        		for(Integer key: map.get(relation[i][j])) {
	        			set1.add(key);
	        		}
	        	}
	        }
	        if(map.size() == max) {
	        	answer++;
	        }else {
	        	answer += solution2(relation, ++j, set1, set1.size());
	        }
        }
        return answer;
    }

}
