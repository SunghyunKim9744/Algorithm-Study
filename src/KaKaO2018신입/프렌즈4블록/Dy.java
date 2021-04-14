package KaKaO2018신입.프렌즈4블록;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Dy {

	public static void main(String[] args) {

		int s1 = 6;
		int s2 = 6;
		String[] s3 = {"AAAAAA", "BBAATB", "BBAATB", "JJJTAA", "JJJTAA", "JJJTAA"};
				
		
		System.out.println(solution(s1,s2,s3));

	}
	private static int solution(int m, int n, String[] board) {
        int answer = 0;
        Set<String> set = new HashSet<>();
        String[][] newBoard = new String[m][n];
        for(int i=0; i<board.length; i++) {
        	newBoard[i] = board[i].split("");
        	
        }
        while(true) {
	        for(int i=0; i<m-1; i++) {
	        	for(int j=0; j<n-1; j++) {
	        		if(!newBoard[i][j].equals("@")) {
		        		if(newBoard[i][j].equals(newBoard[i][j+1]) &&
		        			newBoard[i][j].equals(newBoard[i+1][j]) &&
		        			newBoard[i][j].equals(newBoard[i+1][j+1])) {
		        			
		        			int tempI = i+1;
		        			int tempJ = j+1;
		        			set.add(i+" "+j);
		        			set.add(i+" "+tempJ);
		        			set.add(tempI+" "+j);
		        			set.add(tempI+" "+tempJ);
		        		}
	        		}
	        	}
	        }
	        for(String key: set) {
	        	System.out.println(key);
	        }
	        
	        for(String[] key: newBoard) {
	        	System.out.println(Arrays.toString(key));
	        }
	        System.out.println("------------");
	        if(set.isEmpty())
	        	break;
	        
	        answer += set.size();
	        for(String key: set) {
	        	String[] temp = key.split(" ");
	        	int[] temp2 = {Integer.parseInt(temp[0]), Integer.parseInt(temp[1])};
	        	for(int i = temp2[0]; i>0; i--) {
	        		newBoard[i][temp2[1]] = newBoard[i-1][temp2[1]];
	        	}
	        	newBoard[0][temp2[1]] = "@";
	        }
	        
	        set.clear();
        }
        return answer;
    }

}
