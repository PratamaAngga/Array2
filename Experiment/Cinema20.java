package Experiment;

public class Cinema20 {
    public static void main(String[] args) {
        String audience[][] = new String[4][2];
        audience[0][0] = "Amin";
        audience[0][1] = "Bena";
        audience[1][0] = "Candra";
        audience[1][1] = "Dela";
        audience[2][0] = "Eka";
        audience[2][1] = "Farhan";
        audience[3][0] = "Gisel";
        audience[3][1] = "Hana";

        System.out.printf("%s \t %s\n", audience[0][0], audience[0][1]);
        System.out.printf("%s \t %s\n", audience[1][0], audience[1][1]);
        System.out.printf("%s \t %s\n", audience[2][0], audience[2][1]);
        System.out.printf("%s \t %s\n", audience[3][0], audience[3][1]);

        System.out.println(audience.length);
        for (String[] rowAudience : audience) {
            System.out.println("Length of row: " + rowAudience.length);
        }

        System.out.println("Audiences in the row 3: ");
        for (int i = 0; i < audience.length; i++) {
            System.out.println("Audience in the row: " + (i + 1) + String.join(", ", audience[i]));
        }
    }
}