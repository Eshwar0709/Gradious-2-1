//   1
//  2 1 2 
// 3 2 1 2 3
import java.util.*;
class Main {
    public static void main(String[] args) {
        String result="";
        for(int i=1;i<=3;i++){
            for(int j=3-i+1;j>0;j--){
                result+=" ";
            }
            for(int k=i;k>=1;k--){
                result+=k;
                if(i!=1){
                    result+=" ";
                }
            }
            for(int l=2;l<=i;l++){
                result+=l;
                if(l!=i){
                    result+=" ";
                }
            }
            result+="\n";
        }
        System.out.println(result);
    }
}
