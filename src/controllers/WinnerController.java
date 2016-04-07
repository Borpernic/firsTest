package controllers;

import com.borpernic.myfirstest.model.Field;
import com.borpernic.myfirstest.model.Figure;
import com.borpernic.myfirstest.model.TestExeption.InvalidPointException;

import java.awt.*;

/**
 * Created by b.pershin on 07.04.2016.
 */
public class WinnerController {

    public Figure getWinner(final Field field) {
        try {
            for (int i = 0; i < field.getFIELD_SIZE(); i++) {
                if (chek(field, new Point(i, 0), new Point(i, 1), new Point(i, 2)))
                    return field.getFigure(new Point(i, 0));


            }

            for (int i = 0; i < field.getFIELD_SIZE(); i++) {
                if (chek(field, new Point(0, i), new Point(1, i), new Point(2, i)))
                    return field.getFigure(new Point(0, i));
            }

            for (int i = 0; i < field.getFIELD_SIZE(); i++) {
                if (chek(field, new Point(i, i), new Point(i, i), new Point(i, i)))
                    return field.getFigure(new Point(0, i));
                if (chek(field, new Point(field.getFIELD_SIZE() - i, i), new Point(field.getFIELD_SIZE() - i, i),
                        new Point(field.getFIELD_SIZE() - i, i))) return field.getFigure(new Point(0, i));
            }

        } catch (InvalidPointException e) {
            e.printStackTrace();
        }
    }

    private boolean chek(final Field field, final Point p1, final Point p2, final Point p3) {


        try {
            if (field.getFigure(p1) == null) return false;
            if (field.getFigure(p1) == field.getFigure(p2) && field.getFigure(p1) == field.getFigure(p3)) return true;
        } catch (InvalidPointException e) {
            e.printStackTrace();
        }
        return false;
    }
}
