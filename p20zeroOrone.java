interface myInterface{
    int check(int a);
}
public class p20zeroOrone{
    public static void main(String[] rahul) {
        myInterface x =(n)->
        {
            if(n==0){
                return 1;
            }else{
                return transform(n, 0);
            }
        };
        System.out.println(x.check(10101013));
    }
    public static int transform(int number, int count){
        if(number == 0){
            return 0;
        }else{
            int lastDigit = number%10;
            if(lastDigit == 0){
                return ((1*pow(count))) + transform(number/10, count+1);
            }else{
                return ((lastDigit*pow(count))) + transform(number/10, count+1);
            }
        }
    }
    public static int pow(int exponent){
        if(exponent == 0){
            return 1;
        }else{
            return 10*(pow(exponent-1));
        }
    }
}