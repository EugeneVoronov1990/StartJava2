import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;

        do {
            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();

            System.out.print("Введите знак математической операции: ");

            char sign = scanner.next().charAt(0);

            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();

            Calculator.calculate(a, sign, b);

            System.out.print("Хотите выполнить еще одну операцию? (yes/no): ");
            answer = scanner.next();
        } while (!answer.equalsIgnoreCase("no"));
    }
}