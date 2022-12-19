package task2;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int inputData = new Scanner(System.in).nextInt();

        long factorial = 1;
        for (int i = 2; i <= inputData; i++) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
    }
}
