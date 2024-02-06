package Arrays;

public class MaximumValue {
    public static void main(String[] args) {
        int []arr={10,8,43,74,89};
        int mx=arr[0];
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
            //System.out.println(mx);
        }
        System.out.println(mx);
    }
}
