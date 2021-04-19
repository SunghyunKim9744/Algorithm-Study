package KaKaO2019신입.후보키;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sh {

	public static void main(String[] args) {
		String[][] relation = {
								{"1","2","a","3"},
								{"1","3","a","3"},
								{"1","2","c","3"},
								{"1","3","c","3"}
							  };
		
		int answer = solution(relation);

	}

	private static int solution(String[][] relation) {
		int answer = 0;
		List<String> answerList = new ArrayList<>();
		String[] temp = new String[relation[0].length];
		for(int i=0; i<relation[0].length; i++) {
			comb(relation,temp,0,0,i+1,answerList);
			
		}
		for(int i=0; i<answerList.size()-1; i++) {
			String small = answerList.get(i);
			for(int j=i+1; j<answerList.size(); j++) {
				String big = answerList.get(j);
				if(big.contains(small)) {
					answerList.remove(j);
					j--;
				}
			}
		}
		System.out.println(answerList);
		return answerList.size();
	}

	private static void comb(String[][] relation, String[] temp, int start, int depth, int r,
			List<String> answerList) {
		if(depth == r) {
			int[] index = new int[r];
			StringBuilder temps = new StringBuilder();
			for(int i=0; i<r; i++) {
				
				index[i] = Integer.parseInt(temp[i]);
				temps.append(temp[i]);
			}
			
			for(String s : answerList) {
				if(temps.toString().contains(s))
					return;
			}
			String[] rows = new String[relation.length];
			Set<String> set = new HashSet<>();
			for(int i=0; i<rows.length; i++) {
				StringBuilder strb = new StringBuilder();
				for(int j : index)
					strb.append(relation[i][j]+",");
			
				set.add(strb.toString());
			}
			if(set.size() == rows.length) {
				System.out.println(temps.toString());
				answerList.add(temps.toString());
			}
			return;
		}
		
		for (int i = start; i < relation[0].length; i++) {
			temp[depth] = String.valueOf(i);
			StringBuilder tempStr = new StringBuilder();
			for(int j=0; j<depth+1; j++)
				tempStr.append(temp[j]);
			
		
			
			if(!answerList.contains(tempStr.toString()))
				comb(relation,temp,i+1,depth+1,r,answerList);
			
		}
		
		
		
	}


}
