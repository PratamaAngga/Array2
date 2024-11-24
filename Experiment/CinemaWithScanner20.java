package Experiment;
import java.util.Scanner;
public class CinemaWithScanner20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, column;
        String name, next;
        String audience[][] = new String[4][2];
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1: Input audience data");
            System.out.println("2: Show audience list");
            System.out.println("3: Exit");
            System.out.print("What do you want to do? (Enter menu number): ");
            String menu = sc.nextLine();
            switch (menu) {
                case "1":
                    while (true) {
                        System.out.print("Enter a name : ");
                        name = sc.nextLine();
                        System.out.print("Enter row number : ");
                        row = sc.nextInt();
                        System.out.print("Enter column number : ");
                        column = sc.nextInt();
                        sc.nextLine();
            
                        if (audience[row - 1][column - 1] != null) {
                            System.out.println("This seat is already occupied by " + audience[row - 1][column - 1] + ". Please choose another seat.");
                        } else if (row >= 1 && row <= 4 && column >= 1 && column <= 2) {
                            audience[row - 1][column - 1] = name;
                        } else {
                            System.out.println("Invalid row or column number. Try again.");
                        }
                        System.out.print("Are there any other audience to be added? (y/n) : ");
                        next = sc.nextLine();
            
                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;
                case "2":
                    System.out.println("\nAudience List:");
                    for (int i = 0; i < audience.length; i++) {
                        for (int j = 0; j < audience[i].length; j++) {
                            if (audience[i][j] != null) {
                                System.out.println(audience[i][j]);
                            } else {
                                System.out.println("***");
                            }
                        }
                    }
                    break;
                case "3":
                    System.out.println("Exiting the Program!");
                    return;
                default:
                    System.out.println("Invalid menu option!");
                    break;
            }
        }
    }
}
