package 고득점Kit.깊이_너비_우선탐색.단어변환;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 2:12 ~ 4:47 
public class Dy {
	public static void main(String[] args) {
		String begin = "hit";
		String target = "cog";
		String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
		
		System.out.println(solution(begin,target,words));
	}
	//  나중에 다시풀어라
	//테스트 5 〉	통과 (0.20ms, 52.9MB) 테스트 3 〉	통과 (3.41ms, 52.8MB)
	public static int solution(String begin, String target, String[] words) {
        int answer = 0;
        List<LinkedList<Integer>> graph = new ArrayList<LinkedList<Integer>>();
        List<String> wordsList = new ArrayList<String>();
        
        wordsList.add(begin);
        for(String key: words) {
        	wordsList.add(key);
        }
        
        for(int i = 0; i<wordsList.size(); i++) {
        	LinkedList<Integer> temp = new LinkedList<Integer>();
        	for(int j=0; j<wordsList.size(); j++) {
        		if(i != j) {
        			
        			char[] iWord = wordsList.get(i).toCharArray();
    				char[] jWord = wordsList.get(j).toCharArray();
    				int dif = 0;
        			for(int k=0; k<begin.length(); k++) {
        				if(iWord[k] != jWord[k])
        					dif++;
        			}
        			if(dif == 1)
        				temp.add(j);
        		}
        	}
        	graph.add(temp);
        }
        
        Queue<Integer> queue = new LinkedList<Integer>();
        Boolean[] visited = new Boolean[wordsList.size()];
        queue.add(0);
        int num = 0;
        while(true) {
	        if(queue.peek() != wordsList.indexOf(target)){
	        	visited[queue.peek()] = true;
	        	LinkedList<Integer> temp = graph.get(queue.poll());
	        	int addNum = 0;
	        	for(Integer key: temp) {
	        		if(key == wordsList.indexOf(target))
	        			return answer+1;
	        		if(visited[key] == null && !queue.contains(key)) {
	        			queue.add(key);
	        			if(num == 0)
	        				addNum++;
	        		}
	        	}
	        	if(addNum !=0)
	        		answer++;
	        	num += addNum;
	        	addNum = 0;
	        	if(num>0) {
	        		num--;
	        	}
	        }
	        
	        if(queue.isEmpty()) {
	        	return 0;
	        }
        }
    }
	
	//테스트 5 〉	통과 (0.27ms, 52.8MB) 테스트 3 〉	통과 (5.91ms, 52.6MB)
//	public static int solution(String begin, String target, String[] words) {
//        int answer = 0;
//        List<LinkedList<Integer>> graph = new ArrayList<LinkedList<Integer>>();
//        List<String> wordsList = new ArrayList<String>();
//        
//        wordsList.add(begin);
//        for(String key: words) {
//        	wordsList.add(key);
//        }
//        
//        for(int i = 0; i<wordsList.size(); i++) {
//        	LinkedList<Integer> temp = new LinkedList<Integer>();
//        	for(int j=0; j<wordsList.size(); j++) {
//        		if(i != j) {
//        			
//        			char[] iWord = wordsList.get(i).toCharArray();
//    				char[] jWord = wordsList.get(j).toCharArray();
//    				int dif = 0;
//        			for(int k=0; k<begin.length(); k++) {
//        				if(iWord[k] != jWord[k])
//        					dif++;
//        			}
//        			if(dif == 1)
//        				temp.add(j);
//        		}
//        	}
//        	graph.add(temp);
//        }
//        
//        Queue<Integer> queue = new LinkedList<Integer>();
//        Boolean[] visited = new Boolean[wordsList.size()];
//        queue.add(0);
//        int num = 0;
//        while(true) {
//	    	if(queue.peek() == wordsList.indexOf(target))
//	    		return answer;
//        	 
//    		visited[queue.peek()] = true;
//        	
//        	LinkedList<Integer> temp = graph.get(queue.poll());
//        	int addNum = 0;
//        	for(Integer key: temp) {
//        		if(visited[key] == null && !queue.contains(key)) {
//        			queue.add(key);
//        			if(num == 0)
//        				addNum++;
//        		}
//        	}
//        	if(addNum !=0)
//        		answer++;
//        	num += addNum;
//        	addNum = 0;
//        	if(num>0) {
//        		num--;
//        	}
//	        
//	        
//	        if(queue.isEmpty()) {
//	        	return 0;
//	        }
//        }
//    }
}
