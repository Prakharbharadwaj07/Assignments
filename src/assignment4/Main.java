package assignment4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1. List with area of top 5 largest cities
        List<Integer> cityAreas = Arrays.asList(575300, 522700, 353010, 283123, 234545); // in km²
        int totalArea = cityAreas.get(2) + cityAreas.get(3);
        System.out.println("Total area of 3rd and 4th cities: " + totalArea + " km²");

        // 2. Set of top 10 most visited tourist attractions (using city names)
        Set<String> attractions = new HashSet<>(Arrays.asList(
                "Paris", "Bangkok", "London", "Dubai", "Singapore",
                "Kuala Lumpur", "New York City", "Istanbul", "Tokyo", "Antalya"));
        System.out.println("Tourist attractions: " + attractions);
        System.out.println("Number of attractions in set: " + attractions.size());

        // 3. Array of 10 numbers and average of 5th and 6th values
        int[] numbers = {13, 27, 35, 44, 56, 62, 77, 83, 91, 105};
        double avg = (numbers[4] + numbers[5]) / 2.0;
        System.out.println("Average of 5th and 6th value: " + avg);

        // 4. List of top 5 highest-grossing movies and print 3rd
        List<String> movies = Arrays.asList(
                "Titanic", "Avatar", "Gone with the Wind", "Star Wars", "Avengers: Endgame");
        System.out.println("Third highest-grossing movie: " + movies.get(2));
    }
}
