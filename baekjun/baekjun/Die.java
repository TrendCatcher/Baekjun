package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Die {
	public void solve() throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());

		int a= Integer.parseInt(st.nextToken());
		int b= Integer.parseInt(st.nextToken());
		int c= Integer.parseInt(st.nextToken());

		int max=a;

		if(a==b&&b==c) {
			System.out.println(10000+a*1000);
		}
		else if (a!=b&&b!=c&&a!=c) {
			if(max<b) {
				max=b;
			}
			if(max<c) {
				max=c;
			}
			System.out.println(100*max);
		}
		else {
			if(a!=b) {System.out.println(1000+100*c);}
			else if(a!=c){System.out.println(1000+100*b);}
		}

	}
	public static void main(String[]args) throws IOException {

			new Die().solve();
	}

}
/*주사위 던지기>>
 * 같은눈 3개 100000원+(같은눈)*1000원
 *
 *  같은눈 2개 1000원 +(같은눈)*100원
 *  모두 다른 눈 (그중 가장 큰눈)*100원
 *
 *  scanner>> 자신이 가지고있는 버퍼 중 공백이 아니라고 생각하는 것을 찾아서
 *  그것 부터 공백이 아니라고 생각하는곳 까지 읽는다, 공백단위로 읽는다!
 */