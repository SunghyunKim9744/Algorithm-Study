package Day05.두개뽑아서더하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class GY {

	public static void main(String[] args) {
		int[] nums1 = { 2, 1, 3, 4, 1 };
		int[] nums2 = { 5, 0, 2, 7 };

		solution(nums1);
		System.out.println();
		solution(nums2);
	}

	public static int[] solution(int[] numbers) {
		
		int[] answer = {};
		// 배열을 리스트로 변환
		List<Integer> newNumbers = Arrays.stream(numbers).boxed().collect(Collectors.toList());
		// 중복 제거를 위해 Set 정의, TreeSet은 오름차순으로 자동 정렬해줌
		Set<Integer> set = new TreeSet<>();
		// list에서 다른 인덱스에 있는 값을 더해 set에 담기
		for (int i = 0; i < newNumbers.size(); i++)
			for (int j = 0; j < newNumbers.size(); j++)
				if (i != j)
					set.add(newNumbers.get(i) + newNumbers.get(j));
		// set을 list로 변환
		List<Integer> sumOfNumbers = new ArrayList<>(set);
		// list를 array로 변환
		answer = set.stream().mapToInt(i->i).toArray();

		return answer;
	}
}
