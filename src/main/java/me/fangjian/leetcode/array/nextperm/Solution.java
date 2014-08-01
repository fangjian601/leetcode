package me.fangjian.leetcode.array.nextperm;

/**
 * Created at 7/31/14
 *
 * https://oj.leetcode.com/problems/next-permutation/
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {
    private void swap(int[] num, int i, int j){
        int tmp = num[i];
        num[i] = num[j];
        num[j] = tmp;
    }

    private void reverseSortedArray(int[] num, int start, int end){
        int len = end - start + 1;
        if(len > 1){
            int i = start, j = end;
            while(i < j){
                swap(num, i, j);
                i++;
                j--;
            }
        }
    }

    public void nextPermutation(int[] num) {
        int index = -1;
        for(int i = num.length - 1; i > 0; i--){
            if(num[i] > num[i - 1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            reverseSortedArray(num, 0, num.length - 1);
        } else {
            int swapIndex = index;
            while(swapIndex < num.length - 1 && num[index - 1] < num[swapIndex + 1]){
                swapIndex++;
            }
            swap(num, index - 1, swapIndex);
            reverseSortedArray(num, index, num.length - 1);
        }
    }
}
