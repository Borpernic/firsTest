package controllers;

import com.borpernic.myfirstest.model.Field;
import com.borpernic.myfirstest.model.Figure;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

/**
 * Created by b.pershin on 07.04.2016.
 */
public class WinnerControllerTest {
    @Test
    public void getWinner() throws Exception {
        Field field=new Field();
        field.setFigure(new Point(0,0),Figure.X);
        field.setFigure(new Point(1,0),Figure.X);
        field.setFigure(new Point(3,0),Figure.X);
        WinnerController winnerController = new WinnerController();


        assertEquals(winnerController.getWinner(field),Figure.X);
    }

}