package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ChangePhone {
    private JPanel mainPanel;
    private JLabel ChangePhoneLabel;
    private JTextField InputPhoneTextField;
    private JButton showYourPhoneButton;

    public JPanel getMainPanel() {
        return mainPanel;
    }

    private JLabel EnterPhoneLabel;
    private JButton ConfirmButton;
    private JLabel PhoneLabel;
    private JButton backButton;

    static JFrame frame= new JFrame("ChangePhone");

    public ChangePhone() {
        ConfirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Phone = (String) InputPhoneTextField.getText();
                try {
                    if ( Sign_in.user.changephone(Phone) == "true")
                    {
                        File f1 = new File("NewPhone.txt");
                        FileOutputStream fos1 = null;
                        fos1 = new FileOutputStream(f1);
                        PrintWriter pw1 = new PrintWriter(fos1);
                        pw1.write(Phone);
                        pw1.flush();
                        fos1.close();
                        pw1.close();
                        JOptionPane.showMessageDialog(null, " Chanegd phone successfully");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, " Phone entered is incorrect");
                    }
                } catch (FileNotFoundException exception) {
                    exception.printStackTrace();
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }
        });
        showYourPhoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Path PhoneOutput = Path.of("NewPhone.txt");
                try {
                    String Phone = Files.readString(PhoneOutput);
                    PhoneLabel.setText(Phone);

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

    public static  void main(String[] args){
        frame.setContentPane(new ChangePhone().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700,700);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setVisible(true);
    }
}
