package main;

import inputs.KeyboardInput;
import inputs.MouseInput;
import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private MouseInput mouseInput;
    private Game game;

    public GamePanel(Game game) {
        mouseInput = new MouseInput(this);
        this.game = game;

        setPanelSize();
        addKeyListener(new KeyboardInput(this));
        addMouseListener(mouseInput);
        addMouseMotionListener(mouseInput);
    }


    private void setPanelSize() {
        Dimension size = new Dimension(1280,800);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
    }


    public void updateGame() {

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        game.render(g);
    }

    public Game getGame() {
        return game;
    }


}
