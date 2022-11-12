package ru.vsu.cs.kg2022.okshina_v_a.task1.Background;

import java.awt.*;

public class Flower {
    private int x, y, width, height;
    private Color colorFlower;

    public Flower(int x, int y, int width, int height, Color colorFlower) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.colorFlower = colorFlower;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Color getColorFlower() {
        return colorFlower;
    }

    public void setColorFlower(Color colorFlower) {
        this.colorFlower = colorFlower;
    }

    public void drawFlower(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(this.colorFlower);
        g.fillOval(this.x + 304, this.y, this.width, this.height);
        g.fillOval(this.x + 330, this.y + 20, this.width, this.height);
        g.fillOval(this.x + 320, this.y + 50, this.width, this.height);
        g.fillOval(this.x + 290, this.y + 50, this.width, this.height);
        g.fillOval(this.x + 280, this.y + 20, this.width, this.height);

        g.setColor(Color.YELLOW);
        g.fillOval(this.x + 312, this.y + 35, this.width - 15, this.height - 15);
    }
}
