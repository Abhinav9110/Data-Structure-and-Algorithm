package Arrays;

public class secondlargest {
    public static void main(String[] args) {
        int []arr={10,8,43,74,89};
        int mx=arr[0];
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }

        }
        System.out.println(mx);
        int smax=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]!=mx && arr[i]>smax){
                smax=arr[i];
            }

        }
        System.out.println(smax);

    }
}
