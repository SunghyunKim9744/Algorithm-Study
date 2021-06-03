package Level2Day05.쿼드압축후개수세기;

import java.util.Arrays;

public class Dy {

	public static void main(String[] args) {

		int[][] arr = {{1,1,1,1,1,1,1,1},{0,1,1,1,1,1,1,1},{0,0,0,0,1,1,1,1},{0,1,0,0,1,1,1,1},{0,0,0,0,0,0,1,1},{0,0,0,0,0,0,0,1},{0,0,0,0,1,0,0,1},{0,0,0,0,1,1,1,1}};
		System.out.println(Arrays.toString(solution(arr)));

	}

	private static int[] solution(int[][] arr) {
        int[] answer = new int[2];
        int devide = arr.length;
        while(devide != 1) {
        	int x = 0;
        	int y = 0;
        	while(y != arr.length) {
        		x = 0;
        		while(x != arr.length) {
            		if(arr[x][y] == -1) {
            			x+=devide;
            			continue;
            		}
            		int zero = 0;
            		int one = 0;
            		for(int i=x; i<x+devide; i++) {
                    	for(int j=y; j<y+devide; j++) {
                    		if(arr[i][j] == 0) {
                    			zero++;
                    		}else {
                    			one++;
                    		}
                        }
                    }
            		if(zero == 0) {
            			answer[1]++;
            			for(int i=x; i<x+devide; i++) {
                        	for(int j=y; j<y+devide; j++) {
                        		arr[i][j] = -1;
                            }
                        }
            		}else if(one == 0) {
            			answer[0]++;
            			for(int i=x; i<x+devide; i++) {
                        	for(int j=y; j<y+devide; j++) {
                        		arr[i][j] = -1;
                            }
                        }
            		}
            		x+=devide;
        		}
        		y+=devide;
        	}
        	devide /= 2;
        }
        
        
        return answer;
    }

}
