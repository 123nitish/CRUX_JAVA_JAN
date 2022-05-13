package lec5;
import java.util.*;
public class fabunacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
		        // no need to take input for these two
				// int a= sc.nextInt();
				// int b= sc.nextInt();
				int a=0;
				int  b=1;
				int n = sc.nextInt();   // you need to input for n
				for(int i=1;i<=n;i++){
		            int c =a+b;  // temporary variable for storing sum of previous two numbers
				    a=b;
				    b=c;
				}
				System.out.println(a);
			}
		

	}


