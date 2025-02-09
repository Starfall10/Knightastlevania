package main;

import inputs.KeyboardInput;
import inputs.MouseInput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel {

    private MouseInput mouseInput;

    public GamePanel() {

        mouseInput = new MouseInput();
        addKeyListener(new KeyboardInput());
        addMouseListener(mouseInput);
        addMouseMotionListener(mouseInput);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.fillRect(100,100,200,50);
    }
}
