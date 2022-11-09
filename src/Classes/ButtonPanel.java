package Classes;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
// import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ButtonPanel extends JPanel {
    private JButton createTask;
    private JButton emptyTasks;

    Border eborder = BorderFactory.createEmptyBorder();

    ButtonPanel() {
        this.setPreferredSize(new Dimension(200, 40));

        createTask = new JButton("Add");
        createTask.setBorder(eborder);
        createTask.setFont(new Font("sans>serif", Font.PLAIN, 20));

        emptyTasks = new JButton("Clear completed tasks");
        emptyTasks.setBorder(eborder);
        emptyTasks.setFont(new Font("sans>serif", Font.PLAIN, 20));

        this.add(createTask);
        // this.add(Box.createHorizontalStrut(20));
        this.add(emptyTasks);
    }

    public JButton getNewTask() {
        return createTask;
    }

    public JButton getClearTask() {
        return emptyTasks;
    }
}
