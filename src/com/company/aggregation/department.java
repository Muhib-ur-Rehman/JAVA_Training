package com.company.aggregation;

import java.util.ArrayList;

public class department {
    public String name;
    public ArrayList<std> list;

    public department(String name , ArrayList<std> list){
        this.list=list;
        this.name=name;
    }

    public ArrayList<std> showStudents(){
        return this.list;
    }
}
