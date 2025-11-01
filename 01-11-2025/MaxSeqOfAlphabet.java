import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="sdabcdeghijruvwxyzpqrstabc";
		int max=0;
		int countw=1;
		int l=0,r=str.length()-1;
		for(int i=0;i<str.length()-1;i++){
		    char ch=str.charAt(i);
		    char ch1=str.charAt(i+1);
		    if((char)(ch+1)==ch1){
		        countw++;
		    }
		    else{
		        countw=1;
		    }
		    max=Math.max(max,countw);
		}
		System.out.println(max);
	}
}
