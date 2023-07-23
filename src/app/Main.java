package app;

import app.FileReadService;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        getMenu();
    }
    public static void getMenu(){
        Scanner scanner = new Scanner(System.in);
        Scanner tx = new Scanner(System.in);
        while (true) {
            System.out.print("""
                    Menu:
                    1. Create and save file.
                    2. Read file.
                    0. Exit.
                                 """);
            int choice = 0;
          try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
              scanner.nextLine();
           System.out.print("Wrong input ");
             System.out.println(" ");
            continue;
            }
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter name file.");
                    String name = tx.nextLine();
                    System.out.println("Enter text in to your file");
                    String text = tx.nextLine();
                    FileWriteService fw = new FileWriteService();
                    String write = fw.writeToFile(name, text);
                    System.out.println(write);
                }
                case 2 -> {
                    System.out.println("Enter name file");
                    String name = tx.nextLine();
                    FileReadService fr = new FileReadService();
                    String read = fr.readFromFile(name);
                    System.out.println("File content: ");
                    System.out.println(read);
                }
                case 0 -> {
                    System.out.println("Bye.");
                    System.exit(0);
                }
                default -> {
                    System.out.println("The choice is not correct.");
                }
            }
        }
    }
}
