package 고득점Kit_완전탐색.소수찾기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sh {

	public static void main(String[] args) {
		String numbers = "17";
		
		int answer = solution(numbers);

	}

	// 12:56 ~
	// (2.04ms, 52.8MB) - > (149.65ms, 65MB)
	private static int solution(String numbers) {
		int answer = 0;
		
		String[] strs = numbers.split("");
		
		Arrays.sort(strs);
		
		List<Integer> list = new ArrayList<>();
		
//		String str ="";
//		int idx = -1;
//		int len = 1;
//		list = func(strs,str,idx,len);
		
		String temp ="";
		
//		System.out.println("한 개");
//		// 1개 짜리일 때
//		for(int i=0; i<strs.length; i++) {
//			list.add(Integer.parseInt(strs[i]));
//			System.out.println(strs[i]);
//			for(int j=0; j<strs.length; j++) {
//				if(i != j) {
//					list.add(Integer.parseInt(strs[i]+strs[j]));
//					System.out.println(strs[i]+strs[j]);
//				}
//					
//			}
//			
//		}
		
		
		
		
		for(int i=0; i<strs.length; i++) {
			temp = strs[i];
			list.add(Integer.parseInt(temp));
			for(int j=0; j<strs.length; j++) {
				temp = strs[i];
				if(i != j) {
					temp += strs[j];
					list.add(Integer.parseInt(temp));
					for(int k=0; k<strs.length; k++) {
						temp = strs[i]+strs[j];
						if( j != k && i != k) {
							temp += strs[k];
							list.add(Integer.parseInt(temp));
							for(int l=0; l<strs.length; l++) {
								temp = strs[i]+strs[j]+strs[k];
								if( j != l && i != l && k != l) {
									temp += strs[l];
									list.add(Integer.parseInt(temp));
									for(int m=0; m<strs.length; m++) {
										temp = strs[i]+strs[j]+strs[k]+strs[l];
										if( j != m && i != m && k != m && l != m) {
											temp += strs[m];
											list.add(Integer.parseInt(temp));
											for(int n=0; n<strs.length; n++) {
												temp = strs[i]+strs[j]+strs[k]+strs[l]+strs[m];
												if( j != n && i != n && k != n && l != n && m != n) {
													temp += strs[n];
													list.add(Integer.parseInt(temp));
													for(int o=0; o<strs.length; o++) {
														temp = strs[i]+strs[j]+strs[k]+strs[l]+strs[m]+strs[n];
														if( j != o && i != o && k != o && l != o && m != o && n != o) {
															temp += strs[o];
															list.add(Integer.parseInt(temp));
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
		
			}
				
		}
			
		
		Set<Integer> set = new HashSet<>(list);
			
		for(Integer i : set) {
			int cnt = 0;
			if(i<=1)
				cnt++;
			for(int j=2; j<=Math.sqrt(i); j++) {
				
				if(i%j ==0) {
					cnt++;
					break;
				}
			}
			
			if(cnt == 0)
				answer++;
		}

		return answer;
	}

//	private static List<Integer> func(String[] strs, String str, int idx,int len) {
//		List<Integer> list = new ArrayList<>();
//		
//		if(len != strs.length+1) {
//			for(int i=0; i<strs.length; i++) {
//				if(idx != i) {
//					str = str+strs[i];
//					list.add(Integer.parseInt(str));
//					
//					System.out.println(str);
//					return func(strs,str,i,len+1);
//				}
//			}
//		}
//		else
//			return list;
//		return list;
//		
//		
//	}

}
