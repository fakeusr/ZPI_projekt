package VolumeCalc;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;

public class SimpleVolumeCalc extends Component {

    private double solidRadius;
    private double solidHeight;

    private int componentWidth;
    private int componentHeight;
    private Color componentColor;

    public SimpleVolumeCalc() {
        super();
        this.solidRadius = 0;
        this.solidHeight = 0;
        this.componentWidth = 80;
        this.componentHeight = 50;
        this.componentColor = Color.BLACK;
    }

    public double getSolidRadius() {
        return solidRadius;
    }

    public void setSolidRadius(double radius) {
        this.solidRadius = radius;
    }

    public double getSolidHeight() {
        return solidHeight;
    }

    public void setSolidHeight(double height) {
        this.solidHeight = height;
    }

    public int getComponentWidth() {
        return componentWidth;
    }

    public void setComponentWidth(int componentWidth) {
        this.componentWidth = componentWidth;
    }

    public int getComponentHeight() {
        return componentHeight;
    }

    public void setComponentHeight(int componentHeight) {
        this.componentHeight = componentHeight;
    }

    public Color getComponentColor() {
        return componentColor;
    }

    public void setComponentColor(Color componentColor) {
        this.componentColor = componentColor;
    }

    @Override
    public void paint(Graphics g) {
        setSize(new Dimension(this.componentWidth, this.componentHeight));
        g.setColor(this.componentColor);

        int height = getSize().height;
        int width = getSize().width;
        int w, h;
        g.drawRect(0, 0, w = width / 2, h = height / 2);
        g.drawRect(w / 2, h / 2, w / 2 * 2, h / 2 * 2);
        g.drawLine(0, 0, w / 2, h / 2);
        g.drawLine(w, h, w / 2 + w / 2 * 2, h / 2 + h / 2 * 2);
        g.drawLine(w, 0, w / 2 + w / 2 * 2, h / 2);
        g.drawLine(0, h, w / 2, h / 2 + h / 2 * 2);
    }

    public double calcSphereVolume() {
        return (4 / 3) * Math.PI * this.solidRadius * this.solidRadius * this.solidRadius;
    }

    public double calcCylinderVolume() {
        return this.solidHeight * Math.PI * this.solidRadius * this.solidRadius;
    }

    public double calcConeVolume() {
        return (1 / 3) * this.solidHeight * Math.PI * this.solidRadius * this.solidRadius;
    }

}
