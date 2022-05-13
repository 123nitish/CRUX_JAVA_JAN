package lec21;
import java.util.*;
public class Nth_riangle_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println(fact(n,1));
	}

	public static int fact(int n, int ans) {
		// TODO Auto-generated method stub
		//base case
		if(n==0) {
			return ans;
		}
		return fact(n-1,ans*n);
	}

}
