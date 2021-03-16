package com;

import com.bank.S001_Two_Sum;

public class BankMain {
    public static void main(String[] args) {
        S001_Two_Sum ts = new S001_Two_Sum();
        int[] nums = {1, 3, 5, 7};
        int target = 8;
        int[] twoSum = ts.solution1(nums, target);

        for(int i=0;i<twoSum.length;i++){
        System.out.println(twoSum[i]);
        }
    }
}
