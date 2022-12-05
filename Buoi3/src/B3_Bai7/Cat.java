package B3_Bai7;

public class Cat {
    private String name;
    private int speed;

    private boolean catchedRat = false;

    public Cat(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isCatchedRat() {
        return catchedRat;
    }

    public void eat(Rat food) {
        if (this.catchedRat) {
            if (food.getWeight() <= 100) System.out.printf("Mum mum! %s hoi gay!\n", food.getName());
            else System.out.printf("Mum mum! %s beo day!", food.getName());
        } else {
            System.out.printf("Khong bat duoc %s nen chiu doi",  food.getName());
        }
    }

    public void run() {
        System.out.printf("%s di tim chuot\n", this.getName());
    }

    public boolean catchRat(Rat rat) {
        if (this.getSpeed() > rat.getSpeed()) {
            System.out.printf("Da tom duoc %s", rat.getName());
            return (catchedRat = true);
        } else {
            System.out.printf("%s khong duoi kip %s", this.getName(), rat.getName());
            return false;
        }
    }
}
