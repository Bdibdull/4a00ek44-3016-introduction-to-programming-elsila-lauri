import java.io.Console;
import javax.swing.*;

class Jframee {
    public static void main(String [] args) {
        JFrame ikkuna = new JFrame("Super siisti uus ikkuna");
        ikkuna.setSize(400, 400);
        ikkuna.setVisible(true);

        JLabel laabeli = new JLabel("jabadabaduu");
        ikkuna.add(laabeli);

        JButton nappula = new JButton("clear");
        nappula.setBounds(130, 100, 100, 40);

        ikkuna.add(nappula);
    }
}