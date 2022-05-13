package Lec1;

public class grade_card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=78;
		
		if(marks>=80)
		{
			System.out.println("grade A");
			
		}
		else if(marks>=70 && marks<80)
		{
			System.out.println("grade B");
		}
		else  if(marks>=60 && marks<70)
		{
			System.out.println("grade c");
		}
		else if(marks>=50 && marks<60) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}

}
