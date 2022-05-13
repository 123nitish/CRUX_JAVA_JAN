package Lec9;
import java.util.*;
public class max_subarray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int []arr=new int[n];
for(int i=0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
}
System.out.println(maxsum(arr)); // print here the returned value that is the max sum
// for(int i=0;i<arr.length;i++) {   // no need to print array
// 	 System.out.print(arr[i]+" ");
// 	}
}
	//public static void sort(int[] arr) {
		// TODO Auto-generated method stub
		public static int maxsum(int[] arr) {
			int ans = Integer.MIN_VALUE;// -2^31
			for (int i = 0; i < arr.length; i++) {
				int prevous_sum = 0;
				for (int j = i; j < arr.length; j++) {
					prevous_sum += arr[j];
					ans = Math.max(ans, prevous_sum);
				}
			}
			return ans;
	}
	}



