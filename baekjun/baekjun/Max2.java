package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Max2 {
	public void solve() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] arr = new int[st.countTokens()];// 배열선언과 크기할당 int [] arr= new int[n]

		for(int i=0; i<arr.length;i++ ) {

			arr[i]= Integer.parseInt(st.nextToken());
		}


	Arrays.sort(arr);
	System.out.println(arr[1]);
	br.close();
	}
	public static void main(String[] args) throws NumberFormatException, IOException {

		new Max2().solve();
	}
}
