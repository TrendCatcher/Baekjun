package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Max_Min {
	public void solve() throws NumberFormatException, IOException {
		int [] N =  new int [9];


		int max=0, idx=-1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(int i=0; i<9; i++) {
			N[i]=Integer.parseInt(br.readLine());

		}

		for(int i=0; i<N.length; i++) {
			if(N[i]>max) {
				max=N[i];
				idx=i+1;
			}
		}//최댓값구하기
		System.out.println(max);
		System.out.println(idx);
	}
	public static void main(String[]args) throws IOException  {

		new Max_Min().solve();
	}
}
