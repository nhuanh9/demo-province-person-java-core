package BaiTap.QLS;

import BaiTap.GeneralManage;

import java.util.ArrayList;
import java.util.List;

public class QLTL implements GeneralManage<TaiLieu> {
    private List<TaiLieu> taiLieus = new ArrayList<>();
    public QLTL() {
        taiLieus.add(new Sach("KĐ", 120));
        taiLieus.add(new Sach("KĐ", 125));
        taiLieus.add(new TapChi("KOL", 111));
        taiLieus.add(new Sach("KĐ", 130));
        taiLieus.add(new TapChi("KOL", 222));
        taiLieus.add(new TapChi("BTS", 222));
        taiLieus.add(new Sach("MTP", 1000));
    }

    @Override
    public void add(TaiLieu taiLieu) {

    }

    @Override
    public void edit(int id, TaiLieu taiLieu) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public TaiLieu findById(int id) {
        return null;
    }

    @Override
    public int findIndexById(int id) {
        return 0;
    }

    @Override
    public void printAll() {
        for (TaiLieu t :
                taiLieus) {
            System.out.println(t);
        }
    }
    public void printSach() {
        for (TaiLieu t :
                taiLieus) {
            if (t instanceof Sach) {
                System.out.println(t);
            }
        }
    }
    public void printTaiChi() {
        for (TaiLieu t :
                taiLieus) {
            if (t instanceof TapChi) {
                System.out.println(t);
            }
        }
    }
    public static void main(String[] args) {
        QLTL qltl = new QLTL();
        qltl.printTaiChi();
    }
}
