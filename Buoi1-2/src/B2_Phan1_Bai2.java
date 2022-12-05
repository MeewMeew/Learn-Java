import java.util.Calendar;
import java.util.Scanner;

public class B2_Phan1_Bai2 {
    public void run() {
        int daysNum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so thang tu 1 - 12: ");
        int index = s.nextInt();
        while (index < 1 || index > 12) {
            System.out.println("Nhap sai! Vui long nhap lai!");
            System.out.print("Nhap so thang tu 1 - 12: ");
            index = s.nextInt();
        }

        daysNum = this.calcDayNum(index);


//        switch (index) {
//            case 1:
//                daysNum = 31;
//                break;
//            case 2:
//                daysNum = 28;
//                break;
//            case 3:
//                daysNum = 30;
//                break;
//            case 4:
//                daysNum = 31;
//                break;
//            case 5:
//                daysNum = 30;
//                break;
//            case 6:
//                daysNum = 31;
//                break;
//            case 7:
//                daysNum = 30;
//                break;
//            case 8:
//                daysNum = 31;
//                break;
//            case 9:
//                daysNum = 30;
//                break;
//            case 10:
//                daysNum = 31;
//                break;
//            case 11:
//                daysNum = 30;
//                break;
//            case 12:
//                daysNum = 31;
//                break;
//        }


        System.out.println("So ngay trong thang " + index + " la: " + daysNum);

    }

    private int calcDayNum(int month) {
        if (month == 2) return 28;
        else if (month == 1 || month % 2 == 0 || month == 7) return 31;
        else return 30;
    }
}
