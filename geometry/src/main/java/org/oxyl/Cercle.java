package org.oxyl;

public class Cercle {
    private double centreX;
    private double centreY;
    private double rayon;
    public Cercle(){
        centreX = 0.0;
        centreY = 0.0;
        rayon = 1.0;
    }
    public Cercle(double centreX, double centreY, double rayon){
        this.centreX = centreX;
        this.centreY  = centreY;
        setRayon(rayon);
    }
    public Cercle (Cercle cercle1) {
        this.centreX = cercle1.centreX;
        this.centreY = cercle1.centreY;
        this.rayon = cercle1.rayon;
    }
    public void deplacer(double distanceX, double distanceY){
        centreX += distanceX;
        centreY += distanceY;
    }
    public boolean isGrand(){
        return rayon>100;
    }
    public void redimensionner(double f){
        rayon *= f;
        setRayon(rayon);
    }
    public void tourner (double theta){
    }
    void setRayon(double rayon){
        this.rayon = (0>rayon) ? 0 : rayon;
    }

}






