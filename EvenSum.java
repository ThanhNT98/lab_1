import java.util.Scanner;

public class EvenSum {

	public static void main(String[] args) {
		int n;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Enter a positive number (less than 100): ");
		n=sc.nextInt();
		}
		while (n>100);
		for (int i = 0; i <= n; i++) {
			if(i%2==0) {
				sum+=i;
			}
			
		}
		System.out.println("Sum of even numbers: "+sum);
	}

}
