package 자료구조.Graph;

import java.util.HashMap;
import java.util.Map;

public class 서로소집합 {

	public static void main(String[] args) {


		/*
		 * 
		 * 						AㅡㅡㅡㅡㅡㅡㅡㅡB
		 * 					   / \		   /
		 * 					  C	  \		  G
		 * 					  |\   \     / \			I---------J
		 *                    | \   \   /   \					 /
		 *                    |  \   \ /     \					/
		 *  				  DㅡㅡE   H       F				   K-------L
		 *  
		 */
		

		// key : 본인
		// value : 부모
		Map<String,String> table = new HashMap<>();
		char ch = 'A';
		
		for(int i=0; i<12; i++) {
			String node = Character.toString(ch+i);
			table.put(node, node);
		}
		System.out.println(table);

		unionParent(table,"A","B");
		unionParent(table,"A","C");
		unionParent(table,"A","H");
		unionParent(table,"B","G");
		unionParent(table,"C","D");
		unionParent(table,"C","E");
		unionParent(table,"D","E");
		unionParent(table,"F","G");
		unionParent(table,"G","H");
		
		unionParent(table,"I","J");
		unionParent(table,"J","K");
		unionParent(table,"K","L");
		
		System.out.println(table);

	}

	private static void unionParent(Map<String, String> table, String nodeA, String nodeB) {
		String nodeAParent = findParent(table,nodeA);
		String nodeBParent = findParent(table,nodeB);
		
		int value = nodeAParent.compareTo(nodeBParent);
		// 1번째 노드가 2번째 노드보다 값이 작을 경우
		if(value < 0)
			table.put(nodeBParent, nodeAParent);
		else
			table.put(nodeAParent, nodeBParent);
		
	}

	private static String findParent(Map<String, String> table, String node) {
		
		String parent = table.get(node);
//		if(!node.equals(parent))
//			return findParent(table,parent);
//		return node;
		
		
		// 경로 압축 기법
		if(!node.equals(parent)) {
			parent =  findParent(table,parent);
			table.put(node, parent);
		}
			
		return parent;
	}

}
