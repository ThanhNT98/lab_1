import java.util.Scanner;

public class chuVi_dienTich {

	public static void main(String[] args) {
		double length, width;
		double area, cir;
		Scanner sc=new Scanner (System.in);
		System.out.println("Nhap chieu dai: ");
		length=sc.nextDouble();
		System.out.println("Nhap chieu rong: ");
		width=sc.nextDouble();
		area=length*width;
		cir=(length+width)*2;
		System.out.println("Area = "+area);
		System.out.println("Circumference = "+cir);
		
	}

}
