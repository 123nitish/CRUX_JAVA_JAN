package Lec7;
import java.util.*;
public class inverse_array{
		public static void main(String[] args) {
	      Scanner sc= new Scanner(System.in);
	      int n= sc.nextInt();
	      int []arr= new int[n];
	      for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		  } // till here you have done
	      // Now Logic is that
	      /*
	      0 2 4 1 3
	      Suppose you input at index 
	      0->0;
	      1->2;
	      2->4;
	      3->1;
	      4->3;
	      You need to swap these indexes with your input
	      It means
	      at index 0->0
	      2->1;
	      4->2;
	      1->3;
	      3->4;
	      Now resultant array becomes our result
	      0->0;
	      1->3;
	      2->1;
	      3->4;
	      4->2;
	      0 3 1 4 2
	      */
	      //Make a new array
	      int[] res=new int[n]; // we will make same size of array
	      for(int i=0;i<arr.length;i++)  // now traverse through your previous array
	      {
	          int data=arr[i];     //collecting the data at ith index of arr
	          res[data]=i;       // use data as index for res and store index
	      }
	      // now print the array
	      for(int i=0;i<res.length;i++)  
	      {
	          System.out.print(res[i]+" ");  
	      }
		}
	}
	

