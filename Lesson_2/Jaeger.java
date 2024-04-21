public class Jaeger {
    private String name;
    private String model;
    private String origin;
    private float height;

    public Jaeger(String name, String model, String origin, float height) {
        this.name = name;
        this.model = model;
        this.origin = origin;
        this.height = height;
    }

    public Jaeger() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void output() {
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Origin: " + origin);
        System.out.println("Height: " + height);
    }

    public void move() {
        System.out.println("Двигаться вперёд");
    }
}