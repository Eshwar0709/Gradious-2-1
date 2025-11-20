//1 2 3 4 5 
//1 2 3 4 
//1 2 3 
//1 2 
//1 
import java.util.*;
class Main {
    public static void main(String[] args) {
        String result="";
        for(int i=0;i<5;i++){
            for(int j=1;j<=5-i;j++){
                result+=j;
                if(j!=5-i){
                    result+=" ";
                }
            }
            result+="\n";
        }
        System.out.println(result);
    }
}
