package B3_Bai4;

import java.util.Scanner;

public class HinhChuNhat {
    private int cDai, cRong;

    public HinhChuNhat(int cDai, int cRong) {
        this.cDai = cDai;
        this.cRong = cRong;
    }

    public HinhChuNhat() {
    }

    public int getcDai() {
        return cDai;
    }

    public void setcDai(int cDai) {
        this.cDai = cDai;
    }

    public int getcRong() {
        return cRong;
    }

    public void setcRong(int cRong) {
        this.cRong = cRong;
    }

    public void PrintInfo() {
        for (int i = 0; i < this.cRong; i++) {
            for (int j = 0; j < this.cDai; j++) {
                System.out.printf(" *" + (j == (this.cDai - 1) ? "\n" : ""));
            }
        }
    }

    public void ScanInfo() {
        Scanner s = new Scanner(System.in);
        System.out.printf("Nhap CD: ");
        this.setcDai(s.nextInt());
        System.out.printf("Nhap CR: ");
        this.setcRong(s.nextInt());
    }


}
