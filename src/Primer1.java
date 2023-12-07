import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String shortestString = "";
        String longestString = "";

        for (int i = 0; i < 3; i++) {
            System.out.print("Введите строку: ");
            String input = scanner.nextLine();

            if (shortestString.isEmpty() || input.length() < shortestString.length()) {
                shortestString = input;
            }

            if (longestString.isEmpty() || input.length() > longestString.length()) {
                longestString = input;
            }
        }

        System.out.println("Самая короткая строка: " + shortestString + ", длина: " + shortestString.length());
        System.out.println("Самая длинная строка: " + longestString + ", длина: " + longestString.length());
    }
}
