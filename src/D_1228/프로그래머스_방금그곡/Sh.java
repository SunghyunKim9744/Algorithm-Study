package D_1228.프로그래머스_방금그곡;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sh {

	static public class Song implements Comparable<Song>{
		int time;
		String title;
		String sound;
		
		public Song(int time, String title, String sound) {
			this.time = time;
			this.title = title;
			this.sound = sound;
		}

		@Override
		public int compareTo(Song o) {
			return o.time - this.time;
		}
	}
	
	public static void main(String[] args) {
		
		String m = "ABC";
		String[] musicinfos = {"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"};
		
		String answer = solution(m,musicinfos);
		System.out.println(answer);

	}

	private static String solution(String m, String[] musicinfos) {
		
		String answer = "";
		Map<String,String> replaceSound = new HashMap<>();
		
		replaceSound.put("C#", "H");
		replaceSound.put("D#", "I");
		replaceSound.put("F#", "J");
		replaceSound.put("G#", "K");
		replaceSound.put("A#", "L");
		
		for(String key : replaceSound.keySet())
			m = m.replace(key, replaceSound.get(key));
		
		
		List<Song> answerList = new ArrayList<>();
	
		for(String music : musicinfos) {
			String[] temp = music.split(",");
			String start = temp[0];
			String end =temp[1];
			int time = playTime(start,end);
			String title = temp[2];
			String song = temp[3];
			for(String key : replaceSound.keySet())
				song = song.replace(key, replaceSound.get(key));
			int repeatCnt = time/song.length();
			String sound = "";
			for(int i=0; i<repeatCnt; i++)
				sound += song;
			int mod = time % song.length();
			if( mod != 0)
				sound += song.substring(0,mod);
		
			if(sound.contains(m))
				answerList.add(new Song(time,title,sound));
		}
		
		if(answerList.isEmpty())
			answer = "(None)";
		else {
			Collections.sort(answerList);
			answer = answerList.get(0).title;
		}
		return answer;
	}

	private static int playTime(String start, String end) {
		String[] starts = start.split(":");
		int startHour = Integer.parseInt(starts[0]);
		int startToMinute = startHour * 60 + Integer.parseInt(starts[1]);
		
		String[] ends = end.split(":");
		int endHour = Integer.parseInt(ends[0]);
		int endToMinute = endHour * 60 + Integer.parseInt(ends[1]);
		return endToMinute-startToMinute;
	}

}
