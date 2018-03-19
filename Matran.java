import java.util.Scanner;

public class Matran {
	public static void main(String[] args) {
        input();
        print();
        System.out.println("Sum: " +sum(matrix));
        System.out.println("Average: " + sum(matrix)/(col*row));
    }
	
	
	
	 static int col,row,matrix[][];
	    public static void input(){
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter number of rows: ");
	        row=sc.nextInt();
	        System.out.println("Enter number of columns: ");
	        col=sc.nextInt();
	        System.out.println("Enter the matrix: ");
	        matrix=new int[row][col];
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                System.out.print("  m["+i+","+j+"]=");
	                matrix[i][j]=sc.nextInt();
	            }
	            System.out.println();
	        }
	    }
	    
	    
	    public static void print(){
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	            System.out.print(matrix[i][j] +"    ");
	        }
	        System.out.println("");
	        }
	    }
	  

	  public static float sum(int matrix[][]){
	        float S = 0;
	        for (int i = 0; i<col;i++){
	            for (int j = 0; j<row;j++){
	                S+=matrix[i][j];
	            }
	        }return S;
	    }
	  
	  
}
