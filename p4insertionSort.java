import java.util.Scanner;
public class p4insertionSort{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Array Size:");
        int n = scan.nextInt();
        System.out.print("Enter the Array:");
        int[] data = new int[n];
        for(int i=0;i<n;i++){
            data[i] = scan.nextInt();
        }
        int[] sortData = insertionsort(data);
        System.out.print("Sorted Data:");
        for(int output : sortData){
            System.out.print(output+" ");
        }
        scan.close();
    }
    public static int[] insertionsort(int[] data){
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
        return data;
    }
}