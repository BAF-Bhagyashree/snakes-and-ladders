package com.bafila.models;

public class Color extends BaseModel{
    private String color;

    Color(String color) {
        this.color = color; //ddoesnt make sense to have default constr, as we dont hwant color to be without color
    }
}
