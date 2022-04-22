package BaiTap.QLN;

public class Person {
    private int id;
    private String name;
    private int age;
    private Province province;

    public Person() {
    }

    public Person(int id, String name, int age, Province province) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.province = province;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Person: " +
                "" + id +
                ", " + name +
                ", " + age +
                ", " + province.toString();
    }
}
