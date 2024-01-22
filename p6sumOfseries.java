import java.util.Scanner;
interface quark{
    int sum(int n);
}
public class p6sumOfseries{
    public static void main(String[] quark) {
        quark iteration = (n)->
        {
            int count = 0;
            for(int i=1;i<=n;i++){
                count += ((i%2==1)?(i*i):(-(i*i)));
            }
            return count;
        };
        quark formula = (n)->(((n%2==0)?(-1):(1))*(n*(n+1)/2));
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Sum = "+iteration.sum(n));
        System.out.println("FormulaSum = " + formula.sum(n));
         scan.close();
        
    }
}