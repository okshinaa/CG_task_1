package ru.vsu.cs.kg2022.okshina_v_a.task1.Background;

import java.awt.*;

public class Nature {
    private int x, y, width, height, x1, y1;
    private String str;
    private Color colorSky, colorGround;

    public Nature(int x, int y, int width, int height, int x1, int y1, String str, Color colorSky, Color colorGround) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.x1 = x1;
        this.y1 = y1;
        this.str = str;
        this.colorSky = colorSky;
        this.colorGround = colorGround;
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

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Color getColorSky() {
        return colorSky;
    }

    public void setColorSky(Color colorSky) {
        this.colorSky = colorSky;
    }

    public Color getColorGround() {
        return colorGround;
    }

    public void setColorGround(Color colorGround) {
        this.colorGround = colorGround;
    }

    public void drawSkyAndGround(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(this.colorSky);
        g.fillRect(this.x, this.y, this.width, this.height/2);

        g.setColor(Color.PINK);
        Font f = new Font("Arial", Font.ITALIC, 50);
        g.setFont(f);
        g.drawString(this.str, this.x1, this.y1);

        g.setColor(this.colorGround);
        g.fillRect(this.x,this.height/2,this.width,this.height/2);
    }
}
