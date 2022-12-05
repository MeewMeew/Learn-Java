package B3_Bai6;

public class Student {
    private String MaSV, TenSV;
    private float Point;

    public String getMaSV() {
        return MaSV;
    }

    public String getTenSV() {
        return TenSV;
    }

    public float getPoint() {
        return Point;
    }

    public void setMaSV(String maSV) {
        MaSV = maSV;
    }

    public void setTenSV(String tenSV) {
        TenSV = tenSV;
    }

    public void setPoint(float point) {
        Point = point;
    }

    public Student(String maSV, String tenSV, float point) {
        MaSV = maSV;
        TenSV = tenSV;
        Point = point;
    }

    public Student() {}
}
