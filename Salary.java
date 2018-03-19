import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		int Pack;
		int Distance;
		int Shift;
		int Feedback;
		int Call;
		int Electric;
		int Other;
		double salary;
		Scanner sc=new Scanner(System.in);
		System.out.println("Eter package number: ");
		Pack=sc.nextInt();
		System.out.println("Eter distance number: ");
		Distance=sc.nextInt();
		System.out.println("Eter shift number: ");
		Shift=sc.nextInt();
		System.out.println("Eter feedback grade: ");
		Feedback=sc.nextInt();
		System.out.println("Eter the call amount: ");
		Call=sc.nextInt();
		System.out.println("Eter the electricity payment: ");
		Electric=sc.nextInt();
		System.out.println("Eter the other payment: ");
		Other=sc.nextInt();
		
		salary=Pack*50+Distance*75+Shift*50*0.1+Feedback+Call+Electric+Other;
		System.out.println("The salary is "+salary);
		
		

	}

}
