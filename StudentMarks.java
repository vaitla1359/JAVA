import java.util.Scanner;

public class StudentMarks {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int A,B,C; 
	    float total, Average;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the THREE Subjects Marks : ");
		A = sc.nextInt();	
		B = sc.nextInt();	
		C = sc.nextInt();	
		
		
		total = A + B + C;
		Average = total / 3;
	    
	    System.out.println(" Total Marks =  " + total);
	    System.out.println(" Average Marks =  " + Average);
	  
	}
}
