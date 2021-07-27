package com.company.encapsulation;

public class student {
    private String name;
    private int rollNo;
    private  String sex;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public student(){
        this.sex=null;
        this.age=0;
        this.name=null;
        this.rollNo=0;
    }

    public student(String name,int rollNo,String sex,int age){
        this.name=name;
        this.rollNo=rollNo;
        this.age=age;
        this.sex=sex;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
