package com.javarush.task.task10.task1014;

/* 
Расставьте минимум static-ов
*/

public class Solution {
    public int A = 5;
    public int B = 5;
    public int C = 5;
    public static int D = 5;

    public void main(String[] args) {
        Solution solution = new Solution();
        solution.A = 5;
        solution.B = 5 * B;
        solution.C = 5 * C * D;
        Solution.D = 5 * D * C;

        Solution.D = 5;
    }

    public int getA() {
        return A;
    }

}