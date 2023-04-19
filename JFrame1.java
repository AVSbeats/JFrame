import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class JFrame1 {
    public static void main(String[] args) {

        // This will create a frame box
        JFrame aFrame = new JFrame("First frame Example");
        aFrame.setSize(300, 200);
        aFrame.setVisible(true);
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // This will Change font and styles
        Font fontStyle = new Font("Monospaced", Font.BOLD, 24);

        // This will add text inside the frame & Layout positions
        JLabel greeting1 = new JLabel("Produced by: ");
        JLabel greeting2 = new JLabel("AVS Beats");
        greeting1.setFont(fontStyle);
        greeting2.setFont(fontStyle);

        aFrame.setLayout(new FlowLayout());
        aFrame.add(greeting1);
        aFrame.add(greeting2);
    }
}