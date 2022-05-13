package Lec12;
import java.util.*;
public class square_root_binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Sc=new Scanner(System.in);
long n = Sc.nextLong();
System.out.println(root(n));
	}
	public static long root(long n) {
		// TODO Auto-generated method stub
		long lo = 0;  // 0 is also possible square root
		long hi = n;
		long ans = 0;
		while(lo<=hi) {
			long mid=(lo+hi)/2;
			if(mid*mid<=n) {
				ans=mid;
				lo=mid+1;
			}
			
			hi=mid-1;
		}
		return ans;
	}

}
