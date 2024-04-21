public class JaegerTest {
    public static void main(String[] args) {
        Jaeger gipsyDanger = new Jaeger("Gipsy Danger", "Mark-3", "USA", 79.25F);

        Jaeger strikerEureka = new Jaeger("", "", "", 0.0F);
        strikerEureka.setName("Striker Eureka");
        strikerEureka.setModel("Mark-5");
        strikerEureka.setOrigin("Australia");
        strikerEureka.setHeight(76.2F);

        System.out.println("Информация о роботе Gipsy Danger:");
        gipsyDanger.output();
        gipsyDanger.move();
        System.out.println();

        System.out.println("Информация о роботе Striker Eureka:");
        strikerEureka.output();
        strikerEureka.move();
        System.out.println();
    }
}