package Level2Day03.삼각달팽이;

public class Sh {

	public static void main(String[] args) {
		int n = 4;
		
		int[] answer = solution(n);

	}

	private static int[] solution(int n) {
		int totalCnt = n*(n+1)/2;
        int[] answer = new int[totalCnt];
        
        int[][] arrays = new int[n][];
        for(int i=0; i<n; i++)
            arrays[i] = new int[i+1];
        
        int lastIdx = 0;
        int startIdx = 0;
        
        int currentCnt = n;
        int currentRow = 0;
        
        boolean south = true;
        boolean east = false;
        boolean north = false;
        
        int value = 1;
        while(value <= totalCnt){
            if(south){
                for(int i=0; i<currentCnt; i++){
                    arrays[currentRow][startIdx] = value;
                    currentRow++; 
                    value++;
                    if(i == currentCnt-1){
                        startIdx++;
                        currentRow--;
                        currentCnt--;
                        south = false;
                        east = true;
                    }
                }
            }
            else if(east){
                for(int i=0; i<currentCnt; i++){
                    arrays[currentRow][startIdx+i] = value;
                    value++;
                    if(i == currentCnt-1){
                        currentRow--;
                        currentCnt--;
                        east = false;
                        north = true;
                    }
                }
            }
            else if(north){
                for(int i=0; i<currentCnt; i++){
                    int rowLastIdx = arrays[currentRow].length-1-lastIdx;
                    arrays[currentRow][rowLastIdx] = value;
                    currentRow--;
                    value++;
                    if(i == currentCnt-1){
                        lastIdx++;
                        currentRow += 2;
                        currentCnt--;                    
                        north = false;
                        south = true;
                    }
                }
            }
        }
        
        int idx = 0;
        for(int[] ary : arrays){
            for(int i : ary)
                answer[idx++] = i;
        }
        return answer;
	}

}
