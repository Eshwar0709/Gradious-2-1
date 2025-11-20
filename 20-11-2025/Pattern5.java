//5
//4 5 
//3 4 5
//2 3 4 5
//1 2 3 4 5
import java.util.*;
class Main {
    public static void main(String[] args) {
        String result="";
        for(int i=1;i<=5;i++){
            for(int j=5-i+1;j<=5;j++){
                result+=j+" ";
            }
            result+="\n";
        }
        System.out.println(result);
    }
}
