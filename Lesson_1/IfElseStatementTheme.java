public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java\n");
        String gender = "man";
        if (!gender.equals("man")) {
            System.out.println("Женщина");
        } else {
            System.out.println("Мужчина");
        }

        int age = 20;
        if (age > 18) {
            System.out.println("Совершеннолетний");
        } else {
            System.out.println("Несовершеннолетний");
        }

        double height = 1.6;
        if (height < 1.8) {
            System.out.println("Низкий рост");
        } else {
            System.out.println("Высокий рост");
        }

        char firstLetterName = "Евгений".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Имя начинается на букву М");
        } else if (firstLetterName == 'I') {
            System.out.println("Имя начинается на букву I");
        } else {
            System.out.println("Имя начинается на любую букву, кроме M и I");
        }

        System.out.println("\n2. Поиск большего числа");
        int a = 2;
        int b = 5;
        if (a > b) {
            System.out.println("число a больше, чем b");
        } else if (a < b) {
            System.out.println("число a меньше, чем b");
        } else {
            System.out.println("числа равны");
        }

        System.out.println("\n3. Проверка числа");
        int originNum = 7;
        if (originNum == 0) {
            System.out.println("число равно 0");
        } else {
            if (originNum > 0) {
                System.out.print(originNum + " является положительным ");
            } else {
                System.out.print(originNum + " является отрицательным ");
            }
            if (originNum % 2 == 0) {
                System.out.println("чётным");
            } else {
                System.out.println("нечётным");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num1 = 123;
        int num2 = 223;
        int hundredsNum1 = (num1 / 100) % 10;
        int tensNum1 = (num1 / 10) % 10;
        int onesNum1 = num1 % 10;
        int hundredsNum2 = (num2 / 100) % 10;
        int tensNum2 = (num2 / 10) % 10;
        int onesNum2 = num2 % 10;
        boolean numbersMatch = hundredsNum1 != hundredsNum2 && tensNum1 != tensNum2 && 
                onesNum1 != onesNum2;
        if (numbersMatch) {
            System.out.println("одинаковых цифр в разрядах нет");
        } else {
            System.out.print("исходные числа - " + num1 + " и " + num2 + " ");
            if (hundredsNum1 == hundredsNum2) {
                System.out.print("\nодинаковые цифры - " + hundredsNum1 + 
                        "\nномер разряда - 3");
            } 
            if (tensNum1 == tensNum2) {
                System.out.print("\nодинаковые цифры - " + tensNum1 + 
                        "\nномер разряда - 2");
            } 
            if (onesNum1 == onesNum2) {
                System.out.println("\nодинаковые цифры - " + onesNum1 + 
                        "\nномер разряда - 1");
            }
        }

        System.out.println("\n5. Определение символа по его коду");
        char someChar = '\u0031';
        if (someChar >= 'a' && someChar <= 'z') {
            System.out.println("Символ " + someChar + " является маленькой буквой");
        } else if (someChar >= 'A' && someChar <= 'Z') {
            System.out.println("Символ " + someChar + " является большой буквой");
        } else if (someChar >= '0' && someChar <= '9') {
            System.out.println("Символ " + someChar + " является цифрой");
        } else {
            System.out.println("Символ " + someChar + " является не буквой и не цифрой");
        }

        System.out.println("\n6. Подсчёт суммы вклада и начисленных банком %");
        double depositAmount = 301000;
        double rate = 0.05;
        if (depositAmount >= 100000 && depositAmount <= 300000) {
            rate = 0.07;
        } else if (depositAmount > 300000) {
            rate = 0.1;
        }
        double percentAmount = depositAmount * rate;
        double depositAmountWithPercent = depositAmount + percentAmount;
        System.out.println("Сумма вклада - " + depositAmount +
                "\nСумма начисленного % - " + percentAmount +
                "\nИтоговая сумма с % - " + depositAmountWithPercent);

        System.out.println("\n7. Определение оценки по предметам");
        int historyGrade = 2;
        int historyPercent = 59;
        if (historyPercent > 60 && historyPercent <= 73) {
            historyGrade = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyGrade = 4;
        } else if (historyPercent > 91) {
            historyGrade = 5;
        }
        int programmingGrade = 2;
        int programmingPercent = 92;
        if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingGrade = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingGrade = 4;
        } else if (programmingPercent > 91) {
            programmingGrade = 5;
        }
        double avgPercent = (historyPercent + programmingPercent) / 2;
        double gpa = (historyGrade + programmingGrade) / 2;
        System.out.println("History - " + historyGrade +
                "\nProgramming - " + programmingGrade +
                "\nсредний балл оценок по предметам - " + gpa +
                "\nсредний % по предметам - " + avgPercent);

        System.out.println("\n8. Расчет годовой прибыли");
        int saleGoods = 13000;
        int roomRent = 5000;
        int costProduction = 9000;
        int annualProfit = (saleGoods - roomRent - costProduction) * 12;
        if (annualProfit > 0) {
            System.out.println("Прибыль за год: +" + annualProfit);
        } else {
            System.out.println("Прибыль за год: " + annualProfit);
        }
    }
}