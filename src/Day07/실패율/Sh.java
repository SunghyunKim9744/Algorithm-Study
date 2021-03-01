package Day07.실패율;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Sh {

	public static void main(String[] args) {
		
		int N = 5;
		int[] stages = {2,1,2,4,2,4,3,3};
		
		int[] answer = solution(N,stages);

	}
	
	// 7:06 ~ 7:36
	// (0.01ms, 52.3MB) - > (307.28ms, 61.6MB)
//	private static int[] solution(int N, int[] stages) {
//		int[] answer = null;
//
//		answer = new int[N];
//		
//		double[] fail = new double[N];
//		
//		for(int i=0; i<N; i++) {
//			int failCnt = 0;
//			int totalCnt = 0;
//			for(int j=0; j<stages.length; j++) {
//				if( stages[j] == i+1) {
//					failCnt++;
//					totalCnt++;
//				}
//				else if(stages[j] > i+1)
//					totalCnt++;
//			}
//				
//			
//			fail[i] = (double)failCnt / totalCnt;
//		}
//		
//		int[] index = new int[N];
//		for(int i=0; i<N; i++) 
//			index[i] = i;
//
//		for(int i=0; i<fail.length-1; i++) {
//			
//			for(int j=0; j<fail.length-i-1; j++) {
//				if(fail[j] < fail[j+1]) {
//					double temp = fail[j];
//					fail[j] = fail[j+1];
//					fail[j+1] = temp;
//					
//					int tem = index[j];
//					index[j] = index[j+1];
//					index[j+1] = tem;
//				}
//			}
//			
//		}
//		
//		for(int i=0; i<answer.length; i++)
//			answer[i] = index[i]+1;
//		return answer;
//	}
	
	
	// (0.50ms, 52.6MB) - > (470.21ms, 62MB)
//	private static int[] solution(int N, int[] stages) {
//		int[] answer = null;
//
//		answer = new int[N];
//		Map<Integer,Double> map = new HashMap<>();
//		
//		for(int i=0; i<N; i++) {
//			int failCnt = 0;
//			int totalCnt = 0;
//			double fail = 0;
//			for(int j=0; j<stages.length; j++) {
//				if( stages[j] == i+1) {
//					failCnt++;
//					totalCnt++;
//				}
//				else if(stages[j] > i+1)
//					totalCnt++;
//			}
//				
//			
//			fail = (double)failCnt / totalCnt;
//			if(totalCnt == 0)
//				fail = 0;
//			map.put(i+1,fail);
//		}
//		List<Entry<Integer,Double>> list = new ArrayList<>(map.entrySet());
//		
//		list.sort((m1,m2)->{
//			return m2.getValue().compareTo(m1.getValue());
//		});
////		list.sort(new Comparator<Entry<Integer,Double>>() {
////
////			@Override
////			public int compare(Entry<Integer, Double> o1, Entry<Integer, Double> o2) {
////				
////				return o2.getValue().compareTo(o1.getValue());
////			}
////			
////		});
//
//		int index = 0;
//		for(Entry<Integer,Double>  entry: list)
//			answer[index++] = entry.getKey();
//		return answer;
//	}
	
	// (0.01ms, 51.8MB) - > (444.76ms, 61.9MB)
	private static int[] solution(int N, int[] stages) {
		int[] answer = null;

		answer = new int[N];

		double[] fail = new double[N];

		for (int i = 0; i < N; i++) {
			int failCnt = 0;
			int totalCnt = 0;
			for (int j = 0; j < stages.length; j++) {
				if (stages[j] == i + 1) {
					failCnt++;
					totalCnt++;
				} else if (stages[j] > i + 1)
					totalCnt++;
			}

			fail[i] = (double) failCnt / totalCnt;
			if(totalCnt == 0)
				fail[i] = 0;
		}


		for (int i = 0; i < fail.length; i++) {
			int maxIndex = 0;
			double maxValue = fail[0];
			for (int j = 0; j < fail.length; j++) {
				if (maxValue < fail[j]) {
					maxIndex = j;
					maxValue = fail[j];
				}
			}
			
			fail[maxIndex] = -1;
			answer[i] = maxIndex+1;

		}


		return answer;
	}
	
//	public static int[] solution(int N, int[] stages) {
//        int[] answer = new int[N];
//        for(int i=0; i<N; i++)
//            answer[i] = i+1;
//        int temp=0;
//        double temp_ = 0;
//        int[] totalUser = new int[N];
//        int[] failUser = new int[N];
//        double[] failList = new double[N];
//        int total=0;
//        int fail=0;
//        for(int j=0; j<N; j++){
//            for(int i=0; i<stages.length; i++){
//                if(stages[i] >= j+1)
//                    total++;
//                if(stages[i] == j+1)
//                    fail++;
//            } 
//            totalUser[j] = total;
//            failUser[j] = fail;
//            fail = 0;
//            total = 0;
//        }
//        
//        for(int i=0; i<N; i++){
//           failList[i] = (double)failUser[i]/(double)totalUser[i];
//        }
//        for(int j=0; j<N-1; j++){
//            for(int i=j; i<N-1; i++){
//                if(failList[j]<failList[i+1]){
//                    temp = answer[j];
//                    answer[j] = answer[i+1];
//                    answer[i+1] = temp;
//                    temp_ = failList[j];
//                    failList[j] = failList[i+1];
//                    failList[i+1] = temp_;
//                }
//                if(failList[j] == failList[i+1] &&  answer[j] >answer[i+1]){
//                    temp = answer[j];
//                    answer[j] = answer[i+1];
//                    answer[i+1] = temp;
//                    temp_ = failList[j];
//                    failList[j] = failList[i+1];
//                    failList[i+1] = temp_;
//                }
//            }
//        }
//        return answer;
//    }

}
