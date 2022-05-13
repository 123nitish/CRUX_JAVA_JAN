package Lec9;
import java.util.*;
public class minimum_user_input {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//import java.util.*;
		//public class Main {
		  //  public static void main(String[] arg) {
				// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				int[] arr = new int[n];

				for (int i = 0; i < arr.length; i++) {
					arr[i] = sc.nextInt();

				}
				System.out.println(minimum(arr));

			}

			public static int minimum(int[] arr) {
			    int min=arr[0];
				for (int i = 0; i < arr.length; i++) {
				    if (arr[i]<min){
		                min=arr[i];
				    }
				}
			return min;
			}

		
	}


