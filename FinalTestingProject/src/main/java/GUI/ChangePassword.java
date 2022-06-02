package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;


public class ChangePassword {
    private JPanel mainPanel;
    private JLabel E_Banking_Label;
    private JTextField oldpassword;
    private JButton showYourPasswordButton;
    private JTextField Newpassword;
    private JButton confirm;
    private JLabel passwordLabel;
    private JButton backButton;


    public void setPasswordLabel(JLabel passwordLabel) {
        this.passwordLabel = passwordLabel;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public JTextField getOldpassword() {
        return oldpassword;
    }

    public JTextField getNewpassword() {
        return Newpassword;
    }

    public String gettheOldpassword(JTextField Old) {
        String oldpassword = Old.getText();
        return oldpassword;
    }

    public void setOldpassword(JTextField oldpassword) {
        this.oldpassword = oldpassword;
    }

    public String gettheNewpassword(JTextField New) {
        String Newpassword = New.getText();
        return Newpassword;
    }

    public void setNewpassword(JTextField newpassword) {
        Newpassword = newpassword;
    }

    static JFrame frame= new JFrame("ChangePassword");


    public ChangePassword() { // not yet complete
        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String oldpassword = gettheOldpassword(getOldpassword());
                String newpassword = gettheNewpassword(getNewpassword());
                File f = new File("CheckingPassword.txt");
                FileOutputStream fos = null;
                String oldUserOutput = null;

                try {
                    fos = new FileOutputStream(f);
                PrintWriter pw = new PrintWriter(fos);
                pw.write(String.valueOf(gettheOldpassword(getOldpassword())));
                pw.flush();
                fos.close();
                pw.close();
                Path CheckingPasswordOutput = Path.of("CheckingPassword.txt");
                String contentOf_CheckingPassword = Files.readString(CheckingPasswordOutput);

                Path Output_file = Path.of("Password.txt");
                oldUserOutput = Files.readString(Output_file);
                if ((oldUserOutput).equals(contentOf_CheckingPassword)) {
                   File f1 = new File("Password.txt");
                    FileOutputStream fos1 = new FileOutputStream(f1);
                    PrintWriter pw1 = new PrintWriter(fos1);
                    if (Sign_in.user.changepassword(newpassword) == "true") {
                        Sign_in.user.setPassword(newpassword);
                        pw1.write(String.valueOf(gettheNewpassword(getNewpassword())));
                        pw1.flush();
                        fos1.close();
                        pw1.close();
                        JOptionPane.showMessageDialog(null, "Changed password successfully");

                    } else {
                        JOptionPane.showMessageDialog(null, "New Password unaccepted");
                        pw1.write(String.valueOf(gettheOldpassword(getOldpassword())));
                        pw1.flush();
                        fos1.close();
                        pw1.close();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Old password is wrong");
                }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }


            }
        });
        showYourPasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Path PasswordOutput = Path.of("Password.txt");
                try {
                    String Password = Files.readString(PasswordOutput);
                    passwordLabel.setText(Password);

                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                JFrame frame= new JFrame("My Account");
                frame.setContentPane(new MyAccount().getMyaccount());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setSize(700,700);
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
                frame.setVisible(true);
            }
        });
    }


    public static  void main(String[] args) throws IOException{
        frame.setContentPane(new ChangePassword().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700,700);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setVisible(true);
        try {
            Path Output_file = Path.of("Password.txt");
            String oldUserOutput = Files.readString(Output_file);
            System.out.println(oldUserOutput);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}




