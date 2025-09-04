package assignment15;

public class SentenceOps {
    public static void main(String[] args) {
        String sentence = "Java programming is fun and challenging";

        // 1. Count the total number of words in the sentence
        String[] words = sentence.trim().split("\\s+");
        int wordCount = words.length;
        System.out.println("Total number of words: " + wordCount); // [web:5][web:3]

        // 2. Print the sentence words in reverse order
        System.out.print("Sentence in reverse word order: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
        System.out.println(); // [web:6][web:9]

        // 3. Convert the first character of each word to uppercase and print the original sentence
        StringBuilder capitalized = new StringBuilder();
        for (String word : words) {
            capitalized.append(Character.toUpperCase(word.charAt(0)))
                       .append(word.substring(1)).append(" ");
        }
        System.out.println("Original sentence with capitalization: " + capitalized.toString().trim()); // [web:7]
    }
}
