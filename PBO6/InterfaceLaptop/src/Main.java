/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Laptop Control ===");
        System.out.println("Choose laptop: 1. Lenovo, 2. Toshiba, 3. MacBook");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Laptop laptop;
        switch (choice) {
            case 1:
                laptop = new Lenovo();
                System.out.println("You've chosen Lenovo ThinkPad.");
                break;
            case 2:
                laptop = new Toshiba();
                System.out.println("You've chosen Toshiba Satellite.");
                break;
            case 3:
                laptop = new MacBook();
                System.out.println("You've chosen MacBook Pro.");
                break;
            default:
                System.out.println("Invalid choice. Exiting program.");
                scanner.close();
                return;
        }

        System.out.println("Do you want to power on the laptop? (yes/no)");
        String input = scanner.nextLine().toLowerCase();

        if (input.equals("yes")) {
            laptop.powerOn();

            while (true) {
                System.out.println("Do you want to adjust the volume? (yes/no)");
                input = scanner.nextLine().toLowerCase();

                if (input.equals("yes")) {
                    System.out.print("Enter volume level (0-100): ");
                    int volume = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    if (volume >= 0 && volume <= 100) {
                        laptop.setVolume(volume);
                    } else {
                        System.out.println("Invalid volume level. Please enter a value between 0 and 100.");
                    }
                } else if (input.equals("no")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                }
            }

            laptop.powerOff();
        } else {
            System.out.println("Exiting program...");
        }

        scanner.close();
    }
}
