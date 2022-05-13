package Lec16;
//import java.util.*;
import java.util.Scanner;
public class Ascii_Codes {

	private static String st;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String str=sc.next();
        Asciicode(str);
    }
    public static void Asciicode(String str){
        String ans="";
        char prev=str.charAt(0);
        for(int i=1;i<str.length();i++){
            
			char curr=str.charAt(i);
            ans=ans+prev+(curr-prev);
            prev=curr;
        }
        ans=ans+prev;
        
		System.out.println(ans);
    }
}


