package org.oxyl;

public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
        x =0.0;
        y =0.0;
    }
    public Point (Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean equals(Object p) {
        if (p instanceof Point) {
            return (this.x == ((Point) p).x && this.y == ((Point)p).y);
       }
       else { return false; }
    }

    public double calculerDistance(Point p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
}
