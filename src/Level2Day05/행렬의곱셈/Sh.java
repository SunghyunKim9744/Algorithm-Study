package Level2Day05.행렬의곱셈;

public class Sh {

	public static void main(String[] args) {
		int[][] arr1 = {{}};
		
		int[][] arr2 = {{}};
		
		int[][] answer = solution(arr1,arr2);

	}

	private static int[][] solution(int[][] arr1, int[][] arr2) {
int[][] answer = new int[arr1.length][arr2[0].length];
        
        for(int i=0; i<answer.length; i++){
            
            for(int j=0; j<answer[i].length; j++){
                
                int value = 0;
                
                for(int k=0; k<arr2.length; k++){
                    value += arr1[i][k]*arr2[k][j];
                }
                answer[i][j] = value;
            
            }
        }
        return answer;
	}

}
