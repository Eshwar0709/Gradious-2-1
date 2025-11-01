//Finding Equal Point in the String of Brackets
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="))))))()(((";
		int res=0;
		int k=0;
		while(k<str.length()){
		    int openb=0,closedb=0;
		    for(int i=0;i<k;i++){
		        char ch=str.charAt(i);
		        if(ch=='('){
		            openb++;
		        }
		    }
		    for(int i=k;i<str.length();i++){
		        char ch=str.charAt(i);
		        if(ch==')'){
		            closedb++;
		        }
		    }
		    if(openb==closedb){
		        res=k;
		        break;
		    }
		    else{
		        k++;
		    }
		}
		System.out.println(res);
	}
}
