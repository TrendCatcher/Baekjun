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
/*�ֻ��� ������>>
 * ������ 3�� 100000��+(������)*1000��
 *
 *  ������ 2�� 1000�� +(������)*100��
 *  ��� �ٸ� �� (���� ���� ū��)*100��
 *
 *  scanner>> �ڽ��� �������ִ� ���� �� ������ �ƴ϶�� �����ϴ� ���� ã�Ƽ�
 *  �װ� ���� ������ �ƴ϶�� �����ϴ°� ���� �д´�, ��������� �д´�!
 */