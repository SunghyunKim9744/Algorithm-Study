package 고득점Kit.해시.베스트앨범;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GY {

	public static void main(String[] args) {
		String[] genres = { "classic", "pop", "classic", "classic", "pop" };
		int[] plays = { 500, 600, 150, 800, 2500 };
		solution(genres, plays);
	}

	// 6:27 ~
	public static int[] solution(String[] genres, int[] plays) {
		int[] answer = {};

		List<Song> album = new LinkedList<>();
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < genres.length; i++) {
			album.add(new Song(i, genres[i], plays[i]));
			map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
		}

		Comparator<Song> comparator = new Comparator<Song>() {

			@Override
			public int compare(Song o1, Song o2) {
				return o2.getNumberOfPlay() - o1.getNumberOfPlay();
			}

		};

		Collections.sort(album, comparator);

		List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, (o1, o2) -> (o2.getValue().compareTo(o1.getValue())));

		String[] genreRank = new String[list.size()];
		for (int i = 0; i < genreRank.length; i++)
			genreRank[i] = list.get(i).getKey();

		List<Integer> albumList = new LinkedList<>();
		for (int i = 0; i < genreRank.length; i++) {
			int num = 0;
			for (int j = 0; j < album.size(); j++) {
				if (album.get(j).getGenre().equals(genreRank[i])) {
					albumList.add(album.get(j).getNumber());
					num++;
				}
				if (num == 2)
					break;
			}
		}

		answer = new int[albumList.size()];
		for (int i = 0; i < albumList.size(); i++)
			answer[i] = albumList.get(i);
		
		return answer;
	}

}

class Song /* implements Comparable<Song> */ {
	private int number;
	private String genre;
	private int numberOfPlay;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getNumberOfPlay() {
		return numberOfPlay;
	}

	public void setNumberOfPlay(int numberOfPlay) {
		this.numberOfPlay = numberOfPlay;
	}

	public Song(int number, String genre, int numberOfPlay) {
		this.number = number;
		this.genre = genre;
		this.numberOfPlay = numberOfPlay;
	}

	@Override
	public String toString() {
		return "Song [number=" + number + ", genre=" + genre + ", numberOfPlay=" + numberOfPlay + "]";
	}

}
