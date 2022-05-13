package Lec14;
import java.util.*;
public class Arrays_Spiral_Print_clockwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc= new Scanner(System.in);
		int n=Sc.nextInt();
		int m=Sc.nextInt();
		int [][]arr=new int [n] [m];
		for (int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr [i][j]=Sc.nextInt();
			}
		}
		display(arr);
			}
		public static void display(int [][]arr) {
		for (int row=0;row<arr[0].length;row++) {   // fixed row will be in horizontal or column wise array
			if(row %2==0) { // for even number
				for(int col=0;col<arr.length;col++) {
					System.out.print(arr[col][row]+ ", ");
				}
			}
			else {
			 	for(int col=arr.length-1;col>=0;col--) {
				System.out.print(arr[col][row]+", ");
			}
		}

		}
		System.out.print("END");
		}

		}