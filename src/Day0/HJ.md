# 현지 정리 노트

## 알고리즘

### 정렬
* 선택정렬
	* 교체할 자리는 이미 고정
	* 최소값 설정
	* 값 비교하며 최소값 있는 인덱스 저장
	* 고정된 인덱스 값과 최소값 인덱스 값을 외부 for문에서 변경
	* 교환 시간 복잡도 :O(n)
	* 비교 시간 복잡도 : O(n^2)
	* 버블정렬보다 낫다
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

### Arrays
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

### Collection

## 그 외
1. 온라인 코딩 테스트 시 검색 가능
	상황따라 달라지니 확인 필수
2. 효율성 : 1초 = 1억개(100,000,000)

