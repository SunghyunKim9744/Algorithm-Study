package D_0912.백준_2143_두배열의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 
 * 		https://www.acmicpc.net/problem/2143
 * 
 */

public class Sh {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		int sizeA = Integer.parseInt(br.readLine());
		int[] aryA = new int[sizeA];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < sizeA; i++)
			aryA[i] = Integer.parseInt(st.nextToken());

		int sizeB = Integer.parseInt(br.readLine());
		int[] aryB = new int[sizeB];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < sizeB; i++)
			aryB[i] = Integer.parseInt(st.nextToken());

		int listASize = (sizeA * (sizeA + 1)) / 2;
		int[] listA = new int[listASize];
		int idxACnt = 0;
		for (int i = 0; i < aryA.length; i++) {
			int temp = 0;
			for (int j = i; j < aryA.length; j++) {
				temp += aryA[j];
				listA[idxACnt++] = temp;
			}
		}

		int listBSize = (sizeB * (sizeB + 1)) / 2;
		int[] listB = new int[listBSize];
		int idxBCnt = 0;
		for (int i = 0; i < aryB.length; i++) {
			int temp = 0;
			for (int j = i; j < aryB.length; j++) {
				temp += aryB[j];
				listB[idxBCnt++] = temp;
			}
		}

		Arrays.sort(listA);
		Arrays.sort(listB);

		long answer = 0;

	
		for (int idxA : listA) {
			int modNum = T - idxA;
			int startIdx = binarySeacrchStart(listB, modNum);
			if(startIdx == -1)
				continue;
			int endIdx = binarySeacrchLast(modNum,listB);
			if(endIdx == -1)
				continue;
			
			answer += endIdx - startIdx+1;
			
		}
		
//		2번쨰

//		int[][] listA = new int[sizeA][];
//		for(int i=0; i<aryA.length; i++) {
//			listA[i] = new int[sizeA-i];
//			int idx = 0;
//			int temp = 0;
//			for(int j=i; j<aryA.length; j++) {
//				temp+= aryA[j];
//				listA[i][idx++] = temp;
//			}
//		}
//		
//		int[][] listB = new int[sizeB][];
//		for(int i=0; i<aryB.length; i++) {
//			listB[i] = new int[sizeB-i];
//			int idx = 0;
//			int temp = 0;
//			for(int j=i; j<aryB.length; j++) {
//				temp+= aryB[j];
//				listB[i][idx++] = temp;
//			}
//		}
//		
//		for(int[] list : listA)
//			Arrays.sort(list);
//		
//		for(int[] list : listB)
//			Arrays.sort(list);
//		
//		int answer = 0;
//		
//		for(int[] idxAList : listA) {
//			for(int idxA : idxAList) {
//				for(int[] idxBList : listB) {
//					for(int idxB : idxBList) {
//						if(idxA+idxB == T)
//							answer++;
//						else if(idxA+idxB > T)
//							break;
//					}
//				}
//			}
//		}

		// 1번째
//		List<List<Integer>> listA = new ArrayList<>();
//		
//		for(int i=0; i<aryA.length; i++) {
//			listA.add(new ArrayList<>());
//			List<Integer> current = listA.get(i);
//			int temp = 0;
//			for(int j=i; j<aryA.length; j++) {
//				temp+= aryA[j];
//				current.add(temp);
//			}
//		}
//		
//		List<List<Integer>> listB = new ArrayList<>();
//		for(int i=0; i<aryB.length; i++) {
//			listB.add(new ArrayList<>());
//			List<Integer> current = listB.get(i);
//			int temp = 0;
//			for(int j=i; j<aryB.length; j++) {
//				temp+= aryB[j];
//				current.add(temp);
//			}
//		}
//		
//		for(List<Integer> list : listA)
//			Collections.sort(list);
//		
//		for(List<Integer> list : listB)
//			Collections.sort(list);
//		
//		int answer = 0;
//		
//		for(List<Integer> idxAList : listA) {
//			for(int idxA : idxAList) {
//				for(List<Integer> idxBList : listB) {
//					for(int idxB : idxBList) {
//						if(idxA+idxB == T)
//							answer++;
//						else if(idxA+idxB > T)
//							break;
//					}
//				}
//			}
//		}

		System.out.println(answer);
	}

	private static int binarySeacrchStart(int[] listB, int modNum) {
		int start = 0;
		int end = listB.length-1;
		
		int endIdx = -1;
		
		
		while(start <= end) {
			int mid = (start+end)/2;
			
			if(listB[mid] >= modNum) {
				end = mid-1;
				endIdx = mid;
			}
			else {
				start = mid+1;
				
			}
		}
		
		return endIdx;
	}

	private static int binarySeacrchLast(int modNum, int[] listB) {
		
		int start = 0;
		int end = listB.length-1;
		
		int endIdx = -1;
		
		while(start <= end) {
			int mid = (start+end)/2;
			
			if(listB[mid] > modNum) {
				end = mid-1;
			}
			else {
				start = mid+1;
				endIdx = mid;
			}
			
		}
		return endIdx;
	}

}
