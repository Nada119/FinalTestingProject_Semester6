package GUI;

import ourpackage.User;

import java.awt.*;
import java.io.*;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.JOptionPane;


public class Sign_in extends JFrame {
    public static User user = new User();
    public static ChangePassword c1;


    private JLabel eBankingLabel;
    private JTextField UsernametextField;
    public JTextField PasswordtextField;
    private JButton signinButton;
    //private JCheckBox PasswordcheckBox1;
    private JLabel SigninLabel;
    private JPanel signin;
    private JLabel Username;


    private JLabel PasswordLabel;
    //private JPasswordField passwordField1;


    public String getusername(JTextField username_textField) {
        String username = username_textField.getText();
        return username;


    }

    public String getpassword(JTextField PasswordtextField) {
        String password = PasswordtextField.getText();
        return password;

    }

    static JFrame frame = new JFrame("Sign_in");

    public Sign_in() {

        signinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                user.setUsername(getusername(UsernametextField));
                user.setPassword(getpassword(PasswordtextField));
                if (user.getUsername() == null || user.getPassword()==null)
                {
                    JOptionPane.showMessageDialog(null, "Wrong Password");
                    System.out.println("here");
                }
                //c1.Password = ((getpassword(PasswordtextField)));
                File f = new File("Password.txt");
                FileOutputStream fos = null;
                try {
                    fos = new FileOutputStream(f);

                    PrintWriter pw = new PrintWriter(fos);
                    pw.write(String.valueOf(getpassword(PasswordtextField)));
                    pw.flush();
                    fos.close();

                    pw.close();

                    if (user.checkpassword() == "true" && user.checkusername() == "true") {
                        frame.dispose();

                        JFrame frame = new JFrame("Main Window");
                        frame.setContentPane(new MainWindow().getMainPanel());
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.pack();
                        frame.setSize(700,700);
                        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
                        frame.setVisible(true);
                    } else
                    {

                        signin.setVisible(true);
                        //JOptionPane.showMessageDialog(null, "Wrong Password");
                        JOptionPane.showMessageDialog(null, "Your input is incorrect");

                    }
                } catch (FileNotFoundException exception) {
                    exception.printStackTrace();

                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
        });

    }

    public static void main(String[] args) {
        frame.setContentPane(new Sign_in().signin);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700,700);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setVisible(true);
    }
}


