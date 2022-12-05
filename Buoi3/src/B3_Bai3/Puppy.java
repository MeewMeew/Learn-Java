package B3_Bai3;

public class Puppy {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Puppy(String name) {
        this.name = name;
    }

    public void sound(String w) {
        System.out.println(this.getName() + " sua: " + w);
    }
}
