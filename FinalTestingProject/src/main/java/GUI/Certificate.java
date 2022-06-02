package GUI;

import ourpackage.Request;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Certificate {
    static JFrame frame = new JFrame("Request Certificate");
    private JPanel mainPanel;
    private JLabel certificate;
    private JLabel amount;
    private JLabel yearly;
    private JButton ConfirmButton;
    private JTextField password;
    private JLabel Interest;
    private JButton backButton;
    private JTextField amountof;

    public Certificate() {
        ConfirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = Double.valueOf(amountof.getText());
                String ippassword= password.getText();
                Path Output_file = Path.of("Password.txt");

                System.out.print(ippassword);
                try {
                    String InputPassword = Files.readString(Output_file);
                    if ( InputPassword.equals(ippassword)){
                        System.out.print("here?");
                        Request newrequest= new Request();
                        newrequest.setAmountofcert(amount);
                        if (newrequest.requestCertificate()=="true"){
                            JOptionPane.showMessageDialog(null, "Certificate successfully created");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Certificate creation unsuccessfull" +
                                    "/n Please check your balance");
                        }
                    }
                    else{
                        System.out.print(InputPassword);
                        JOptionPane.showMessageDialog(null, "Wrong Password");
                    }
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

        frame.setContentPane(new Certificate().getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700,700);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setVisible(true);
    }


}
