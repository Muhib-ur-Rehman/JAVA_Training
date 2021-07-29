package com.company.abstraction;

public class Employee implements Person{
    public float income;
    public String name;
    public String address;
    public String hobby;

    public Employee(String name, String address, String hobby , float income){
        this.income=income;
        this.name=name;
        this.hobby=hobby;
        this.address=address;
    }

    @Override
    public String getHobby() {
        return this.hobby;
    }

    @Override
    public float getIncome() {
        return this.income;
    }

    @Override
    public String printPerson() {
        return "Employee Detail{ Name : "+this.name+" , Address : "+this.address+" , Hobby : "+this.hobby+" , Income : "+this.income;
    }
}
