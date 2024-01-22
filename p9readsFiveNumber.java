import java.util.Scanner;
interface Quark{
    container find(int[] data);
}
class container{
    int first, second;
    double third;
    container(int first, int second, double third){
        this.first = first;
        this.second = second;
        this.third = third;
    }
}
public class p9readsFiveNumber{
    public static void main(String[] quark) {
        Quark x = (data)->
        {
            int max_ = 0, min_ = Integer.MAX_VALUE, sum = 0;
            for(int i=0;i<5;i++){
                int u = data[i];
                max_ = Math.max(u, max_);
                min_ = Math.min(u, min_);
                sum += u;
            }
            double average = (double)(sum/5);
            container obj = new container(max_, min_, average);
            return obj;
        };
        Scanner scan = new Scanner(System.in);
        int[] data = new int[5];
        for(int i=0;i<5;i++){
            data[i] = scan.nextInt();
        }
        container obj = x.find(data);
        System.out.println("Max value = " + obj.first);
        System.out.println("Min Value = " + obj.second);
        System.out.println("Average = " + obj.third);
        scan.close();
    }
}