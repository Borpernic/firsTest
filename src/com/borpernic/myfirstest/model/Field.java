package com.borpernic.myfirstest.model;

import java.awt.*;

/**
 * Created by b.pershin on 04.04.2016.
 */
public class Field {

    private final int FIELD_SIZE = 3;
    private final Figure[][] figures = new Figure[FIELD_SIZE][FIELD_SIZE];


    public Figure getFigure(final Point point) {
        return figures[point.x][point.y];
    }

    public void setFigure(final Point point, final Figure figure) {
        this.figures[point.x][point.y] = figure;
    }

    public int getFIELD_SIZE() {
        return FIELD_SIZE;
    }

    private boolean chkPoint(Point point) {
        if (point.x < 0 || point.x >= FIELD_SIZE) return false;
        if (point.y < 0 || point.y >= FIELD_SIZE) return false;
        return true;
    }
}
