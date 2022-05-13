package Lec9;
import java.util.*;
public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int []arr=new int[n];
    for(int i=0;i<arr.length;i++) {
    	arr[i]=sc.nextInt();
    	
    }
    sort(arr);
    for(int i=0;i<arr.length;i++) {
    	System.out.println(arr[i]+" ");
    }
 
	}
	public static void sort(int[]arr) {
		for(int pass=1;pass<arr.length;pass++) {
			for(int i=0;i<arr.length-pass;i++){
				if(arr[i]>arr[i+1]) {
					int t =arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=t;
				}
			}
		}
	}

}
