package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Help {
    static JFrame frame = new JFrame("Help");

    private JPanel help;
    private JPanel mainPanel;
    private JLabel ChangeAddressLabel;
    private JLabel enterpass;
    private JLabel codelabel;
    private JButton backButton;

    public Help() {
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                JFrame frame= new JFrame("MainWindow");
                frame.setContentPane(new MainWindow().getMainPanel());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setSize(700,700);
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
                frame.setVisible(true);
            }
        });
    }
    public JPanel getHelp() {
        return help;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Help");
        frame.setContentPane(new Help().getHelp()) ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700,700);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setVisible(true);
    }



}
