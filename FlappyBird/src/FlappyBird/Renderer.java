package FlappyBird;

import javax.swing.*;
import java.awt.Graphics;

public class Renderer extends JPanel {

    private static final long serialVersionUID = 1L;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        FlappyBird.flappyBird.repaint(g);

    }
}
