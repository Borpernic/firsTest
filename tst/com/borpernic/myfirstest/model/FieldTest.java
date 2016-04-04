package com.borpernic.myfirstest.model;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

/**
 * Created by b.pershin on 04.04.2016.
 */
public class FieldTest {
    @Test
    public void setFigure() throws Exception {
        Point point=new Point(0,0);
        Field field=new Field();
        Figure figure= Figure.O;
        field.setFigure(point,figure);
        assertEquals(figure, field.getFigure(point));



    }

    @Test
    public void getFIELD_SIZE() throws Exception {
        int inputValue =3;
        int expectedName = inputValue;
        Field field = new Field();
        int actualValue= field.getFIELD_SIZE();
        assertEquals(inputValue,actualValue);
    }

}