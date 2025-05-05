
import java.awt.*;
import javax.swing.*;

public class BotonRedondo extends JButton {

    public BotonRedondo(String texto) {
        super(texto);
        setContentAreaFilled(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(getModel().isArmed() ? new Color(200, 200, 200) : getBackground());
        g.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        g.setColor(getForeground());
        g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
    }

    @Override
    public void setContentAreaFilled(boolean b) {
        // No hacer nada para mantener el fondo personalizado
    }
}
