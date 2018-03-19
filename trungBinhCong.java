import java.util.Scanner;

public class trungBinhCong {

		
			public static void main(String[] args) {
				double num1, num2, num3, num4, num5, result;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the 1st number: ");
				num1=sc.nextDouble();
				System.out.println("Enter the 2nd number: ");
				num2=sc.nextDouble();
				System.out.println("Enter the 3th number: ");
				num3=sc.nextDouble();
				System.out.println("Enter the 4th number: ");
				num4=sc.nextDouble();
				System.out.println("Enter the 5th number: ");
				num5=sc.nextDouble();
				result=(num1+num2+num3+num4+num5)/5;
				System.out.println("Result = "+result);
				sc.close();
				
			}

		


	}
