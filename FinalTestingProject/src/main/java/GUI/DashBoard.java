package GUI;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashBoard {
    private JPanel Dashboard;
    private JLabel dashboardlabel;
    private JLabel label2;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JButton backButton;

    static JFrame frame= new JFrame("Dashboard");

    public DashBoard() {
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBox1.getSelectedItem().toString() == "Transfer to another account")
                {
                    frame.dispose();
                    JFrame frame= new JFrame("Transfer");
                    frame.setContentPane(new Transfer().getMainPanel());
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setSize(700,700);
                    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                    frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
                    frame.setVisible(true);
                }
                if (comboBox1.getSelectedItem().toString() == "Deposit money")
                {
                    frame.dispose();
                    JFrame frame= new JFrame("Deposit");
                    frame.setContentPane(new Deposit().getMainPanel());
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setSize(700,700);
                    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                    frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
                    frame.setVisible(true);

                }
                if (comboBox1.getSelectedItem().toString() == "Withdraw money")
                {
                    frame.dispose();
                    JFrame frame= new JFrame("Withdraw");
                    frame.setContentPane(new Withdraw().getMainPanel());
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setSize(700,700);
                    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                    frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
                    frame.setVisible(true);

                }
            }
        });
        comboBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBox2.getSelectedItem().toString() == "Request Certficate")
                {
                    frame.dispose();
                    JFrame frame= new JFrame("Request Certificate");
                    frame.setContentPane(new Certificate().getMainPanel());
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setSize(700,700);
                    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                    frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
                    frame.setVisible(true);
                }
                if (comboBox2.getSelectedItem().toString() == "Request Debit card")
                {
                    frame.dispose();
                    JFrame frame= new JFrame("Request Debit Card");
                    frame.setContentPane(new DebitCard().getMainPanel());
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setSize(700,700);
                    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                    frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
                    frame.setVisible(true);

                }
                if (comboBox2.getSelectedItem().toString() == "Request Credit Card")
                {
                    frame.dispose();
                    JFrame frame= new JFrame("Request Credit Card");
                    frame.setContentPane(new CreditCard().getMainPanel());
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setSize(700,700);
                    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                    frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
                    frame.setVisible(true);

                }

            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                JFrame frame= new JFrame("Main Window");
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

    public JPanel getDashboard() {
        return Dashboard;
    }

    public void setDashboard(JPanel dashboard) {
        Dashboard = dashboard;
    }
    public static  void main(String[] args){
        frame.setContentPane(new DashBoard().getDashboard());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700,700);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setVisible(true);
    }
}
