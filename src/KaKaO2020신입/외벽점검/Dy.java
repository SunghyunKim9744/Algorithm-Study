package KaKaO2020신입.외벽점검;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dy {

	public static void main(String[] args) {
		int n = 200;
		int[] w = {0,100};
		int[] d = {1,1};
		System.out.println(solution(n,w,d));
		

	}
	
	public static int solution(int n, int[] weak, int[] dist) {
        int answer = 0;
        Arrays.sort(dist);
        answer = solution2(n, weak, dist, 0, weak.length);
        
        
        return answer;
    }
	
	public static int solution2(int n, int[] weak, int[] dist, int num, int size) {
        int answer = 1;
        int a = 0;
        int b = dist[num];
        int max = 0;
        while(a != n) {
            int count = 0;
            int[] temp = weak.clone();
            int sizeTemp = size;
        	for(int i=0; i<weak.length; i++) {
        		if(weak[i] != -1) {
	            	if(a<b) {
	    				if(a<=weak[i] && weak[i]<=b) {
	    					count++;
	    					temp[i] = -1;
	    					sizeTemp--;
	    				}
	    			}else {
	    				if(a<=weak[i] || weak[i]<=b) {
	    					count++;
	    					temp[i] = -1;
	    					sizeTemp--;
	    				}
	    			}
        		}
            }
        	
        	if(count >= max) {
        		max = count;
        		if(num < dist.length-1) {
        			answer += solution2(n, temp, dist, ++num, sizeTemp);
        		}
        	}
        	
        	if(sizeTemp == 0) {
        	}
        	
        	a++;
        	b++;
        	if(b == n) {
        		b = 0;
        	}
        }
        
        
        return answer;
    }
	
	
	
	
//	public static int solution(int n, int[] weak, int[] dist) {
//        int answer = 0;
//        Arrays.sort(dist);
//        int size = weak.length;
//        for(int i=0; i<dist.length; i++) {
//        	int a = 0;
//        	int b = dist[dist.length-1-i];
//        	int maxA = 0;
//        	int maxB = dist[dist.length-1-i];
//        	int max = 0;
//        	while(a != n) {
//        		int count = 0;
//        		int distance = 10000;
//        		int distance1 = 10000;
//        		int distance2 = 0;
//        		for(int key: weak) {
//        			if(key != -1) {
//	        			if(a<b) {
//	        				if(a<=key && key<=b) {
//	        					count++;
//	        				}
//	        			}else {
//	        				if(a<=key || key<=b) {
//	        					count++;
//	        				}
//	        			}
//        			}
//        		}
//        		if(count >= max) {
//        			
//        			max = count;
//        			for(int key2: weak) {
//        				if(key2 != -1) {
//	        				if(a<b) {
//		        				if(a>key2 || key2<b) {
//		        					if(distance1 == 10000) {
//		        						distance1 = key2;
//		        					}
//	        						distance2 = key2;
//		        				}
//		        			}else {
//		        				if(a<key2 && key2>b) {
//		        					if(distance1 == 10000) {
//		        						distance1 = key2;
//		        					}
//		        					distance2 = key2;
//		        				}
//		        			}
//        				}
//        			}
//        			if(distance2 > distance1) {
//        				if((distance2-distance1) < distance){
//        					maxA = a;
//                			maxB = b;
//        				}
//        			}else {
//        				if(n-distance2 + distance1 < distance){
//        					maxA = a;
//                			maxB = b;
//        				}
//        			}
//        		}
//        		a++;
//        		b++;
//        		if(b == n) {
//        			b = 0;
//        		}
//        	}
//        	for(int j = 0; j<weak.length; j++) {
//        		if(maxA<maxB) {
//    				if(maxA<=weak[j] && weak[j]<=maxB && weak[j] != -1) {
//    					weak[j] = -1;
//    					size--;
//    				}
//    			}else {
//    				if(maxA<=weak[j] || weak[j]<=maxB && weak[j] != -1) {
//    					weak[j] = -1;
//    					size--;
//    				}
//    			}
//        	}
//        	answer++;
//        	if(size == 0) {
//        		break;
//        	}
//        }
//        
//        
//        return answer;
//    }

}
