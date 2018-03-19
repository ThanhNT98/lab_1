import java.util.Scanner;

public class sumFirstOddNum {

	public static void main(String[] args) {
		int n,x,i;
		int sum=0;
		Scanner sc= new Scanner (System.in);
		do {
		System.out.println("Enter a number(>=20): ");
		n=sc.nextInt();
		}
		while(n<20);
		System.out.println("Eter a number: ");
		x=sc.nextInt();
		for ( i = 1; i <= x; i++) {
			sum+=i*2;
		}
		System.out.printf("Sum of the %d first even numbers:%d  ",x,sum);	
		
		
		

	}

}
