package controllers;

import com.borpernic.myfirstest.model.Field;
import com.borpernic.myfirstest.model.Figure;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by b.pershin on 07.04.2016.
 */
public class WinnerControllerTest {
    @Test
    public void getWinnerCol() throws Exception {
        Field field = new Field();
        WinnerController winnerController = new WinnerController();
        for (int i = 0; i < 3; i++) {
            field.setFigure(new Point(0, i), Figure.X);
            field.setFigure(new Point(1, i), Figure.X);
            field.setFigure(new Point(2, i), Figure.X);
            assertEquals(winnerController.getWinner(field), Figure.X);
        }
    }


    @Test
    public void getWinnerRow() throws Exception {
        Field field = new Field();
        WinnerController winnerController = new WinnerController();
        for (int i = 0; i < 3; i++) {
            field.setFigure(new Point(i, 0), Figure.X);
            field.setFigure(new Point(i, 1), Figure.X);
            field.setFigure(new Point(i, 2), Figure.X);
            assertEquals(winnerController.getWinner(field), Figure.X);
        }
    }

    @Test
    public void getWinnerDiag1() throws Exception {
        Field field = new Field();
        WinnerController winnerController = new WinnerController();
        for (int i = 0; i < 3; i++) {
           field.setFigure(new Point(i, i), Figure.X);

      /*      field.setFigure(new Point(0, 0), Figure.X);
            field.setFigure(new Point(1, 1), Figure.X);
            field.setFigure(new Point(2, 2), Figure.X);*/
            //assertEquals(winnerController.getWinner(field), Figure.X);

        }
            assertEquals(winnerController.getWinner(field), Figure.X);
    }

    @Test
    public void getWinnerDiag2() throws Exception {
        Field field = new Field();
        WinnerController winnerController = new WinnerController();
        field.setFigure(new Point(0, 2), Figure.X);
        field.setFigure(new Point(1, 1), Figure.X);
        field.setFigure(new Point(2, 0), Figure.X);
        assertEquals(winnerController.getWinner(field), Figure.X);

    }
}