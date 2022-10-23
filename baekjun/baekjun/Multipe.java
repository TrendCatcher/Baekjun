package baekjun;

/* solution2 mathemathical
 *
 *입력으로 들어오는 값 %로 연산후 계산
 *
 *j/100>>가장앞숫자
 *j%10>>가장 뒤숫자
(j%100)/10>>가운데 숫자
public class Multipe  {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();

		System.out.println(i*(j%10));
		System.out.println(i*(j/100));
		System.out.println(i*((j%100)/10));
		System.out.println(i*j);

	}
}
*/

/*solution 3 bufferedReader
 *
 * public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int A = Integer.parseInt(br.readLine());
		String B = br.readLine();

		char[] b = B.toCharArray();


		System.out.println(A * (b[2]-'0'));
		System.out.println(A * (b[1]-'0'));
		System.out.println(A * (b[0]-'0'));
		System.out.println(A * Integer.parseInt(B));

	}
}
 *
 *
 *
 * */
