//steps back character
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int step=sc.nextInt();
		String res="";
		for(int i=0;i<str.length();i++){
		    char ch=str.charAt(i);
		    if(ch-step>=97){
		        res+=(char)(ch-step);
		    }
		    else{
		        res+=(char)('z'+(ch-'a'-step+1));
		    }
		}
		System.out.println(res);
	}
}
