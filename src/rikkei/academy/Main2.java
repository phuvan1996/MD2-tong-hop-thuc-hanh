package rikkei.academy;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("linear equation resolver");
        System.out.println("given a equation 'a*x+b=c' , please enter constants");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a : ");
        double a = scanner.nextDouble();
        System.out.println("enter b : ");
        double b = scanner.nextDouble();
        System.out.println("enter the c ");
        double c = scanner.nextDouble();
        if (a!=0){
            double x = (c-b)/a;
            System.out.println(" equation pass width x = "+x);
        }else {
            if (b==c){
                System.out.println("the solution is all x !");
            }else {
                System.out.println("no solution");
            }
        }
    }
}
