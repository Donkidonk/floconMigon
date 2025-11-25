package com.example.floconmigon;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

import java.awt.*;

public class Flocon extends ObjetDuJeu{

    private Point2D vitesse;
    private Point2D acc;
    private Point2D position;
    private Point2D taille;





    Flocon(Point2D vitesse, Point2D acc, Point2D taille, Point2D position) {
        super(vitesse, acc, taille,position);

    }


    @Override
    public void draw(GraphicsContext context) {

    }
}