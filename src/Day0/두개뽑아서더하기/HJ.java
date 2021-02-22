package Day0.두개뽑아서더하기;

import java.util.HashSet;
import java.util.Set;

public class HJ {
	public static void main(String[] args) {
		int[] numbers = { 5, 0, 2, 7 };
		System.out.println(solution(numbers));
	}

	public static int[] solution(int[] numbers) {
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < numbers.length; i++)
			for (int j = 0; j < numbers.length; j++)
				if (i != j)
					set.add(numbers[i] + numbers[j]);

		return set.stream().sorted().mapToInt(i -> i).toArray();
	}
}
