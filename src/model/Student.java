package model;

public class Student {
    private String name;
    private String age;
    private String sex;
    private String stuNo;

    public Student(){}

    public Student(String name,String age,String sex,String stuNo){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.stuNo = stuNo;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }
}
