import java.util.Scanner;

public class IncomeTax {
	public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of income for the year: ");
        double income = input.nextDouble();

        double tax = 0;

        if (income <= 180000)
            tax = 0;
        else if (180001<= income && income <= 300000)
            tax =  (income) * 0.10;
        else if  (300001<= income && income <= 500000)
            tax =  (income) * 0.20;
        else if  (500001<= income && income <= 1000000)
            tax =  (income) * 0.30;
       
        if (income <=  180000)
            System.out.println("Tax Payable is Zero:" + tax);
        else if (180001<= income && income <= 300000)
            System.out.println("Tax Payable is 10%:" + tax);
        else if (300001<= income && income <= 500000)
            System.out.println("Tax Payable is 20%:"+ tax);
        else if (500001<= income && income <= 1000000)
            System.out.println("Tax Payable is 30%:"+ tax);
        
    }
}
