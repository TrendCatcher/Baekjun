package baekjun;

public class Self_Num {
	public int Dn(int n) {
		int Dn = n;
		while(n>0) {
			Dn+=(n%10);
			n=n/10;

		}
		return Dn;
	}

	public void solve() {
		boolean check [] = new boolean[10001];

		for(int i =1; i<10001; i++) {
			if (Dn(i) < 10001)
			check[Dn(i)]=true;

		}
		for(int i=1; i<10001; i++) {
			if(check[Dn(i)]==false)
				System.out.println(i);
		}

}
	public static void main(String[]args) {
		new Self_Num().solve();
	}
}
/*풀이법
 * 1. d(n)함수를 recursion으로 구하기
 * 2. 크기가 10001인 boolean 배열을 만들어 d(n)에 해당되는 배열의 값을 true로 바꾸어준다.(초기값은 false로 설정)
 * 3.
 *
 */