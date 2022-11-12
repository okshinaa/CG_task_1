package ru.vsu.cs.kg2022.okshina_v_a.task1;

import ru.vsu.cs.kg2022.okshina_v_a.task1.Background.Cloud;
import ru.vsu.cs.kg2022.okshina_v_a.task1.Background.Flower;
import ru.vsu.cs.kg2022.okshina_v_a.task1.Background.Nature;
import ru.vsu.cs.kg2022.okshina_v_a.task1.Background.Sun;
import ru.vsu.cs.kg2022.okshina_v_a.task1.Person.Body;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class DrawPanel extends JPanel implements ActionListener {

    private static final Random rnd = new Random();
    private final int PANEL_WIDTH;
    private final int PANEL_HEIGHT;
    private final int TIMER_DELAY;
    private final Timer timer;
    private int ticksFromStart = 0;

    private Nature nature;
    private Sun sun;
    private Cloud[] cloud;
    private Flower[] flower;
    private Flower hairFlower;
    private Body body;


    public DrawPanel(final int width, final int height, final int timerDelay) {
        this.PANEL_WIDTH = width;
        this.PANEL_HEIGHT = height;
        this.TIMER_DELAY = timerDelay;
        timer = new Timer(timerDelay, this);
        timer.start();

        this.nature = new Nature(0, 0, width, height, 250, 150, "СМЕШАРИКИ: новая серия!",
                new Color(176, 224, 230), new Color(107, 142, 35));
        this.sun = new Sun(90, 70, 40, 25, 10 + rnd.nextInt(20), Color.ORANGE);
        this.cloud = new Cloud[rnd.nextInt(4, 8)];
        this.flower = new Flower[rnd.nextInt(5, 9)];
        this.hairFlower = new Flower(610, 380, 30, 30, Color.WHITE);
        this.body = new Body(750, 500, 300, 300, new Color(247, 199, 209));

        for (int i = 0; i < flower.length; i++) {
            int randomX = rnd.nextInt(50, 1400);
            int randomY = rnd.nextInt(640, 1100);

            flower[i] = new Flower(randomX, randomY, 40, 40, Color.PINK);
        }

        for (int i = 0; i < cloud.length; i++) {
            int randomX = rnd.nextInt(50, 1400);
            int randomY = rnd.nextInt(0, 450);

            cloud[i] = new Cloud(randomX, randomY, 140, 60, Color.WHITE);
        }
    }

    @Override
    public void paint(final Graphics gr) {
        super.paint(gr);

        nature.setWidth(getWidth());
        nature.setHeight(getHeight());
        nature.drawSkyAndGround(gr);

        sun.setX(ticksFromStart);
        sun.drawSun(gr);

        for (Cloud cloud : cloud) {
            cloud.drawCloud(gr);
        }

        for (Flower flower : flower) {
            flower.drawFlower(gr);
        }

        body.drawBody(gr);
        hairFlower.drawFlower(gr);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == timer) {
            for (Cloud cloud : cloud) {
                int gX = cloud.getX();

                if (cloud.getX() > getWidth()) {
                    cloud.setX(getX() - 150);
                } else {
                    cloud.setX(gX + 10);
                }
            }

            repaint();
            ticksFromStart ++;
        }
    }
}
