package statements;

import java.util.Scanner;

public class DivByThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérek egy egész számot: ");
        int x = scanner.nextInt();

        if (x%3 == 1) {
            System.out.println("A megadott szám nem osztható 3 - al ");
        }
        else {
            System.out.println("A megadott szám osztható 3 - al ");
        }
    }

}
