package BasicSortingAlgorithm;

public class IfArrayIsSortedOrNot {
    public static void main(String[] args) {
        int arr[]={2,4,8,9};
        int n=arr.length;
        boolean a=true;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1])
                a=false;
            break;
        }
        if(a==true){
            System.out.println("Sorted");
        }else{
            System.out.println("Unsorted");
        }
    }
}
