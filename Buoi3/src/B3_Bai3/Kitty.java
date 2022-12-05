package B3_Bai3;

public class Kitty {
    private String name;

    public Kitty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sound(String m) {
        System.out.println(this.getName() + " keu: " + m);
    }
}
