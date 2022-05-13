package lec5;
import java.util.*;
public class LCM_find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int divident = sc.nextInt();
		int divisor = sc.nextInt();
		int lcm = (divident * divisor);
		// int multiplier = divider;
		// int a=4;
		// int b=6;
		// int c=b;
		int remainder = 0;
		while (divident % divisor != 0) {
			remainder = divident % divisor;
			divident = divisor;
			divisor = remainder;
		}
		System.out.println(lcm / divisor); // I only change remainder to divisor
		// You are already having lcm = product of the two numbers that you did in line
		// 5 (int lcm = (divident * divisor);)
		// System.out.println(lcm);
	}



		
	}


