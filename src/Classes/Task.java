package Classes;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Color;

public class Task extends JPanel {
    private JLabel index;
    private JTextField name;
    private JButton doneTask;
    private boolean checked;

    Task() {
        this.setPreferredSize(new Dimension(40, 20));
        this.setLayout(new BorderLayout());

        checked = false;

        index = new JLabel("");
        index.setPreferredSize(new Dimension(20, 20));
        index.setHorizontalAlignment(JLabel.CENTER);
        this.add(index, BorderLayout.WEST);

        name = new JTextField("Your task here");
        name.setBorder(BorderFactory.createEmptyBorder());
        // name.setPreferredSize(new Dimension(60, 20));
        // name.setHorizontalAlignment(JLabel.CENTER);
        this.add(name, BorderLayout.CENTER);

        doneTask = new JButton("Done");
        doneTask.setPreferredSize(new Dimension(30, 20));
        doneTask.setBorder(BorderFactory.createEmptyBorder());
        this.add(doneTask, BorderLayout.EAST);

    }

    public JButton getDone() {
        return doneTask;
    }

    public void cahngeIndex(int number) {
        this.index.setText(number + "");
        this.revalidate();
    }

    public void changeState() {
        this.setBackground(Color.GREEN);
        checked = true;
    }

    public boolean getState() {
        return checked;
    }
}
