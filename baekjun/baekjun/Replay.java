package baekjun;

import java.util.Scanner;

public class Replay {
	public void solve(){

			Scanner sc = new Scanner(System.in);
			int i,num=0;
			num=sc.nextInt();
			int intArray[]=new int [num];

			int max=0;
			System.out.println("양수"+ num +"를 입력하시오");

			for(i=0;i<num;i++) {
				intArray[i] = sc.nextInt();
				if(max<intArray[i])
					max=intArray[i];
			}
			System.out.println("가장 큰수는 "+ max +"입니다.");
	}
	public static void main(String[]args) {
		new Replay().solve();
	}
}
