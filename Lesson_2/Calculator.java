public class Calculator {
    public static void calculate(int a, char sign, int b) {
        int result = 0;
        switch (sign) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '^':
                result = 1;
                for (int exponent = b; exponent > 0; exponent--) {
                    result *= a;
                }
                break;
            case '%':
                result = a % b;
                break;
            default:
                System.out.println("Введенная математическая операция не поддерживается!");
                break;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}