package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Max_Min2 {
public void solve() throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int n = Integer.parseInt(br.readLine());

	StringTokenizer st = new StringTokenizer(br.readLine()," ");


	int[] arr = new int[n];// 배열선언과 크기할당 int [] arr= new int[n]

	for(int i=0; i<n;i++) {
		arr[i]=Integer.parseInt(st.nextToken());
	}
}

public static void main(String []args) {

}
}
/*
 *
 * String substring(int beginIndex, int endIndex)
 * >> 시작인덱스에서 끝 인덱스-1까지를 리턴
 *
*/
