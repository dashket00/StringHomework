import java.util.Scanner;

public class PrimerStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        int word;
        do {
            System.out.print("Введите номер словa для проверки: ");
            word = scanner.nextInt();
        } while (word < 1 || word > words.length);
        boolean isPalindrome = isPalindrome(words[word-1]);

        if (isPalindrome) {
            System.out.println("Выбранное слово является палиндромом.");
        } else {
            System.out.println("Выбранное слово не является палиндромом.");
        }
    }

    private static boolean isPalindrome(String word) {
        StringBuilder reversedWord = new StringBuilder(word).reverse();
        return word.equalsIgnoreCase(reversedWord.toString());
    }
}
