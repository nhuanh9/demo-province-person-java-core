package BaiTap.TimKiem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {12, 34, 1, 3, 4, 6, 37, 12, 45};
        List<Integer> list = new ArrayList<>();
        list.add(12);
        for (int i=1; i<arr.length; i++) {
            if (arr[i] > list.get(list.size()-1)){
                list.add(arr[i]);
            }
        }
        for (Integer i: list) {
            System.out.println(i);
        }
    }
}
