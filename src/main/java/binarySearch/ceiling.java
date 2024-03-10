package binarySearch;

import java.util.Scanner;

public class ceiling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int t = scanner.nextInt();
        int i = 0, j = n-1;
        boolean flag = true;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid] == t){
                System.out.println(mid);
                flag = false;
                break;
            }
            else if(arr[mid] > t){
                j = mid-1;
            }
            else {
                i = mid + 1;
            }
        }
        if(flag)
            System.out.println(arr[j]);
    }
}
