package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class builtinmethod {

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int [] arr=new int[7];
            //  int [] arr={10,20,21,23,25,65};
//        arr[0]=10;
//        arr[1]=20;
//        arr[2]=30;
//        arr[3]=40;
//        arr[4]=50;
//        arr[5]=60;
//        arr[6]=70;
//      input
            for(int i=0;i<=6;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);

            //output
            for(int i=0;i<=6;i++){
                System.out.println(arr[i]+" ");
            }
            //Arrays.sort(arr);

        }
    }


