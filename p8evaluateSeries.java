import java.util.Scanner;
interface Quark{
    int nthValue(int n);
}
public class p8evaluateSeries{
    public static void main(String[] quark) {
        Scanner scan = new Scanner(System.in);
        Quark x = (n)->(2*n+1);
        int n = scan.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i + "*" + x.nthValue(i) + ((i%n==0)?"\n":"+"));
        }
        scan.close();
    }
}