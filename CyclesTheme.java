public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1.Подсчитайте с помощью do-while сумму четных и " +
                "нечетых чисел в отрезке [-10, 21]");
        int sumEvenNum = 0;
        int sumOddNum = 0;
        int counter = -10;
        do {
            if (counter % 2 == 0) {
                sumEvenNum = sumEvenNum + counter;
            } else {
                sumOddNum = sumOddNum + counter;
            }
            counter++;
        } while (counter <= 21);
        int X = sumEvenNum;
        int Y = sumOddNum;
        System.out.println("В отрезке [-10, 21] сумма четных чисел = " + X +
                ", а нечетных = " + Y);

        System.out.println("\n2.Вывод чисел в порядке убывавния");
        int a = 10;
        int b = 5;
        int c = -1;
        int max = a;
        int min = a;
        if (b > a && b > c) {
            max = b;
        } else if (c > a && c > b) {
            max = c;
        }
        if (b < a && b < c) {
            min = b;
        } else if (c < a && c < b) {
            min = c;
        }
        for (int i = min + 1; i < max; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3.Вывод реверсивного числа и сумма его цифр");
        int originNumber = 1234;
        int sumNumber = 0;
        while (originNumber > 0) {
            int reverse = originNumber % 10;
            System.out.print(reverse);
            sumNumber = sumNumber + (reverse);
            originNumber = originNumber / 10;
        }
        System.out.println("\nСумма цифр - " + sumNumber);

        System.out.println("\n4.Вывод чисел в несколько строк");
        int firstNumber = 1;
        int lastNumber = 24;
        int count = 0;
        for (int i = firstNumber; i < lastNumber; i += 2) {
            System.out.printf("%5d", i);
            count++;
            while (count % 5 == 0) {
                System.out.println();
                break;
            }
        }
        if (count > count % 5) {
            while (count % 5 > 0) {
                System.out.printf("%5d", 0);
                count++;
            }
        }

        System.out.println("\n\n5.Проверка количества двоек числа на четность/нечетность");
        originNumber = 3242592;
        int countTwos = 0;
        int helpNumber;
        int myNumber = originNumber;
        while (myNumber > 0) {
            helpNumber = myNumber % 10;
            while (helpNumber == 2) {
                countTwos++;
                break;
            }
            myNumber = myNumber / 10;
        }
        System.out.print("В " + originNumber);
        if (countTwos % 2 == 0) {
            System.out.print(" чётное количество ");
        } else {
            System.out.print(" нечётное количество ");
        }
        System.out.println("двоек - " + countTwos);

        System.out.println("\n6.Отображение геометрических фигур");
        
        for (int j = 0; j < 5; j++) {
            System.out.println();
            for (int k = 0; k < 10; k++) {
                System.out.print("*");
            }
        }

        System.out.println("\n");
        int n = 5;
        int m;
        m = n;
        while (m >= 1) {
            int j = 1;
            while (j <= m) {
                System.out.print("#");
                j++;
            }
            System.out.println();
            m--;
        }

        System.out.println("\n");
        int maxHeight = 3;
        int lineNumber = 2 * maxHeight - 1;
        int counterForAngles = 1;
        int increase = 1;
        int widthLine = 1;
        do {
            int i = 0;
            do {
                System.out.print("$");
            } while (++i < widthLine);
            System.out.println();
            if (counterForAngles == maxHeight) {
                increase = -1;
            }
            widthLine += increase;
        } while (++counterForAngles <= lineNumber);

        System.out.println("\n7.Отображение ASCII-символов");
        System.out.printf("%5s  %5s  %5s %n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (char ch = 15; ch <= 122; ch++) {
            if ((ch <= 47) && (ch % 2 != 0)) {
                System.out.printf("%5d   %5s       %-10s %n", (int) ch, ch, Character.getName(ch));
            } else if ((ch >= 98) && (ch % 2 == 0)) {
                System.out.printf("%5d   %5s       %-10s %n", (int) ch, ch, Character.getName(ch));
            }
        }

        System.out.println("\n8. Проверка является ли число палиндромом");
        int numPalindrome = 1234321;
        int reverse = 0;
        int p = 0;
        int originalNum = numPalindrome;
        while (numPalindrome != 0) {
            reverse = numPalindrome % 10;
            p = p * 10 + reverse;
            numPalindrome = numPalindrome / 10;
        }
        if (originalNum == p) {
            System.out.println("Число " + originalNum + " которые вы ввели является палиндромом");
        } else {
            System.out.println("Число " + originalNum + 
                    " которые вы ввели не является палиндромом");
        }

        System.out.println("\n9.Проверка, является ли число счастливым");
        originNumber = 123123;
        int firstPart = originNumber / 1000;
        int secondPart = originNumber - firstPart * 1000;
        int sumFirstPart = 0;
        while (firstPart > 0) {
            sumFirstPart = sumFirstPart + (firstPart % 10);
            firstPart = firstPart / 10;
        }
        int sumSecondPart = 0;
        while (secondPart > 0) {
            sumSecondPart = sumSecondPart + (secondPart % 10);
            secondPart = secondPart / 10;
        }
        if (sumFirstPart == sumSecondPart) {
            System.out.println("Число " + originNumber + " является счастливым\n" +
                    "Сумма цифр ABC = " + sumFirstPart + ", а сумма DEF = " + sumSecondPart);
        } else {
            System.out.println("Число " + originNumber + " не является счастливым\n" +
                    "Сумма цифр ABC = " + sumFirstPart + ", а сумма DEF = " + sumSecondPart);
        }

        System.out.println("\n10. Отображение таблицы умножения Пифагора");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                while (i == 1) {
                    System.out.println("   ____________________________________________");
                    for (int k = 0; k < 9; k++) {
                        if (k == 0) {
                            System.out.printf("%5d", (k + 1) * 2);
                            System.out.print("|");
                        } else {
                            System.out.printf("%5d", (k + 1) * 2);
                        }
                    }
                    System.out.println();
                    i++;
                }
                if (j == 0 & i > 0) {
                    System.out.printf("%5d", (i + 1) * (j + 1));
                    System.out.print("|");
                } else if (j == 0 & i == 0) {
                    System.out.print("      ");
                } else {
                    System.out.printf("%5d", (i + 1) * (j + 1));
                }
            }
            System.out.println();
        }
    }
}