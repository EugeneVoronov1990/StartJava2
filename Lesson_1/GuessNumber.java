public class GuessNumber { 
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 99);
        int inputNumber = 50;
        while (randomNumber != inputNumber) {
            if (randomNumber < inputNumber) {
                System.out.println("Число " + inputNumber + " больше того, что загадал компьютер");
                inputNumber--;
            } else {
                System.out.println("Число " + inputNumber + " меньше того, что загадал компьютер");
                inputNumber++;
            }
        }
        System.out.println("Вы победили");
    }
}