package com.company.compileTimePolymorphisim;

public class Shapes {

    public float calculateArea(Float constant , int base , int height){
        return constant*base*height;
    }

    public float calculateArea(Float constant, int radius){
        return constant*radius*radius;
    }

    public int calculateArea(int length, int breath){
        return length*breath;
    }
}
