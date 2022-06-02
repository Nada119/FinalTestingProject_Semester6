package GUI;

import ourpackage.Request;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DebitCard {
    static JFrame frame = new JFrame("Request Debit Card");
    private JPanel mainPanel;
    private JLabel Debit;
    private JLabel enterpass;
    private JTextField password;
    private JButton ConfirmButton;
    private JButton showdebitcardcode;
    private JLabel codelabel;
    private JButton backButton;

    public JPanel getMainPanel() {
        return mainPanel;
    }


    public DebitCard() {
        ConfirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Request newrequest= new Request();
                String InputPassword = null;
                Path Output_file = Path.of("Password.txt");
                try {
                    InputPassword = Files.readString(Output_file);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                if (InputPassword.equals(password.getText())){

                    if(newrequest.requestDebitCard() == "true"){
                        JOptionPane.showMessageDialog(null, "Debit Card successfully created");
                       // String code= newrequest.getUser().getDebitcardcode();
                    }

                }
                else{
                    JOptionPane.showMessageDialog(null, "Wrong Password");
                }
            }
        });
        showdebitcardcode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Path Output_file = Path.of("DebitCardCode.txt");
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


    public static void main(String[] args) {

        frame.setContentPane(new DebitCard().getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700,700);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setVisible(true);
    }

}
