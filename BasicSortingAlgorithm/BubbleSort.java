package BasicSortingAlgorithm;

public class BubbleSort {
    public static void print(int[] arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    public static void bubblesort(int arr[]){
    int n=arr.length;
    for(int i=0;i<n;i++){
        boolean flag=true;
        for(int j=0;j<n-1-i;j++){
        if(arr[j]>arr[j+1]) {
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
            flag=false;
        }
        }
        if (flag==true) break;
    }

    }

    public static void main(String[] args) {

        int arr[]={8,6,9,7,8};
        print(arr);
        bubblesort(arr);
        print(arr);
    }
}

