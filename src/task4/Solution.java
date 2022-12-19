package task4;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearsOfWork = scanner.nextInt();
        System.out.println("Employee works such years: " + yearsOfWork);
        double salary = scanner.nextInt();
        System.out.println("Employee salary is: " + salary);

        if (yearsOfWork >= 1 && yearsOfWork <= 3) {
            salary = salary + (salary * 0.1);
        } else if (yearsOfWork > 3) {
            salary = salary + (salary * 0.2);
        }

        if (salary < 4000) {
            salary = salary + 1000;
        } else if (salary >= 4000) {
            salary = salary + 500;
        }

        System.out.println("Employ's salary with bonus is: " + salary);
    }
}
