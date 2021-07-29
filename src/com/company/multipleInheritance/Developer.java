package com.company.multipleInheritance;

public class Developer implements PersonInterface,EmployeeInterface{
    Person p1= new Person();
    Employee e1 = new Employee();
    @Override
    public void doWork() {
        e1.doWork();
    }

    @Override
    public String getSalary() {
        return e1.getSalary();
    }

    @Override
    public String getName() {
        return p1.getName();
    }

    @Override
    public void doFun() {
        p1.doFun();
    }
}
