import java.util.*;
//ip: 1 2 3 4 5 6
//Left Rotation
//op: 2 3 4 5 6 1
//Right Rotation
//op:6 1 2 3 4 5
public class Main
{
	public static void main(String[] args) {
	    int[] arr={1,2,3,4,5,6};
	    //left Rotation
	    int temp=arr[0];
	    for(int i=0;i<arr.length-1;i++){
	        arr[i]=arr[i+1];
	    }
	    arr[arr.length-1]=temp;
	    System.out.println(Arrays.toString(arr));
	    //right Rotation
	    int[] arr1={1,2,3,4,5,6};
	    int temp1=arr1[arr1.length-1];
	    for(int i=arr1.length-1;i>0;i--){
	        arr1[i]=arr1[i-1];
	    }
	    arr1[0]=temp1;
	    System.out.println(Arrays.toString(arr1));
	}
}
