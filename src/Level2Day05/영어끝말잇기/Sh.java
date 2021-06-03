package Level2Day05.영어끝말잇기;

import java.util.HashSet;
import java.util.Set;

public class Sh {

	public static void main(String[] args) {
		int n = 5;
		String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};

		int[] answer = solution(n, words);
	}

	private static int[] solution(int n, String[] words) {
		int[] answer = new int[2];

		Set<String> set = new HashSet<>();

		String previous = words[0];
		set.add(words[0]);
		if(previous.length()==1) {
			answer[0] = 1;
			answer[1] = 1;
			return answer;
		}
			
		for (int i = 1; i < words.length; i++) {
			String s = words[i];
			String lastWord = previous.substring(previous.length() - 1);
			String firstWord =  s.substring(0, 1);
			
			set.add(s);

			if (s.length() == 1 || !lastWord.equals(firstWord) || set.size() != i + 1) {
				answer[0] = i % n + 1;
				answer[1] = i / n + 1;
				break;
			}
            previous = s;

		}
		
		System.out.println(answer[0]);

		return answer;
	}

}
