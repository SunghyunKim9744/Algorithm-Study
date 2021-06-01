package Level2Day02.게임맵최단거리;

public class Dy {

	public static void main(String[] args) {
		
		int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		System.out.println(solution(maps));

	}

	private static int solution(int[][] maps) {
        int answer = -1;
        int[][] record = new int[maps.length][maps[0].length];
        
        dfs(maps, record, 0, 0,1);
        if(record[maps.length-1][maps[0].length-1] != 0) {
        	answer = record[maps.length-1][maps[0].length-1];
        }
        
        return answer;
    }

	private static void dfs(int[][] maps, int[][] record, int x, int y, int length) {
		if(maps[x][y] == 1 && (record[x][y] == 0 || record[x][y] > length) ) {
			record[x][y] = length;
			
			if(x+1 < maps.length) {
				dfs(maps, record, x+1, y, length+1);
			}
			
			if(x > 0) {
				dfs(maps, record, x-1, y, length+1);
			}
			
			if(y+1 < maps[0].length) {
				dfs(maps, record, x, y+1, length+1);
			}
			
			if(y > 0) {
				dfs(maps, record, x, y-1, length+1);
			}
		}
	}

}
