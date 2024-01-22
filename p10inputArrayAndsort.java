import java.util.Scanner;
interface Quark{
    void sort(int[] data);
}
public class p10inputArrayAndsort{
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
        System.out.print("Enter the nnumber of item:");
        int n = scan.nextInt();
        int[] data = new int[n];
        System.out.print("Enter Array: ");
        for(int i=0;i<n;i++){
            data[i] = scan.nextInt();
        }
        x.sort(data);
        System.out.print("Sorted Array:" );
        for(int d:data){
            System.out.print(d+" ");
        }
        System.out.println();
        System.out.println("Max Value = " + data[0]);
        System.out.println("Min Value = " + data[n-1]);
        scan.close();
    }
}