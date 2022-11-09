package Classes;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
import java.awt.event.MouseAdapter;
import java.awt.Component;
import java.awt.event.MouseEvent;

import java.awt.*;

public class AppFrame extends JFrame {
    private titleBar titlebar;
    private ButtonPanel buttonpanel;
    private List list;

    private JButton addTask;
    private JButton clear;

    AppFrame() {
        this.setSize(400, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        titlebar = new titleBar();
        buttonpanel = new ButtonPanel();
        list = new List();

        this.add(titlebar, BorderLayout.NORTH);
        this.add(list, BorderLayout.CENTER);
        this.add(buttonpanel, BorderLayout.SOUTH);

        addTask = buttonpanel.getNewTask();
        clear = buttonpanel.getClearTask();

        addListeners();
    }

    public void addListeners() {
        addTask.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Task task = new Task();
                list.add(task);
                list.updateNumbers();
                task.getDone().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        task.changeState();
                        revalidate();
                    }
                });
                revalidate();
            }
        });

        clear.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                list.removeCompletedTasks();
                repaint();
            }
        });
    }
}
