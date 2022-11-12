package ru.vsu.cs.kg2022.okshina_v_a.task1.Background;

import java.awt.*;

public class Sun {
    private int x;
    private int y;
    private int r;
    private int l;
    private int n;
    private Color c;

    public Sun(int x, int y, int r, int l, int n, Color c) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.l = l;
        this.n = n;
        this.c = c;
    }

    public double getX() {
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

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public void drawSun(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(this.c);
        g.fillOval( this.x - this.r, this.y - this.r, 2 * this.r, 2 * this.r);

        double da = 2 * Math.PI / this.n;

        for (int i = 0; i < this.n; i++) {
            double a = i * da;

            double x1 = (this.r * Math.cos(a)) + this.x;
            double y1 = (this.r * Math.sin(a)) + this.y;

            double x2 = ((this.r + this.l) * Math.cos(a)) + this.x;
            double y2 = ((this.r + this.l) * Math.sin(a)) + this.y;

            g.drawLine((int) x1, (int) y1, (int) x2, (int) y2);


        }
    }
}