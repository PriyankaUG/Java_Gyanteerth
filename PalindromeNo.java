
public class PalindromeNo
{
    
    public static boolean isPalindrome(int n){
       if(n<9) return true;
       int temp = n;
       int rev = 0;
       
       while(temp>0){
           int digit = temp%10;
           rev = rev*10 + digit;
           temp /=10;
       }
       
       if(rev==n){
           return true;
       }
       return false;
    }
    

	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
        
	}
}
