package 자료구조.완전탐색;


/*
 * 
 * 				완전 탐색 (말 그대로 모든 경우를 탐색하는 것)
 * 			이론은 어렵지 않으나 모든 경우를 찾는 알고리즘을 구현하는 것이 어려움
 * 			
 * 			재귀함수가 많이 사용됨.(백트래킹,DFS,비트마스크,스왑)
 * 				순열을 구현하는 방법(재귀)
 * 			1. DFS
 * 			2. SWAP
 * 			3. 비트마스크
 * 			
 * 				대표적 완전 탐색 알고리즘
 * 			순열, 중복 순열, 조합 , 중복 조합
 * 
 * 			String[] strs = {"a","b"};
 * 		
 * 						          순서의 구분  
 * 		순열, 중복 순열         < ============== >   조합, 중복 조합
 * 	    {a,b}, {b,a} 다름					   {a,b},{b,a} 같음
 * 		 위치 0부터 찾는다.						   직전 원소위치+1 부터 찾는다.
 * 						
 * 							  중복의 구분
 *      중복순열, 중복조합 	< ============== >  순열, 조합
 *      {a,a}, {b,b} 가능						{a,a},{b,b} 불가능
 *      원소가 사용됐는지 확인 X					원소가 사용됐는지 확인해야함
 *      
 */
public class Sh {

	public static void main(String[] args) {

		
		String[] arr = {"a","b","c"}; //순열을 만들 배열 
		int n = arr.length; //배열의 길이 
		
		int r = n; // 갯수

		//1. Swap 함수를 이용해 구현  - > 순서대로 출력X
		System.out.println("======== Swap 순열 ============== ");
		per1(arr, 0, n, r);

		System.out.println("=========== DFS 순열 ===================");
		//2. DFS를 이용해 구현 
		boolean[] visited = new boolean[n]; //중복해서 뽑지 않기 위해 방문했는지를 체크하는 배열 
		String[] output = new String[n];
		per2(arr, output, visited, 0, n, r); //r = 3, 3개를 뽑을 것 
		
		System.out.println("============= 비트 마스크 순열 ============");
		//3. 비트 마스크를 이용해 구현
		
		System.out.println("================= DFS 조합(백트래킹) ============");
		for(int i=0; i<r; i++)
			comb1(arr, visited, 0, i+1);
		
	}


	private static void per1(String[] arr, int depth, int n, int r) {
		if(depth == r) {
			String temp ="";
			for(int i=0; i<r; i++)
				temp+=arr[i];
			System.out.println(temp);
			return;
		}

		for(int i=depth; i<n; i++) {
			swap(arr, depth, i);
			per1(arr, depth + 1, n, r);
			swap(arr, depth, i);
		}
		
	}
	
	static void swap(String[] arr, int depth, int i) { //두 배열의 값을 바꾸는 Swap 함수 
		String temp = arr[depth];
		arr[depth] = arr[i];
		arr[i] = temp;
	}
	
	static void per2(String[] arr, String[] output, boolean[] visited, int depth, int n, int r) {
		if(depth == r) {
			String temp ="";
			for(int i=0; i<r; i++)
				temp+=output[i];
			System.out.println(temp);
			return;
		}

		for(int i = 0; i < n; i++) {
			if(visited[i] != true) {
				visited[i] = true;
				output[depth] = arr[i];
				per2(arr, output, visited, depth + 1, n, r);    
				output[depth] = null;
				visited[i] = false;
			}
		}
	}
	
	private static void comb1(String[] arr, boolean[] visited, int start, int r) {
		if(r == 0) {
            String temp = "";
            for(int i=0; i<arr.length; i++) {
            	if(visited[i]==true) {
            		temp+=arr[i];
            	}
            }
            System.out.println(temp);
            return;
        } else {
            for(int i = start; i < arr.length; i++) {
                visited[i] = true;
                comb1(arr, visited, i + 1, r - 1);
                visited[i] = false;
            }
        }
		
	}

}
