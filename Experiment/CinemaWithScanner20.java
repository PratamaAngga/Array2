package Experiment;
import java.util.Scanner;
public class CinemaWithScanner20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, column;
        String name, next;
        String audience[][] = new String[4][2];
        while (true) {
            System.out.print("Enter a name : ");
            name = sc.nextLine();
            System.out.print("Enter row number : ");
            row = sc.nextInt();
            System.out.print("Enter column number : ");
            column = sc.nextInt();
            sc.nextLine();

            audience[row-1][column-1] = name;
            System.out.print("Are there any other audience to be added? (y/n) : ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
