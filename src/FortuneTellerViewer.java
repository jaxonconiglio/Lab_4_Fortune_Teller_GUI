import javax.swing.*;

public class FortuneTellerViewer {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new FortuneTellerFrame();
            frame.setVisible(true);
        });
    }
}