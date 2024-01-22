import java.util.Scanner;
interface Quark{
    int calculate(int x, int n);
}
public class p12xPowerN{ 
    public static void main(String[] quark) {
        Quark r = (x, n)->(power(x, n, 0));
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter X = ");
        int x = scan.nextInt();
        System.out.print("Enter n = ");
        int n = scan.nextInt();
        System.out.println("x^n = " + r.calculate(x, n));
        scan.close();

    }
    public static int power(int x, int n, int count){
        if(count == n){
            return 1;
        }else{
            return x*power(x, n, count+1);
        }
    }
}