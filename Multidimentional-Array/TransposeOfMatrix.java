package MultidimentionalArrays;

public class TransposeOfMatrix {
    public static void main(String[] args) {


        int[][] arr = {{2, 5, 4}, {3, 5, 7}, { 7, 8, 9}};
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
             System.out.println();
        }
        System.out.println();
        System.out.println("Transpose Matrix IS");
//        for( int j=0;j<n;j++){//cols
//            for(int i=0;i<m;i++){ //rows
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
        //storing transpose in a new matrix
        int[][] transpose=new int[n][m];
        for(int i=0;i<n;i++){//cols
            for(int j=0;j<m;j++){//rows
                transpose[i][j]=arr[j][i];
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();

        }
    }
}