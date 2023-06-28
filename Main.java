import java.util.*;
public class Main
{
    public static boolean isPalindrome(int x) 
    {
        
        if (x < 0) {
            return false;
    }
    
        int number = x;
        
        int reverse = 0;
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return x == reverse;
    }
    	public static void main(String[] args) 
	{
         Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean f = isPalindrome(x); 
        System.out.print(f);
	}
}
	    
