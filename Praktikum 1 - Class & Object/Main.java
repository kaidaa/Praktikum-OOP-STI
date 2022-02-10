/**
 * Main.java
 * Class yang membantu FAANG apakah dapat promosi dan berapa besar salary yang akan didapatkannya
 * @author [NIM] [Nama]
 */

import java.lang.System;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        double baseSalary = scanner.nextDouble();
        double currrentPoints = scanner.nextDouble();
        double targetPoints = scanner.nextDouble();

        Employee employeeFaang= new Employee(name, baseSalary);
        EmployeePerformance ep = new EmployeePerformance(employeeFaang, currrentPoints, targetPoints);
        
        if (ep.isPromotable()){
            System.out.printf("YES\n");
            System.out.printf("%.2f\n", ep.getCurrentSalary());
        }else{
            System.out.printf("NO\n");
            System.out.printf("%.2f\n", 2 * targetPoints - currrentPoints);
        }

        scanner.close();
    }
}
