package VolumeCalc;

import java.awt.Color;
import java.awt.Graphics;
import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleVolumeCalcTest {

    private static final double DELTA = 0.25;

    @Test
    public void calcSphereVolume_validInput() {
        SimpleVolumeCalc calc = new SimpleVolumeCalc();
        calc.setSolidRadius(5.0);

        double expResult = 523.59;
        double result = calc.calcSphereVolume();

        assertEquals(expResult, result, DELTA);
    }

    @Test
    public void calcSphereVolume_invalidInput() {
        SimpleVolumeCalc calc = new SimpleVolumeCalc();
        calc.setSolidRadius(-125.0);

        double expResult = -1;
        double result = calc.calcSphereVolume();

        assertEquals(expResult, result, DELTA);
    }

    @Test
    public void calcCylinderVolume_validInput() {
        SimpleVolumeCalc calc = new SimpleVolumeCalc();
        calc.setSolidRadius(5.0);
        calc.setSolidHeight(5.0);

        double expResult = 392.69;
        double result = calc.calcCylinderVolume();

        assertEquals(expResult, result, DELTA);
    }

    @Test
    public void calcCylinderVolume_invalidInput() {
        SimpleVolumeCalc calc = new SimpleVolumeCalc();
        calc.setSolidRadius(5.0);
        calc.setSolidHeight(-3.0);

        double expResult = -1;
        double result = calc.calcCylinderVolume();

        assertEquals(expResult, result, DELTA);
    }

    @Test
    public void calcConeVolume_validInput() {
        SimpleVolumeCalc calc = new SimpleVolumeCalc();
        calc.setSolidRadius(5.0);
        calc.setSolidHeight(5.0);

        double expResult = 130.89;
        double result = calc.calcConeVolume();

        assertEquals(expResult, result, DELTA);
    }

    @Test
    public void calcConeVolume_imvalidInput() {
        SimpleVolumeCalc calc = new SimpleVolumeCalc();
        calc.setSolidRadius(-1.0);
        calc.setSolidHeight(5.0);

        double expResult = -1;
        double result = calc.calcConeVolume();

        assertEquals(expResult, result, DELTA);
    }

}
