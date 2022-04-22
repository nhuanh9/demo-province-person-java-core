package BaiTap.QLN;

import BaiTap.GeneralManage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagePerson implements GeneralManage<Person> {
    List<Person> people = new ArrayList<>();

    public ManagePerson() {
        people.add(new Person(1, "NA", 23, ManageProvince.provinces.get(1)));
        people.add(new Person(2, "DTH", 32, ManageProvince.provinces.get(2)));
        people.add(new Person(3, "HVM", 20, ManageProvince.provinces.get(1)));
        people.add(new Person(4, "TVH", 29, ManageProvince.provinces.get(3)));
    }

    @Override
    public void add(Person person) {
        people.add(person);
    }

    @Override
    public void edit(int id, Person person) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Person findById(int id) {
        return null;
    }

    @Override
    public int findIndexById(int id) {
        return 0;
    }

    @Override
    public void printAll() {
        for (Person p: people) {
            System.out.println(p);
        }
    }
    public void printAllPersonByProvinceId(int id) {
        for (Person p: people) {
            if (p.getProvince().getId()==id) {
                System.out.println(p);
            }
        }
    }
    public static void main(String[] args) {
        ManagePerson managePerson = new ManagePerson();
        ManageProvince manageProvince = new ManageProvince();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào thông tin người dùng!");
        System.out.println("Nhập mã: ");
        int id = scanner.nextInt();
        System.out.println("Nhập tên:");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = scanner.nextInt();
        System.out.println("Chọn tỉnh: (nhập mã)");
        manageProvince.printAll();
        int idOfProvince = scanner.nextInt();
        managePerson.add(new Person(id, name, age, ManageProvince.provinces.get(manageProvince.findIndexById(idOfProvince))));
        managePerson.printAll();
        managePerson.printAllPersonByProvinceId(2);
    }
}
