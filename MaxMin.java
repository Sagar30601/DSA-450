package sagar;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 2, 7, 9};
        int min=0, max=0;
        if(arr[0] > arr[1]) {
            max = arr[0];
            min = arr[1];
        } else {
            min = arr[0];
            max = arr[1];
        }
        for (int i = 2; i < arr.length; i++) {
            if(max < arr[i]) max=arr[i];
            if(min > arr[i]) min=arr[i];
        }
        System.out.println(max + " " + min);
    }
}
