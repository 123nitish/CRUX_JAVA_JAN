package lec5;
import java.util.*;
public class reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int n,rev=0;
		
	          n = sc.nextInt();
	          while(n>0)
	         {
	             rev=(rev*10)+n%10;
	             n=n/10;
	         }
	        System.out.print(rev);
	         }
	 
	}


