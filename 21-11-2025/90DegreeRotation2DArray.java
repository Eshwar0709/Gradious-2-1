import java.util.*;
//2D Array Rotation 90 degrees
//ip:
//1 2 3 4
//5 6 7 8
//9 1 2 3
//3 2 1 4
//op:
//3 9 5 1
//2 1 6 2
//1 2 7 3
//4 3 8 4
public class Main
{
	public static void main(String[] args) {
	    int[][] arr={{1,2,3,4},{5,6,7,8},{9,1,2,3},{3,2,1,4}};
	    //Transpose
	    for(int i=0;i<arr.length;i++){
	        for(int j=0;j<i;j++){
	            int temp=arr[i][j];
	            arr[i][j]=arr[j][i];
	            arr[j][i]=temp;
	        }
	    }
	    //Row Reverse
	    for(int i=0;i<arr.length;i++){
	        int l=0,r=arr[i].length-1;
	        while(l<r){
	            int temp=arr[i][l];
	            arr[i][l]=arr[i][r];
	            arr[i][r]=temp;
	            l++;
	            r--;
	        }
	    }
	    System.out.println(Arrays.deepToString(arr));
	}
}
