package Arrays;

public class productofarray {
    public static void main(String[] args) {
        int [] arr={2,4,5,2};
        int n=arr.length;
        int product=1;
        for(int i=0;i<n;i++){
            product=product*arr[i];
        }
        System.out.println("The product is:"+ product);
    }
}
