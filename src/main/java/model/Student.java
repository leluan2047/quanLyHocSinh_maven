package model;

public class Student {
    private int id;
    private String name;
    private int age;
    private String address;
    private String sex;
    private String classroom;

    public Student() {
        id = 0;
        name = "";
        age = 0;
        address = "";
        sex = "";
        classroom = "";
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public Student(int id, String name, int age, String address, String sex, String classroom) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.sex = sex;
        this.classroom = classroom;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getSex() {
        return sex;
    }

    public String getClassroom() {
        return classroom;
    }
}
