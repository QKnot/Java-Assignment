import java.util.Scanner;
interface myInterface{
    boolean binarysearch(int[] data, int value);
}
public class p19binarySearch{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Array Size:");
        int n = scan.nextInt();
        myInterface x = (data, value)->
        {
            int left = 0, right = data.length - 1;
            while(left<=right){
                int mid = (left + ((right-left) >> 1));
                if(data[mid] == value){
                    return true;
                }else if(data[mid] < value){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
            return false;
        };
        myInterface y = (data, value)->
        {
            int left = 0, right = data.length - 1;
            return BinarySearch(left, right, data, value);

        };
        System.out.print("Enter the Array:");
        int[] data = new int[n];
        for(int i=0;i<n;i++){
            data[i] = scan.nextInt();
        }
        System.out.print("Enter the finding data:");
        int findingData = scan.nextInt();
        System.out.print("Result:");
        //String result = ((x.binarysearch(data, findingData))?"Found":"Not Found");
        String result = ((y.binarysearch(insertionSort(data), findingData))?"Found":"Not Found");
        System.out.println(result);
        /* 
        int[] sortData = insertionSort(data);
        for(int output : sortData){
            System.out.print(output+" ");
        }
        */
        scan.close();
    }
    public static boolean BinarySearch(int left, int right,int[] data, int findingValue){
        if(left <= right){
            int mid = (left + ((right-left) >> 1));
            if(data[mid] == findingValue){
                return true;
            }else if(data[mid] < findingValue){
                return BinarySearch(mid+1, right, data, findingValue);
            }else{
                return BinarySearch(left, mid-1, data, findingValue);
            }
        }
        return false;
    }
    public static int[] insertionSort(int[] data){
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