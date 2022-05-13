package lec23;
import java.util.*;

public class Board_path {
	//import java.util.*;
	//ublic class Board_path {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			int n= sc.nextInt();
			int m=sc.nextInt();
			System.out.println("\n" +Boardpath(n,m,0," "));
		}
		public static int Boardpath(int end,int m,int curr,String ans) {
	 if(curr==end) {
		System.out.print(ans+" ");
		return 1;
	}
	{
		if(curr>end) {
			return 0;
		}
	}
	int count = 0;
	for (int dice = 1; dice <= m; dice++) {
		count = count + Boardpath(end, m, curr + dice, ans + dice);
			}
	return count;
		}
	}