package baekjun;

import java.util.Scanner;
/*
public class Counting_stars {


	public static void main (String[]args) {
		 int num=0;
		Scanner scan = new Scanner(System.in);
		num=scan.nextInt();
		for(int i=0;i<num;i++){
			for(int b=0; b<i; b++)	{
				System.out.print(" ");
			}
			for(int a=num; a>i; a--) {
					System.out.print("*");
			}

			System.out.println(" ");
//각행에 별출력을 끝냈으면 줄바꿈
		}
	}
}
*/


 /*
 *행의 개수만큼 별출력 --
 *1~입력받은 수 -1 만큼 별출력
 */

 public class Counting_stars{
	public void solve(){
	int i,j=0;

	Scanner sc= new Scanner(System.in);
	int num=sc.nextInt();

	for(i=0;i<num;i++){//입력한 수만큼 행 출력

		for(j=0;j<i;j++){//공백먼저 출력
			System.out.print(" ");
		}
		for(int a=num; a>i;a--){
			System.out.print("*");
		}//공백뒤에 별출력
		System.out.println(" ");
		}
	}



	public static void main(String[]args){
	new Counting_stars().solve();
		}
 }
