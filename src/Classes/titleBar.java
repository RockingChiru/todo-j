package Classes;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;

public class titleBar extends JPanel {
    titleBar() {
        this.setPreferredSize(new Dimension(400, 50));

        JLabel titlelabel = new JLabel("TO  DO");

        titlelabel.setPreferredSize(new Dimension(200, 50));
        titlelabel.setFont(new Font("sans>serif", Font.BOLD, 20));
        titlelabel.setHorizontalAlignment(JLabel.CENTER);

        this.add(titlelabel);
    }
}
