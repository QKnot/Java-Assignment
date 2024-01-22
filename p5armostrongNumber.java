public class p5armostrongNumber{
    public static void main(String[] args) {
        isArmostrongNumber(153);
    }
    public static void isArmostrongNumber(int number){
        int n = size(number, 0);
        int armostrong = 0;
        int realNumber = number;
        while(number!=0){
            int mod = number%10;
            armostrong += pow(mod, n);
            number/=10;
        }
        String output = ((armostrong == realNumber)?"YES":"NO");
        System.out.println(output);
    }
    public static int size(int number, int count){
        if(number == 0){
            return count;
        }
        return size(number/10, count+1);
    }
    public static int pow(int number, int n){
        if(n == 0){
            return 1;
        }
        return number*pow(number, n-1);
    }

}