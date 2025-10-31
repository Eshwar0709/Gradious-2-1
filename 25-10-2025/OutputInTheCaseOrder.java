//Output in the case order
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str="fgsRTsdf3gg2fsd4r53";
	    String result1="",result2="",result3="";
	    for(int i=0;i<str.length();i++){
	        if(str.charAt(i)>=65 && str.charAt(i)<=90){
	            result2+=str.charAt(i);
	        }
	        if(str.charAt(i)>=97 && str.charAt(i)<=122){
	            result1+=str.charAt(i);
	        }
	        else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
	            result3+=str.charAt(i);
	        }
	    }
	    System.out.println(result1+result2+result3);
	}
}
