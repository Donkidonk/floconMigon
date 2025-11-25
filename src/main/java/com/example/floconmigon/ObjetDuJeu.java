package com.example.floconmigon;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

import java.awt.*;


public abstract class ObjetDuJeu {

    private Point2D vitesse;
    private Point2D  acc;
    private Point2D position;
    private Point2D taille;


    ObjetDuJeu(Point2D vitesse, Point2D acc, Point2D taille, Point2D position){
        this.vitesse= vitesse;
        this.acc=acc;
        this.taille=taille;

    }

    public ObjetDuJeu() {

    }

    /**
     * Dessine l'objet sur l'écran.
     *
     * À redéfinir dans les sous-classes.
     */
    public abstract void draw(GraphicsContext context);

    /**
     * Met à jour la vitesse selon l'accélération et
     * la position selon la vitesse.
     */
    protected void updatePhysique(double deltaTemps) {


        vitesse = vitesse.add(acc.multiply(deltaTemps));
        position = position.add(vitesse.multiply(deltaTemps));
    }


    public void update(double deltaTemps) {
        updatePhysique(deltaTemps);
    }

    public double getHaut() {
        return position.getY();
    }

    public double getBas() {
        return position.getY() + taille.getY();
    }

    public double getGauche() {
        return position.getX();
    }

    public double getDroite() {
        return position.getX() + taille.getX();
    }

    public Point2D getCentre() {
        return position.add(taille.multiply(1/2.0));
    }



}
