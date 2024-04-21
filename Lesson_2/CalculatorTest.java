import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();

            System.out.print("Введите знак математической операции: ");
            char sign = scanner.next().charAt(0);

            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();

            Calculator calculator = new Calculator();
            calculator.calculate(a, sign, b);

            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Программа завершена.");
                break;
            } else if (!answer.equalsIgnoreCase("yes")) {
                System.out.println("Некорректный ввод. Пожалуйста, введите 'yes' или 'no'.");
            }
        }
    }
}