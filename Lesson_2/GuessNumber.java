import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int randomNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        randomNumber = (int) (Math.random() * 100) + 1;
    }

    public void play() {
        Player currentPlayer = player1;
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0;
        do {
            inputNumber = enterNumber(currentPlayer, scanner);

            checkNumber(inputNumber, randomNumber);

            currentPlayer = switchPlayer(currentPlayer);
        } while (inputNumber != randomNumber);
        System.out.println("Поздравляем, " + currentPlayer.getName() + ", вы победили!");
    }
    private int enterNumber( Player currentPlayer, Scanner scanner) {
        System.out.print(currentPlayer.getName() + ", введите ваше предполагаемое число: ");
        return scanner.nextInt();
    }
    public void checkNumber(int inputNumber, int randomNumber) {
        if (inputNumber > randomNumber) {
            System.out.println("Число " + inputNumber + " больше загаданного числа.");
        } else {
            System.out.println("Число " + inputNumber + " меньше загаданного числа.");
        }
    }
    public Player switchPlayer(Player currentPlayer) {
        return currentPlayer == player1 ? player2 : player1;
    }
}