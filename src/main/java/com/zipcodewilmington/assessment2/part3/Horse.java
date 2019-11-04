package com.zipcodewilmington.assessment2.part3;

public class Horse implements Animal{
    private String move;
    private String color;

    public Horse() {
        this.move = "gallop";
        this.color = "brown";
    }

    @Override
    public String move(){
        return move;
    }

    @Override
    public int getSpeed() {
        return 40;
    }

    @Override
    public String color(){
        return color;
    }
}
