public class AddTwoMatrix {
    public static void main(String[] args) {
        int [][] a={{1,8,9},{5,8,7},{4,2,3}};
        int [][] b={{4,2,7},{5,6,8},{3,5,8}};
        int m=a.length;
        int n=b[0].length;
        int [][] res=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int [] ele:res){
            for( int x :ele){
                System.out.print(x +" ");
            }
            System.out.println();
        }
    }
}
