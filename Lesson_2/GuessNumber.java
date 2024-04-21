import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private int randomNumber;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.randomNumber = (int) (Math.random() * 100) + 1;
    }

    public void play() {
        Player currentPlayer = playerOne;
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0;
        while (randomNumber != inputNumber) {
            System.out.print(currentPlayer.getName() + ", введите ваше предполагаемое число: ");
            inputNumber = scanner.nextInt();

            if (inputNumber == randomNumber) {
                System.out.println("Поздравляем, " + currentPlayer.getName() + ", вы победили!");
                break;
            } else if (inputNumber > randomNumber) {
                System.out.println("Число " + inputNumber + " больше загаданного числа.");
            } else {
                System.out.println("Число " + inputNumber + " меньше загаданного числа.");
            }
            if (currentPlayer == playerOne) {
                currentPlayer = playerTwo;
            } else {
                currentPlayer = playerOne;
            }
        }
    }
}