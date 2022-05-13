package lec4;
import java.util.*;
public class prime_no {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		 int num=0;
         for(int i=2;i<n;i++){
            if(n%i==0){
                num++;
            } 
         }
         if(num>=1){
             System.out.print("Not Prime");
         }else{
             System.out.print("Prime");
         }
     	}   
	}     