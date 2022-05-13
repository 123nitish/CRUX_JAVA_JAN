package Lec16;
import java.util.*;
public class is_palidrom_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		System.out.println(ispalodromstring(n));
	}

public static boolean ispalodromstring(String s) {

	int i=0;
	int j=s.length()-1;
	while(i<j) {
		if(s.charAt(i)!=s.charAt(j)) {
		return false;
	}
	i++;
	j--;
	}

		return true;
}
}

	



