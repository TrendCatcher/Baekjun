package baekjun;

import java.util.Scanner;

	public class factorial {

		static int  fact1(int n)
		{
			if (n==0)
			return 1;

			else
			return n*fact1(n-1);

		}

public static void main(String[] args) {
	int fact=1;
	Scanner scan= new Scanner(System.in);
	int n = scan.nextInt();
	fact= fact1(n);
System.out.println("Factorial of "+n+" is: "+ fact);
}
}
