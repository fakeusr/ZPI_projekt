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
    private Color componentBgColor;
    private Color componentColor;

    public SimpleVolumeCalc() {
        super();
        this.solidRadius = 0;
        this.solidHeight = 0;
        this.componentWidth = 80;
        this.componentHeight = 40;
        this.componentBgColor = Color.YELLOW;
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

    public Color getComponentBgColor() {
        return componentBgColor;
    }

    public void setComponentBgColor(Color componentBgColor) {
        this.componentBgColor = componentBgColor;
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
        setBackground(this.componentBgColor);
        g.setColor(this.componentColor);

        g.drawOval(0, 0, this.componentWidth, this.componentHeight / 10);
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
