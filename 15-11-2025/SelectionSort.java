//Selection Sort
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int[] arr={1,3,2,4,-1,56,0};
	    for(int i=0;i<arr.length;i++){
	        int minI=i;
	        for(int j=i+1;j<arr.length;j++){
	            if(arr[j]<arr[minI]){
	                minI=j;
	            }
	        }
	        if(arr[minI]!=arr[i]){
	            int temp=arr[i];
	            arr[i]=arr[minI];
	            arr[minI]=temp;
	        }
	    }
	    System.out.println(Arrays.toString(arr));
	}
}
