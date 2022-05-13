package lec21;
import java.util.*;
public class first_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
				//int arr = sc.nextInt();
				System.out.println(FistIndex(arr, 0,2));

			}

			public static int FistIndex(int[] arr, int i, int item) {
				if (i == arr.length) {
					return -1;
				}

				if (arr[i] == item) {
					return i;
				}

				return FistIndex(arr, i + 1, item);

			}
	}


