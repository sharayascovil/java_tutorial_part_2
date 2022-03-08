package Tutorial1;

import java.util.Scanner;


public class Application {
    private static Scanner scanner;

    public static void main(String[] args) {
        
        scanner = new Scanner(System.in);

        int value = 0;
        do {
            System.out.println("Enter a number: ");
            value = scanner.nextInt();

        }
        while(value != 5);

        System.out.println("Got 5!");

    }
}