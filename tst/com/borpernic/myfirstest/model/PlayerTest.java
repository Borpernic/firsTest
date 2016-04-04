package com.borpernic.myfirstest.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by b.pershin on 04.04.2016.
 */
public class PlayerTest {
    @Test
    public void testgetName() throws Exception {
        final String inputName = "Bn";
        final String expectedName = inputName;
        final Player player = new Player(inputName,null);
        final String actualName = player.getName();
        assertEquals(expectedName,actualName);

    }

    @Test
    public void testgetFigure() throws Exception {

        final Figure inputName = Figure.O;
        final Figure expectedName = inputName;
        final Player player = new Player(null,inputName);
        final Figure actualName = player.getFigure();
        assertEquals(expectedName,actualName);

    }

}