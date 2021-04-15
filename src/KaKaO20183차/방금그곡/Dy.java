package KaKaO20183차.방금그곡;

import java.util.ArrayList;
import java.util.List;

public class Dy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        String[][] musics = new String[musicinfos.length][4]; 
        List<String> list = new ArrayList<>();
        List<Integer> listSize = new ArrayList<>();
        m = m.replaceAll("C#","H");
        m = m.replaceAll("D#","I");
        m = m.replaceAll("F#","J");
        m = m.replaceAll("G#","K");
        m = m.replaceAll("A#","L");
        for(int i=0; i<musicinfos.length; i++){
            musics[i] = musicinfos[i].split(",");
            String[] startTime = musics[i][0].split(":");
            String[] endTime = musics[i][1].split(":");
            int time = (Integer.parseInt(endTime[0]) - Integer.parseInt(startTime[0])) * 60
                        + (Integer.parseInt(endTime[1]) - Integer.parseInt(startTime[1]));
            System.out.println(time);
            StringBuilder sb = new StringBuilder();
            musics[i][3] = musics[i][3].replaceAll("C#","H");
            musics[i][3] = musics[i][3].replaceAll("D#","I");
            musics[i][3] = musics[i][3].replaceAll("F#","J");
            musics[i][3] = musics[i][3].replaceAll("G#","K");
            musics[i][3] = musics[i][3].replaceAll("A#","L");
            int musicLength = musics[i][3].length();
            for(int j=0; j<time/musicLength; j++){
                sb.append(musics[i][3]);
            }
            
            sb.append(musics[i][3].substring(0,time%musicLength));
            
            list.add(sb.toString());
            listSize.add(time);
        }
        int max = 0;
        for(int i=0; i<list.size(); i++){
            if(list.get(i).contains(m) && listSize.get(i) > max){
                max = listSize.get(i);
                answer = musics[i][2];
            }
        }
        
        return answer;
    }
}
