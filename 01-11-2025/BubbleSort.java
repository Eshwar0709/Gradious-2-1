import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr={10,2,4,5,7,1};
		for(int i=0;i<arr.length;i++){
		    int f=0;
		    for(int j=0;j<arr.length-1-i;j++){
		        if(arr[j]>arr[j+1]){
		            f=1;
		            int temp=arr[j];
		            arr[j]=arr[j+1];
		            arr[j+1]=temp;
		        }
		    }
		    if(f==0){
		        break;
		    }
		}
		System.out.println(Arrays.toString(arr));
	}
}
