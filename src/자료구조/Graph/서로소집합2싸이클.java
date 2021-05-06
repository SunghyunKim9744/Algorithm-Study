package 자료구조.Graph;

import java.util.HashMap;
import java.util.Map;

public class 서로소집합2싸이클 {

	public static void main(String[] args) {


		/*
		 * 
		 * 						A						A
		 * 					   / \ 					   /		 
		 * 					  B---C	 				  B---C
		 * 					 
		 *  
		 */
		

		// key : 본인
		// value : 부모
		Map<String,String> table = new HashMap<>();
		char ch = 'A';
		
		for(int i=0; i<3; i++) {
			String vertex = Character.toString(ch+i);
			table.put(vertex, vertex);
		}
		 
		String[] edges = {"AB","AC","BC"};
		
		boolean cycle = false;
		for(String edge : edges) {
			String vertexA = edge.substring(0,1);
			String vertexB = edge.substring(1,2);
			
			String vertexAParent = findParent(table,vertexA);
			String vertexBParent = findParent(table,vertexB);
			if(vertexAParent.equals(vertexBParent)) {
				System.out.println(edge+" 연결 시 싸이클 발생");
				cycle = true;
				break;
			}
			else
				unionParent(table,vertexA,vertexB);
		}
		
		if(cycle)
			System.out.println("Cycle 발생");
		else
			System.out.println("Cycle 발생 안함.");
		

	}

	private static void unionParent(Map<String, String> table, String vertexA, String vertexB) {
		String vertexAParent = findParent(table,vertexA);
		String vertexBParent = findParent(table,vertexB);
		
		int value = vertexAParent.compareTo(vertexBParent);
		if(value < 0) {
			table.put(vertexBParent, vertexAParent); 
		}
		else {
			table.put(vertexAParent, vertexBParent);
		}
		
	}

	private static String findParent(Map<String, String> table, String vertex) {
		String parent = table.get(vertex);
		
		if(!vertex.equals(parent)) {
			parent = findParent(table,parent);
			table.put(vertex, parent);
		}
		return parent;
	}


}
