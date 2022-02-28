package KalkulatorObjetosci;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;

public class ProstyKalkulatorObjetosci extends Component {

    private double solidRadius;
    private double solidHeight;

    private int wielkoscKomponentu;
    private Color kolorWypelnieniaKomponentu;
    private Color kolorKomponentu;

    public ProstyKalkulatorObjetosci() {
        super();
        this.solidRadius = 0;
        this.solidHeight = 0;
        this.wielkoscKomponentu = 20;
        this.kolorKomponentu = Color.RED;
        this.kolorWypelnieniaKomponentu = Color.BLUE;
    }

    public double getSolidRadius() {
        return solidRadius;
    }

    public void setSolidRadius(double solidRadius) {
        this.solidRadius = solidRadius;
    }

    public double getSolidHeight() {
        return solidHeight;
    }

    public void setSolidHeight(double solidHeight) {
        this.solidHeight = solidHeight;
    }

    public int getWielkoscKomponentu() {
        return wielkoscKomponentu;
    }

    public void setWielkoscKomponentu(int wielkoscKomponentu) {
        this.wielkoscKomponentu = wielkoscKomponentu;
    }

    public Color getKolorWypelnieniaKomponentu() {
        return kolorWypelnieniaKomponentu;
    }

    public void setKolorWypelnieniaKomponentu(Color kolorWypelnieniaKomponentu) {
        this.kolorWypelnieniaKomponentu = kolorWypelnieniaKomponentu;
    }

    public Color getKolorKomponentu() {
        return kolorKomponentu;
    }

    public void setKolorKomponentu(Color kolorKomponentu) {
        this.kolorKomponentu = kolorKomponentu;
    }

    @Override
    public void paint(Graphics g) {
        setSize(new Dimension(this.wielkoscKomponentu, this.wielkoscKomponentu));
        g.setColor(this.kolorKomponentu);
        g.drawLine(0, this.wielkoscKomponentu, this.wielkoscKomponentu, this.wielkoscKomponentu);
        g.drawLine(0, 0, 0, this.wielkoscKomponentu);
        g.drawLine(this.wielkoscKomponentu, 0, this.wielkoscKomponentu, this.wielkoscKomponentu);
        g.setColor(this.kolorWypelnieniaKomponentu);
        g.fillRect(0, 0, this.wielkoscKomponentu, this.wielkoscKomponentu);
    }

    public double calcSphereVolume() {
        if (this.solidRadius < 0) {
            return -420;
        }
        return Math.PI * this.solidRadius * this.solidRadius * this.solidRadius * 4 / 3;
    }

    public double calcCylinderVolume() {
        if (this.solidRadius < 0 || this.solidHeight < 0) {
            return -420;
        }
        return this.solidHeight * Math.PI * this.solidRadius * this.solidRadius;
    }

    public double calcConeVolume() {
        if (this.solidRadius < 0 || this.solidHeight < 0) {
            return -420;
        }
        return this.solidHeight * Math.PI * this.solidRadius * this.solidRadius / 3;
    }

}
