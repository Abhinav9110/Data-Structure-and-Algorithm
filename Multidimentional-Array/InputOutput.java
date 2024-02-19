package MultidimentionalArrays;
import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] arr=new int[3][3];
        int m=arr.length; //no of rows/lines
        int n=arr[0].length; //no of cols
        System.out.println(n);
        //Input of 2D array
        for(int i=0;i<3;i++){
          for(int j=0;j<3;j++){
              arr[i][j]=sc.nextInt();
          }
        }
        //Output of 2D Array
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
