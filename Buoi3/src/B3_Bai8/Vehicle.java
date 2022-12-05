package B3_Bai8;

public class Vehicle {
    private String maXe, chuXe;
    private int dungTichXe;
    private double giaTriXe;

    public Vehicle(String maXe, String chuXe, int dungTichXe, double giaTriXe) {
        this.maXe = maXe;
        this.chuXe = chuXe;
        this.dungTichXe = dungTichXe;
        this.giaTriXe = giaTriXe;
    }

    public String getMaXe() {
        return maXe;
    }

    public String getChuXe() {
        return chuXe;
    }

    public int getDungTichXe() {
        return dungTichXe;
    }

    public double getGiaTriXe() {
        return giaTriXe;
    }

    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }

    public void setDungTichXe(int dungTichXe) {
        this.dungTichXe = dungTichXe;
    }

    public void setGiaTriXe(double giaTriXe) {
        this.giaTriXe = giaTriXe;
    }
}
