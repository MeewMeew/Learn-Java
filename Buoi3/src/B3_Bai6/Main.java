package B3_Bai6;

public class Main {
    public static void main(String[] args) {
        ClassRoom cr = new ClassRoom();

        // Insert data from keyboard to array
        cr.scanFromKeyboard();

        // Sort array by Point
        cr.sortStudentByPoint();

        // Print array
        cr.classInfo();

        // Print student with point less than 5
        Student[] lessThan5 = cr.getStudentsWithPointLessThan5();
        System.out.println("==== Danh Sach Sinh Vien Phai Hoc Lai ====");
        System.out.printf("%-9s %-26s %-5s\n", "Ma SV", "Ten SV", "Diem");
        for (Student student : lessThan5) {
            System.out.printf("%-9s %-26s %-3.1f\n", student.getMaSV(), student.getTenSV(), student.getPoint());
        }
    }
}
