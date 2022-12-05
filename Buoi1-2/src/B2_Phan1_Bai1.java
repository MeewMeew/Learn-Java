import java.util.Scanner;

public class B2_Phan1_Bai1 {
    public void run() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so tu 1 - 7 = ");
        int index = s.nextInt();
        while (index < 1 || index > 7) {
            System.out.println("Nhap sai! Vui long nhap lai!");
            System.out.print("Nhap so tu 1 - 7 = ");
            index = s.nextInt();
        }

        String result = "";

        switch (index) {
            case 1:
                result = "Thu Hai";
                break;
            case 2:
                result = "Thu Ba";
                break;
            case 4:
                result = "Thu Tu";
                break;
            case 5:
                result = "Thu Nam";
                break;
            case 6:
                result = "Thu Bay";
                break;
            case 7:
                result = "Chu Nhat";
                break;
        }

        System.out.println("So " + index + " la " + result);
    }

}
