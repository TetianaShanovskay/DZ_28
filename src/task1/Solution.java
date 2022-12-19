package task1;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int inputData = new Scanner(System.in).nextInt();

        if (String.valueOf(inputData).length() > 3) {
            System.out.println("Number is not correct");
        }

        int tail = inputData % 10;
        inputData = inputData / 10;
        int middle = inputData % 10;
        inputData = inputData / 10;
        int head = inputData % 10;

        System.out.println("Result " + (head + middle + tail));
    }
}
