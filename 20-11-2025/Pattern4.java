//1
//22 
//333
//4444
//55555
import java.util.*;
class Main {
    public static void main(String[] args) {
        String result="";
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                result+=i;
            }
            result+="\n";
        }
        System.out.println(result);
    }
}
