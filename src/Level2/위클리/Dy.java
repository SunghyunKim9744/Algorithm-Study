package Level2.위클리;

public class Dy {

	public static void main(String[] args) {
		
		int[][] a = {{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67},{61,57,100,80,65},{24,90,94,75,65}};
		
		System.out.println(solution(a));

	}

	public static String solution(int[][] scores) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<scores.length; i++) {
        	int myPoint = scores[i][i];
        	int min = Integer.MAX_VALUE;
        	int max = 0;
        	int total = 0;
        	for(int j = 0; j<scores[0].length; j++) {
        		if(i != j) {
        			if(scores[j][i] > max) {
        				max = scores[j][i];
        			}
        			if(scores[j][i] < min) {
        				min = scores[j][i];
        			}
        		}
        		total += scores[j][i];
        	}
        	          
        	int average = total / scores.length;
        	if((myPoint < min || myPoint > max ) && (myPoint != max || myPoint != min)) {
        		total -= myPoint;
        		average = total / (scores.length - 1);
        	}
        	switch(average / 10) {
        		case 10:
        		case 9:
        			sb.append("A");
        			break;
        		case 8:
        			sb.append("B");
        			break;
        		case 7:
        			sb.append("C");
        			break;
        		case 6:
        		case 5:
        			sb.append("D");
        			break;
        		default:
        			sb.append("F");
        			break;
        	}
        
        }

        answer = sb.toString();
        
        return answer;
    }
}
