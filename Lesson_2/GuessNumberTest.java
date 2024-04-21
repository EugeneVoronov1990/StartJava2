import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        String nameOne = scanner.nextLine();

        System.out.print("Введите имя второго игрока: ");
        String nameTwo = scanner.nextLine();

        Player playerOne = new Player(nameOne);
        Player playerTwo = new Player(nameTwo);

        GuessNumber game = new GuessNumber(playerOne, playerTwo);
        game.play();

        while (true) {
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                game = new GuessNumber(playerOne, playerTwo);
                game.play();
            } else if (answer.equalsIgnoreCase("no")) {
                System.out.println("Игра завершена.");
                break;
            } else {
                System.out.println("Некорректный ввод. Пожалуйста, введите 'yes' или 'no'.");
            }
        }
    }
}