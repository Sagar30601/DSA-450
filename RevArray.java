package sagar;

public class RevArray {
    static void revArray(int a[]){
        int start=0, end=a.length-1;
        int imd;
        while(start<=end){
            imd = a[start];
            a[start] = a[end];
            a[end] = imd;
            start++;
            end--;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{55, 66, 11, 98, 23, 33, 12};
        revArray(a);
    }
}
