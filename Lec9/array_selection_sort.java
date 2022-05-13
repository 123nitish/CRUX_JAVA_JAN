package Lec9;
import java.util.*;
public class array_selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc= new Scanner(System.in);
     int n = sc.nextInt();
     int[]arr=new int[n];
     for(int i=0;i<arr.length;i++) {
    	 arr[i]=sc.nextInt();
     }
     Sort(arr);
     for(int i=0;i<arr.length;i++) {
    	 System.out.println(arr[i]+" ");
     }
	}

	public static void Sort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int min_idx = i;// index min

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min_idx]) {
					min_idx = j;
				}

			}

			int t = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = t;
		}

	}

}