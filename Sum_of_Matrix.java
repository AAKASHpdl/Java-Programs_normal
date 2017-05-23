
import java.util.Scanner;
public class Sum_of_Matrix {
    public static void main(String [] args){
        int i,j,n;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter number of rows and colums for square Matrix");
        n=S.nextInt();
        int first[][]=new int[n][n];
        int second[][]=new int[n][n];
        int sum[][]=new int[n][n];
        System.out.println("Enter elements of first matrix");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                first[i][j]=S.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                second[i][j]=S.nextInt();
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                sum[i][j]=first[i][j]+second[i][j];
            }
        }
        System.out.println("Sum of two Matrix is");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println(" ");
        }
    }
}
