package KaKaO2019신입.실패율;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Dy {

	public static void main(String[] args) {
		int n = 5;
		int[] n2 = {2, 1, 2, 2, 4, 3, 3};
		for(int key: solution(n,n2)) {
			System.out.println(key);
		}
		

	}

//	public static int[] solution(int N, int[] stages) {
//        int[] answer = new int[N];
//        Map<Integer, Integer> map1 = new HashMap<>();
//        Map<Integer, Double> map2 = new HashMap<>();
//        for(int i=0; i<N+1; i++) {
//        	map1.put(i,0);
//        }
//        
//        for(int key: stages) {
//        	for(int i=0; i<key; i++) {
//        		map1.put(i, map1.getOrDefault(i, 0)+1);
//        	}
//        }
//        for(int i=1; i<N+1; i++) {
//        	map2.put(i, ((map1.get(i-1) - map1.get(i)) / (double) map1.get(i-1)));
//        }
//        
//        List<Entry<Integer, Double>> entryList = new ArrayList<Map.Entry<Integer,Double>>(map2.entrySet());
//		
//		Collections.sort(entryList, new Comparator<Entry<Integer, Double>>() {
//
//			@Override
//			public int compare(Entry<Integer, Double> o1, Entry<Integer, Double> o2) {
//				// TODO Auto-generated method stub
//				return o2.getValue().compareTo(o1.getValue());
//			}
//		});
//		int index = 0;
//		for(Entry<Integer, Double> entry: entryList) {
//			answer[index] = entry.getKey();
//			index++;
//		}
//        return answer;
//    }
	
//	public static int[] solution(int N, int[] stages) {
//        int[] answer = new int[N];
//        List<Integer> list = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//        Integer[] stages2 = Arrays.stream(stages).boxed().toArray(Integer[]::new);
//        Arrays.sort(stages2, Collections.reverseOrder());
//        Map<Integer, Integer> map = new HashMap<>();
//        Map<Integer, Double> map2 = new HashMap<>();
//        
//        int beforeNum = 0;
//        for(int i=0; i<stages2.length-1; i++) {
//        	if(stages2[i] != stages2[i+1] ) {
//        		for(int j=0; j<stages2[i]-stages2[i+1]; j++) {
//	        		map.put(stages2[i]-j, i+1);
//	        		if(beforeNum != 0) {
//	        			map2.put(stages2[i]-j, (i+1-map.get(beforeNum)) / (double)(i+1));
//	        		}
//        		}
//        		beforeNum = stages2[i];
//        	}
//        }
//        
//        System.out.println(map2.get(5));
//        
//        List<Entry<Integer, Double>> entryList = new ArrayList<Map.Entry<Integer,Double>>(map2.entrySet());
//		
//		Collections.sort(entryList, new Comparator<Entry<Integer, Double>>() {
//
//			@Override
//			public int compare(Entry<Integer, Double> o1, Entry<Integer, Double> o2) {
//				// TODO Auto-generated method stub
//				return o2.getValue().compareTo(o1.getValue());
//			}
//		});
//		int index = 0;
//		for(Entry<Integer, Double> entry: entryList) {
//			answer[index] = entry.getKey();
//			index++;
//		}
//        
//        return answer;
//    }
	
	public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Double> map2 = new HashMap<>();
        for(int i=0; i<N+1; i++) {
        	map.put(i, 0);
        	map1.put(i, 0);
        }
        
        for(int key: stages) {
        	map.put(key, map.getOrDefault(key, 0)+1);
        	map1.put(key, map1.getOrDefault(key, 0)+1);
        }
        
        for(int i=1; i<N+1; i++) {
        	map1.put(i, map1.get(i) + map1.get(i-1));
        }
        
        for(int i=1; i<N+1; i++) {
        	if(stages.length-map1.get(i-1) == 0) {
        		map2.put(i, 0.0);
        	}else {
            	map2.put(i, map.get(i) / (double) (stages.length-map1.get(i-1)));
        	}
        }
        
        List<Entry<Integer, Double>> entryList = new ArrayList<Map.Entry<Integer,Double>>(map2.entrySet());
		
		Collections.sort(entryList, new Comparator<Entry<Integer, Double>>() {

			@Override
			public int compare(Entry<Integer, Double> o1, Entry<Integer, Double> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		int index = 0;
		for(Entry<Integer, Double> entry: entryList) {
			answer[index] = entry.getKey();
			index++;
		}
        
        return answer;
    }
}
