package com.georgioskachrimanis.javacourse;

public class Wall {

    private double height, width;

    //constructors
    public Wall() {

    }

    public Wall(double width, double height) {

        if (height < 0){
            this.height = 0;
        } else {
            this.height = height;
        }

        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    // getters and setters
    public void setHeight(double height) {
        if (height < 0){
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getArea () {
        return getHeight() * getWidth();
    }
}
