package org.oxyl;

public class Triangle {
    private double x1, y1, x2, y2, x3, y3;
    private double xBarycentre;
    private double yBarycentre;

    public Triangle(){
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 0;
        x3 = 0;
        y3 = 0;
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public Triangle( Triangle Triangle1){
        this.x1 = Triangle1.x1;
        this.y1 = Triangle1.y1;
        this.x2 = Triangle1.x2;
        this.y2 = Triangle1.y2;
        this.x3 = Triangle1.x3;
        this.y3 = Triangle1.y3;
    }

    public void deplacer(double distanceX,double distanceY){
        x1 += distanceX;
        x2 += distanceX;
        x3 += distanceX;
        y1 += distanceY;
        y2 += distanceY;
        y3 += distanceY;
    }
    public void tourner(double theta){
        xBarycentre = (x1+x2+x3)/3;
        yBarycentre = (y1+y2+y3)/3;
        x1 = (x1-xBarycentre)* Math.cos(Math.atan(y1/x1)+theta);
        y1 = (y1-yBarycentre)* Math.sin(Math.atan(y1/x1)+theta);
        x2 = (x2-xBarycentre)* Math.cos(Math.atan(y1/x1)+theta);
        y2 = (y2-yBarycentre)* Math.sin(Math.atan(y1/x1)+theta);
        x3 = (x3-xBarycentre)* Math.cos(Math.atan(y1/x1)+theta);
        y3 = (y3-yBarycentre)* Math.sin(Math.atan(y1/x1)+theta);
    }

    public boolean isEquilateral(){
        return (Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2))==Math.sqrt(Math.pow(x2-x3,2)+Math.pow(y2-y3,2)) && Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2))==Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2)));
    }

}
