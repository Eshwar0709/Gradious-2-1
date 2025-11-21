import java.util.*;
//2D Array Rotation 180 degrees
//ip:
//1 2 3 4
//5 6 7 8
//9 1 2 3
//3 2 1 4
//op:
//4 1 2 3
//3 2 1 9
//8 7 6 5
//4 3 2 1
public class Main
{
	public static void main(String[] args) {
	    int[][] arr={{1,2,3,4},{5,6,7,8},{9,1,2,3},{3,2,1,4}};
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
	    //column Reverse
	    for(int i=0;i<arr.length;i++){
	        int l=0,r=arr[i].length-1;
	        while(l<r){
	            int temp=arr[l][i];
	            arr[l][i]=arr[r][i];
	            arr[r][i]=temp;
	            l++;r--;
	        }
	    }
	    System.out.println(Arrays.deepToString(arr));
	}
}
