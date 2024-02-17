package Arrays;

public class sort0and1 {
    public static void main(String[] args) {
        int []arr={1,0,0,0,1,1,1,0,0,1,0};
        int n=arr.length;
        int noOfZeros =0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) noOfZeros++;
        }
        for(int i=0;i<n;i++){
            if(i<noOfZeros) arr[i]=0;
            else arr[i]=1;
        }
        //method one pass solutions
//        int i=0,j=n-1;
//        while(i<j){
//            if(arr[i]==0) i++;
//            if (arr[j]==1) j--;
//            if(i<j && arr[i]==1 && arr[j]==0){
//                arr[i]=0;
//                arr[j]=1;
//                i++;
//                j--;
//            }
//        }

       for( int ele: arr) {
           System.out.print(ele+" ");
       }


    }
}
