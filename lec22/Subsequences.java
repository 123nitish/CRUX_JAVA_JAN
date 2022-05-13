package lec22;
import java.util.*;
public class Subsequences {
	static int count=0;

	public static void main(String[] args) {
		String str="abcd";
		subsequence(str," ");
		// TODO Auto-generated method stub

	}

	public static void subsequence(String ques, String ans) {
		
		// TODO Auto-generated method stub
		if(ques.length()==0) {
			System.out.print(ans);
			count++;
			return;
		}
		char ch= ques.charAt(0);
		 subsequence(ques.substring(1),ans);
		 subsequence(ques.substring(1),ans+ch);
		// return(count);
	}
}
	
	




