package Lec9;
import java.util.*;

public class insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc= new Scanner(System.in);
 int n = sc.nextInt();
 int []arr= new int[n];
 for(int i=0;i<arr.length;i++) {
	 arr[i]=sc.nextInt();
 }
 sort(arr);
 for(int i=0;i<arr.length;i++) {
	 System.out.print(arr[i]+" ");
 }
	}

	public static void sort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;
			int item = arr[i];
			while (j >= 0 && arr[j] > item) {
				arr[j + 1] = arr[j];
				j--;
			}
			j++;
			arr[j] = item;
		}

	}


	}
	

