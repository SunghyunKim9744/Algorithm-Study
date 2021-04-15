package KaKaO20183차.자동완성;

import java.util.HashMap;
import java.util.Map;

public class Dy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int solution(String[] words) {
        int answer = 0;
        Map<String,Integer> map = new HashMap<>();
        for(String key: words){
            for(int i=0; i<key.length(); i++){
                map.put(key.substring(0,i+1), map.getOrDefault(key.substring(0,i+1), 0) + 1);
            }
        }
        
        for(String key: words){
            for(int i=0; i<key.length(); i++){
                if(map.get(key.substring(0,i+1)) == 1 || i == key.length()-1){
                    answer = answer + i + 1;
                    break;
                }
            }
        }
        return answer;
    }
}
