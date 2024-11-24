public class Assignment {
    public static void main(String[] args) {
        int array[][] = {
            {1, 2, 3, 4, 5, 1},
            {1, 2, 3, 4, 5, 2},
            {1, 2, 3, 4, 5, 3},
            {1, 2, 3, 4, 5, 4},
            {1, 2, 3, 4, 5, 5},
            {1, 2, 3, 4, 1, 2},
            {1, 2, 3, 4, 1, 3},
            {1, 2, 3, 4, 1, 4},
            {1, 2, 3, 4, 1, 5},
            {1, 2, 3, 4, 2, 1}
        };
        int respon, question, totalRespon, totalQuestion, totalSemua = 0;
        double rerataRespon, rerataQuestion, rerataSemua;

        // Display the survey results
        System.out.println("\nDisplay the survey results:");
        for (respon = 0; respon < array.length; respon++) {
            for (question = 0; question < array[respon].length; question++) {
                System.out.printf("Row %d, Column %d: %s\n", respon + 1, question + 1, array[respon][question]);
            }
        }
        System.out.println("------------------------------------------");
        // Display the average value for each respondent
        System.out.println("\nDisplay the average value for each respondent");
        for (respon = 0; respon < array.length; respon++) {
            totalRespon = 0;
            for (question = 0; question < array[respon].length; question++) {
                totalRespon += array[respon][question];
            }
            rerataRespon = (double) totalRespon / array[respon].length;
            System.out.println("Average value for this respondent is: " + rerataRespon);
        }
        System.out.println("------------------------------------------");
        // Display the average value for each questions
        System.out.println("\nDisplay the average value for each questions");
        for (question = 0; question < 6; question++) {
            totalQuestion = 0;
            for (respon = 0; respon < array.length; respon++) {
                totalQuestion += array[respon][question];
            }
            rerataQuestion = (double) totalQuestion / array.length;
            System.out.println("Average value for this questions is: " + rerataQuestion);
        }
        System.out.println("------------------------------------------");
        //  Display the overall average value
        System.out.println("\nDisplay the overall average value");
        for (respon = 0; respon < array.length; respon++) {
            for (question = 0; question < array[respon].length; question++) {
                totalSemua += array[respon][question];
            }
        }
        rerataSemua = (double) totalSemua / 60;
        System.out.println("Overall average value is: " + rerataSemua);
    }
}
