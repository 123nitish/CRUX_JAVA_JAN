package Lec9;
import java.util.*;
public class product_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//import java.util.*;
		//public class Main(){
		   // public static void main(sting args[]){
		Scanner sc=new Scanner(System.in);
		        int n= sc.nextInt();
		        long []arr=new long[n];
		        for(int i=0;i<arr.length;i++){
		        	//int[]ans=product(arr);// no need to call
		            arr[i]=sc.nextInt();
		        }
		        product(arr);// need to call now 
		            for(int i=0;i<arr.length;i++){
		           System.out.print(arr[i]+" ");// now output
		        }
		        
		    }
	public static long[] product(long arr[]) {
		int n = arr.length;
		long[]left=new long[n];
		long []right=new long [n];
		left[0]=1;
		for (int i=1;i<n;i++) {
			left[i]=left[i-1]*arr[i-1];
		}
		right[n-1]=1;
		for(int i=n-2;i>=0;i--) {
			right[i]=right[i+1]*arr[i+1];
		}
		for(int i=0;i<right.length;i++) {
			arr[i]=left[i]*right[i];
		}
		return arr;
	}
		
	}


