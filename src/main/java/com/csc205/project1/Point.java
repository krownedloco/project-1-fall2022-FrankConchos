package com.csc205.project1;

public class Point {

    double x, y;

    public Point(){
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Distance formula D=sqrt((x2 - x1)^2 + (y2 -y1)^2)
    public double distance(Point b) {
        double x_2 = b.getX();
        double y_2 = b.getY();
        return Math.sqrt(Math.pow(x_2 - x, 2) + Math.pow(y_2 - y, 2));

    }


    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setPoint(double x, double y ) {
        setX(x);
        setY(y);
    }

    public void shiftX(double n) {
        x += n;
    }

    public void shiftY(double n) {
        y += n;
    }

    //Rotation equations x=xcos(angle) - ysin(angle) and y=xsin(angle) + ycos(angle)
    public void rotate(double rotation) {
        x = x * Math.cos(rotation) - y * Math.sin(rotation);
        y = x * Math.sin(rotation) + y * Math.cos((rotation));

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Point{");
        sb.append("x = ").append(x);
        sb.append(", y = ").append(y);
        sb.append('}');
        return sb.toString();
    }
}
