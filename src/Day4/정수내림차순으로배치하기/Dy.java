package Day4.정수내림차순으로배치하기;

public class Dy {

	public long solution(long n) {
        long answer = 0;
        long[] temp = new long[10];
        int index = 0;
        for(int i=0; i<10; i++) {
        	if(n == 0)
        		break;
        	
        	temp[i] = n % 10;
        	
        	n = n / 10;
        	index++;
        }
        
        long[] nums = new long[index];
        for(int i=0; i<index; i++){
            nums[i] = temp[i];
        }
        
        for(int i = 0; i<index-1; i++){
            for(int j=0; j<index-1-i; j++)
                if(nums[j] < nums[j+1]){
                    long temp2 = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp2;
                }
        }
        
        for(int i=0; i<index; i++) {
        	answer += nums[i];
        	answer = answer * 10;
        }
        
        answer = answer / 10;
        
        return answer;
    }
}
