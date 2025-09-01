package assignment9;

import java.util.HashMap;
import java.util.Map;

public class EmployeeHikeCalculator {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Alice Johnson", 75000.0, 5.1, 4.2),
            new Employee("Bob Smith", 68000.0, 3.2, 3.8),
            new Employee("Carol Davis", 82000.0, 7.1, 4.5),
            new Employee("David Brown", 90000.0, 10.2, 2.5),
            new Employee("Eva Green", 60000.0, 2.4, 3.5)
        };

        Map<String, Double> hikeMap = new HashMap<>();

        for (Employee emp : employees) {
            double variablePayPerc;
            double bonus;
            double reward = 0;

            if (emp.rating >= 4.0) {
                variablePayPerc = 0.15;
                bonus = 1500;
            } else if (emp.rating >= 3.0) {
                variablePayPerc = 0.10;
                bonus = 1200;
            } else {
                variablePayPerc = 0.03;
                bonus = 300;
            }

            if (emp.experience >= 5) {
                reward = 5000;
            }

            double hike = (emp.baseSalary * variablePayPerc) + bonus + reward;
            double hikePerc = hike / emp.baseSalary;

            hikeMap.put(emp.name, hikePerc);
        }

        // Print the map with employee name and hike percentage
        for (Map.Entry<String, Double> entry : hikeMap.entrySet()) {
            System.out.printf("%s : %.4f%n", entry.getKey(), entry.getValue());
        }
    }
}
