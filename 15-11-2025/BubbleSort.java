//Bubble Sort
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int[] arr={1,3,2,4,-1,56,0};
	    for(int i=0;i<arr.length;i++){
	        for(j=i;j<arr.length;j++){
	            if(arr[i]>arr[j]){
	                int temp=arr[i];
	                arr[i]=arr[j];
	                arr[j]=temp;
	            }
	        }
	    }
	    System.out.println(Arrays.toString(arr));
	}
}
