package B3_Bai7;

public class Rat {
    private String name;
    private int speed;
    private int weight;

    public Rat(String name, int speed, int weight) {
        this.name = name;
        this.speed = speed;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public void run() {
        System.out.printf("%s dang di tron\n", this.getName());
    }
}
