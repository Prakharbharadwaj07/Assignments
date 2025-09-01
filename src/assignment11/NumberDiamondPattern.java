package assignment11;

public class NumberDiamondPattern {
    public static void main(String[] args) {
        int n = 5; // Maximum number in the middle row

        // Upper part of the diamond (including middle row)
        for (int i = 1; i <= n; i++) {
            // Print leading spaces for centering
            for (int s = n - i; s > 0; s--) {
                System.out.print("  ");
            }
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces for centering
            for (int s = n - i; s > 0; s--) {
                System.out.print("  ");
            }
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
