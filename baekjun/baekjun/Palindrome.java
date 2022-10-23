package baekjun;

public class Palindrome{
    public static int recursion(String s, int l, int r, int cnt){
    	cnt=0;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else
        	{
        		cnt++;
        		return recursion(s, l+1, r-1, cnt);
           	}
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1, 0);
    }
    public static void main(String[] args){
        System.out.println("ABBA: " + isPalindrome("ABBA")  );
        System.out.println("ABC: " + isPalindrome("ABC") );
    }
}
/*Ǯ�̹�
 * 1. ���ڿ� S�� �Է¹��� �� �縰��� ����Ȯ��( 0>>�ƴ�, 1>>���� )
 * 2. recursion ���Ƚ�� ����
 *
 *
 *
 *
 *
 *
 */