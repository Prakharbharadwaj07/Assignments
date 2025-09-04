package assignment16;

public class JavaWordSearch {
    public static void main(String[] args) {
        String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";

        // 1. Divide into multiple words (including punctuation handling)
        String[] words = paragraph.split("\\W+"); // splits by non-word characters to handle punctuation

        // 2. Find total number of occurrences and collect indexes
        String targetWord = "Java";
        int count = 0;
        System.out.print("Indexes of word \"" + targetWord + "\": ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(targetWord)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();

        // 3. Print total count
        System.out.println("Total occurrences of word \"" + targetWord + "\": " + count);
    }
}
