package com.borpernic.myfirstest.model;

/**
 * Created by b.pershin on 04.04.2016.
 */
public class Player {

    private final String name ;

    private final Figure figure;

    public Player(final String name, final Figure figure) {
        this.name = name;
        this.figure = figure;
    }

    public String getName() {
        return name;
    }

    public Figure getFigure() {
        return figure;
    }
}
