package Level2Day01.단체사진찍기;

import java.util.ArrayList;
import java.util.List;

public class Dy {

	public static void main(String[] args) {

		int n = 2;
		String[] data = {"N~F=0", "R~T>2"};
		solution(n,data);
	}

	public static int solution(int n, String[] data) {
        int answer = 0;
        boolean[] visited = new boolean[8];
        
        String[][] data2 = new String[n][5];
        
        for(int i=0; i<n; i++) {
        	data2[i] = data[i].split("");
        }
        
        String[] character = {"A","C","F","J","M","N","R","T"};
        List<String> list = new ArrayList<>();
        answer = solution2(data2, visited, character, list, 0);
        return answer;
    }

	private static int solution2(String[][] data, boolean[] visited, String[] character, List<String> list, int depth) {
		int answer = 0;
		
		if(depth == 8) {
			answer = 1;

			for(String[] key: data) {
				if(key[3].equals("=")) {
					if(Math.abs(list.indexOf(key[0]) - list.indexOf(key[2])) != Integer.parseInt(key[4])+1) {
						answer = 0;
					}
				}else if(key[3].equals(">")) {
					if(Math.abs(list.indexOf(key[0]) - list.indexOf(key[2])) <= Integer.parseInt(key[4])+1) {
						answer = 0;
					}
				}else if(key[3].equals("<")) {
					if(Math.abs(list.indexOf(key[0]) - list.indexOf(key[2])) >= Integer.parseInt(key[4])+1) {
						answer = 0;
					}
				}
			}
			return answer;
		}
		
		
		for(int i=0; i<8; i++) {
			if(!visited[i]) {
				visited[i] = true;
				list.add(character[i]);
				answer += solution2(data, visited, character, list, depth+1);
				visited[i] = false;
				list.remove(character[i]);
			}
		}
		
		return answer;
		
	}

}
