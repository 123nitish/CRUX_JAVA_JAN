package Lec9;
import java.util.*;
public class minmum_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//import java.util.*;
		//public class Main {
		    //public static void main(String args[]) {
		        int []arr={10,-3,90,7,-9,79,-18,902};
		        System.out.println(Minimum(arr));
		    }
		    public static int Minimum(int[]arr){
		        int min=arr[0];
		        for(int i=1;i<arr.length;i++){
		            if (arr[i]<min){
		                min=arr[i];
		            } 
		        }
		        return min;
		    }

	}


