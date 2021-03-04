package 자료구조.완전탐색;

import java.util.ArrayList;
import java.util.List;

public class PermutationAndCombination {

	public static void main(String[] args) {

		String[] arr = { "a", "b", "c" };

		List<String> list = new ArrayList<>();
		String[] temp = new String[arr.length];
		boolean[] checked = new boolean[arr.length];
		int depth = 0;

		System.out.println("============ 순열 ==============");
		for (int i = 0; i < arr.length; i++)
			per(arr, temp, checked, depth, i + 1, list);

		for (String s : list)
			System.out.println(s);

		list.clear();

		System.out.println("==========  중복 순열 ============");
		for (int i = 0; i < arr.length; i++)
			per2(arr, temp, depth, i + 1, list);

		for (String s : list)
			System.out.println(s);

		list.clear();

		System.out.println("========= 조합 =============");
		int start = 0;
		for (int i = 0; i < arr.length; i++)
			comb(arr, temp, start, depth, i + 1, list);

		for (String s : list)
			System.out.println(s);
		
		list.clear();
		
		System.out.println("========= 중복 조합 =============");
		int start2 = 1;
		for (int i = 0; i < arr.length; i++)
			comb2(arr, temp,start2, depth, i + 1, list);

		for (String s : list)
			System.out.println(s);
		
		
		System.out.println("============== 원소개수마다의 리스트 ==========");
		System.out.println("============ 순열 ==============");
		List<List<String>> lists = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			List<String> tempList = new ArrayList<>();
			per(arr, temp, checked, depth, i + 1, tempList);
			lists.add(tempList);
		}
			

		for (List<String> s : lists)
			System.out.println(s);

		lists.clear();

		System.out.println("==========  중복 순열 ============");
		for (int i = 0; i < arr.length; i++) {
			List<String> tempList = new ArrayList<>();
			per2(arr, temp, depth, i + 1, tempList);
			lists.add(tempList);
		}
			

		for (List<String> s : lists)
			System.out.println(s);

		lists.clear();

		System.out.println("========= 조합 =============");
		int start3 = 0;
		for (int i = 0; i < arr.length; i++) {
			List<String> tempList = new ArrayList<>();
			comb(arr, temp, start3, depth, i + 1, tempList);
			lists.add(tempList);
		}
			

		for (List<String> s : lists)
			System.out.println(s);
		
		lists.clear();
		
		System.out.println("========= 중복 조합 =============");
		int start4 = 1;
		for (int i = 0; i < arr.length; i++) {
			List<String> tempList = new ArrayList<>();
			comb2(arr, temp,start4, depth, i + 1, tempList);
			lists.add(tempList);
		}
			

		for (List<String> s : lists)
			System.out.println(s);

	}

	private static void comb2(String[] arr, String[] temp,int start, int depth, int r, List<String> list) {
		if(depth == r) {
			StringBuilder str = new StringBuilder();
			for(int i=0; i<r; i++)
				str.append(temp[i]);
			list.add(str.toString());
			return;
		}
		
		for(int i=start-1; i<arr.length; i++) {
			temp[depth] = arr[i];
			comb2(arr, temp, i+1, depth+1, r, list);
		}
		
	}

	private static void comb(String[] arr, String[] temp, int start, int depth, int r, List<String> list) {
		if (depth == r) {
			StringBuilder str = new StringBuilder();
			for (int i = 0; i < r; i++)
				str.append(temp[i]);

			list.add(str.toString());
			return;
		}

		for (int i = start; i < arr.length; i++) {
			temp[depth] = arr[i];
			comb(arr, temp, i + 1, depth + 1, r, list);
		}

	}

	private static void per2(String[] arr, String[] temp, int depth, int r, List<String> list) {
		if (depth == r) {
			StringBuilder str = new StringBuilder();
			for (int i = 0; i < r; i++)
				str.append(temp[i]);

			list.add(str.toString());
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			temp[depth] = arr[i];
			per2(arr, temp, depth + 1, r, list);
		}

	}

	private static void per(String[] arr, String[] temp, boolean[] checked, int depth, int r, List<String> list) {

		if (depth == r) {
			StringBuilder str = new StringBuilder();
			for (int i = 0; i < r; i++)
				str.append(temp[i]);
			list.add(str.toString());
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			if (!checked[i]) {
				checked[i] = true;
				temp[depth] = arr[i];
				per(arr, temp, checked, depth + 1, r, list);
				checked[i] = false;
			}
		}

	}

}
