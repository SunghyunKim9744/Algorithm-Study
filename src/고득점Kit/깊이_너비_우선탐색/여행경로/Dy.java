package 고득점Kit.깊이_너비_우선탐색.여행경로;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


// 5:55 ~
public class Dy {
	public static void main(String[] args) {
		String[][] tickets = {{"ICN","B"},{"B","ICN"},{"ICN","A"},{"A","D"},{"D","A"}};
		
		for(String key: solution(tickets)) {
			System.out.println(key);
		}
//		System.out.println(solution(tickets));
	}

	public static String[] solution(String[][] tickets) {
        String[] answer = {};
        Arrays.sort(tickets, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				if(o1[0].equals(o2[0]))
					return o1[1].compareTo(o2[1]);
				return o1[0].compareTo(o2[0]);
			}
		});
        	
        Map<String, LinkedList<String>> map = new HashMap<String, LinkedList<String>>();
        for(String[] key: tickets) {
        	LinkedList<String> list = map.getOrDefault(key[0], new LinkedList<String>());
        	list.add(key[1]);
        	map.put(key[0], list);
        }
        List<String> list = new ArrayList<String>();
        List<String> ansList = dfs(map, tickets.length,"ICN",list);
        answer = new String[tickets.length+1];
        for(int i=0; i<tickets.length+1; i++) {
        	answer[i] = ansList.get(i);
        }
     
        return answer;
    }
	
	public static List<String> dfs( Map<String, LinkedList<String>> map, int ticket, String key, List<String> list) {
		List<String> temp = new ArrayList<String>();
		list.add(key);
		if(list.size() == ticket+1) {
	        return list;
		}
		if(map.get(key)!=null) {
			for(int i=0; i<map.get(key).size(); i++) {
				String nextKey = map.get(key).poll();
				temp = dfs(map, ticket, nextKey, list);
				map.get(key).add(nextKey);
				if(temp != null)
					return temp;
			}
		}
		
		list.remove(key);
        return null;
    }
}
