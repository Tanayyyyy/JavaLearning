package binarySearch;

import java.util.Arrays;


// time complexity = O(N)
public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {10,50,60,76},
                {12,90,110,120}
        };
        System.out.println(Arrays.toString(searhRowCol(arr,0)));
    }
    public static int[] searhRowCol(int[][]arr,int target){
        int[] ans = {-1,-1};
        int row = 0, col = arr[0].length - 1;
        while(row < arr.length && col > -1){
            if(target==arr[row][col]){
                ans[0] = row;
                ans[1] = col;
                break;
            }
            else if(arr[row][col] < target){
                row ++;
            }
            else{
                col --;
            }
        }
        return ans;
    }
}
