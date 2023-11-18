import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row and column of Matrix A : ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.print("Enter row and column of Matrix B : ");
        int n1 = scanner.nextInt();
        int k = scanner.nextInt();

        if(n1 != n){
            System.out.println("Cannot perform multiplication on A and B");
        }
        else{
            System.out.println("Enter Matrix A");
            int[][] A = new int[m][n];
            for(int  i=0; i<m;i++){
                for(int j=0; j<n;j++){
                    A[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Enter Matrix B");
            int[][] B = new int[n][k];
            for(int  i=0; i<n;i++){
                for(int j=0; j<k;j++){
                    B[i][j] = scanner.nextInt();
                }
            }

            int[][] R = new int[m][k];

            for(int i=0 ; i<m ;i++){
                for(int j=0 ; j<k ; j++){
                    R[i][j] = 0;
                    for(int l=0 ; l<n ; l++){
                       R[i][j] = R[i][j] + (A[i][l] * B[l][j]); 
                    }
                }
            }
            System.out.println("Resultant Matrix");
            for(int i=0 ; i<m ;i++){
                for(int j=0 ; j<k ; j++){
                    System.out.print(R[i][j]+" ");
                }
                System.out.println();
            }

        }
        scanner.close();
    }
}