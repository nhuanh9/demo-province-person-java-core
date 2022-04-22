package BaiTap.QLS;

public class TaiLieu {
    private static int autoId = 1;
    private int ma;
    private String tenNXB;

    public TaiLieu() {
    }

    public TaiLieu(String tenNXB) {
        this.ma = autoId;
        autoId++;
        this.tenNXB = tenNXB;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    @Override
    public String toString() {
        return ma + ", " + tenNXB;
    }
}
