import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="h$ell@o#";
		char[] arr=str.toCharArray();
		String res="";
		int l=0,r=arr.length-1;
		while(l<r){
		    if(!((arr[l]>='a' && arr[l]<='z') || (arr[l]>='A' && arr[l]<='Z'))){
		        l++;
		    }
		    else if(!((arr[r]>='a' && arr[r]<='z') || (arr[r]>='A' && arr[r]<='Z'))){
		        r--;
		    }
		    else{
		        char t=arr[l];
		        arr[l]=arr[r];
		        arr[r]=t;
		        l++;
		        r--;
		    }
		}
		for(int i=0;i<arr.length;i++){
		    res+=arr[i];
		}
		System.out.println(res);
	}
}
//ip:"h$ell@o#"
//op:"o$lle@h#"
