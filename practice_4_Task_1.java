import java.util.Scanner;

public class practice_4_Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        double a = sc.nextDouble();

        System.out.print("Введіть оператор (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.print("Введіть друге число: ");
        double b = sc.nextDouble();

        double result;

        switch (op) {
            case '+':
                result = a + b;
                System.out.println("Результат: " + result);
                break;
            case '-':
                result = a - b;
                System.out.println("Результат: " + result);
                break;
            case '*':
                result = a * b;
                System.out.println("Результат: " + result);
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                    System.out.println("Результат: " + result);
                } else {
                    System.out.println("Ділення на нуль неможливе!");
                }
                break;
            default:
                System.out.println("Невірний оператор!");
        }
    }
}


