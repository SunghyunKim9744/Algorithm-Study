# 정리 노트

## 목차
1. 알고리즘
	* 정렬
	* 그리디
	
2. 함수/문법
	* String
	* Arrays
	* Collections
	* Comparable & Comparator
	* 정규 표현식
	
3. 그 외

## 알고리즘

### 정렬
* 선택정렬
	* 교체할 자리는 이미 고정
	* 최소값 설정
	* 값 비교하며 최소값 있는 인덱스 저장
	* 고정된 인덱스 값과 최소값 인덱스 값을 외부 for문에서 변경
	* 교환 시간 복잡도 :O(n)
	* 비교 시간 복잡도 : O(n^2)
```
for (int i = 0; i < arr.length - 1; i++) {
	int min = i;
	for (int j = i + 1; j < arr.length; j++) {
		// 오름차순 : 1, 2, 3, ...
		if(arr[j] < arr[min])
			min = j;	
	}
	int temp = arr[i];
	arr[i] = arr[min];
	arr[min] = temp;
}
```
* 버블정렬
	* 나랑 바로 옆에 애랑 비교해서 정렬하는 것
	* n개 정렬 시 n-1, n-2, ..., 1번 비교
	* 시간 복잡도 : O(n^2)
```
for(int i=0; i < arr.length - 1; i++)
	for(int j=0; j < arr.length - 1 - i; j++) {
		// 오름차순 : 1, 2, 3, ...
		if(arr[j] > arr[j+1]) {
			int temp = arr[j];
			arr[j] = arr[j+1];
			arr[j+1] = temp;
		}
	}
```
* 삽입정렬
```
```
* 퀵정렬
```
```
* 병합정렬
```
```

### 그리디

## 함수/문법
### String
* char 배열 생성
```
char[] arr = str.toCharArr();
String[] arr = str.split("");	// Not char array, But 문자열 쪼개어 String형 문자 배열 생성
```
* char 배열 -> String
```
String str = String.valueOf(charArr);

String[] strArr = str.split("");
StringBuilder sb = new StringBuilder();
for(String s : strArr)
	sb.append(s);
```
* String Builder
	* append
	* insert
* String, String Builder, String Buffer
* string 합치기
```
String str = "str1" + "str2" + "str3";
String str = String.join(" ", strArr);
```

### Arrays
* 리스트 생성
```
Arrays.asList(objArr);	// 기본형 배열은 안됨. 객체형 배열만 가능 => String, Date, ...

// 기본형 배열 => 리스트
int[] arr = {1, 2, 3, 4, 5};

List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
List<Integer> list2 = IntStream.of(arr).boxed().collect(Collectors.toList());
```
* 정렬
```
Arrays.sort(arr, compare);
```
* 복사
```
Arrays.copyOfRange(array, from, to);
```
* List를 int형 배열로 변환
```
int[] arr = list.stream().mapToInt(i -> i).toArray()
```
* 배열 생성과 초기화 동시
```
int[] arr = new int[] {-1};
```

### Collection

### Comparable & Comparator
#### Comparable : this.compareTo(Object another)
* 클래스 내부에 구현
* 파라미터 1개
* 객체 정렬하는 기본 기준을 제공

#### Comparator : compare(Object o1, Object o2)
* 클래스 외부에서 Collections.sort(item, new Comparator<>(){})나 Arrays.sort(item, new Comparator<>(){})로 구현
* 파라미터 2개
* 사용자 설정 기준

### 정규표현식(Regular Expression)
| 표현		|	뜻		| 예시		|   결과				|
| ---------	| ---------	| ---------	| -----------------	|
| ?			| 0...1		| ab?c		| ac, abc			|
| *			| 0...n		| ab*c		| ac, abc, abbbbbbc	|
| {n}		| 정확히 n개	| a{2}b		| aab				|
| {min, }	| min...n	| a{2,}b		| aab, aaaaaaab		|
| {min, max}	| min...max	| a{2,4}b	| aab, aaab, aaaab	|
| []			| 1			| [abc]		| a,b,c				|
| -			| 연속		| [a-z]		| a,b,...,y,z		|
| \d			| =[0-9]		| [0-9]		| 1,2,3,...,9,0		|

## 그 외
1. 온라인 코딩 테스트 시 검색 가능
	상황따라 달라지니 확인 필수
2. 효율성 : 1초 = 1억개(100,000,000)

