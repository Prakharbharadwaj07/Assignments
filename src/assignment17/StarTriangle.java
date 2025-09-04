package assignment17;

public class StarTriangle {
    public static void main(String[] args) {
        int rows = 5;  // Number of rows for the triangle

        for (int i = 1; i <= rows; i++) {
            // Print i stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
