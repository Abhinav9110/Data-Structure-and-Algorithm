package MultidimentionalArrays;

public class largestElement {
    public static void main(String[] args) {
        int [][] arr={{1,2,5},{8,9,7},{3,5,7}};
        int mx=Integer.MIN_VALUE;
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mx=Math.max(mx,arr[i][j]);
            }
        }
        System.out.println(mx);
    }
}
