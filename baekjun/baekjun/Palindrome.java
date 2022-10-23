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
/*풀이법
 * 1. 문자열 S를 입력받은 후 펠린드롬 여부확인( 0>>아님, 1>>맞음 )
 * 2. recursion 사용횟수 세기
 *
 *
 *
 *
 *
 *
 */