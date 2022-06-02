package GUI;

import ourpackage.Service;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class Deposit {
    public static Service s2;
    private JPanel mainPanel;
    private JLabel DepositLabel;
    private JButton showNewBalanceButton;
    private JLabel Label;
    private JTextField InputAmountTextField;
    private JLabel BalanceLabel;

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    private JButton ConfirmButton;
    private JLabel balance1;
    private JButton backButton;

    static JFrame frame= new JFrame("Deposit");


    public Deposit() throws NumberFormatException {
        Path MyBalanceOutput = Path.of("MyBalance.txt");
        try {
            String MyBalance = Files.readString(MyBalanceOutput);
            BalanceLabel.setText(MyBalance);
            balance1.setText(MyBalance);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        ConfirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                double amount = Double.valueOf(InputAmountTextField.getText());
                s2 = new Service(amount);
                if (s2.depositMoney() == "true")

                {
                    JOptionPane.showMessageDialog(null, "Your Deposit Done Successfully");
                    Path MyBalanceOutput = Path.of("MyBalance.txt");
                    try {
                        String MyBalance = Files.readString(MyBalanceOutput);
                        BalanceLabel.setText(MyBalance);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
               }
                catch (NumberFormatException exception)
                {
                    JOptionPane.showMessageDialog(null, "Your Deposit failed due to incorrect amount entered");
                    Path MyBalanceOutput = Path.of("MyBalance.txt");
                    try {
                        String MyBalance = Files.readString(MyBalanceOutput);
                        BalanceLabel.setText(MyBalance);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
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
        frame.setContentPane(new Deposit().getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700,700);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setVisible(true);
    }

}
