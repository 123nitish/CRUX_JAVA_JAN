package Lac6;
import java.util.*;
public class F_TO_C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		         //int  = sc.nextInt();
		         int mim= sc.nextInt();
		         int max=sc.nextInt();
		         int step=sc.nextInt();
		            int i,C;
		           //int n=100;
		        for(i=mim;i<=max;i=i+step){
		            C=((i-32)*5)/9;
		            System.out.println(i+"\t"+C);
		           // break;
		        }
		    }


	}

