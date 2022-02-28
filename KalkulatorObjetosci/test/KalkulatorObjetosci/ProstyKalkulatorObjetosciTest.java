package KalkulatorObjetosci;

import java.awt.Color;
import java.awt.Graphics;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProstyKalkulatorObjetosciTest {

    private static final double DELTA = 0.1;

    @Test
    public void calcSphereVolume_validInput() {
        ProstyKalkulatorObjetosci calc = new ProstyKalkulatorObjetosci();
        calc.setSolidRadius(5.0);

        double expResult = 523.59;
        double result = calc.calcSphereVolume();

        assertEquals(expResult, result, DELTA);
    }

    @Test
    public void calcSphereVolume_invalidInput() {
        ProstyKalkulatorObjetosci calc = new ProstyKalkulatorObjetosci();
        calc.setSolidRadius(-125.0);

        double expResult = -420;
        double result = calc.calcSphereVolume();

        assertEquals(expResult, result, DELTA);
    }

    @Test
    public void calcCylinderVolume_validInput() {
        ProstyKalkulatorObjetosci calc = new ProstyKalkulatorObjetosci();
        calc.setSolidRadius(5.0);
        calc.setSolidHeight(5.0);

        double expResult = 392.69;
        double result = calc.calcCylinderVolume();

        assertEquals(expResult, result, DELTA);
    }

    @Test
    public void calcCylinderVolume_invalidInput() {
        ProstyKalkulatorObjetosci calc = new ProstyKalkulatorObjetosci();
        calc.setSolidRadius(5.0);
        calc.setSolidHeight(-3.0);

        double expResult = -420;
        double result = calc.calcCylinderVolume();

        assertEquals(expResult, result, DELTA);
    }

    @Test
    public void calcConeVolume_validInput() {
        ProstyKalkulatorObjetosci calc = new ProstyKalkulatorObjetosci();
        calc.setSolidRadius(5.0);
        calc.setSolidHeight(5.0);

        double expResult = 130.89;
        double result = calc.calcConeVolume();

        assertEquals(expResult, result, DELTA);
    }

    @Test
    public void calcConeVolume_imvalidInput() {
        ProstyKalkulatorObjetosci calc = new ProstyKalkulatorObjetosci();
        calc.setSolidRadius(-1.0);
        calc.setSolidHeight(5.0);

        double expResult = -420;
        double result = calc.calcConeVolume();

        assertEquals(expResult, result, DELTA);
    }
}
