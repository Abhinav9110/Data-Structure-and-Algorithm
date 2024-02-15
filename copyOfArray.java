package Arrays;
import java.util.*;
public class copyOfArray {
    public static void main(String[] args) {
        int[] arr={30,40,85,65,89};
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
//        int[] nums =arr; //shallow copy
//        nums[0]=70;
//        System.out.println(arr[0]);
        //deep copy
        int []brr=Arrays.copyOf(arr,arr.length);
        brr[0]=70;
        System.out.println(arr[0]);

        int[] crr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            crr[i]=arr[i];
        }
        crr[0]=100;
        System.out.println(arr[0]);
    }
}
