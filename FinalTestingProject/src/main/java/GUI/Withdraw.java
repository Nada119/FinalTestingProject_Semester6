package GUI;

import ourpackage.Service;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Withdraw {
    static JFrame frame= new JFrame("Withdraw");
    public static Service s2;
    private JPanel mainPanel;
    private JLabel WithdrawLabel;
    private JButton showNewBalanceButton;
    private JLabel Label;
    private JButton confirmButton;
    private JLabel BalanceLabel;

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    private JTextField InputAmountTextField;
    private JLabel balance1;
    private JButton backButton;

    public Withdraw() throws NumberFormatException {
        Path MyBalanceOutput = Path.of("MyBalance.txt");
        String MyBalance = null;
        try {
            MyBalance = Files.readString(MyBalanceOutput);
        } catch (IOException e) {
            e.printStackTrace();
        }
        balance1.setText(MyBalance);
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                double amount = Double.valueOf(InputAmountTextField.getText());
                s2 = new Service(amount);
                if (s2.withdrawMoney() == "true")

                {
                    JOptionPane.showMessageDialog(null, "Your Withdraw Done Successfully");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Your Withdraw failed due to insufficient balance");
                }}
                catch (NumberFormatException exception)
                {
                    JOptionPane.showMessageDialog(null, "Your Withdraw failed due to incorrect input");
                }

            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                JFrame frame= new JFrame("Dashboard");
                frame.setContentPane(new DashBoard().getDashboard());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setSize(700,700);
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
                frame.setVisible(true);
            }
        });
    }

    public static  void main(String[] args){

        frame.setContentPane(new Withdraw().getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700,700);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setVisible(true);
    }
}
