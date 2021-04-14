package KaKaO2018신입.캐시;

import java.util.LinkedList;
import java.util.Queue;

import com.sun.tools.classfile.StackMapTable_attribute.chop_frame;

public class Dy {

	public static void main(String[] args) {

		int s1 = 0;
		String s2[] = {"a","b","c","c"};
		
		System.out.println(solution(s1,s2));

	}
	private static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> queue = new LinkedList<>();
        
        for(String key: cities) {
        	key = key.toLowerCase();
        	if(!queue.isEmpty() && cacheSize != 0) {
        		if(queue.contains(key)) {
        			answer++;
        			queue.remove(key);
        			queue.add(key);
        		}else {
        			queue.add(key);
        			answer += 5;
        			if(queue.size() > cacheSize) {
        				queue.poll();
        			}
        		}
        	}else {
        		queue.add(key);
        		answer += 5;
        	}
        }
        
        return answer;
    }

}
