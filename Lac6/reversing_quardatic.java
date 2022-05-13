package Lac6;
import java.util.Scanner;
public class reversing_quardatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//import java.util.*;
	//	public class Main {
			//public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		        // int n = sc.nextInt();
		          int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				int d = b * b - 4 * a * c;
				if (d < 0) {
					System.out.println("Imaginary");
				}

				else if (d == 0) {
					System.out.println("Real and Equal");
					int r1 = -b / (2 * a);
					System.out.println(r1 + " " + r1);
				} else {
					System.out.println("Real and Distinct");
					int r1 = (int) ((-b - Math.sqrt(d)) / (2 * a));
					int r2 = (int) ((-b + Math.sqrt(d)) / (2 * a));
					System.out.println(r1 + " " + r2);

				}

			}

		
	}


