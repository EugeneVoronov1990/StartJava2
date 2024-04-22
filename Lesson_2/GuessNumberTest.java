import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        while (answer.equalsIgnoreCase("yes")) {
            System.out.print("Введите имя первого игрока: ");
            String name1 = scanner.nextLine();
            Player player1 = new Player(name1);

            System.out.print("Введите имя второго игрока: ");
            String name2 = scanner.nextLine();
            Player player2 = new Player(name2);

            GuessNumber game = new GuessNumber(player1, player2);
            game.play();

            do {
                System.out.print("Хотите продолжить? [yes/no]: ");
                answer = scanner.nextLine();
            } while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no"));
        }
        System.out.println("Игра завершена");
    }
}