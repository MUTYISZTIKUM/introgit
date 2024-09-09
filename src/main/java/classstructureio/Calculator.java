package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculator app");
        System.out.println("Első szám: ");
        int a = scanner.nextInt();

        System.out.println("Második szám: ");
        int b = scanner.nextInt();

        System.out.println(a + " + " + b);
        System.out.println(a + b);
    }
}
