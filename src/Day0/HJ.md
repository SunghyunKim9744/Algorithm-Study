# 현지 정리 노트

## 알고리즘

### 정렬
* 선택정렬
```
```
* 버블정렬
	* 나랑 바로 옆에 애랑 비교해서 정렬하는 것
	* n개 정렬 시 n-1, n-2, ..., 1번 비교
	* O(n^2)
```
for(int i=0; i < arr.length; i++)
	for(int j=0; j < arr.length - 1 - j; j++) {
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
* char 배열 생성 : str.toCharArr();

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
list.stream().mapToInt(i -> i).toArray()
```

### Collection

## 그 외
1. 온라인 코딩 테스트 시 검색 가능
	상황따라 달라지니 확인 필수
2. 효율성 : 1초 = 1억개(100,000,000)