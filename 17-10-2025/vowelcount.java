import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String str="hippopotamus";
		StringBuilder res=new StringBuilder(str.length());
		int count=0;
	    String str1=str.toLowerCase();
	    for(int i=0;i<str.length();i++){
	        char s=str1.charAt(i);
	        if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u'){
	            res.append(s);
	        }
	    }
	    System.out.println(res);
	}
}
