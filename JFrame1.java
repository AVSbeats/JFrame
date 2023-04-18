import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrame1 {
    public static void main(String[] args) {

        // This will create a frame box
        JFrame aFrame = new JFrame("First frame Example");
        aFrame.setSize(300, 200);
        aFrame.setVisible(true);
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel greeting = new JLabel("Good Morning!");
        aFrame.add(greeting);
    }
}