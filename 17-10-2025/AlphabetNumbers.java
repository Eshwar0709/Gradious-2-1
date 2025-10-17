import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String choice=sc.nextLine();
		int[] arr=new int[choice.length()];
		int k=0;
		for(int i=0;i<choice.length();i++){
		    char ch=choice.charAt(i);
		    if((int)ch>=97 && (int)ch<=122){
		        arr[k++]=(int)ch-96;
		    }
		}
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
