import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer = "yes";
        while (answer.equalsIgnoreCase("yes")) {
            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();

            System.out.print("Введите знак математической операции: ");
            char sign = scanner.next().charAt(0);

            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();

            Calculator calculator = new Calculator();
            calculator.calculate(a, sign, b);

            do {
                System.out.print("Хотите продолжить? [yes/no]: ");
                answer = scanner.next();
            } while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no"));
        }
        System.out.println("Программа завершена");
    }
}