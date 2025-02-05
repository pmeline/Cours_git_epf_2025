package org.oxyl;

public class Rectangle { //classe rectangle
    private double centreX;
    private double centreY;
    private double longueur;
    private double largeur;
    private double angle;
    public Rectangle(){
        centreX = 0.0;
        centreY = 0.0;
        longueur = 1.0;
        largeur = 1.0;
        angle = 0.0;
    }
    public Rectangle(double centreX, double centreY, double longueur, double largeur, double angle){
        this.centreX = centreX;
        this.centreY = centreY;
        longueurEtLargeurPositive(longueur, largeur);
        this.angle = angle;
    }
    public Rectangle(Rectangle rectangle1){
        this.centreX = rectangle1.centreX;
        this.centreY = rectangle1.centreY;
        longueurEtLargeurPositive(rectangle1.longueur, rectangle1.largeur);
        this.angle = rectangle1.angle;
    }
    public void deplacer(double distanceX, double distanceY ){
        this.centreX += distanceX;
        this.centreY += distanceY;
    }
    public boolean isCarre(){
        return (longueur== largeur);
    }
    public void redimensionner(double f){
        longueur *= f;
        largeur *= f;
        longueurEtLargeurPositive(longueur, largeur);
    }
    public void tourner(double theta){
        angle += theta;
    }
    private void longueurEtLargeurPositive(double longueur,double largeur){
        this.longueur = (longueur>0)? longueur: 0;
        this.largeur = (largeur>0)? largeur:0;
    }

    public void setPoint(){
        Point A = new Point(centreX-(longueur/2), centreY+(largeur/2));
        Point B = new Point(longueur+(longueur/2), longueur+(largeur/2));
        Point C = new Point(longueur-(longueur/2), longueur-(largeur/2));
        Point D = new Point(longueur+(longueur/2), longueur-(largeur/2));
    }
}
