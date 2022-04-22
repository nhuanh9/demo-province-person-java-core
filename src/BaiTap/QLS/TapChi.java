package BaiTap.QLS;

public class TapChi extends TaiLieu {
    private int soPhatHanh;

    public TapChi() {
    }

    public TapChi(String tenNXB, int soPhatHanh) {
        super(tenNXB);
        this.soPhatHanh = soPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    @Override
    public String toString() {
        return "Tạp chí: "+super.toString()+
                ", "+soPhatHanh+";";
    }
}
