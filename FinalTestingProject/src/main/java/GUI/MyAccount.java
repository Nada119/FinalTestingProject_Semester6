package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.DecimalFormat;
import java.util.Random;

public class MyAccount {

    //public static MyAccount C1 = new MyAccount();


    private JPanel myaccount;
    private JButton changePasswordButton;
    private JButton changeAddressButton;
    private JButton changeEmailAddressButton;
    private JButton changePhoneButton;
    private JPanel buttonspanel;
    private JLabel BalanceLabel;
    private JButton backButton;

    static JFrame frame= new JFrame("MyAccount");


    public JPanel getMyaccount() {
        return myaccount;
    }

    DecimalFormat df = new DecimalFormat("0.00");
    Random rnd = new Random();
    double num = rnd.nextDouble(99999);

    public MyAccount()  {
        BalanceLabel.setText(String.valueOf(df.format(num)));
        File f1 = new File("MyBalance.txt");
        FileOutputStream fos1 = null;
        try {
            fos1 = new FileOutputStream(f1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        PrintWriter pw1 = new PrintWriter(fos1);
        pw1.write(String.valueOf(df.format(num)));
        pw1.flush();
        try {
            fos1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        pw1.close();

        changePasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                JFrame frame= new JFrame("ChangePassword");
                frame.setContentPane(new ChangePassword().getMainPanel());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setSize(700,700);
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
                frame.setVisible(true);

            }
        });

        changeEmailAddressButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                JFrame frame= new JFrame("ChangeEmail");
                frame.setContentPane(new ChangeEmail().getMainPanel());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setSize(700,700);
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
                frame.setVisible(true);

            }
        });
        changeAddressButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                JFrame frame= new JFrame("ChangeAddress");
                frame.setContentPane(new ChangeAddress().getMainPanel());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setSize(700,700);
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
                frame.setVisible(true);
            }
        });
        changePhoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                JFrame frame= new JFrame("ChangePhone");
                frame.setContentPane(new ChangePhone().getMainPanel());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setSize(700,700);
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
                frame.setVisible(true);
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                JFrame frame= new JFrame("Main Window");
                frame.setContentPane(new MainWindow().getMainPanel());
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

        frame.setContentPane(new MyAccount().getMyaccount());
        //C1.balance();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700,700);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setVisible(true);




    }
}
