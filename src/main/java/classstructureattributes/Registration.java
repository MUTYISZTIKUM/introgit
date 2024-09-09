package classstructureattributes;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Mail: ");
        String mail = scanner.nextLine();

        System.out.println("Regisztrált adatok: \nNeve: " + name + "\nMail címe: " + mail);

    }
}
