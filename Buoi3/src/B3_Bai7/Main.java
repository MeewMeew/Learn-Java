package B3_Bai7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Cat cat = null;
        Rat rat = null;

        String[] messages = {
                "Meo duoc sinh ra",
                "Chuot duoc sinh ra",
                "Meo duoi chuot",
                "Meo an chuot",
                "Het Phim"
        };

        System.out.println("==== Scene ====");
        for (int i = 0; i < messages.length; i++) {
            System.out.println((i + 1) + ". " + messages[i]);
        }
        System.out.print("============================================");
        while (true) {
            System.out.print("\n#Chon: ");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Yeu cau nhap: ");
                    System.out.print("Ten meo: ");
                    String catName = s.next();
                    System.out.print("Toc do: ");
                    int catSpeed = s.nextInt();
                    cat = new Cat(catName, catSpeed);
                    System.out.printf("%s duoc sinh ra", cat.getName());
                    break;
                case 2:
                    System.out.println("2. Yeu cau nhap: ");
                    System.out.print("Ten chuot: ");
                    String ratName = s.next();
                    System.out.print("Toc do: ");
                    int ratSpeed = s.nextInt();
                    System.out.print("Can nang: ");
                    int ratWeight = s.nextInt();
                    rat = new Rat(ratName, ratSpeed, ratWeight);
                    System.out.printf("%s duoc sinh ra", rat.getName());
                    break;
                case 3:
                    if (cat != null && rat != null) {
                        cat.run();
                        rat.run();
                        cat.catchRat(rat);
                    } else System.out.println("Meo va chuot chua duoc sinh ra.");
                    break;
                case 4:
                    cat.eat(rat);
                    break;
                case 5:
                    if (!cat.isCatchedRat()) {
                        System.out.printf("%s van con, choi lai!", rat.getName());
                    } else {
                        System.out.printf("Da het %s, het phim !", rat.getName());
                        System.exit(0);
                    }
                    return;
                default:
                    System.out.println("Nhap sai, nhap lai.");
                    break;
            }
        }
    }
}
