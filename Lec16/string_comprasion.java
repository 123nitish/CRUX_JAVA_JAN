package Lec16;
import java.util.*;
public class string_comprasion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String str=sc.next();
stringcompression(str);
	}

	public static void stringcompression(String str) {
		// TODO Auto-generated method stub
		char pre=str.charAt(0);
		int count=1;
		//Object ans;
		String ans="";
		for(int i=1;i<str.length();i++) {
			char curr=str.charAt(i);
			if(pre==curr) {
				count++;
			}
			else {
		ans=ans+pre+count;
		pre=curr;
		count=1;
	}
}


 ans=ans+str.charAt(str.length()-1)+count;
System.out.println(ans);

	}

	
	}
	
	


