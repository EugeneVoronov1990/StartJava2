public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n1.Вывод характеристик компьютера");
        byte windowsModel = 10;
        short systemBitDepth = 64;
        int hdCapacity = 500;
        long amountOfRam = 4096L;
        float usbType = 2.0f;
        double cpuFrequency = 2.70;
        char amountOfCores = '4';
        boolean isComputerWorking = true;
        System.out.println(windowsModel + " - модель windows\n" +
                systemBitDepth + " - разрядность системы\n" + 
                hdCapacity + " - вместимость жёсткого диска\n" + 
                amountOfRam + " -  количество оперативной памяти\n" + 
                usbType + " - вид usb\n" + 
                cpuFrequency + " - частота cpu\n" + 
                amountOfCores + " - количество ядер\n" + 
                isComputerWorking + " - работает ли компьютер");

        System.out.println("\n2.Расчёт стоимости товара со скидкой");
        double penCost = 100;
        double bookCost = 200;
        double productsCost = penCost + bookCost;
        double sumDiscount = productsCost * 0.11;
        double discountPrice = productsCost - sumDiscount;
        System.out.println(productsCost + " - общая стоимость товаров без скидки\n" + 
                sumDiscount + " - сумма скидки\n" + 
                discountPrice + " - общая стоимость товара со скидкой");

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4.Вывод min и max значений целых числовых типов");
        byte maxByte = 127;
        System.out.println("первоначальное значение - " + maxByte);
        System.out.println("значение после инкремента на единицу - " + ++maxByte);
        System.out.println("значение после декремента на единицу - " + --maxByte);
        short maxShort = 32767;
        System.out.println("первоначальное значение - " + maxShort);
        System.out.println("значение после инкремента на единицу - " + ++maxShort);
        System.out.println("значение после декремента на единицу - " + --maxShort);
        int maxInt = 2147483647;
        System.out.println("первоначальное значение - " + maxInt);
        System.out.println("значение после инкремента на единицу - " + ++maxInt);
        System.out.println("значение после декремента на единицу - " + --maxInt);
        long maxLong = 9223372036854775807L;
        System.out.println("первоначальное значение - " + maxLong);
        System.out.println("значение после инкремента на единицу - " + ++maxLong);
        System.out.println("значение после декремента на единицу - " + --maxLong);
         
        System.out.println("\n5.Перестановка значений переменных");
        int a = 2;
        int b = 5;
        int swap = a;
        System.out.println("c помощью третьей переменной");
        System.out.println("a = " + a + " и b = " + b);
        a = b;
        b = swap;
        System.out.println("a = " + a + " и b = " + b);
        System.out.println("c помощью арифметических операций");
        System.out.println("a = " + a + " и b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("a = " + a + " и b = " + b);
        System.out.println("c помощью побитовых операций");
        System.out.println("a = " + a + " и b = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("a = " + a + " и b = " + b);

        System.out.println("\n6.Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println((int) dollar + " - " + dollar);
        System.out.println((int) asterisk + " - " + asterisk);
        System.out.println((int) atSign + " - " + atSign);
        System.out.println((int) verticalBar + " - " + verticalBar);
        System.out.println((int) tilde + " - " + tilde);

        System.out.println("\n7.Вывод в консоль ASCII-арт Дюка");
        char openParenthesis = '(';
        char closeParenthesis = ')';
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + openParenthesis + " " + closeParenthesis + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash +
                backslash + underscore+ underscore + backslash);

        System.out.println("\n8.Вывод количества сотен, десятков и единиц числа");
        int originNumber = 123;
        int hundreds = (originNumber / 100) % 10;
        int tens = (originNumber / 10) % 10;
        int ones = originNumber % 10;
        int sum = hundreds + tens + ones;
        int multiplication = hundreds * tens * ones;
        System.out.println("Число " + originNumber + " содержит:\n" +
                "сотен - " + hundreds +
                "\nдесятков - " + tens +
                "\nединиц - " + ones +
                "\nСумма его цифр = " + sum +
                "\nПроизведение = " + multiplication);

        System.out.println("\n9.Вывод времени");
        int time = 86399;
        int hh = time / 3600;
        int mm = time / 60 % 60;
        int ss = time % 60;
        System.out.println(hh + " : " + mm + " : " + ss);
    }
}