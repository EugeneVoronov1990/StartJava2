import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int randomNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.randomNumber = (int) (Math.random() * 100) + 1;
    }

    public void play() {
        Player currentPlayer = player1;
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
            if (currentPlayer == player1) {
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }
        }
    }
}