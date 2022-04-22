package BaiTap.QLCB;

public class Main {
    public static void main(String[] args) {
        QuanLyCanBo qlcb = new QuanLyCanBo();
        qlcb.add(new KySu("NA", 19, "Nam", "TB", "CNTT"));
        qlcb.add(new CongNhan("NAL", 19, "Nam", "TB", 1));
        qlcb.add(new CanBo("DNA", 19, "Nam", "TB"));
        qlcb.printAll();
    }
}
