import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String res="";
		int c=1;
		for(int i=0;i<str.length()-1;i++){
		    if(str.charAt(i)==str.charAt(i+1)){
		        c++;
		    }
		    else{
		        res=res+str.charAt(i)+c;
		        c=1;
		    }
		}
		res=res+str.charAt(str.length()-1)+c;
		System.out.println(res);
	}
}
