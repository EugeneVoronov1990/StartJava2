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
        while (true) {
            System.out.print(currentPlayer.getName() + ", введите ваше предполагаемое число: ");
            inputNumber = enterNumber(scanner);

            if (inputNumber == randomNumber) {
                System.out.println("Поздравляем, " + currentPlayer.getName() + ", вы победили!");
                break;
            }
            checkNumber(inputNumber);
            currentPlayer = switchPlayer(currentPlayer);
        }
    }

    public int enterNumber(Scanner scanner) {
        return scanner.nextInt();
    }

    public void checkNumber(int inputNumber) {
        if (inputNumber > randomNumber) {
            System.out.println("Число " + inputNumber + " больше загаданного числа.");
        } else {
            System.out.println("Число " + inputNumber + " меньше загаданного числа.");
        }
    }

    public Player switchPlayer(Player currentPlayer) {
        if (currentPlayer == player1) {
            return currentPlayer = player2;
        } else {
            return currentPlayer = player1;
        }
    }
}