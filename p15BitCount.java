interface Quark{
    int countBits(int n);
}
public class p15BitCount{
    public static void main(String[] args) {
        Quark x = (n)->
        {
            int count = 0;
            while(n>0){
                count += (n&1);
                //count += (n%2);
                n >>= 1;
                // n /= 2;
            }
            return count;
        };

        int a = 31;
        int b = 14;
        /*
         *    31 = 11111
         *    14 = 01110
         * ..........
         * 31^14 = 10001
         * now count the 1 
         * method 1 n&1 or n%2
         */
        System.out.println("We need to bit change: "+ x.countBits(a^b));
    }
}