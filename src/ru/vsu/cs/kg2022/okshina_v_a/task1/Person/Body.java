package ru.vsu.cs.kg2022.okshina_v_a.task1.Person;

import java.awt.*;

public class Body {
    private int x, y, width, height;
    private Color colorBody;

    public Body(int x, int y, int width, int height, Color colorBody) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.colorBody = colorBody;
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

    public Color getColorBody() {
        return colorBody;
    }

    public void setColorBody(Color colorBody) {
        this.colorBody = colorBody;
    }

    public void drawBody(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(this.colorBody);
        g.fillOval(this.x, this.y, this.width, this.height);
        g.setStroke(new BasicStroke(6));
        g.setColor(new Color(232,120,130));
        g.drawOval(this.x, this.y, this.width, this.height);
        g.setColor(Color.WHITE);
        g.fillOval(this.x + 60, this.y + 50, this.width - 200, this.height - 200);
        g.fillOval(this.x + 150, this.y + 50, this.width - 200, this.height - 200);
        g.setColor(new Color(108,188,232));
        g.fillOval(this.x + 85, this.y + 80, this.width - 250, this.height - 250);
        g.fillOval(this.x + 170, this.y + 80, this.width - 250, this.height - 250);
        g.setColor(Color.BLACK);
        g.fillOval(this.x + 105, this.y + 100, this.width - 280, this.height - 280);
        g.fillOval(this.x + 190, this.y + 100, this.width - 280, this.height - 280);
        g.setColor(new Color(232,120,130));
        g.fillOval(this.x + 120, this.y + 120, this.width - 230, this.height - 230);
        g.setColor(new Color(224,77,94));
        g.fillOval(this.x + 140, this.y + 150, this.width - 290, this.height - 280);
        g.fillOval(this.x + 160, this.y + 150, this.width - 290, this.height - 280);
        g.setColor(new Color(222,66,26));
        g.setStroke(new BasicStroke(6));
        g.drawArc(this.x + 125, this.y + 180, this.width - 240, this.height - 270, -170, 170);
        g.setColor(this.colorBody);
        g.fillOval(this.x-7, this.y + 30, this.width - 260, this.height - 260);
        g.setColor(new Color(232,120,130));
        g.drawOval(this.x-7, this.y + 30, this.width - 260, this.height - 260);
        g.setColor(this.colorBody);
        g.fillOval(this.x + 270, this.y + 30, this.width - 260, this.height - 260);
        g.setColor(new Color(232,120,130));
        g.drawOval(this.x + 270, this.y + 30, this.width - 260, this.height - 260);

        g.setColor(this.colorBody);
        g.fillRect(this.x - 20, this.y + 130, this.width - 280, this.height - 190);
        g.setColor(new Color(232,120,130));
        g.drawRect(this.x - 20, this.y + 130, this.width - 280, this.height - 190);
        g.setColor(new Color(224,77,94));
        g.fillRect(this.x - 20, this.y + 220, this.width - 280, this.height - 280);
        g.setColor(this.colorBody);
        g.fillRect(this.x + 300, this.y + 130, this.width - 280, this.height - 190);
        g.setColor(new Color(232,120,130));
        g.drawRect(this.x + 300, this.y + 130, this.width - 280, this.height - 190);
        g.setColor(new Color(224,77,94));
        g.fillRect(this.x + 300, this.y + 220, this.width - 280, this.height - 280);

        g.setColor(this.colorBody);
        g.fillRect(this.x + 115, this.y + 300, this.width - 270, this.height - 250);
        g.setColor(new Color(232,120,130));
        g.drawRect(this.x + 115, this.y + 300, this.width - 270, this.height - 250);
        g.setColor(new Color(224,77,94));
        g.fillRect(this.x + 115, this.y + 340, this.width - 270, this.height - 290);
        g.setColor(this.colorBody);
        g.fillRect(this.x + 155, this.y + 300, this.width - 270, this.height - 250);
        g.setColor(new Color(232,120,130));
        g.drawRect(this.x + 155, this.y + 300, this.width - 270, this.height - 250);
        g.setColor(new Color(224,77,94));
        g.fillRect(this.x + 155, this.y + 340, this.width - 270, this.height - 290);

        g.setColor(new Color(222,66,26));
        g.fillOval(this.x + 75, this.y + 50, this.width - 230, this.height - 280);
        g.fillOval(this.x + 165, this.y + 50, this.width - 230, this.height - 280);
        g.setColor(new Color(138,33,28));
        g.setStroke(new BasicStroke(3));
        g.drawLine(this.x + 75, this.y + 60, this.x + 60, this.y + 45);
        g.drawLine(this.x + 85, this.y + 55, this.x + 75, this.y + 45);
        g.drawLine(this.x + 235, this.y + 60, this.x + 250, this.y + 47);
        g.drawLine(this.x + 230, this.y + 55, this.x + 242, this.y + 40);

        g.setColor(new Color(222,66,26));
        g.setStroke(new BasicStroke(5));
        g.fillArc(this.x + 72, this.y , this.width - 150, this.height - 260, 0, 180);
        g.fillOval(this.x + 140, this.y - 40, 45, 45);
        g.fillOval(this.x + 150, this.y - 60, 35, 35);
        g.fillOval(this.x + 160, this.y - 70, 25, 25);
        g.fillOval(this.x + 170, this.y - 80, 15, 15);


    }
}
