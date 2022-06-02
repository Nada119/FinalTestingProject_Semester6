package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ChangeAddress {
    static JFrame frame= new JFrame("ChangeAddress");
    private JPanel mainPanel;
    private JLabel ChangeAddressLabel;
    private JTextField InputAddressTextField;
    private JButton showYourAddressButton;
    private JLabel EnterAddressLabel;
    private JButton ConfirmButton;
    private JLabel AddressLabel;
    private JButton backButton;

    public ChangeAddress() {
        ConfirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Address = (String) InputAddressTextField.getText();
                try {
                    if (Sign_in.user.changeAddress(Address) == "true")
                    {   File f1 = new File("NewAddress.txt");
                        FileOutputStream fos1 = null;
                        fos1 = new FileOutputStream(f1);
                        PrintWriter pw1 = new PrintWriter(fos1);
                        pw1.write(Address);
                        pw1.flush();
                        fos1.close();
                        pw1.close();
                        JOptionPane.showMessageDialog(null, "Changed address successfully");

                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Address entered is incorrect");
                    }
                } catch (FileNotFoundException exception) {
                    exception.printStackTrace();
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }
        });
        showYourAddressButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Path AddressOutput = Path.of("NewAddress.txt");
                try {
                    String Address = Files.readString(AddressOutput);
                    AddressLabel.setText(Address);

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
    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public static  void main(String[] args){

        frame.setContentPane(new ChangeAddress().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700,700);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setVisible(true);
    }


}
