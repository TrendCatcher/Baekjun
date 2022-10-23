package baekjun;

import java.util.Scanner;

public class Oven {
	public void solve() {
	Scanner sc = new Scanner(System.in);
	int i=sc.nextInt();
	int j=sc.nextInt();
	int k=sc.nextInt();

	j=j+k;

	if(j>=120) {
		j=j-120;
		i+=2;
	}
	else if(j>=60) {
			j=j-60;
			i+=1;
		}
	if(i>=24)
		i=i-24;

	System.out.printf("%d %d",i,j);
	}

	public static void main(String[]args) {

	new Oven().solve();
	}
}
