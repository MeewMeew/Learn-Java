package B3_Bai1;

public class PhepTinh {
    private int ToanHang1, ToanHang2;

    private char ToanTu;


    public PhepTinh(int toanHang1, int toanHang2, char toanTu) {
        this.ToanHang1 = toanHang1;
        this.ToanHang2 = toanHang2;
        this.ToanTu = toanTu;
    }

    public PhepTinh() {
        this.ToanHang1 = 0;
        this.ToanHang2 = 0;
        this.ToanTu = '+';
    }

    public int getToanHang1() {
        return this.ToanHang1;
    }

    public int getToanHang2() {
        return this.ToanHang2;
    }

    public char getToanTu() {
        return this.ToanTu;
    }

    public void setToanHang1(int toanHang1) {
        this.ToanHang1 = toanHang1;
    }

    public void setToanHang2(int toanHang2) {
        this.ToanHang2 = toanHang2;
    }

    public void setToanTu(char toanTu) {
        this.ToanTu = toanTu;
    }

    public double TinhToan() {
        double result = 0;
        switch (this.ToanTu) {
            case '+':
                result = this.ToanHang1 + this.ToanHang2;
                break;
            case '-':
                result = this.ToanHang1 - this.ToanHang2;
                break;
            case '*':
                result = this.ToanHang1 * this.ToanHang2;
                break;
            default:
                if (this.ToanHang2 != 0) {
                    result = (double) this.ToanHang1 / this.ToanHang2;
                }
                break;
        }
        return result;
    }
}

