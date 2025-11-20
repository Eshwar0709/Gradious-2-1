//1 0 0 0 0
//0 2 0 0 0
//0 0 3 0 0
//0 0 0 4 0
//0 0 0 0 5
import java.util.*;
class Main {
    public static void main(String[] args) {
        String result="";
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==j){
                    result+=j;
                }
                else{
                    result+="0";
                }
                if(j!=5){
                    result+=" ";
                }
            }
            result+="\n";
        }
        System.out.println(result);
    }
}
