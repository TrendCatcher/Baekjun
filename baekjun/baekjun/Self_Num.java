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
/*Ǯ�̹�
 * 1. d(n)�Լ��� recursion���� ���ϱ�
 * 2. ũ�Ⱑ 10001�� boolean �迭�� ����� d(n)�� �ش�Ǵ� �迭�� ���� true�� �ٲپ��ش�.(�ʱⰪ�� false�� ����)
 * 3.
 *
 */