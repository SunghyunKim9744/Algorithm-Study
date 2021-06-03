package Level2Day05.스킬트리;

public class Dy {

	public static void main(String[] args) {
		
		String s = "CBD";
		String[] t = {"BACDE", "CBADF", "AECB", "BDA"};
		System.out.println(solution(s,t));

	}

	private static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        String[] s = skill.split("");
        for(String key: skill_trees) {
        	int index = -2;
        	boolean noWord = false;
        	for(String key2: s) {
        		int i = key.indexOf(key2);
        		
        		if(noWord && i != -1) {
        			index = -1;
        			break;
        		}
        		
        		if(i == -1) {
        			noWord = true;
        			continue;
        		}
        		
        		if(index > i) {
        			index = -1;
        			break;
        		}else {
        			index = i;
        		}
        	}
        	if(index != -1) {
        		answer++;
        	}
        }
        
        return answer;
    }

}
