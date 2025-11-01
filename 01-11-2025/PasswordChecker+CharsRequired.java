import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="1234567";
		int count=0,cl=0,cu=0,cs=0,cd=0,l=str.length();
		for(int i=0;i<str.length();i++){
		    char ch=str.charAt(i);
		    if(ch>='a' && ch<='z'){
		        cl++;
		    }
		    else if(ch>='A' && ch<='Z'){
		        cu++;
		    }
		    else if(ch>='0' && ch<='9'){
		        cd++;
		    }
		    else{
		        cs++;
		    }
		}
     	
		if(cl==0){
		    count++;
		}
		if(cd==0){
		    count++;
		}
		if(cs==0){
		    count++;
		}
		if(cu==0){
		    count++;
		}
		int res=Math.max(count,8-l);
		System.out.println(res);
	}
}
