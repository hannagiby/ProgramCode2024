package java2024;
import java.util.Scanner;
public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		int row1, col1, row2, col2; 
		System.out.println("Enter the no.of rows of matrix 1:");
		row1=sc.nextInt();
		System.out.println("Enter the no.of coloumns of matrix 1:");
		col1=sc.nextInt();
        int mat1[][]=new int[row1][col1]; 
		System.out.println("Enter the no.of rows of matrix 2:");
		row2=sc.nextInt();

		System.out.println("Enter the no.of coloumns of matrix 2:");
		col2=sc.nextInt();
		int mat2[][]=new int[row2][col2];
		if(row2!=col1) {

		System.out.println("Multiplication is not possible"); }

		else {
		System.out.println("Enter the elements of matrix 1:");

		for(int i=0;i<row1;i++) {

		for(int j=0;j<col1;j++) {

		mat1[i][j]=sc.nextInt();

		}

		}

		System.out.println("Enter the elements of matrix 2:");

		for(int i=0; i<row2;i++) {

		for(int j=0 ;j<col2;j++) {

		mat2[i][j]=sc.nextInt();

		}

		}

		System.out.println("Matrix 1:");

		for(int i = 0;i<row1;i++) {

		for(int j = 0 ;j<col1;j++) {

		System.out.print(mat1[i][j]+"\t");

		}

		System.out.print("\n");

		}

		System.out.println("Matrix 2:");

		for(int i = 0; i<row2;i++) {

		for(int j= 0 ;j<col2;j++) {


		System.out.print(mat2[i][j]+"\t");
		}


		System.out.print("\n");
		}

		int mat3[][]=new int[row1][col2];

		for(int i=0;i<row1;i++) {

		for(int j=0;j<col2;j++) {

		for(int k=0;k<col1;k++) {

		mat3[i][j]+=mat1[i][k]*mat2[k][j];

		}

		}

		}

		System.out.println("Product of the two matrices:");

		for(int i=0;i<row1;i++) {

		for(int j=0;j<col2;j++) { 
			System.out.print(mat3[i][j]+"\t");

		}

		System.out.print("\n");

		}

		}

		sc.close();


	}

}
