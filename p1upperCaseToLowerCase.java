import java.util.Scanner;
interface myInterface{
    String convert(String s);
}
public class p1upperCaseToLowerCase{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        myInterface x = (s)->
        {
            String newString = "";
            for(char ch:s.toCharArray()){
                int ascii = (int) ch;
                if(ascii >= 65 && ascii <= 90){
                    ascii += 32;
                    newString += (char)ascii;
                }else{
                    ascii -= 32;
                    newString += (char)ascii;
                }
            }
            return newString;
        };
        String input = scan.nextLine();
        String output = x.convert(input);
        System.out.println(output);
         scan.close();
    }
}