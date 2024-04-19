public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.setGender("male");
        wolf.setName("Grey");
        wolf.setWeight(50.2);
        wolf.setAge(7);
        wolf.setColor("white");

        System.out.println("Пол: " + wolf.getGender());
        System.out.println("Кличка: " + wolf.getName());
        System.out.println("Вес: " + wolf.getWeight());
        System.out.println("Возраст: " + wolf.getAge());
        System.out.println("Окрас: " + wolf.getColor());

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}