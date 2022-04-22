package BaiTap.QLSV;

public class SV {
    private int sbd;
    private String name;
    private int mucUuTien;
    private String khoi;

    public SV() {
    }

    public SV(int sbd, String name, int mucUuTien, String khoi) {
        this.sbd = sbd;
        this.name = name;
        this.mucUuTien = mucUuTien;
        this.khoi = khoi;
    }

    public int getSbd() {
        return sbd;
    }

    public void setSbd(int sbd) {
        this.sbd = sbd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMucUuTien() {
        return mucUuTien;
    }

    public void setMucUuTien(int mucUuTien) {
        this.mucUuTien = mucUuTien;
    }

    public String getKhoi() {
        return khoi;
    }

    public void setKhoi(String khoi) {
        this.khoi = khoi;
    }

    @Override
    public String toString() {
        return "SV{" +
                "sbd=" + sbd +
                ", name='" + name + '\'' +
                ", mucUuTien=" + mucUuTien +
                ", khoi='" + khoi + '\'' +
                '}';
    }
}
