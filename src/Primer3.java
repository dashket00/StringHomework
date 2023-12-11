import java.util.Scanner;

public class Primer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Введите строку: ");
            strings[i] = scanner.nextLine();
        }

        int totalLength = 0;
        for (int i = 0; i < 3; i++) {
            totalLength += strings[i].length();
        }
        double averageLength = (double) totalLength / strings.length;

        System.out.println("Строки, длина которых меньше средней:");
        for (int i = 0; i < 3; i++) {
            if (strings[i].length() < averageLength) {
                System.out.println(strings[i] + ", длина: " + strings[i].length());
            }
        }
    }
}
