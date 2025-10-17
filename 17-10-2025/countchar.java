import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String str="hippopotamus123@AB#C&209";
		int countalp=0,countdig=0,countspl=0;
	    String str1=str.toLowerCase();
	    String str2=str.toUpperCase();
	    for(int i=0;i<str.length();i++){
	        char s=str.charAt(i);
	        char s1=str1.charAt(i);
	        char s2=str2.charAt(i);
	        if((s>= 'A' && s<='Z') || (s>='a' && s<='z')){
	            countalp++;
	        }
	        else if(s>='0' && s<='9'){
	            countdig++;
	        }
	        else{
	            countspl++;
	        }
	    }
	    System.out.println(countalp+" is the count of alphabets\n"+countdig+" is the count of digits\n"+countspl+" is the count of special characters");
	}
}
