package BaiTap.QLN;

import BaiTap.GeneralManage;

import java.util.ArrayList;
import java.util.List;

public class ManageProvince implements GeneralManage<Province> {
    public static List<Province> provinces = new ArrayList<>();

    static {
        provinces.add(new Province(1, "HN", 1000, 700));
        provinces.add(new Province(2, "HCM", 1100, 1000));
        provinces.add(new Province(3, "QN", 900, 700));
        provinces.add(new Province(4, "HP", 800, 600));
        provinces.add(new Province(5, "DN", 800, 500));
    }

    @Override
    public void add(Province province) {

    }

    @Override
    public void edit(int id, Province province) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Province findById(int id) {
        return null;
    }

    @Override
    public int findIndexById(int id) {
        for (int i=0; i<provinces.size();i++) {
            if (provinces.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void printAll() {
        for (Province p: provinces) {
            System.out.println(p);
        }
    }
}
