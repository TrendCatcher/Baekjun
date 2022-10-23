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
/* 풀이 2. bufferedReader 사용
 * ******주의사항**********
 * 1.readLine()시 리턴값은 String형으로 고정이므로 다른타입으로 받으려면 형변환 필수
 * 2. 예외처리 필수, readLine()할 때마다 try&catch 또는 throwsIOException을 통해 작업
 * 3. StringTOkenizer에 nextToken()함수를 쓰면 readLine()을 통해 입력받은 값을 공백단위로 구분하여 순서대로 호출 가능
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


