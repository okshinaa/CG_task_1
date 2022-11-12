package ru.vsu.cs.kg2022.okshina_v_a.task1;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public MainWindow() throws HeadlessException {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(1500, 1200);
        DrawPanel drawPanel = new DrawPanel(getWidth(), getHeight(), 100);
        this.add(drawPanel);
    }
}