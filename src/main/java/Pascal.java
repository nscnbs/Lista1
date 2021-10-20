import javax.swing.*;
import java.awt.*;


public class Pascal {
    int ilosc;
    WierszTrojkataPascala trojkat;
    String wierszString = "";
    JFrame frame;

    public void go() {
        start();

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(ilosc + 1, 1));
        frame.add(panel);

        trojkat = new WierszTrojkataPascala(ilosc);

        for (int i = 0; i <= ilosc; i++) {
            wierszString = "";
            for (int v = 0; v <= i; v++) {
                wierszString = wierszString + "  " + trojkat.getElement(i, v);
            }

            JLabel label = new JLabel(wierszString, SwingConstants.CENTER);
            label.setHorizontalTextPosition(JLabel.CENTER);
            panel.add(label);
            label.setFont(new Font("Trebuchet MS", 0, (int) (20 - i * 0.3)));

        }
        frame.pack();
        frame.setVisible(true);
    }

    public void start() {
        int g = 0;
        while (g < 1) {
            String input = JOptionPane.showInputDialog("Podaj ilosc wierszow");
            if (input.length() > 0) {
                int liczba;
                try {
                    liczba = Integer.parseInt(input);
                    if (liczba >= 0 && liczba <= 33) {
                        ilosc = liczba;
                        g++;
                    }
                } catch (Exception ex) {
                }
            }
        }
    }
}
