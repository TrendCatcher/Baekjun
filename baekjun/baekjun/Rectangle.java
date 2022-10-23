package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
public class Rectangle {
	public void solve() {
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		while(true) {
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();

			if(a==0 && b==0 && c==0) break;

			if((a*a)+(b*b)==(c*c))
			{
				System.out.println("right");
			}
			else if(a*a == (b*b+c*c)) {
				System.out.println("right");
			}
			else if(b*b == (a*a+c*c)) {
				System.out.println("right");
			}
			else {
			System.out.println("wrong");
			}
		}
	}
	public static void main(String[]args) {
		new Rectangle().solve();

	}
}
*/
/* Ǯ�� 2. bufferedReader ���
 * ******���ǻ���**********
 * 1.readLine()�� ���ϰ��� String������ �����̹Ƿ� �ٸ�Ÿ������ �������� ����ȯ �ʼ�
 * 2. ����ó�� �ʼ�, readLine()�� ������ try&catch �Ǵ� throwsIOException�� ���� �۾�
 * 3. StringTOkenizer�� nextToken()�Լ��� ���� readLine()�� ���� �Է¹��� ���� ��������� �����Ͽ� ������� ȣ�� ����
 **/
 public class Rectangle{
 	public void solve() throws IOException{
 		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));


 		while(true){
 			StringTokenizer st = new StringTokenizer(br.readLine()," ");

 			int a = Integer.parseInt(st.nextToken());
 			int b = Integer.parseInt(st.nextToken());
 			int c = Integer.parseInt(st.nextToken());

 			if(a==0 && b==0 && c==0) break;

 			if((a*a)+(b*b)==(c*c))
 			{
 				System.out.println("right");
 			}
 			else if(a*a == (b*b+c*c)) {
 				System.out.println("right");
 			}
 			else if(b*b == (a*a+c*c)) {
 				System.out.println("right");
 			}
 			else {
 				System.out.println("wrong");
 			}
 		}
 	}
 	public  static void main(String[]args) throws IOException{
 		new Rectangle().solve();
 	}
 }


