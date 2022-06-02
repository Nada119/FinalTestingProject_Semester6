package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ChangeEmail {
    static JFrame frame= new JFrame("ChangeEmail");
    private JPanel mainPanel;
    private JLabel ChangeMailLabel;
    private JTextField InputMailTextField;
    private JButton showYourMailButton;
    private JLabel EnterMailLabel;
    private JButton ConfirmButton;
    private JLabel MailLabel;
    private JButton backButton;

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public ChangeEmail() {
        ConfirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mail = (String) InputMailTextField.getText();
                try {
                if ( Sign_in.user.changeemail(mail) == "true")
                {
                    File f1 = new File("NewMail.txt");
                    FileOutputStream fos1 = null;
                    fos1 = new FileOutputStream(f1);
                    PrintWriter pw1 = new PrintWriter(fos1);
                    pw1.write(mail);
                    pw1.flush();
                    fos1.close();
                    pw1.close();
                    JOptionPane.showMessageDialog(null, "Changed Email successfully");

                }
                else {
                    JOptionPane.showMessageDialog(null, "Email entered is incorrect");
                }
            } catch (FileNotFoundException exception) {
                    exception.printStackTrace();
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }
        });
        showYourMailButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Path MailOutput = Path.of("NewMail.txt");
                try {
                    String Mail = Files.readString(MailOutput);
                    MailLabel.setText(Mail);

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

    public static  void main(String[] args){

        frame.setContentPane(new ChangeEmail().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700,700);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setVisible(true);
    }


}
