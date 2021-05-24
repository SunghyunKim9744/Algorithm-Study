package KaKaO2021신입.순위검색;

import java.util.ArrayList;
import java.util.List;

public class Dy {

	public static void main(String[] args) {
		String[] a = { "java backend junior pizza 150", "python frontend senior chicken 210",
				"python frontend senior chicken 150", "cpp backend senior pizza 260", "java backend junior chicken 80",
				"python backend senior chicken 50" };
		String[] b = { "java and backend and junior and pizza 100", "python and frontend and senior and chicken 200",
				"cpp and - and senior and pizza 250", "- and backend and senior and - 150",
				"- and - and - and chicken 100", "- and - and - and - 150" };

		solution(a, b);
	}

//	public static int[] solution(String[] info, String[] query) {
//        int[] answer = new int[query.length];
//        String[][] info2 = new String[info.length][5];
//        
//        for(int i=0; i<info.length; i++) {
//        	info2[i] = info[i].split(" ");
//        }
//        
//        for(int j=0; j<query.length; j++) {
//        	List<Integer> list = new LinkedList<>();
//        	int index = 0;
//        	String[] temp0 = query[j].split(" ");
//        	int point = Integer.parseInt(temp0[temp0.length-1]);
//        	String[] temp = new String[4];
//        	for(int i=0; i<4; i++) {
//        		temp[i] = temp0[i*2];
//            }
//        	if(temp[0].equals("-")) {
//        		for(int i=0; i<info.length; i++) {
//            		if(Integer.parseInt(info2[i][4]) >= point) {
//            			list.add(i);
//            		}
//                }
//    		}else {
//    			for(int i=0; i<info.length; i++) {
//            		if(info2[i][0].equals(temp[0]) && Integer.parseInt(info2[i][4]) >= point) {
//                		list.add(i);
//                	};
//                }
//    		}
//        	
//        	while(index < temp.length-1) {
//        		index++;
//        		if(temp[index].equals("-")) {
//        			continue;
//        		}
//        		List<Integer> tempList = new LinkedList<>();
//        		for(Integer key2: list) {
//        			if(info2[key2][index].equals(temp[index])) {
//                		tempList.add(key2);
//                	};
//            	}
//        		list = tempList;
//        	}
//        	answer[j] = list.size();
//        }
//        
//        return answer;
//    }
	public static int[] solution(String[] info, String[] query) {
		int[] answer = new int[query.length];

		List<List<Integer>> list = new ArrayList<>();
		for(int i=0; i<108; i++) {
			List<Integer> tempList = new ArrayList<>();
			list.add(tempList);
		}
		
		
		for (int i = 0; i < info.length; i++) {
			int num1 = 0;
			int num2 = 0;
			int num3 = 0;
			int num4 = 0;
			String[] temp = info[i].split(" ");
			if(temp[0].equals("java")) {
				num1 = 1;
			}else if(temp[0].equals("python")) {
				num1 = 2;
			}
			
			if(temp[1].equals("frontend")) {
				num2 = 1;
			}
			
			if(temp[2].equals("senior")) {
				num3 = 1;
			}
			
			if(temp[3].equals("pizza")) {
				num4 = 1;
			}
			
			list.get(num1*27+num2*9+num3*3+num4).add(Integer.parseInt(temp[4]));
			list.get(3*27+num2*9+num3*3+num4).add(Integer.parseInt(temp[4]));
			list.get(num1*27+2*9+num3*3+num4).add(Integer.parseInt(temp[4]));
			list.get(num1*27+num2*9+2*3+num4).add(Integer.parseInt(temp[4]));
			list.get(num1*27+num2*9+num3*3+2).add(Integer.parseInt(temp[4]));
			list.get(3*27+2*9+num3*3+num4).add(Integer.parseInt(temp[4]));
			list.get(3*27+num2*9+2*3+num4).add(Integer.parseInt(temp[4]));
			list.get(3*27+num2*9+num3*3+2).add(Integer.parseInt(temp[4]));
			list.get(num1*27+2*9+2*3+num4).add(Integer.parseInt(temp[4]));
			list.get(num1*27+2*9+num3*3+2).add(Integer.parseInt(temp[4]));
			list.get(num1*27+num2*9+2*3+2).add(Integer.parseInt(temp[4]));
			list.get(3*27+2*9+2*3+num4).add(Integer.parseInt(temp[4]));
			list.get(3*27+2*9+num3*3+2).add(Integer.parseInt(temp[4]));
			list.get(3*27+num2*9+2*3+2).add(Integer.parseInt(temp[4]));
			list.get(num1*27+2*9+2*3+2).add(Integer.parseInt(temp[4]));
			list.get(3*27+2*9+2*3+2).add(Integer.parseInt(temp[4]));
		}
		
		for(int i=0; i<query.length; i++) {
			String[] temp = query[i].split(" ");
			int num1 = 0;
			int num2 = 0;
			int num3 = 0;
			int num4 = 0;
			if(temp[0].equals("java")) {
				num1 = 1;
			}else if(temp[0].equals("python")) {
				num1 = 2;
			}else if(temp[0].equals("-")) {
				num1 = 3;
			}
			
			if(temp[2].equals("frontend")) {
				num2 = 1;
			}else if(temp[2].equals("-")) {
				num2 = 2;
			}
			
			if(temp[4].equals("senior")) {
				num3 = 1;
			}else if(temp[4].equals("-")) {
				num3 = 2;
			}
			
			if(temp[6].equals("pizza")) {
				num4 = 1;
			}else if(temp[6].equals("-")) {
				num4 = 2;
			}
			int number = Integer.parseInt(temp[7]);
			for(Integer key: list.get(num1*27+num2*9+num3*3+num4)) {
				if(key >= number) {
					answer[i]++;
				}
			}
		}
		return answer;
	}

}
