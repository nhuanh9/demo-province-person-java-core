package BaiTap;

public interface GeneralManage<T> {
    void add (T t);
    void edit(int id, T t);
    void delete(int id);
    T findById(int id);
    int findIndexById(int id);
    void printAll();
}
