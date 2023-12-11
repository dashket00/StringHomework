import java.util.Scanner;

public class Primer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        StringBuilder duplicatedString = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            duplicatedString.append(currentChar).append(currentChar);
        }

        System.out.println("Новая строка с продублированными буквами: " + duplicatedString.toString());
    }
}
