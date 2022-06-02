package GUI;

import ourpackage.Request;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreditCard {
    static JFrame frame = new JFrame("Request Credit Card");
    private JPanel mainPanel;
    private JLabel ChangeAddressLabel;
    private JLabel creditlimit;
    private JLabel enterpass;
    private JTextField password;
    private JButton ConfirmButton;
    private JButton showcreditcardcode;
    private JTextField limit;
    private JLabel codelabel;
    private JButton backButton;
    private String opcode;

    public CreditCard() {
        ConfirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Request newrequest= new Request();
                double amount = Double.valueOf(limit.getText());
                String InputPassword = null;

                Path Output_file = Path.of("Password.txt");
                try {
                    InputPassword = Files.readString(Output_file);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                if (InputPassword.equals(password.getText())){
                    newrequest.setCreditcardlimit(amount);

                    if(newrequest.requestCreditCard() == "true"){
                        JOptionPane.showMessageDialog(null, "Credit Card successfully successfully created");
                        //opcode= newrequest.getUser().getCreditcardcode();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Wrong Password");
                }

            }
        });
        showcreditcardcode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Path Output_file = Path.of("CreditCardCode.txt");
                try {
                    String code= Files.readString(Output_file);
                    codelabel.setText(code);
                } catch (IOException ex) {
                    ex.printStackTrace();
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

    public JPanel getMainPanel() {
        return mainPanel;
    }
    public static void main(String[] args) {

        frame.setContentPane(new CreditCard().getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700,700);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setVisible(true);
    }
}
