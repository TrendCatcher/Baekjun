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
//���࿡ ������� �������� �ٹٲ�
		}
	}
}
*/


 /*
 *���� ������ŭ ����� --
 *1~�Է¹��� �� -1 ��ŭ �����
 */

 public class Counting_stars{
	public void solve(){
	int i,j=0;

	Scanner sc= new Scanner(System.in);
	int num=sc.nextInt();

	for(i=0;i<num;i++){//�Է��� ����ŭ �� ���

		for(j=0;j<i;j++){//������� ���
			System.out.print(" ");
		}
		for(int a=num; a>i;a--){
			System.out.print("*");
		}//����ڿ� �����
		System.out.println(" ");
		}
	}



	public static void main(String[]args){
	new Counting_stars().solve();
		}
 }
