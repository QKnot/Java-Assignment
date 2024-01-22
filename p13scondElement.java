import java.util.Scanner;
interface Quark{
    void sort(int[] data);
}
public class p13scondElement{
    public static void main(String[] quark) {
        Quark x = (data)->
        {
            int size = data.length;
            for(int i=1;i<size;i++){
                int key = data[i];
                int j = i-1;
                while(j>=0 && data[j] > key){
                    data[j+1] = data[j];
                    j -= 1;
                }
                data[j+1] = key;
            }
        };
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of item:");
        int n = scan.nextInt();
        int[] data = new int[n];
        System.out.print("Enter Array: ");
        for(int i=0;i<n;i++){
            data[i] = scan.nextInt();
        }
        x.sort(data);
        System.out.println("Highest 2nd value is = " + data[n-2] + "\n2nd Lowest Value is = " + data[1]);
        scan.close();
    }
}