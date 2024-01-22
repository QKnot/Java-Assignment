public class p18palindrome{
    public static void main(String[] args) {
        isPalindrome(123321);
    }
    public static void isPalindrome(int number){
        if(number == transformPalindrome(number, size(number, 0))){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
    public static int transformPalindrome(int number, int count){
        if(number == 0){
            return 0;
        }else{
            int mod = number%10;
            return (((mod*pow(count-1)) + transformPalindrome(number/10, count-1)));
        }
    }
    public static int size(int number, int count){
        if(number == 0){
            return count;
        }else{
            return size(number/10, count+1);
        }
    }
    public static int pow(int exponent){
        if(exponent == 0){
            return 1;
        }else{
            return 10*pow(exponent-1);
        }
    }
}