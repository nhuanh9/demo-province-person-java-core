package BaiTap.QLS;

public class Sach extends TaiLieu {
    private int soTrang;

    public Sach() {
    }

    public Sach(String tenNXB, int soTrang) {
        super(tenNXB);
        this.soTrang = soTrang;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sách: "+super.toString()+
                ", "+soTrang+";";
    }

}
