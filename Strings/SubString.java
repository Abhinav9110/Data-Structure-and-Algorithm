package Strings;

public class SubString {
    public static void main(String[] args) {
        String s="abcde";
//        System.out.println(s.substring(2));
//        System.out.println(s.substring(2,4));
//        System.out.println(s.substring(2,3));
        for(int i=0; i<=5;i++){
            for(int j=i+1;j<=5;j++){
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }

    }
}
