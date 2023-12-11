import java.util.Scanner;

public class Primer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Введите строку: ");
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < 3; i++) {
            boolean isUnique = true;
            for (int j = 0; j < strings[i].length(); j++) {
                char currentChar = strings[i].charAt(j);
                if (strings[i].indexOf(currentChar) != strings[i].lastIndexOf(currentChar)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println("Первое слово, состоящее только из различных символов: " + strings[i]);
                break;
            }
        }
    }
}
