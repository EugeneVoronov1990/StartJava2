public class Calculator {
    public void calculate(int a, char sign, int b) {
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
                for (int i = b; i > 0; i--) {
                    result *= a;
                }
                break;
            case '%':
                result = a % b;
                break;
            default:
                System.out.println("Введенная математическая операция не поддерживается!");
                return;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}