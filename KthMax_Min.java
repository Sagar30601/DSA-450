package sagar;
import java.util.*;

import java.util.Arrays;

public class KthMax_Min {
    public static void main(String[] args) {
        Integer[] a = {22, 5, 9, 35, 1};
        int k = 2;
        int l = 3;
        kthSmallest(a, k);
        kthLargest(a, l);
    }

    static void kthSmallest(Integer a[], int k) {
        Arrays.sort(a);
        System.out.println(a[k-1]);
    }

    static void kthLargest(Integer a[], int l) {
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(a[l-1]);
    }
}
