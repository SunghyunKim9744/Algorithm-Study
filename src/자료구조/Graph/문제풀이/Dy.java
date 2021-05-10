package 자료구조.Graph.문제풀이;

import java.util.HashMap;
import java.util.Map;

public class Dy {

	public static void main(String[] args) {
		String[] n = {"A","B","C","D"};
		String[] edges = {"AB","AC","AD","BD","BC"};
		
		Map<String, String> map = new HashMap<>();
		
		for(String key: n) {
			map.put(key, key);
		}
		
		for(String edge: edges) {
			String node1 = edge.substring(0, 1);
			String node2 = edge.substring(1, 2);
			
			String node1P = find(map, node1);
			String node2P = find(map, node2);
			
			if(!node1P.equals(node2P)) {
				union(map, node1, node2);
			}else {
				System.out.println("사이클"+node1+node2);
			}
		}
		
		
	}

	private static void union(Map<String, String> map, String node1, String node2) {
		String node1P = find(map, node1);
		String node2P = find(map, node2);
		if(node1P.compareTo(node2P) < 0) {
			map.put(node2P, node1P);
		}else {
			map.put(node1P, node2P);
		}
		
	}

	private static String find(Map<String, String> map, String key) {
		
		if(map.get(key).equals(key)) {
			return key;
		}else {
			String root = find(map, map.get(key));
			map.put(key,root);
			return root;
		}
		
		
	}
	
}
