import java.util.Scanner;
interface myInterface{
    double calculate(double a, double b, double c);
}
public class p3employee{
    public static void main(String[] qurak) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Hourly Wage:");
        double hw = scan.nextDouble();
        System.out.print("Enter total regular hour:");
        double trh = scan.nextDouble();
        System.out.print("Enter Over time:");
        double ot = scan.nextDouble();
        myInterface x = (a, b, c)->((a * b) + (a * c *1.5));
        double income = x.calculate(hw, trh, ot);
        System.out.println("Total weekly income:" + income);
        scan.close();
    }
}