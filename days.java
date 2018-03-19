import java.util.Scanner;

public class days {

	public static void main(String[] args) {
		int n;
		Scanner scan=new Scanner(System.in);
		do {
		System.out.println("Enter a number (from 1 to 7): ");
		n=scan.nextInt();
		
		switch (n) {
		case 1:System.out.println("Sunday");
		       break;
		case 2: System.out.println("Monday");
		       break;
		case 3: System.out.println("Tuesday");
			   break;
		case 4: System.out.println("wednesday");
		       break;
		case 5: System.out.println("Thursday");
	           break;
		case 6: System.out.println("Friday");
			   break;
		case 7: System.out.println("Saturday");
		       break;
	

		default:System.out.println("Ahihi");
	       break;
	   	
			
		}
		}
		while(n<7);
		

	}

}
