import java.util.Scanner;

public class sumOdd {

	public static void main(String[] args) {
		int x,y,i;
		int sum=0, count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two positive numbers: ");
		x=sc.nextInt();
		y=sc.nextInt();
		for(i=x; i<=y;i++) {
			if(i%2 != 0) {
				sum+=i;
				count++;
			}
		}
		System.out.println("There are %d odd numbers: "+count);
		System.out.printf("Sum of odd numbers form %d to %d: %d ",x,y,sum);
		
		
	}

}
