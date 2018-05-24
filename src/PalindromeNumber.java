public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        int revNumber = 0;
        int temp = x;

        int last_digit = 0 ;
        while ( x != 0 ){
            last_digit = x % 10;
            revNumber = revNumber * 10 + last_digit;
            x = x/10;
        }

        if(temp == Math.abs(revNumber)){
            System.out.println("It's palindrome");
            return true;
        }

        System.out.println("It's not Palindrome ");
        return false;
    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean flag = palindromeNumber.isPalindrome(-121);
    }
}
