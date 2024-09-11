package introcontrol;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int y = 0;

        for(int i = 1; i <= 5; i++){
            System.out.println("Kérem az " + (i) + ". számot: ");
            int x = scanner.nextInt();
            y += x;

        }

        System.out.println("A bekért számok összege: " +y);

    }
}
