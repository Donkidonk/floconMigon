package com.example.floconmigon;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

import javafx.scene.paint.Color;


public class Personnages extends ObjetDuJeu{
    private Point2D vitesse;
    private Point2D  acc;
    private Point2D position= new Point2D(200,250);
    private Point2D taille= new Point2D(200,250);

   private Color couleur;


    Personnages(Point2D vitesse, Point2D acc, Point2D taille, Color couleur, Point2D position ) {
        super(vitesse, acc, taille,position);
        this.couleur= Color.color(12,0,12);
    }

    public Personnages() {

    }


    public void draw(GraphicsContext context) {


        context.setFill(Color.BLUE);
        context.fillRect(position.getX(), position.getY(),taille.getX(),taille.getY());




    }
}
