//mirror character 
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String res="";
		for(int i=0;i<str.length();i++){
		    char ch=str.charAt(i);
		    if(Character.isLowerCase(ch)){
		        res+=(char)('a'+'z'-ch);
		    }
		    else{
		        res+=(char)('A'+'Z'-ch);
		    }
		}
		System.out.println(res);
	}
}
