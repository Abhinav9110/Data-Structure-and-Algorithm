package Arrays;

public class mergeTwoSortedArray {
    public static void main(String[] args) {


        int[] a = {11, 33, 42, 62};
        int[] b = {26, 54, 69, 81, 94};
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        //merging
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        if (i == a.length) {
            while (j < b.length) {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if (j == b.length) {
            while (j<a.length) {
                c[k] = a[i];
                i++;
                k++;
            }
        }
        for (int ele : c) {
            System.out.print(ele + " ");
        }


        //merging from last
//        while (i >= 0 && j >=0) {
//            if (a[i] >= b[j]) {
//                c[k] = a[i];
//                i--;
//            } else {
//                c[k] = b[j];
//                j--;
//            }
//            k--;
//        }
//        //if (i == 0) {
//        while (j >=0) {
//            c[k] = b[j];
//            j--;
//            k--;
//        }
//        //}
//        //if (j == 0) {
//        while (i>=0) {
//            c[k] = a[i];
//            i--;
//            k--;
//        }
//        //}
//        for (int ele : c) {
//            System.out.print(ele + " ");
//        }
    }

}