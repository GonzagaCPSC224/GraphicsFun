import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GraphicsPanel extends JPanel {
    GraphicsFrame graphicsFrame;

    public GraphicsPanel(GraphicsFrame parentFrame) {
        graphicsFrame = parentFrame;

        setBackground(Color.WHITE);

    }
}
