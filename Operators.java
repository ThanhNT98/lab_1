import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		double num1, num2;
		double result=0;
		int choice;
		System.out.println("Welcome to java program.");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		num1=sc.nextDouble();
		System.out.println("Enter the sencond number: ");
		num2=sc.nextDouble();
		
		do {
			System.out.println("Select operation: ");
			System.out.println("1-Add");
			System.out.println("2-Sub");
			System.out.println("3-Mul");
			System.out.println("4-Div");
			System.out.println("5-Exit");
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1: result=num1+num2;
			        System.out.println("Sum: "+result);
			        break;
			case 2: result=num1-num2;
	                System.out.println("Sub: "+result);
	                break;
			case 3: result=num1*num2;
			        System.out.println("Mul: "+result);
			        break;
			case 4: if(num2 ==0) System.out.println("The operator is not correct! Please try again.");
					else { result=num1/num2;
			               System.out.println("Div: "+result);
					}
			        break;
			default: System.out.println("Goodbye!");
			}
		}
			while(choice>0 && choice<5);
			
			
			
		
		
		
			
		

	}

}
