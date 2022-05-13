package lec5;
import java.util.*;
public class Print_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int fact=0;
		for(int i = 2;i<=n;i++)
		{
			fact=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					fact=1;
				}
			}
			if(fact==0)
			{
				System.out.println(i);
			}
		}
	}
}
