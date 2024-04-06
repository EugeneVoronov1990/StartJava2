public class CyclesTheme {
  public static void main(String[] args) {
    System.out.println("1.Подсчитайте с помощью do-while сумму четных и" 
        + "нечетых чисел в отрезке [-10, 21]");
    int evenNum = 0;
    int oddNum = 0;
    int counter = -10;
    do {
      if (counter % 2 == 0) {
        evenNum = evenNum + counter;
      } else {
        oddNum = oddNum + counter;
      }
      counter++;
    } while (counter <= 21);
    System.out.println("В отрезке [-10, 21] сумма четных чисел = " + evenNum
                + ", а нечетных = " + oddNum);

    System.out.println("\n2.Вывод чисел в порядке убывавния");
    int firstNum = 10;
    int secondNum = 5;
    int thirdNum = -1;
    int max = 0;
    int min = 0;
    if (firstNum > secondNum && firstNum > thirdNum) {
      max = firstNum;
    } else if (secondNum > firstNum && secondNum > thirdNum) {
      max = secondNum;
    } else if (thirdNum > firstNum && thirdNum > secondNum) {
      max = thirdNum;
    }
    if (firstNum < secondNum && firstNum < thirdNum) {
      min = firstNum;
    } else if (secondNum < firstNum && secondNum < thirdNum) {
      min = secondNum;
    } else if (thirdNum < firstNum && thirdNum < secondNum) {
      min = thirdNum;
    }
    for (int j = min; j <= max; j++) {
      System.out.print(j + " ");
    }
    System.out.println();

    System.out.println("\n3.Вывод реверсивного числа и сумма его цифр");
    int originNumber = 1234;
    int sumNumber = 0;
    while (originNumber > 0) {
      System.out.print(originNumber % 10 + " ");
      sumNumber = sumNumber + (originNumber % 10);
      originNumber = originNumber / 10;
    }
    System.out.println("\nСумма цифр - " + sumNumber);

    System.out.println("\n4.Вывод чисел в несколько строк");
    int oneNum = 1;
    int twoNum = 24;
    int count = 0;
    for (int k = oneNum; k < twoNum; k += 2) {
      System.out.print(k + " ");
      count++;
      while (count % 5 == 0) {
        System.out.println();
        break;
      }
    }
    if (count > count % 5) {
      while (count % 5 > 0) {
        System.out.print(" " + 0 + " ");
        count++;
      }
    }
    System.out.println();

    System.out.println("\n5.Проверка количества двоек числа на четность/нечетность");
    int number1 = 3242592;
    int number2;
    int count2 = 0;
    for (int n = 1; n < number1; n = n * 10) {
      number2 = (number1 / n) % 10;
      while (number2 == 2) {
        count2++;
        break;
      }
    }
    System.out.print("В " + number1);
    if (count2 % 2 == 0) {
      System.out.print(" чётное количество ");
    } else {
      System.out.print(" нечётное количество ");
    }
    System.out.println("двоек - " + count2);

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
      System.out.println("");
      m--;
    }

    System.out.println("\n");
    int maxHeight = 3;
    int lineNumber = 2 * maxHeight - 1;
    int count3 = 1;
    int increase = 1;
    int widthLine = 1;
    do {
      int j = 0;
      do {
        System.out.print("$");
      } while (++j < widthLine);
      System.out.println();
      if (count3 == maxHeight) {
        increase = -1;
      }
      widthLine += increase;
    } while (++count3 <= lineNumber);

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
      System.out.println("Число " + originalNum 
          + " которые вы ввели не является палиндромом");
    }

    System.out.println("\n9.Проверка, является ли число счастливым");
    int number = 123123;
    int firstPart = number / 1000;
    int secondPart = number - firstPart * 1000;
    int sumNumber1 = 0;
    while (firstPart > 0) {
      sumNumber1 = sumNumber1 + (firstPart % 10);
      firstPart = firstPart / 10;
    }
    int sumNumber2 = 0;
    while (secondPart > 0) {
      sumNumber2 = sumNumber2 + (secondPart % 10);
      secondPart = secondPart / 10;
    }
    if (sumNumber1 == sumNumber2) {
      System.out.println("Число " + number + " является счастливым\n" 
          + "Сумма цифр ABC = " + sumNumber1 + ", а сумма DEF = " + sumNumber2);
    } else {
      System.out.println("Число " + number + " не является счастливым\n" 
          + "Сумма цифр ABC = " + sumNumber1 + ", а сумма DEF = " + sumNumber2);
    }

    System.out.println("\n10. Отображение таблицы умножения Пифагора");
    for (int t = 0; t < 9; t++) {
      for (int j = 0; j < 9; j++) {
        while (t == 1) {
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
          t++;
        }
        if (j == 0 & t > 0) {
          System.out.printf("%5d", (t + 1) * (j + 1));
          System.out.print("|");
        } else if (j == 0 & t == 0) {
          System.out.print("      ");
        } else {
          System.out.printf("%5d", (t + 1) * (j + 1));
        }
      }
      System.out.println();
    }
  }
}