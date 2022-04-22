package BaiTap.QLCB;

import BaiTap.GeneralManage;

import java.util.ArrayList;
import java.util.List;

public class QuanLyCanBo implements GeneralManage<CanBo> {
    List<CanBo> canBos = new ArrayList<>();

    @Override
    public void add(CanBo canBo) {
        canBos.add(canBo);
    }

    @Override
    public void edit(int id, CanBo canBo) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public CanBo findById(int id) {
        return null;
    }

    @Override
    public int findIndexById(int id) {
        return 0;
    }

    @Override
    public void printAll() {
        for (CanBo c : canBos) {
            System.out.println(c);
        }
    }

    public void findByName(String name) {
        for (CanBo c : canBos) {
            if (c.getTen().equals(name)) {
                System.out.println(c);
            }
        }
    }
    public void thoat() {
        System.exit(0);
    }

}
