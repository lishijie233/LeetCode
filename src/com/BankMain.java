package com;

import com.bank.S001_Two_Sum;

public class BankMain {
    public static void main(String[] args) {
        S001_Two_Sum ts = new S001_Two_Sum();
//        int[] nums = {1, 3, 5, 7};// 这里有两种答案
        int[] nums = {1, 4, 5, 7};
        int target = 8;
        int[] solution1 = ts.solution1(nums, target);

        for(int i=0;i<solution1.length;i++){
        System.out.println(solution1[i]);
        }
        //
        int[] solution2 = ts.solution2(nums, target);

        for(int i=0;i<solution2.length;i++){
            System.out.println(solution2[i]);
        }
    }
}
