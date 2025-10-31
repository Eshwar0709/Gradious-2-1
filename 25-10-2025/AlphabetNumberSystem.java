//Alphabets number system
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		String result="";
		for(int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
		    result+=(char)(arr[i]+96);
		}
		System.out.println(result);
	}
}
