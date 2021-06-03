package Level2Day05.스킬트리;

import java.util.LinkedList;
import java.util.Queue;

public class Sh {

	public static void main(String[] args) {
		String skill = "CBD";

		String[] skill_trees = { "BACDE", "CBADF", "AECB", "BDA" };

		int answer = solution(skill, skill_trees);

	}

	private static int solution(String skill, String[] skill_trees) {
		int answer = 0;

		
		for (String s : skill_trees) {
			Queue<String> qu = new LinkedList<>();
			String[] sk = skill.split("");
			boolean bool = true;
			for (String temp : sk)
				qu.offer(temp);
			
			String[] trees = s.split("");
			for (String t : trees) {
				if (skill.contains(t)) {
					if (qu.peek().equals(t)) {
						qu.poll();
						
					}

					else {
						bool = false;
						break;
					}

				}
				if (qu.isEmpty())
					break;
			}
			if (bool)
				answer++;
		}
		return answer;
	}

}
