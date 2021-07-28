package com.company.aggregation;

import java.util.ArrayList;

public class Department {
    public String name;
    public ArrayList<DepartmentStudent> list;

    public Department(String name , ArrayList<DepartmentStudent> list){
        this.list=list;
        this.name=name;
    }

    public ArrayList<DepartmentStudent> showStudents(){
        return this.list;
    }
}
