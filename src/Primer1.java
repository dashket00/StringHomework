import java.util.Scanner;

public class Primer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String shortestString = "";
        String longestString = "";

        for (int i = 1; i <= 3; i++) {
            System.out.print("Введите строку " + i + " : ");
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
