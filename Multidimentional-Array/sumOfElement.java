package MultidimentionalArrays;

public class sumOfElement {
    public static void main(String[] args) {
        int [][] arr={{5,6,7},{4,5,7},{3,5,9}};
        int m=arr.length;
        int n=arr[0].length;
        int sum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println("Sum :"+sum);
    }
}
