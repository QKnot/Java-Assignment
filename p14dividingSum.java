import java.util.Scanner;
interface Quark{
    double calculate(int n);
}
public class p14dividingSum{
    public static void main(String[] quark) {
        Quark r = (n)->
        {
            double sum = 0.0;
            for(int i=1;i<=n;i++){
                sum += ((double)1/i);
            }
            return sum;
        };
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = scan.nextInt();
        System.out.println("Sum = "+r.calculate(n));
        scan.close();
    }
}