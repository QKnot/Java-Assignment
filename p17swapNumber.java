import java.util.Scanner;
interface myInterface{
    void swap(int a, int b);
}
public class p17swapNumber{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("a=");
        int a = scan.nextInt();
        System.out.print("b=");
        int b = scan.nextInt();
        /* 
        //Max value checking 
        int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE - 1 ;
        System.out.println("a = " + a + "\nb = " + b);
        */
        /* 
        checking min integer 
        int a = Integer.MIN_VALUE, b = Integer.MIN_VALUE + 1 ;
        System.out.println("a = " + a + "\nb = " + b);
        */
        myInterface xor = (x, y)->
        {
            x = x ^ y;
            y = x ^ y;
            x = x ^ y;
            System.out.println("a = " + x + "\nb = " + y);
        };
        /*
         * 
         * when 
         * integer.MIN_VALUE/2 < a >integer.MAX_VALUE/2
         * integer.MIN_VALUE/2 < b > integer.MAX_VALUE/2
         * a = a + b; a can't store the value 
         * b = a - b;
         * a = a - b;
         * This plusMinus won't because of overflow.
         * xor work's 
         * we can use another algorithm
         * a = a - b; a can store the value
         * b = a + b; b also can store the because the a value is reduce 
         * a = b - a; 
         * by this algorithm we avoid the overflow.
         */
        myInterface plusMinus = (x, y)->
        {
            x = x + y;
            y = x - y;
            x = x - y;
            System.out.println("a = " + x + "\nb = " + y);
        };
        myInterface handlingOverflow = (x, y)->
        {
            x = x - y;
            y = x + y;
            x = y - x;
            System.out.println("a = " + x + "\nb = " + y);
        };
        myInterface mulDivide = (x, y)->{
            x = x * y;
            y = x / y;
            x = x / y;
            System.out.println("a = " + x + "\nb = " + y);
        };
        xor.swap(a, b);
        plusMinus.swap(a, b);
        mulDivide.swap(a, b);
        handlingOverflow.swap(a, b);
        scan.close(); 
    }
}