package B3_Bai5;

import java.util.Scanner;

public class World {
    public static void main(String[] args) {
        Human adam = null, eva = null;
        Scanner s = new Scanner(System.in);

        String[] messages = {
                "Admin duoc sinh ra",
                "Eva duoc sinh ra",
                "Chua noi: \"Khong duoc an tao se chet\"",
                "Con ran noi: \"An tao di ngon lam, khong chet dau\"",
                "Eva an mot mieng tao, Admam an mot mieng tao cho den khi het",
                "Admam di ngu. Eva di ngu",
                "Chua phan: \"Eva! ba se phai vang loi chong va dau don khi sinh con\"\n\"Adam\"Nguoi se phai cuoc dat trong cay ma an\"",
                "Het"
        };
        System.out.println("==== Vuon dia dang ====");
        for (int i = 0; i < messages.length; i++) {
            System.out.println((i + 1) + ". " + messages[i]);
        }

        while (true) {
            System.out.printf("Nhap 1 so tu 1 den 8: ");
            switch (s.nextInt()) {
                case 1:
                    adam = new Human("Adam", false);
                    System.out.println(messages[0]);
                    break;
                case 2:
                    eva = new Human("Eva", true);
                    System.out.println(messages[1]);
                    break;
                case 3:
                    God.say("Khong duoc an tao se chet");
                    break;
                case 4:
                    Snake snake = new Snake();
                    snake.say("An tao di ngon lam, khong chet dau");
                    break;
                case 5:
                    Apple food = new Apple();
                    while (true) {
                        if (eva != null && adam != null) {
                            eva.eat(food);
                            System.out.println("Eva an 1 mieng tao, con lai: " + food.weight);
                            if (food.isEmpty()) break;
                            adam.eat(food);
                            System.out.println("Adam an 1 mieng tao, con lai: " + food.weight);
                            if (food.isEmpty()) break;
                        } else {
                            System.out.println("Adam va Eva chua duoc sinh ra.");
                            break;
                        }
                    }
                    break;
                case 6:
                    if (eva != null && adam != null) {
                        System.out.print(adam.getName() + ": "); adam.sleep();
                        System.out.print(eva.getName() + ": "); eva.sleep();
                    } else {
                        System.out.println("Adam va Eva chua duoc sinh ra.");
                    }
                    break;
                case 7:
                    God.say("\"Eva! ba se phai vang loi chong va dau don khi sinh con\"\n\"Adam\"Nguoi se phai cuoc dat trong cay ma an\"");
                    break;
                case 8:
                    break;
            }

        }
    }
}
