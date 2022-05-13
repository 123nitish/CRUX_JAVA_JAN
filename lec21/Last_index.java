package lec21;
import java.util.*;
public class Last_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []arr=new int[n];
System.out.println(lastIndex(arr,7,2));
	}
	public static int lastIndex(int[] arr, int i, int item) {
		// TODO Auto-generated method stub
	if(i==arr.length) {
		return-1;
	}
if(arr[i]==item) {
	return i;
}
return lastIndex(arr,i+1,item);
}
}