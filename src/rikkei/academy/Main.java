package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter width: ");
        width = scanner.nextFloat();
        System.out.println("enter the height: ");
        height = scanner.nextFloat();
        float area = width*height;
        System.out.println("area is "+ area);
    }
}
