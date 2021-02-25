package Day05.직사각형별찍기;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class GY {

	public static void main(String[] args) throws IOException {
		// 1. Scanner 사용
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();

//		for (int i = 0; i < b; i++) {
//			for (int j = 0; j < a; j++)
//				System.out.print("*");
//			System.out.println();
//		}

		// 2. BufferedReader 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++)
				bw.write("*");
			bw.newLine();
		}

		bw.flush();
		bw.close();

	}

}
