import javax.swing.*;
import java.awt.*;

public class GraphicsFrame extends JFrame {

    public GraphicsFrame() {
        super("Graphics Fun");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 500));
        setVisible(true);
        setupUI();
        pack();
    }

    private void setupUI() {
        GraphicsPanel graphicsPanel = new GraphicsPanel();
        setContentPane(graphicsPanel);
    }
}
