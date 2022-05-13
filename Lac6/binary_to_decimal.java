
package Lac6;
import java.util.*;
public class binary_to_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int n=10010;
		    int mul=1;
		    int ans=0;
		    while(n>0){
		        int rem=n%10;
		        mul=mul*2;
		        n/=10;
		    }
		    System.out.print(ans);
		        
		    }
		}
		    