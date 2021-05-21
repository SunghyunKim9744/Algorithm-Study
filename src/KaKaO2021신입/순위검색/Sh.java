package KaKaO2021신입.순위검색;

import java.util.ArrayList;
import java.util.List;

public class Sh {

	public static void main(String[] args) {
		String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
	
		int[] answer = solution(info,query);
	}

	private static int[] solution(String[] info, String[] query) {
		// 0 , -
		// 1 cpp 2 java 3 python
		// 1 backend 2 frontend
		// 1 junior 2 senior
		// 1. chicken 2 pizza
		
		List<List<List<List<List<Integer>>>>> list = new ArrayList<>();
		
		
		
		for(int i=0; i<4; i++) {
			list.add(new ArrayList<>());
			for(int j=0; j<3; j++) {
				list.get(i).add(new ArrayList<>());
				for(int k=0; k<3; k++) {
					list.get(i).get(j).add(new ArrayList<>());
					for(int l=0; l<3; l++) {
						list.get(i).get(j).get(k).add(new ArrayList<>());
					}
				}
			}
		}
		
		for(String s : info) {
			String[] temp = s.split(" ");
			
			String lan = temp[0];
			String posi = temp[1];
			String ex = temp[2];
			String food = temp[3];
			int score = Integer.parseInt(temp[4]);
			list.get(0).get(0).get(0).get(0).add(score);
			
			if(lan.equals("cpp")) {
				list.get(1).get(0).get(0).get(0).add(score);
				if(posi.equals("backend")) {
					list.get(0).get(1).get(0).get(0).add(score);
					list.get(1).get(1).get(0).get(0).add(score);
					if(ex.equals("junior")) {
						list.get(0).get(0).get(1).get(0).add(score);
						list.get(1).get(0).get(1).get(0).add(score);
						list.get(1).get(1).get(1).get(0).add(score);
						list.get(0).get(1).get(1).get(0).add(score);
						if(food.equals("chicken")) {
							list.get(0).get(0).get(0).get(1).add(score);
							list.get(0).get(0).get(1).get(1).add(score);
							list.get(0).get(1).get(1).get(1).add(score);
							list.get(0).get(1).get(0).get(1).add(score);
							list.get(1).get(0).get(0).get(1).add(score);
							list.get(1).get(0).get(1).get(1).add(score);
							list.get(1).get(1).get(1).get(1).add(score);
							list.get(1).get(1).get(0).get(1).add(score);
						}
						else {
							list.get(0).get(0).get(0).get(2).add(score);
							list.get(0).get(0).get(1).get(2).add(score);
							list.get(0).get(1).get(1).get(2).add(score);
							list.get(0).get(1).get(0).get(2).add(score);
							list.get(1).get(0).get(0).get(2).add(score);
							list.get(1).get(0).get(1).get(2).add(score);
							list.get(1).get(1).get(1).get(2).add(score);
							list.get(1).get(1).get(0).get(2).add(score);
						}
					}
					else {
						list.get(0).get(0).get(2).get(0).add(score);
						list.get(1).get(0).get(2).get(0).add(score);
						list.get(1).get(1).get(2).get(0).add(score);
						list.get(0).get(1).get(2).get(0).add(score);
						if(food.equals("chicken")) {
							list.get(0).get(0).get(0).get(1).add(score);
							list.get(0).get(0).get(2).get(1).add(score);
							list.get(0).get(1).get(2).get(1).add(score);
							list.get(0).get(1).get(0).get(1).add(score);
							list.get(1).get(0).get(0).get(1).add(score);
							list.get(1).get(0).get(2).get(1).add(score);
							list.get(1).get(1).get(2).get(1).add(score);
							list.get(1).get(1).get(0).get(1).add(score);
						}
						else {
							list.get(0).get(0).get(0).get(2).add(score);
							list.get(0).get(0).get(2).get(2).add(score);
							list.get(0).get(1).get(2).get(2).add(score);
							list.get(0).get(1).get(0).get(2).add(score);
							list.get(1).get(0).get(0).get(2).add(score);
							list.get(1).get(0).get(2).get(2).add(score);
							list.get(1).get(1).get(2).get(2).add(score);
							list.get(1).get(1).get(0).get(2).add(score);
						}
					}
				}
				else {
					list.get(0).get(2).get(0).get(0).add(score);
					list.get(1).get(2).get(0).get(0).add(score);
					if(ex.equals("junior")) {
						list.get(0).get(0).get(1).get(0).add(score);
						list.get(1).get(0).get(1).get(0).add(score);
						list.get(1).get(2).get(1).get(0).add(score);
						list.get(0).get(2).get(1).get(0).add(score);
						if(food.equals("chicken")) {
							list.get(0).get(0).get(0).get(1).add(score);
							list.get(0).get(0).get(1).get(1).add(score);
							list.get(0).get(2).get(1).get(1).add(score);
							list.get(0).get(2).get(0).get(1).add(score);
							list.get(1).get(0).get(0).get(1).add(score);
							list.get(1).get(0).get(1).get(1).add(score);
							list.get(1).get(2).get(1).get(1).add(score);
							list.get(1).get(2).get(0).get(1).add(score);
						}
						else {
							list.get(0).get(0).get(0).get(2).add(score);
							list.get(0).get(0).get(1).get(2).add(score);
							list.get(0).get(2).get(1).get(2).add(score);
							list.get(0).get(2).get(0).get(2).add(score);
							list.get(1).get(0).get(0).get(2).add(score);
							list.get(1).get(0).get(1).get(2).add(score);
							list.get(1).get(2).get(1).get(2).add(score);
							list.get(1).get(2).get(0).get(2).add(score);
						}
					}
					else {
						list.get(0).get(0).get(2).get(0).add(score);
						list.get(1).get(0).get(2).get(0).add(score);
						list.get(1).get(2).get(2).get(0).add(score);
						list.get(0).get(2).get(2).get(0).add(score);
						if(food.equals("chicken")) {
							list.get(0).get(0).get(0).get(1).add(score);
							list.get(0).get(0).get(2).get(1).add(score);
							list.get(0).get(2).get(2).get(1).add(score);
							list.get(0).get(2).get(0).get(1).add(score);
							list.get(1).get(0).get(0).get(1).add(score);
							list.get(1).get(0).get(2).get(1).add(score);
							list.get(1).get(2).get(2).get(1).add(score);
							list.get(1).get(2).get(0).get(1).add(score);
						}
						else {
							list.get(0).get(0).get(0).get(2).add(score);
							list.get(0).get(0).get(2).get(2).add(score);
							list.get(0).get(2).get(2).get(2).add(score);
							list.get(0).get(2).get(0).get(2).add(score);
							list.get(1).get(0).get(0).get(2).add(score);
							list.get(1).get(0).get(2).get(2).add(score);
							list.get(1).get(2).get(2).get(2).add(score);
							list.get(1).get(2).get(0).get(2).add(score);
						}
					}
				}
			}
			
			else if(lan.equals("java")) {
				list.get(2).get(0).get(0).get(0).add(score);
				if(posi.equals("backend")) {
					list.get(0).get(1).get(0).get(0).add(score);
					list.get(2).get(1).get(0).get(0).add(score);
					if(ex.equals("junior")) {
						list.get(0).get(0).get(1).get(0).add(score);
						list.get(2).get(0).get(1).get(0).add(score);
						list.get(2).get(1).get(1).get(0).add(score);
						list.get(0).get(1).get(1).get(0).add(score);
						if(food.equals("chicken")) {
							list.get(0).get(0).get(0).get(1).add(score);
							list.get(0).get(0).get(1).get(1).add(score);
							list.get(0).get(1).get(1).get(1).add(score);
							list.get(0).get(1).get(0).get(1).add(score);
							list.get(2).get(0).get(0).get(1).add(score);
							list.get(2).get(0).get(1).get(1).add(score);
							list.get(2).get(1).get(1).get(1).add(score);
							list.get(2).get(1).get(0).get(1).add(score);
						}
						else {
							list.get(0).get(0).get(0).get(2).add(score);
							list.get(0).get(0).get(1).get(2).add(score);
							list.get(0).get(1).get(1).get(2).add(score);
							list.get(0).get(1).get(0).get(2).add(score);
							list.get(2).get(0).get(0).get(2).add(score);
							list.get(2).get(0).get(1).get(2).add(score);
							list.get(2).get(1).get(1).get(2).add(score);
							list.get(2).get(1).get(0).get(2).add(score);
						}
					}
					else {
						list.get(0).get(0).get(2).get(0).add(score);
						list.get(2).get(0).get(2).get(0).add(score);
						list.get(2).get(1).get(2).get(0).add(score);
						list.get(0).get(1).get(2).get(0).add(score);
						if(food.equals("chicken")) {
							list.get(0).get(0).get(0).get(1).add(score);
							list.get(0).get(0).get(2).get(1).add(score);
							list.get(0).get(1).get(2).get(1).add(score);
							list.get(0).get(1).get(0).get(1).add(score);
							list.get(2).get(0).get(0).get(1).add(score);
							list.get(2).get(0).get(2).get(1).add(score);
							list.get(2).get(1).get(2).get(1).add(score);
							list.get(2).get(1).get(0).get(1).add(score);
						}
						else {
							list.get(0).get(0).get(0).get(2).add(score);
							list.get(0).get(0).get(2).get(2).add(score);
							list.get(0).get(1).get(2).get(2).add(score);
							list.get(0).get(1).get(0).get(2).add(score);
							list.get(2).get(0).get(0).get(2).add(score);
							list.get(2).get(0).get(2).get(2).add(score);
							list.get(2).get(1).get(2).get(2).add(score);
							list.get(2).get(1).get(0).get(2).add(score);
						}
					}
				}
				else {
					list.get(0).get(2).get(0).get(0).add(score);
					list.get(2).get(2).get(0).get(0).add(score);
					if(ex.equals("junior")) {
						list.get(0).get(0).get(1).get(0).add(score);
						list.get(2).get(0).get(1).get(0).add(score);
						list.get(2).get(2).get(1).get(0).add(score);
						list.get(0).get(2).get(1).get(0).add(score);
						if(food.equals("chicken")) {
							list.get(0).get(0).get(0).get(1).add(score);
							list.get(0).get(0).get(1).get(1).add(score);
							list.get(0).get(2).get(1).get(1).add(score);
							list.get(0).get(2).get(0).get(1).add(score);
							list.get(2).get(0).get(0).get(1).add(score);
							list.get(2).get(0).get(1).get(1).add(score);
							list.get(2).get(2).get(1).get(1).add(score);
							list.get(2).get(2).get(0).get(1).add(score);
						}
						else {
							list.get(0).get(0).get(0).get(2).add(score);
							list.get(0).get(0).get(1).get(2).add(score);
							list.get(0).get(2).get(1).get(2).add(score);
							list.get(0).get(2).get(0).get(2).add(score);
							list.get(2).get(0).get(0).get(2).add(score);
							list.get(2).get(0).get(1).get(2).add(score);
							list.get(2).get(2).get(1).get(2).add(score);
							list.get(2).get(2).get(0).get(2).add(score);
						}
					}
					else {
						list.get(0).get(0).get(2).get(0).add(score);
						list.get(2).get(0).get(2).get(0).add(score);
						list.get(2).get(2).get(2).get(0).add(score);
						list.get(0).get(2).get(2).get(0).add(score);
						if(food.equals("chicken")) {
							list.get(0).get(0).get(0).get(1).add(score);
							list.get(0).get(0).get(2).get(1).add(score);
							list.get(0).get(2).get(2).get(1).add(score);
							list.get(0).get(2).get(0).get(1).add(score);
							list.get(2).get(0).get(0).get(1).add(score);
							list.get(2).get(0).get(2).get(1).add(score);
							list.get(2).get(2).get(2).get(1).add(score);
							list.get(2).get(2).get(0).get(1).add(score);
						}
						else {
							list.get(0).get(0).get(0).get(2).add(score);
							list.get(0).get(0).get(2).get(2).add(score);
							list.get(0).get(2).get(2).get(2).add(score);
							list.get(0).get(2).get(0).get(2).add(score);
							list.get(2).get(0).get(0).get(2).add(score);
							list.get(2).get(0).get(2).get(2).add(score);
							list.get(2).get(2).get(2).get(2).add(score);
							list.get(2).get(2).get(0).get(2).add(score);
						}
					}
				}
			}
			
			else if(lan.equals("python")) {
				list.get(3).get(0).get(0).get(0).add(score);
				if(posi.equals("backend")) {
					list.get(0).get(1).get(0).get(0).add(score);
					list.get(3).get(1).get(0).get(0).add(score);
					if(ex.equals("junior")) {
						list.get(0).get(0).get(1).get(0).add(score);
						list.get(3).get(0).get(1).get(0).add(score);
						list.get(3).get(1).get(1).get(0).add(score);
						list.get(0).get(1).get(1).get(0).add(score);
						if(food.equals("chicken")) {
							list.get(0).get(0).get(0).get(1).add(score);
							list.get(0).get(0).get(1).get(1).add(score);
							list.get(0).get(1).get(1).get(1).add(score);
							list.get(0).get(1).get(0).get(1).add(score);
							list.get(3).get(0).get(0).get(1).add(score);
							list.get(3).get(0).get(1).get(1).add(score);
							list.get(3).get(1).get(1).get(1).add(score);
							list.get(3).get(1).get(0).get(1).add(score);
						}
						else {
							list.get(0).get(0).get(0).get(2).add(score);
							list.get(0).get(0).get(1).get(2).add(score);
							list.get(0).get(1).get(1).get(2).add(score);
							list.get(0).get(1).get(0).get(2).add(score);
							list.get(3).get(0).get(0).get(2).add(score);
							list.get(3).get(0).get(1).get(2).add(score);
							list.get(3).get(1).get(1).get(2).add(score);
							list.get(3).get(1).get(0).get(2).add(score);
						}
					}
					else {
						list.get(0).get(0).get(2).get(0).add(score);
						list.get(3).get(0).get(2).get(0).add(score);
						list.get(3).get(1).get(2).get(0).add(score);
						list.get(0).get(1).get(2).get(0).add(score);
						if(food.equals("chicken")) {
							list.get(0).get(0).get(0).get(1).add(score);
							list.get(0).get(0).get(2).get(1).add(score);
							list.get(0).get(1).get(2).get(1).add(score);
							list.get(0).get(1).get(0).get(1).add(score);
							list.get(3).get(0).get(0).get(1).add(score);
							list.get(3).get(0).get(2).get(1).add(score);
							list.get(3).get(1).get(2).get(1).add(score);
							list.get(3).get(1).get(0).get(1).add(score);
						}
						else {
							list.get(0).get(0).get(0).get(2).add(score);
							list.get(0).get(0).get(2).get(2).add(score);
							list.get(0).get(1).get(2).get(2).add(score);
							list.get(0).get(1).get(0).get(2).add(score);
							list.get(3).get(0).get(0).get(2).add(score);
							list.get(3).get(0).get(2).get(2).add(score);
							list.get(3).get(1).get(2).get(2).add(score);
							list.get(3).get(1).get(0).get(2).add(score);
						}
					}
				}
				else {
					list.get(0).get(2).get(0).get(0).add(score);
					list.get(3).get(2).get(0).get(0).add(score);
					if(ex.equals("junior")) {
						list.get(0).get(0).get(1).get(0).add(score);
						list.get(3).get(0).get(1).get(0).add(score);
						list.get(3).get(2).get(1).get(0).add(score);
						list.get(0).get(2).get(1).get(0).add(score);
						if(food.equals("chicken")) {
							list.get(0).get(0).get(0).get(1).add(score);
							list.get(0).get(0).get(1).get(1).add(score);
							list.get(0).get(2).get(1).get(1).add(score);
							list.get(0).get(2).get(0).get(1).add(score);
							list.get(3).get(0).get(0).get(1).add(score);
							list.get(3).get(0).get(1).get(1).add(score);
							list.get(3).get(2).get(1).get(1).add(score);
							list.get(3).get(2).get(0).get(1).add(score);
						}
						else {
							list.get(0).get(0).get(0).get(2).add(score);
							list.get(0).get(0).get(1).get(2).add(score);
							list.get(0).get(2).get(1).get(2).add(score);
							list.get(0).get(2).get(0).get(2).add(score);
							list.get(3).get(0).get(0).get(2).add(score);
							list.get(3).get(0).get(1).get(2).add(score);
							list.get(3).get(2).get(1).get(2).add(score);
							list.get(3).get(2).get(0).get(2).add(score);
						}
					}
					else {
						list.get(0).get(0).get(2).get(0).add(score);
						list.get(3).get(0).get(2).get(0).add(score);
						list.get(3).get(2).get(2).get(0).add(score);
						list.get(0).get(2).get(2).get(0).add(score);
						if(food.equals("chicken")) {
							list.get(0).get(0).get(0).get(1).add(score);
							list.get(0).get(0).get(2).get(1).add(score);
							list.get(0).get(2).get(2).get(1).add(score);
							list.get(0).get(2).get(0).get(1).add(score);
							list.get(3).get(0).get(0).get(1).add(score);
							list.get(3).get(0).get(2).get(1).add(score);
							list.get(3).get(2).get(2).get(1).add(score);
							list.get(3).get(2).get(0).get(1).add(score);
						}
						else {
							list.get(0).get(0).get(0).get(2).add(score);
							list.get(0).get(0).get(2).get(2).add(score);
							list.get(0).get(2).get(2).get(2).add(score);
							list.get(0).get(2).get(0).get(2).add(score);
							list.get(3).get(0).get(0).get(2).add(score);
							list.get(3).get(0).get(2).get(2).add(score);
							list.get(3).get(2).get(2).get(2).add(score);
							list.get(3).get(2).get(0).get(2).add(score);
						}
					}
				}
			}
		}
		System.out.println(list);
		for(int i=0; i<4; i++) {
			
			for(int j=0; j<3; j++) {
				
				for(int k=0; k<3; k++) {
					
					for(int l=0; l<3; l++) {
						list.get(i).get(j).get(k).get(l).sort((i1,i2)-> {
							return i1-i2;
						});
					}
				}
			}
		}
		
		int[] answer = new int[query.length];
		int cnt = 0;
		for(String s : query) {
			s = s.replace("and ", "");
			String[] temp = s.split(" ");
			
			String lan = temp[0];
			String posi = temp[1];
			String ex = temp[2];
			String food = temp[3];
			int score = Integer.parseInt(temp[4]);
			if(lan.equals("-")) {
				
				if(posi.equals("-")) {
					
					if(ex.equals("-")) {
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(0).get(0).get(0).get(0);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(0).get(0).get(0).get(1);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(0).get(0).get(0).get(2);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
					
					else if(ex.equals("junior")) {
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(0).get(0).get(1).get(0);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(0).get(0).get(1).get(1);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(0).get(0).get(1).get(2);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
					
					else{
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(0).get(0).get(2).get(0);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(0).get(0).get(2).get(1);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(0).get(0).get(2).get(2);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
				}
				
				else if(posi.equals("backend")) {
					
					if(ex.equals("-")) {
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(0).get(1).get(0).get(0);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(0).get(1).get(0).get(1);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(0).get(1).get(0).get(2);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
					
					else if(ex.equals("junior")) {
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(0).get(1).get(1).get(0);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(0).get(1).get(1).get(1);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(0).get(1).get(1).get(2);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
					
					else{
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(0).get(1).get(2).get(0);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(0).get(1).get(2).get(1);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(0).get(1).get(2).get(2);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
				}
				
				
				else {
					
					if(ex.equals("-")) {
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(0).get(2).get(0).get(0);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(0).get(2).get(0).get(1);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(0).get(2).get(0).get(2);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
					
					else if(ex.equals("junior")) {
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(0).get(2).get(1).get(0);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(0).get(2).get(1).get(1);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(0).get(2).get(1).get(2);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
					
					else{
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(0).get(2).get(2).get(0);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(0).get(2).get(2).get(1);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(0).get(2).get(2).get(2);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
				}
			}
			
			else if(lan.equals("cpp")) {
				
				if(posi.equals("-")) {
					
					if(ex.equals("-")) {
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(1).get(0).get(0).get(0);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(1).get(0).get(0).get(1);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(1).get(0).get(0).get(2);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
					
					else if(ex.equals("junior")) {
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(1).get(0).get(1).get(0);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(1).get(0).get(1).get(1);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(1).get(0).get(1).get(2);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
					
					else{
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(1).get(0).get(2).get(0);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(1).get(0).get(2).get(1);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(1).get(0).get(2).get(2);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
				}
				
				else if(posi.equals("backend")) {
					
					if(ex.equals("-")) {
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(1).get(1).get(0).get(0);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(1).get(1).get(0).get(1);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(1).get(1).get(0).get(2);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
					
					else if(ex.equals("junior")) {
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(1).get(1).get(1).get(0);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(1).get(1).get(1).get(1);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(1).get(1).get(1).get(2);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
					
					else{
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(1).get(1).get(2).get(0);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(1).get(1).get(2).get(1);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(1).get(1).get(2).get(2);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
				}
				
				
				else {
					
					if(ex.equals("-")) {
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(1).get(2).get(0).get(0);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(1).get(2).get(0).get(1);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(1).get(2).get(0).get(2);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
					
					else if(ex.equals("junior")) {
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(1).get(2).get(1).get(0);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(1).get(2).get(1).get(1);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(1).get(2).get(1).get(2);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
					
					else{
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(1).get(2).get(2).get(0);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(1).get(2).get(2).get(1);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(1).get(2).get(2).get(2);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
				}
			}
			
			else if(lan.equals("java")) {
				
				if(posi.equals("-")) {
					
					if(ex.equals("-")) {
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(2).get(0).get(0).get(0);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(2).get(0).get(0).get(1);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(2).get(0).get(0).get(2);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
					
					else if(ex.equals("junior")) {
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(2).get(0).get(1).get(0);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(2).get(0).get(1).get(1);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(2).get(0).get(1).get(2);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
					
					else{
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(2).get(0).get(2).get(0);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(2).get(0).get(2).get(1);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(2).get(0).get(2).get(2);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
				}
				
				else if(posi.equals("backend")) {
					
					if(ex.equals("-")) {
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(2).get(1).get(0).get(0);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(2).get(1).get(0).get(1);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(2).get(1).get(0).get(2);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
					
					else if(ex.equals("junior")) {
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(2).get(1).get(1).get(0);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(2).get(1).get(1).get(1);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(2).get(1).get(1).get(2);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
					
					else{
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(2).get(1).get(2).get(0);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(2).get(1).get(2).get(1);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(2).get(1).get(2).get(2);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
				}
				
				
				else {
					
					if(ex.equals("-")) {
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(2).get(2).get(0).get(0);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(2).get(2).get(0).get(1);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(2).get(2).get(0).get(2);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
					
					else if(ex.equals("junior")) {
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(2).get(2).get(1).get(0);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(2).get(2).get(1).get(1);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(2).get(2).get(1).get(2);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
					
					else{
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(2).get(2).get(2).get(0);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(2).get(2).get(2).get(1);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(2).get(2).get(2).get(2);
							
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
				}
			}
			
			
			else {
				
				if(posi.equals("-")) {
					
					if(ex.equals("-")) {
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(3).get(0).get(0).get(0);
							System.out.println(s);
							System.out.println(tempList);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(3).get(0).get(0).get(1);
							System.out.println(s);
							System.out.println(tempList);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(3).get(0).get(0).get(2);
							System.out.println(s);
							System.out.println(tempList);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
					
					else if(ex.equals("junior")) {
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(3).get(0).get(1).get(0);
							System.out.println(s);
							System.out.println(tempList);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(3).get(0).get(1).get(1);
							System.out.println(s);
							System.out.println(tempList);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(3).get(0).get(1).get(2);
							System.out.println(s);
							System.out.println(tempList);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
					
					else{
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(3).get(0).get(2).get(0);
							System.out.println(s);
							System.out.println(tempList);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(3).get(0).get(2).get(1);
							System.out.println(s);
							System.out.println(tempList);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(3).get(0).get(2).get(2);
							System.out.println(s);
							System.out.println(tempList);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
				}
				
				else if(posi.equals("backend")) {
					
					if(ex.equals("-")) {
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(3).get(1).get(0).get(0);
							System.out.println(s);
							System.out.println(tempList);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(3).get(1).get(0).get(1);
							System.out.println(s);
							System.out.println(tempList);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(3).get(1).get(0).get(2);
							System.out.println(s);
							System.out.println(tempList);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
					
					else if(ex.equals("junior")) {
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(3).get(1).get(1).get(0);
							System.out.println(s);
							System.out.println(tempList);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(3).get(1).get(1).get(1);
							System.out.println(s);
							System.out.println(tempList);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(3).get(1).get(1).get(2);
							System.out.println(s);
							System.out.println(tempList);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
					
					else{
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(3).get(1).get(2).get(0);
							System.out.println(s);
							System.out.println(tempList);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(3).get(1).get(2).get(1);
							System.out.println(s);
							System.out.println(tempList);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(3).get(1).get(2).get(2);
							System.out.println(s);
							System.out.println(tempList);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
				}
				
				
				else {
					
					if(ex.equals("-")) {
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(3).get(2).get(0).get(0);
							System.out.println(s);
							System.out.println(tempList);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(3).get(2).get(0).get(1);
							System.out.println(s);
							System.out.println(tempList);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(3).get(2).get(0).get(2);
							System.out.println(s);
							System.out.println(tempList);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
					
					else if(ex.equals("junior")) {
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(3).get(2).get(1).get(0);
							System.out.println(s);
							System.out.println(tempList);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(3).get(2).get(1).get(1);
							System.out.println(s);
							System.out.println(tempList);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(3).get(2).get(1).get(2);
							System.out.println(s);
							System.out.println(tempList);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
					
					else{
						
						if(food.equals("-")) {
							List<Integer> tempList = list.get(3).get(2).get(2).get(0);
							System.out.println(s);
							System.out.println(tempList);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						
						else if(food.equals("chicken")) {
							List<Integer> tempList = list.get(3).get(2).get(2).get(1);
							System.out.println(s);
							System.out.println(tempList);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
						else {
							List<Integer> tempList = list.get(3).get(2).get(2).get(2);
							System.out.println(s);
							System.out.println(tempList);
							if(tempList.size() == 0) {
								answer[cnt++] = tempList.size();
								continue;
							}
								
							int num = binarySearch(tempList,score);
							if(num == -1) {
								answer[cnt++] = tempList.size();
								continue;
							}
							answer[cnt++] = tempList.size()-num-1;
						}
					}
				}
			}
			
		}
		
		
		
		for(int i : answer)
			System.out.println(i);
		
		return null;
	}

	private static int binarySearch(List<Integer> tempList, int score) {
		int start = 0;
		int end = tempList.size()-1;
		
		int index = -1;
		while(start <= end) {
			int mid = (start+end)/2;
			int value = tempList.get(mid);
			if(value < score) {
				start = mid+1;
				index = mid;
			}
			else {
				end = mid-1;
			}
		}
		
		return index;
	}

}
