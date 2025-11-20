//0 1
//0 2 4
//0 3 9 27
//0 4 16 64 256
//0 5 25 125 625 3125
import java.util.*;
class Main {
    public static void main(String[] args) {
        String result="";
        for(int i=1;i<=5;i++){
            result+="0 ";
            int num=i;
            for(int j=1;j<=i;j++){
                result+=num+" ";
                num*=i;
            }
            result+="\n";
        }
        System.out.println(result);
    }
}
