package 고득점Kit.완전탐색.소수찾기;

import java.util.ArrayList;
import java.util.List;

// 2:18 ~
public class Dy {
	public static void main(String[] args) {
		String numbers = "011";
		System.out.println(solution(numbers));
	}

	public static int solution(String numbers) {
		int answer = 0;
		String[] number = numbers.split("");
		int max = 9999999;
		boolean[] sosu = new boolean[max];
		sosu[0] = true;
		sosu[1] = true;
		for (int i = 2; i < 4000; i++) {
			if (!sosu[i]) {
				for (int j = 2; j < max / i; j++) {
					sosu[j * i] = true;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		answer += calculator(number, sb, sosu, 0);
				
		return answer;
	}
	
	public static int calculator(String[] number, StringBuilder sb, boolean[] sosu, int n) {
		int value = 0;
		for(int i=0; i<number.length; i++) {
			if(n == 0 && number[i] == "0") {
				continue;
			}
			
			if((n & (1 << i))==0) {
				sb.append(number[i]);
				n |= (1<<i);
				if(sosu[Integer.parseInt(sb.toString())] == false) {
					sosu[Integer.parseInt(sb.toString())] = true;
	    			value++;
	    		}
				value += calculator(number, sb, sosu, n);
				sb.setLength(sb.length()-1);
				n &= ~(1<<i);
			}
		}
		return value;
	}

//	public static int solution(String numbers) {
//        int answer = 0;
//        String[] number = numbers.split("");
//        int max = 9999999;
//        boolean[] sosu = new boolean[max];
//        sosu[0] = true;
//        sosu[1] = true;
//        for(int i=2; i<3163; i++) {
//        	if(!sosu[i]) {
//        		for(int j=2; j<max/i; j++) {
//        			sosu[j*i] = true;
//        		}
//        	}
//        }
//        for(int i=0; i<number.length; i++) {
//        	StringBuilder sb = new StringBuilder();
//        	if(!number[i].equals("0")) {
//        		sb.append(number[i]);
//        		if(sosu[Integer.parseInt(sb.toString())] == false) {
//        			answer++;
//        		}
//        		if(number.length == 1) {
//        			sb.setLength(0);
//        			continue;
//        		}
//        		for(int j=0; j<number.length; j++) {
//            		if(j==i)
//            			continue;
//            		sb.append(number[j]);
//            		if(sosu[Integer.parseInt(sb.toString())] == false) {
//            			answer++;
//            		}
//            		
//            		if(number.length == 2) {
//            			sb.setLength(0);
//            			continue;
//            		}
//            		for(int k=0; k<number.length; k++) {
//                		if(k==i || k==j)
//                			continue;
//                		sb.append(number[k]);
//                		if(sosu[Integer.parseInt(sb.toString())] == false) {
//                			answer++;
//                		}
//                		
//                		if(number.length == 3) {
//                			sb.setLength(0);
//                			continue;
//                		}
//                		
//                		for(int l=0; l<number.length; l++) {
//                    		if(l==i || l==j || l==k)
//                    			continue;
//                    		sb.append(number[l]);
//                    		if(sosu[Integer.parseInt(sb.toString())] == false) {
//                    			answer++;
//                    		}
//                    		
//                    		if(number.length == 4) {
//                    			sb.setLength(0);
//                    			continue;
//                    		}
//                    		
//                    		for(int m=0; m<number.length; m++) {
//                        		if(m==i || m==j || m==k || m== l)
//                        			continue;
//                        		sb.append(number[m]);
//                        		if(sosu[Integer.parseInt(sb.toString())] == false) {
//                        			answer++;
//                        		}
//                        		
//                        		if(number.length == 5) {
//                        			sb.setLength(0);
//                        			continue;
//                        		}
//                        		
//                        		for(int n=0; n<number.length; n++) {
//                            		if(n==i || n==j || n==k || n==l || n==m)
//                            			continue;
//                            		sb.append(number[n]);
//                            		if(sosu[Integer.parseInt(sb.toString())] == false) {
//                            			answer++;
//                            		}
//                            		
//                            		if(number.length == 6) {
//                            			sb.setLength(0);
//                            			continue;
//                            		}
//                            		
//                            		for(int o=0; o<number.length; o++) {
//                                		if(o==i || o==j || o==k || o==l || o==m|| o==n)
//                                			continue;
//                                		sb.append(number[o]);
//                                		if(sosu[Integer.parseInt(sb.toString())] == false) {
//                                			answer++;
//                                		}
//                                		
//                                		if(number.length == 7) {
//                                			sb.setLength(0);
//                                			continue;
//                                		}
//                                		
//                                	}
//                            	}
//                        		
//                        	}
//                    		
//                    	}
//                		
//                	}
//            		
//            	}
//            	
//        		
//        	}
//        	
//        	
//        }
//        
//        return answer;
//    }

}
