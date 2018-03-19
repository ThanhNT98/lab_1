import java.util.Scanner;

public class MaTrix {
	public static void main(String[] args) {
		int row=0;
		int col=0;
		int m[][]=new int[row][col];
		int i,j;
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter number of rows: ");
		row=sc.nextInt();
		System.out.println("Eter number of columns: ");
		col=sc.nextInt();
		System.out.println("Enter the matrix: ");
		
		for(i=0;i<row;i++)
			for(j=0;j<col;j++)
			{
				System.out.printf("%d",m[i][j]);
			}
		
		
		
		
	}

}
