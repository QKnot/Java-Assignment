public class p2recursion{
    public static void main(String[] rahul) {
        System.out.println(factorial(5));
    }
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}