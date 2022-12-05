package B3_Bai5;

public class Human {
    private String name;
    private int age;
    private boolean gender;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Human(String name, boolean gender) {
        this.name = name;
        this.gender = gender;
    }

    public void say (String words) {
        System.out.println(words);
    }

    public void eat(Apple food) {
        if (!food.isEmpty()) {
            food.weight--;
        }
    }

    public void sleep() {
        System.out.println("zzZZ");
    }
}
