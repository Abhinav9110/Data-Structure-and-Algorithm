package Arrays;
import java.util.Scanner;
public class Linearsearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter target element");
        int x=sc.nextInt();
        System.out.println("Enter the array size:");
        int n =sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Array element: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean flag=false; //flag means not found
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                //System.out.println("Element Found");
                flag=true; //true means found
                break;
            }
        }
        if(flag == true){
            System.out.println("Element found");

        }
        else System.out.println("Not Found");


    }
}
