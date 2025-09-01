package assignment6;


public class StudentMarks {
    public static void main(String[] args) {
        // Array of student names
        String[] names = {"Suresh", "Mahesh", "Naresh"};

        // Array of student marks
        int[] marks = {75, 80, 82};

        // Array to store marks after adding 10
        int[] updatedMarks = new int[marks.length];
        int total = 0;

        // Add 10 marks to each student and calculate total
        for (int i = 0; i < marks.length; i++) {
            updatedMarks[i] = marks[i] + 10; // Assignment operator used
            total += updatedMarks[i];
        }

        // Calculate average
        double average = total / (double)marks.length;

        // Print updated marks
        System.out.println("Updated Marks:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + updatedMarks[i]);
        }

        // Print average
        System.out.println("Average marks after adding 10: " + average);
    }
}