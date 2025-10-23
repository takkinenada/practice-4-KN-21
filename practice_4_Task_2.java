import java.util.Scanner;

public class practice_4_Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть текст:");
        String text = sc.nextLine();

        int count = 0;
        int i = 0;

        while (i < text.length()) {
            char c = text.charAt(i);
            if (c == '.' || c == '!' || c == '?') {
                count++;
            }
            i++;
        }

        System.out.println("Кількість речень: " + count);
    }
}

