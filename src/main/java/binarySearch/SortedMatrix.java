package binarySearch;

import java.util.Arrays;


// time complexity = O(log(n)+log(m))
public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {10,50,60,76},
                {80,90,110,120}
        };
        System.out.println(Arrays.toString(searhRowCol(arr,3)));
    }
    public static int[] searhRowCol(int[][]arr,int target){
        int[] ans = {-1,-1};
        int row_start = 0, row_end = arr.length-1;
        int mid_col = arr[0].length/2;
        while(row_start < row_end){
            int mid_row = (row_end+row_start)/2;
            if(target == arr[mid_row][mid_col]){
                ans[0] = mid_row;
                ans[1] = mid_col;
                break;
            }
            else if(target < arr[mid_row][mid_col]){
                row_end --;
            }
            else{
                row_start ++;
            }
        }
        int row = row_end;
        int s = 0, e = arr[0].length-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(target == arr[row][mid]){
                ans[0] = row;
                ans[1] = mid;
                break;
            }
            else if(arr[row][mid]<target){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return ans;
    }
}
