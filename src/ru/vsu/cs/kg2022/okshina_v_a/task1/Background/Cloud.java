package ru.vsu.cs.kg2022.okshina_v_a.task1.Background;

import java.awt.*;

public class Cloud {
    private int x, y, width, height;
    private Color colorCloud;

    public Cloud(int x, int y, int width, int height, Color colorCloud) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.colorCloud = colorCloud;
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

    public Color getColorCloud() {
        return colorCloud;
    }

    public void setColorCloud(Color colorCloud) {
        this.colorCloud = colorCloud;
    }

    public void drawCloud(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(this.colorCloud);
        g.fillOval(this.x, this.y, this.width, this.height);
        g.fillOval(this.x + 15, this.y - 15, this.width - 75, this.height);
        g.fillOval(this.x + 40, this.y - 30, this.width - 55, this.height + 25);
    }
}
