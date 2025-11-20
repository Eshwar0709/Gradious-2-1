//12345
//1234 
//123
//12
//1
import java.util.*;
class Main {
    public static void main(String[] args) {
        String result="";
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i+1;j++){
                result+=j;
            }
            result+="\n";
        }
        System.out.println(result);
    }
}
