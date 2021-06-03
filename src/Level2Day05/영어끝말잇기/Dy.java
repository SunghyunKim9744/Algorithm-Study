package Level2Day05.영어끝말잇기;

import java.util.HashSet;
import java.util.Set;

public class Dy {

	public static void main(String[] args) {

		int n = 3;
		String[] s = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		System.out.println(solution(n, s));

	}

	private static int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        
        String last = words[0].substring(0,1);
        Set<String> set = new HashSet<>();
        int count = 0;
        for(String key: words) {
        	if(key.startsWith(last) && !set.contains(key)) {
        		set.add(key);
        		last = key.substring(key.length()-1, key.length());
        	}else {
        		answer[0] = count % n +1;
                answer[1] = count / n +1;
        		return answer;
        	}
        	count++;
        }
        
        return answer;
    }

}
