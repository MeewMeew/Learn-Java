import java.util.Scanner;

public class B1_Bai1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        String name = s.nextLine();
        System.out.print("Nhap tuoi: ");
        int age = s.nextInt();
        System.out.print("Nhap gioi tinh: ");
        boolean sex = s.nextBoolean();
        s.nextLine();
        System.out.print("Nhap so dien thoai: ");
        String phone = s.nextLine();
        System.out.print("Nhap dia chi: ");
        String address = s.nextLine();
        System.out.print("Nhap diem cua ban: ");
        float point = s.nextFloat();

        System.out.println("Ho va ten: " + name + "\nTuoi: " + age + "\nGioi tinh: " + ((sex == true) ? "Nam" : "Nu") + "\nSo dien thoai" + phone + "\nDia chi: " + address + "\nDiem cua ban: " + point);
    }
}
