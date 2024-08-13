package java5;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class SWING_ADVANCED {
    public static void main(String[] args) {
        //real time application->Task Manager->tasks,prority,time
        JFrame frame = new JFrame("Task Manager");

        //task table
        String[] colnames = {"Task", "Category", "Priority", "Completion"};
        Object[][] data = {{"Task1", "Work", "High", 30},
                {"Task2", "Personal", "Medium", 60},
                {"Task3", "Work", "Low", 70}
        };
        //JTable
        JTable tasktable = new JTable(new DefaultTableModel(data, colnames));

        //Scrollpane
        JScrollPane taskscroll = new JScrollPane(tasktable);

        //JTree->root->branches
        //root
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Category");
        DefaultMutableTreeNode worknode = new DefaultMutableTreeNode("Work");
        DefaultMutableTreeNode personalnode = new DefaultMutableTreeNode("Personal");
        root.add(worknode);
        root.add(personalnode);

        JTree tasktree = new JTree(root);
        JScrollPane treescrollpane = new JScrollPane(tasktree);

        //list
        String[] prioritylevels = {"High", "Medium", "Low"};
        JList<String> proiritylsit = new JList<>(prioritylevels);
        JScrollPane listscrollpane = new JScrollPane(proiritylsit);

        //tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("All Tasks", taskscroll);
        tabbedPane.addTab("Categories", treescrollpane);
        tabbedPane.addTab("Priority List", listscrollpane);

        //progress bar
        JProgressBar progress = new JProgressBar();
        progress.setStringPainted(true);

        //jslider
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        slider.setMajorTickSpacing(25);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        //spinner
        SpinnerModel spinner = new SpinnerNumberModel(3, 2, 4, 1);
        JSpinner taskspinner = new JSpinner(spinner);

        //layout
        frame.setLayout(new BorderLayout());
        frame.add(tabbedPane, BorderLayout.CENTER);
        frame.add(createprioritypanel(slider), BorderLayout.SOUTH);
        frame.add(createprogresspanel(progress), BorderLayout.NORTH);
        frame.add(createspinnerpanel(taskspinner), BorderLayout.EAST);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    private static JPanel createprioritypanel(JSlider slider) {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(new JLabel("Task Priority"));
        panel.add(slider);
        return panel;
    }

    private static JPanel createprogresspanel(JProgressBar progressBar) {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(new JLabel("Task Completion:"));
        panel.add(progressBar);
        return panel;
    }
    private static JPanel createspinnerpanel(JSpinner spinner) {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(new JLabel("Number of Tasks:"));
        panel.add(spinner);
        return panel;
    }
}