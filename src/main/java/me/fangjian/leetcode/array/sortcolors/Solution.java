package me.fangjian.leetcode.array.sortcolors;

/**
 * Created at 7/29/14
 *
 * https://oj.leetcode.com/problems/sort-colors/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {

    private void swap(int[] A, int i, int j){
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

    public void sortColors(int[] A) {
        if(A.length > 1){
            int redIndex = 0;
            int blueIndex = A.length - 1;
            for(int i = 0; i <= blueIndex; i++){
                if(A[i] == 0){
                    if(redIndex != i){
                        swap(A, redIndex, i);
                        i--;
                    }
                    redIndex++;

                } else if(A[i] == 2){
                    if(blueIndex != i){
                        swap(A, blueIndex, i);
                        i--;
                    }
                    blueIndex--;
                }
            }
        }
    }
}
