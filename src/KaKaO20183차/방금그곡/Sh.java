package KaKaO20183차.방금그곡;

public class Sh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String solution(String m, String[] musicinfos) {
        String answer = "";
        
        int maxTime = 0;
        m = change(m);
        for(String str : musicinfos){
            String[] temp = str.split(",");
            String[] startTime = temp[0].split(":");
            String[] endTime = temp[1].split(":");
            int playTime = Integer.parseInt(endTime[0])*60 +Integer.parseInt(endTime[1]) -
                            Integer.parseInt(startTime[0])*60 +Integer.parseInt(startTime[1]);
            String title = temp[2];
            String music = change(temp[3]);
            StringBuilder strb = new StringBuilder();
            int loop = music.length();
            for(int i=0; i<playTime; i++){
                int index = i % loop;
                strb.append(music.substring(index,index+1));
            }
            String fullMusic = strb.toString();
            if(maxTime < playTime && fullMusic.contains(m)){
                answer = title;
                maxTime = playTime;
            }
        }
        
        
        
        return answer;
    }
    
    public String change(String s){
        s = s.replaceAll("C#","0");
        s = s.replaceAll("D#","1");
        s = s.replaceAll("F#","2");
        s = s.replaceAll("G#","3");
        s = s.replaceAll("A#","4");
        
        return s;
    }

}
