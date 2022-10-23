package baekjun;

import java.util.Scanner;
/*
class Deep {
public void solve() {
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	String a = sc.next();			//문자열로 입력받음
	sc.close();

	int sum=0;

	for(int i=0; i<n; i++) {
		sum += a.charAt(i)-'0';		// 아스키코드에서 -'0'혹은 48을 해줌
	}
	System.out.print(sum);
}
}
public class Sum_11720{
public static void main(String[]args) {

	new Deep().solve();
}
}*/


 class Sum{
  	public void solve(){
  Scanner sc = new Scanner(System.in);
  int i= sc.nextInt();
  String s = sc.next();


  int sum=0;

  for(int a=0; a<i; a++){
  sum+=s.charAt(i);
  	}
  System.out.println(sum);
  }
  }
  public class Sum_11720{
  public static void main(){
  new Sum().solve();
  }
  }

