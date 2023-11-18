import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row and column of Matrices: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println("Enter Matrix A ");
        int[][] A = new int[m][n];
        for(int  i=0; i<m;i++){
            for(int j=0; j<n;j++){
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter Matrix B");
        int[][] B = new int[m][n];
        for(int  i=0; i<m;i++){
            for(int j=0; j<n;j++){
                B[i][j] = scanner.nextInt();
            }
        }

        int[][] R = new int[m][n];
        for(int  i=0; i<m;i++){
            for(int j=0; j<n;j++){
                R[i][j] = A[i][j]+B[i][j];
            }
        }

        System.out.println("Resultant Matrix");
        for(int i=0 ; i<m ;i++){
            for(int j=0 ; j<n ; j++){
                System.out.print(R[i][j]+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}