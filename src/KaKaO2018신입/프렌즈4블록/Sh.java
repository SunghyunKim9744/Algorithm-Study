package KaKaO2018신입.프렌즈4블록;

import java.util.ArrayList;
import java.util.List;

public class Sh {

	public static void main(String[] args) {
		int m = 2;
		int n = 2;
		String[] board = {"TT","TT" };

		int answer = solution(m, n, board);
		System.out.println(answer);

	}

//	private static int solution(int m, int n, String[] board) {
//		int answer = 0;
//		List<List<String>> list = new ArrayList<>();
//		for (int i = 0; i < n; i++) {
//			List<String> tempList = new ArrayList<>();
//			for (int j = m-1; j >=0; j--) {
//				String temp = board[j].substring(i, i + 1);
//				tempList.add(temp);
//			}
//			System.out.println(tempList);
//			list.add(tempList);
//
//		}
//
//		while (true) {
//			List<String> removeTemp = new ArrayList<>();
//			List<String> temp = new ArrayList<>();
//
//			int[] remove = new int[n];
//			for (int i = 0; i < list.size() - 1; i++) {
//
//				for (int j = 0; j < list.get(i).size() - 1; j++) {
//					if(list.get(i).size()<=j+1 || list.get(i+1).size()<=j+1)
//						continue;
//				
//					String current = list.get(i).get(j);
//					String right = list.get(i + 1).get(j);
//					String bot = list.get(i).get(j + 1);
//					String rb = list.get(i + 1).get(j + 1);
//
//					if (current.equals(right) && current.equals(bot) && current.equals(rb)) {
//						String cur = i + "" + j;
//						String r = (i + 1) + "" + j;
//						String b = i + "" + (j + 1);
//						String rb2 = (i + 1) + "" + (j + 1);
//
//						if (!temp.contains(cur)) {
//							temp.add(cur);
//							cur = i + "" + (j - remove[i]);
//							removeTemp.add(cur);
//							remove[i]++;
//						}
//						if (!temp.contains(r)) {
//							temp.add(r);
//							r = (i + 1) + "" + (j - remove[i + 1]);
//							removeTemp.add(r);
//							remove[i + 1]++;
//						}
//						if (!temp.contains(b)) {
//							temp.add(b);
//							b = i + "" + ((j + 1) - remove[i]);
//							removeTemp.add(b);
//							remove[i]++;
//						}
//						if (!temp.contains(rb2)) {
//							temp.add(rb2);
//							rb2 = (i + 1) + "" + ((j + 1) - remove[i + 1]);
//							removeTemp.add(rb2);
//							remove[i + 1]++;
//						}
//					}
//				}
//
//			}
//			
//			if(removeTemp.size() == 0)
//				return answer;
//			System.out.println(removeTemp);
//			for(String s : removeTemp) {
//				int line = Integer.parseInt(s.substring(0,1));
//				List<String> lineList = list.get(line);
//				int row = Integer.parseInt(s.substring(1,2));
//				lineList.remove(row);
//				answer++;
//				
//			}
//			System.out.println(list);
//		}
//
//		
//	}
	
	private static int solution(int m, int n, String[] board) {
		int answer = 0;
		List<List<String>> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			List<String> tempList = new ArrayList<>();
			for (int j = m-1; j >=0; j--) {
				String temp = board[j].substring(i, i + 1);
				tempList.add(temp);
			}
			System.out.println(tempList);
			list.add(tempList);

		}

		while (true) {
			List<String> removeTemp = new ArrayList<>();
			List<String> temp = new ArrayList<>();

			int[] remove = new int[n];
			for(int i=0; i<m-1; i++) {
				for(int j=0; j<n-1; j++) {
					if(list.get(j).size() <= i+1 || list.get(j+1).size() <= i+1)
						continue;
					String current = list.get(j).get(i);
					String right = list.get(j + 1).get(i);
					String top = list.get(j).get(i + 1);
					String rt = list.get(j + 1).get(i + 1);
					if (current.equals(right) && current.equals(top) && current.equals(rt)) {
						String cur = j + "" + i;
						String r = (j + 1) + "" + i;
						String t = j + "" + (i + 1);
						String rt2 = (j + 1) + "" + (i + 1);

						if (!temp.contains(cur)) {
							temp.add(cur);
							cur = j + "" + (i - remove[j]);
							removeTemp.add(cur);
							remove[j]++;
						}
						if (!temp.contains(r)) {
							temp.add(r);
							r = (j + 1) + "" + (i - remove[j + 1]);
							removeTemp.add(r);
							remove[j + 1]++;
						}
						if (!temp.contains(t)) {
							temp.add(t);
							t = j + "" + ((i + 1) - remove[j]);
							removeTemp.add(t);
							remove[j]++;
						}
						if (!temp.contains(rt2)) {
							temp.add(rt2);
							rt2 = (j + 1) + "" + ((i + 1) - remove[j + 1]);
							removeTemp.add(rt2);
							remove[j + 1]++;
						}
					}
				}
			}
			if(removeTemp.size() == 0)
				return answer;
			System.out.println(removeTemp);
			for(String s : removeTemp) {
				int line = Integer.parseInt(s.substring(0,1));
				List<String> lineList = list.get(line);
				int row = Integer.parseInt(s.substring(1,2));
				lineList.remove(row);
				answer++;
				
			}
			System.out.println(list);
		}

		
	}

}
