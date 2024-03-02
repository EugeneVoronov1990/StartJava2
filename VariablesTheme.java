public class VariablesTheme{
    public static void main(String[] args){
    System.out.println("1.Вывод характеристик компьютера");
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
            ram + " -  количество оперативной памяти\n" + 
            usbType + " - вид usb\n" + 
            cpuFrequency + " - частота cpu\n" + 
            amountOfCores + " - количество ядер\n" + 
            isComputerWorking + " - работает ли компьютера");

    System.out.println("2.Расчёт стоимости товара со скидкой");
    int penCost = 100;
    int bookCost = 200;
    int costOfTheProducts = penCost + bookCost;
    int sumDiscount = (int) (((double) (costOfTheProducts))*0.11);
    int costWithDiscount = costOfTheProducts - sumDiscount;
    System.out.println(costOfTheProducts + " - общая стоимость товаров без скидки\n" + 
            sumDiscount + " - сумма скидки\n" + 
            costWithDiscount + " - общая стоимость товара со скидкой");

    System.out.println("3. Вывод слова JAVA");
    System.out.println("   J    a  v     v  a   ");
    System.out.println("   J   a a  v   v  a a  ");
    System.out.println("J  J  aaaaa  V V  aaaaa ");
    System.out.println(" JJ  a     a  V  a     a");
    System.out.println();


    System.out.println("4.Вывод min и max знвчений целых числовых типов");
        byte maxByte = 127;
        maxByteIncresead = maxByte++;
        maxByteDecreased = maxByte--;
        byte minByte = -128;
        minByteIncreased = minByte++;
        minByteDecreased = minByte--;
        short maxShort = 32767;
        maxShortIncreased = maxShort++;
        maxShortDecreased = maxShort--;
        short minShort = -32768;
        minShortIncreased = minShort++;
        minShortDecreased = minShort--;
        int maxInt = 2147483647;
        maxIntIncreased = maxInt++;
        maxIntDecreased = maxInt--;
        int minInt = -2147483648;
        minIntIncreased = minInt++;
        minIntDecreased = minInt--;
        long maxLong = 9223372036854775807L;
        maxLongIncreased = maxLong++;
        maxLongDecreased = maxLong--;
        long minLong = -9223372036854775808L;
        minLongIncreased = minLong++;
        minLongDecreased = minLong--;
        float maxFloat = 3.4028235E38f;
        maxFloatIncreased = maxFloat++;
        maxFloatDecreased = maxFloat--;
        float minFloat = 1.4E-45f;
        minFloatIncreased = minFloat++;
        minFloatDecreased = minFloat--;
        double maxDouble = 9.223372036854776E18;
        maxDoubleIncreased = minDouble++;
        maxDoubleDecreased = minDouble--;
        double minDouble = -9.223372036854776E18;
        minDoubleIncreased = minDouble++;
        minDoubleDecreased = minDouble--;
        char maxChar = 65535;
        maxCharIncreased = maxChar++;
        maxCharDecreased = maxChar--;
        char minChar = 0;
        minCharIncreased = minChar++;
        minCharDecreased = minChar--;
        boolean maxBoolean = true;
        maxBooleanIncreased = maxBoolean++;
        maxBooleanDecreased = maxBoolean--;
        boolean minBoolean = false;
        minBooleanIncreased = minBoolean++;
        minBooleanDecreased = minBoolean--;

        System.out.println("5.Перестановка значений переменных");
        int numOne = 2;
        int numTwo = 5;
        int numThree;
        System.out.println("c помощью третьей переменной");
        System.out.println("numOne = " + numOne + " и numTwo = " + numTwo);
        numThree = numOne;
        numOne = numTwo;
        numTwo = numThree;
        System.out.println("numOne = " + numOne + " и numTwo = " + numTwo);
        System.out.println("c помощью арифметических операций");
        System.out.println("numOne = " + numOne + " и numTwo = " + numTwo);
        numOne = numOne + numTwo;
        numTwo = numOne - numTwo;
        numOne = numOne - numTwo;
        System.out.println("numOne = " + numOne + " и numTwo = " + numTwo);
        System.out.println("c помощью побитовых операций");
        System.out.println("numOne = " + numOne + " и numTwo = " + numTwo);
        numOne = numOne ^ numTwo;
        numTwo = numOne ^ numTwo;
        numOne = numTwo ^ numOne;
        System.out.println("numOne = " + numOne + " и numTwo = " + numTwo);

        System.out.println("6.Вывод символов и их кодов");
        char symbol36 = '$';
        char symbol42 = '*';
        char symbol64 = '@';
        char symbol124 = '|';
        char symbol126 = '~';
        System.out.println("36 - " + symbol36);
        System.out.println("42 - " + symbol42);
        System.out.println("64 - " + symbol64);
        System.out.println("124 - " + symbol124);
        System.out.println("126 - " + symbol126);

        System.out.println("7.Вывод в консоль ASCII-арт Дюка");
        char symbol40 = '(';
        char symbol41 = ')';
        char symbol47 = '/';
        char symbol92 = '\';
        char symbol95 = '_';
        System.out.println("    " + symbol47 + "" + symbol92);
        System.out.println("   " + symbol47 + "  " + symbol92);
        System.out.println("  " + symbol47 + symbol95 + symbol40 + " " + symbol41 + symbol92);
        System.out.println(" " + symbol47 + "      " + symbol92);
        System.out.println("" + symbol47 + symbol95 + symbol95 + symbol95 + symbol95 + symbol47 + symbol92 + symbol95 + symbol95 + symbol92);

        System.out.println("8.Вывод количества сотен, десятков и единиц числа");
        int N = 123;
        int hundreds = (N/100)%10;
        int dozens = (N/10)%10;
        int units = (N/1)%10;
        int sumOfTheDigits = hundreds + dozens + units;
        int multiplication = hundreds * dozens * units;
        System.out.println("Число " + N + "содержит:\n" +
                "сотен - " + hundreds +
                "\nдесятков - " + dozens +
                "\nединиц - " + units +
                "\nСумма его цифр = " + sumOfTheDigits +
                "\nПроизведение = " + multiplication);

        System.out.println("9.Вывод времени");
        int time = 86399;
        int hours = time/(3600);
        int minutes = time%3600/60;
        int seconds = time%3600%60;
        System.out.println(hours + " : " + minutes + " : " + seconds);



    }
}