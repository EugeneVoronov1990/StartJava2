public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1.Подсчитайте с помощью do-while сумму четных и " +
                "нечетных чисел в отрезке [-10, 21]");
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        int counter = -10;
        do {
            if (counter % 2 == 0) {
                sumEvenNumbers += counter;
            } else {
                sumOddNumbers += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("В отрезке [" + sumEvenNumbers + " ," + sumOddNumbers + "] сумма четных чисел = " +
                sumEvenNumbers + ", а нечетных = " + sumOddNumbers);

        System.out.println("\n2.Вывод чисел в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        int max = a;
        int min = a;
        if (b > max) {
            max = b;
        } else if (c > max) {
            max = c;
        }
        if (b < min) {
            min = b;
        } else if (c < min) {
            min = c;
        }
        for (int i = min + 1; i < max; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3.Вывод реверсивного числа и сумма его цифр");
        int originNumber = 1234;
        int sumNumber = 0;
        while (originNumber > 0) {
            int digit = originNumber % 10;
            System.out.print(digit);
            sumNumber += digit;
            originNumber /= 10;
        }
        System.out.println("\nСумма цифр - " + sumNumber);

        System.out.println("\n4.Вывод чисел в несколько строк");
        int beginInterval = 1;
        int endInterval = 24;
        int count = 0;
        for (int i = beginInterval; i < endInterval; i += 2) {
            System.out.printf("%5d", i);
            count++;
            if (count % 5 == 0) {
                System.out.println();
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
        int originNumberCopy = originNumber;
        while (originNumberCopy > 0) {
            if (originNumberCopy % 10 == 2) {
                countTwos++;
            }
            originNumberCopy /= 10;
        }
        System.out.print("В " + originNumber);
        if (countTwos % 2 == 0) {
            System.out.print(" чётное количество ");
        } else {
            System.out.print(" нечётное количество ");
        }
        System.out.println("двоек - " + countTwos);

        System.out.println("\n6.Отображение геометрических фигур");
        
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
        }

        System.out.println("\n");
        int lengthTriangle = 5;
        int heightTriangle;
        heightTriangle = lengthTriangle;
        while (heightTriangle >= 1) {
            int lineLengthCounter = 1;
            while (lineLengthCounter <= heightTriangle) {
                System.out.print("#");
                lineLengthCounter++;
            }
            System.out.println();
            heightTriangle--;
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
                System.out.printf("%5d   %5s            %-10s %n", (int) ch, ch, Character.getName(ch));
            } else if ((ch >= 98) && (ch % 2 == 0)) {
                System.out.printf("%5d   %5s            %-10s %n", (int) ch, ch, Character.getName(ch));
            }
        }

        System.out.println("\n8. Проверка является ли число палиндромом");
        originNumber = 1234321;
        int lastDigitOriginNumber = 0;
        int reverseNumber = 0;
        originNumberCopy = originNumber;
        while (originNumber > 0) {
            lastDigitOriginNumber = originNumber % 10;
            reverseNumber = reverseNumber * 10 + lastDigitOriginNumber;
            originNumber /= 10;
        }
        if (originNumberCopy == reverseNumber) {
            System.out.println("Число " + originNumberCopy + " является палиндромом");
        } else {
            System.out.println("Число " + originNumberCopy +
                    " не является палиндромом");
        }

        System.out.println("\n9.Проверка, является ли число счастливым");
        originNumber = 123123;
        int firstPart = originNumber / 1000;
        int secondPart = originNumber - firstPart * 1000;
        int sumFirstPart = 0;
        int sumSecondPart = 0;
        while (firstPart > 0 || secondPart > 0) {
            sumFirstPart += firstPart % 10;
            sumSecondPart += secondPart % 10;
            firstPart /= 10;
            secondPart /= 10;
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