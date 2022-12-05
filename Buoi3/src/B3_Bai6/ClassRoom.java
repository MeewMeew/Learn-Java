package B3_Bai6;

import java.util.Arrays;
import java.util.Scanner;

public class ClassRoom {
    private String ClassName;
    private int StudentCount;
    private Student[] Students = new Student[]{};

    public ClassRoom(String className, int studentCount, Student[] students) {
        ClassName = className;
        StudentCount = studentCount;
        Students = students;
    }

    public ClassRoom() {
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public int getStudentCount() {
        return StudentCount;
    }

    public void setStudentCount(int studentCount) {
        StudentCount = studentCount;
    }

    public Student[] getStudents() {
        return Students;
    }

    public void setStudents(Student[] students) {
        Students = students;
    }

    public void scanFromKeyboard() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap Ten Lop Hoc: ");
        this.setClassName(s.nextLine());
        System.out.print("Nhap so sinh vien trong lop: ");
        this.setStudentCount(s.nextInt());
        s.nextLine();
        int i = 0;
        while (true) {
            Student student = new Student();
            System.out.print("Nhap Ma SV " + (i + 1) + ": ");
            student.setMaSV(s.nextLine());
            System.out.print("Nhap Ten SV " + (i + 1) + ": ");
            student.setTenSV(s.nextLine());
            System.out.print("Nhap Diem SV " + (i + 1) + ": ");
            student.setPoint(s.nextFloat());
            s.nextLine();
            Student[] students = this.getStudents();
            students = Arrays.copyOf(students, students.length + 1);
            students[students.length - 1] = student;
            this.setStudents(students);
            if (++i == this.getStudentCount()) break;
        }
    }

    public void classInfo() {
        System.out.println("==== Thong Tin Lop Hoc ====");
        System.out.println("Ten Lop: " + this.getClassName());
        System.out.println("So SV: " + this.getStudentCount());
        System.out.println("==== Danh Sach Sinh Vien ====");
        System.out.printf("%-9s %-26s %-5s\n", "Ma SV", "Ten SV", "Diem");
        for (Student student : this.getStudents()) {
            System.out.printf("%-9s %-26s %-3.1f\n", student.getMaSV(), student.getTenSV(), student.getPoint());
        }
    }

    public void sortStudentByPoint() {
        Student[] students = this.getStudents();
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getPoint() < students[j].getPoint()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        this.setStudents(students);
    }

    public Student[] getStudentsWithPointLessThan5() {
        Student[] students = this.getStudents();
        Student[] result = new Student[]{};
        for (Student student : students) {
            if (student.getPoint() < 5) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = student;
            }
        }
        return result;
    }
}
