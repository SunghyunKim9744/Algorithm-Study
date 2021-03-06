package 자료구조.투포인터;

public class GY_반대진행방향 {

//	N개의 정수를 가진 정렬된 배열 A가 있을 때*두 원소의 합이 X인 경우가 있는지*에 대해 확인해 본다면 어떻게 할까?
//
//	투 포인터에서 하나의 포인터는 첫번째 원소를 나타내고 다른 하나는 마지막 원소를 나타낸다두 포인터는 서로를 향한 방향으로 이동하는데 두 포인터가 만나거나 어떤 조건을 만족할 때 까지 이동한다
//
//	1) 두 원소의 합이 x보다 작다면 왼쪽 포인터를 오른쪽으로 이동한다. 정렬된 배열에서 합을 키우기 위해 오른쪽으로 이동시키는 것이다
//
//	2) 만일 두 원소의 합이 x보다 크다면 오른쪽 포인터를 왼쪽으로 이동한다
//
//	3) x를 찾을 때 까지 반복한다

	public static void main(String[] args) {

	}

	private static boolean isPairSum(int[] n, int x) {
		
		int left = 0;
		
		int right = n.length - 1;
		
		while (left < right) {
			if (n[left] + n[right] == x)
				return true;
			else if (n[left] + n[right] > x)
				right--;
			else
				left++;
		}
		
		return false;
	}

}
