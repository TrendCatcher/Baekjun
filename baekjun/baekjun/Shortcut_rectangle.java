package baekjun;

import java.util.Scanner;

public class Shortcut_rectangle {



	public void solve() {

	Scanner sc= new Scanner(System.in);
	int x= sc.nextInt();
	int y= sc.nextInt();
	int k= sc.nextInt();
	int h= sc.nextInt();

	int shortcut1=  Math.abs(x-k);
	int shortcut2= Math.abs(y-h);
	int shortcut3 =0;
	int shortcut4=0;

	if(x>shortcut1 || y>shortcut2) {
		if(shortcut1>shortcut2) {
		shortcut3 = shortcut2;
		}
		else if (shortcut1<shortcut2) {
		shortcut3=shortcut1;
		}


	}
	if(x<shortcut1 || y<shortcut2) {
		if(x<shortcut1) {
		shortcut4 = x;
		}
		else if(y<shortcut2)
		{
		shortcut4 = y;
		}
	}
	if(shortcut3<shortcut4)
		System.out.println(shortcut3);
	else
		System.out.println(shortcut4);
}


	public static void main(String[]args) {

	new Shortcut_rectangle().solve();
	}

}



/* 현재 위치 x,y가 주어지면 직사각형의 크기를 가늠한 후 해당 위치에서 직사각형의 가로변, 세료변까지의 위치를 비교한 뒤 가장 큰값을 리턴
 *
 * 1.math.abs 를 사용>>
 *
 * 2. if(num<0){
 * num=-num
 * } 사용
 *
 */