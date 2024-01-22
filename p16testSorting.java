import java.util.Scanner;
interface Quark{
    boolean isSort(int[] data);
}
public class p16testSorting{
    public static void main(String[] quark) {
        Quark x = (data)->
        {
            for(int i=0;i<(data.length-1);i++){
                if(data[i] > data[i+1]){
                    return false;
                }
            }
            return true;
        };
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the nnumber of item:");
        int n = scan.nextInt();
        int[] data = new int[n];
        System.out.print("Enter Array: ");
        for(int i=0;i<n;i++){
            data[i] = scan.nextInt();
        }
        boolean check = x.isSort(data);
        System.out.println(check?"The algorithm is sorting algorithm":"The algorithm is not sorting algorithm");
        scan.close();
    }
}