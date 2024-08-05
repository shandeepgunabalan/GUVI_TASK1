package task4;

import java.util.Scanner;

public class WeekdayArray {
    public static void main(String[] args) {
        // Array to store the names of weekdays starting from Sunday
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day position (0-6): ");
        
        try {
            int dayIndex = scanner.nextInt();
            System.out.println("Day at position " + dayIndex + " is " + weekdays[dayIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Invalid day index. Please enter a number between 0 and 6.");
        } catch (Exception e) {
            System.err.println("Invalid input. Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }
}