package Arrays;
//Wap TO REVERSE THE ARRAY WITHOUT USING ANY EXTRA ARAY.
public class reversearray {
    public static void main(String[] args) {
        int [] arr={10,20,30,45,50};
        int n=arr.length;
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        //reverse
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

}
