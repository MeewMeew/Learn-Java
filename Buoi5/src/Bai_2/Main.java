package Bai_2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] messages = {
            "Tao 1 con chim, 1 con ca, 1 con ho",
            "Trinh dien kha nang cua moi con vat",
            "Cho cac con vat an thuc an den khi het ",
            "Cho cac con vat sinh san",
            "Trinh dien kha nang cua cac con con",
            "Ket thuc"
    };
    System.out.println("==== Circus ====");
    for (int i = 0; i < messages.length; i++) {
      System.out.println((i + 1) + ". " + messages[i]);
    }

    Bird bird = null;
    Bird babyBird = null;
    Fish fish = null;
    Fish babyFish = null;
    Tiger tiger = null;
    Tiger babyTiger = null;

    boolean animalsCreated = false;
    boolean animalsHaveBaby = false;

    while (true) {
      System.out.printf("Nhap lua chon: ");
      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
          if (animalsCreated) {
            System.out.println("Cac con vat da duoc tao");
            break;
          }
          bird = new Bird();
          bird.setName("Chim");
          fish = new Fish();
          fish.setName("Ca");
          tiger = new Tiger();
          tiger.setName("Ho");
          System.out.println("Tao thanh cong");
          animalsCreated = true;
          break;
        case 2:
          if (!animalsCreated) {
            System.out.println("Chua tao cac con vat");
            break;
          }
          bird.fly();
          fish.swim();
          fish.dive();
          tiger.run(10);
          break;
        case 3:
          if (!animalsCreated) {
            System.out.println("Chua tao cac con vat");
            break;
          }
          Food food = new Food();
          food.setMass(100);
          bird.eat(food, 10);
          fish.eat(food, 20);
          tiger.eat(food, 30);
          System.out.println("Con vat da an xong");
          break;
        case 4:
          if (!animalsCreated) {
            System.out.println("Chua tao cac con vat");
            break;
          }
          babyBird = bird.haveBaby("Chim con");
          babyFish = fish.haveBaby("Ca con");
          babyTiger = tiger.haveBaby("Ho con");
          System.out.println("Con vat da sinh san");
          animalsHaveBaby = true;
          break;
        case 5:
          if (!animalsHaveBaby) {
            System.out.println("Chua sinh san cac con vat");
            break;
          }
          babyBird.fly();
          babyFish.swim();
          babyFish.dive();
          babyTiger.run(10);
          break;
        case 6:
          System.out.println("Ket thuc");
          return;
        default:
          System.out.println("Lua chon khong hop le");
      }
    }
  }
}
