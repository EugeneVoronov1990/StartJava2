
public class GuessNumber { 
    public static void main(String[] args) {
        byte random = 50;
        random ^= (random << 2);
        random ^= (random >> 1);
        byte num = 50;
        while (random != num) {
            if (random < num) {
                System.out.println("Число " + num + " больше того, что загадал компьютер");
                num--;
            } else if (random > num) {
                System.out.println("Число " + num + " меньше того, что загадал компьютер");
                num++;
            } else if (random == num) {
                break;
            }
        }
        System.out.println("Вы победили");
    }
}