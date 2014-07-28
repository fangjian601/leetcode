package me.fangjian.leetcode.array.closest3sum;

/**
 * Created at 7/27/14
 *
 * @author Jian Fang (jfang@rocketfuelinc.com)
 */
public class Solution {

    private void swap(int[] num, int i, int j){
        int tmp = num[i];
        num[i] = num[j];
        num[j] = tmp;
    }

    private int partition(int[] num, int start, int end){
        int pivotIndex = start;
        int pivot = num[pivotIndex];
        swap(num, pivotIndex, end);
        int storeIndex = start;
        for(int i = start; i < end; i++){
            if(num[i] <= pivot){
                swap(num, i, storeIndex);
                storeIndex++;
            }
        }
        swap(num, storeIndex, end);
        return storeIndex;
    }

    private void quickSort(int[] num, int start, int end){
        if(end - start > 0){
            int index = partition(num, start, end);
            quickSort(num, start, index - 1);
            quickSort(num, index + 1, end);
        }
    }

    public int threeSumClosest(int[] num, int target) {
        quickSort(num, 0, num.length - 1);
        int closest = -1;
        int sum = 0;
        for(int i = 0; i < num.length; i++){
            int j = i + 1;
            int k = num.length - 1;
            while(j < k){
                if(closest < 0){
                    closest = Math.abs(num[i] + num[j] + num[k] - target);
                    sum = num[i] + num[j] + num[k];
                }
                if(num[i] + num[j] + num[k] >= target){
                    if(num[i] + num[j] + num[k] - target < closest){
                        closest = num[i] + num[j] + num[k] - target;
                        sum = num[i] + num[j] + num[k];
                    }
                    k--;
                } else {
                    if(target - (num[i] + num[j] + num[k]) < closest){
                        closest = target - (num[i] + num[j] + num[k]);
                        sum = num[i] + num[j] + num[k];
                    }
                    j++;
                }
            }
        }
        return sum;
    }
}
