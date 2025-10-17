import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String str="hippopotamus123@AB#C&209";
		int countupp=0,countlwr=0,countdig=0,countspl=0;
	    for(int i=0;i<str.length();i++){
	        char ch=str.charAt(i);
	        if(ch>='A' && ch<='Z'){
	            countupp++;
	        }
	        else if(ch>='a' && ch<='z') countlwr++;
	        else if(ch>='0' && ch<='9') countdig++;
	        else countspl++;
	    }
	    if(countupp>=1 && countlwr>=1 && countspl>=1 && countdig>=1 && str.length()>=8){
	        System.out.println("The password is valid");
	    }
	    else{
	        System.out.println("The password is invalid");
	    }
	}
}
