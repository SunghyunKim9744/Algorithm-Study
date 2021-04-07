package KaKaO2019WinterIntern.튜플;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Dy {

	public static void main(String[] args) {
		
		String s = "{{20,111},{111}}";
		
		System.out.println(solution(s));

	}

	private static int[] solution(String s) {
        int[] answer = {};
        String[] s2 = s.split("},{");
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for(int i=0; i<s2.length; i++) {
        	String temp = s2[i].replaceAll("[^0-9,]", "");
        	String[] temp2 = temp.split(",");
        	List<Integer> temp3 = new ArrayList<Integer>();
        	for(String key: temp2) {
        		temp3.add(Integer.parseInt(key));
        	}
        	list.add(temp3);
        }
        
        Collections.sort(list, new Comparator<List<Integer>>() {

			@Override
			public int compare(List<Integer> o1, List<Integer> o2) {
				return o1.size()-o2.size();
			}
		});
        List<Integer> ansList = new ArrayList<Integer>();
        for(List<Integer> key : list) {
        	for(Integer key2 : ansList) {
        		if(key.contains((Integer)key2)) {
        			key.remove((Integer)key2);
        		}
        	}
        	ansList.add(key.get(0));
        }
        
        answer = new int[ansList.size()];
        
        for(int i=0; i<ansList.size(); i++) {
        	answer[i] = ansList.get(i);
        }
        
        return answer;
    }

}
