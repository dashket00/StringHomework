import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Primer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Введите строку: ");
            strings[i] = scanner.nextLine();
        }

        Arrays.sort(strings, Comparator.comparingInt(String::length));

        System.out.println("Строки в порядке возрастания длины:");
        for (int i = 0; i < 3; i++) {
            System.out.println(strings[i]);
        }
    }
}
