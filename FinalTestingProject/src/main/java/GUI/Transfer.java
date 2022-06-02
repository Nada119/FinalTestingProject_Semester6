package GUI;

import ourpackage.Service;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.InputMismatchException;

public class Transfer {
    public static Service s2;
    private JPanel mainPanel;
    private JLabel TransferLabel;
    private JLabel AmountLabel;
    private JTextField InputAmountTextField;
    private JLabel AccountLabel;
    private JTextField InputAccountTextField;
    private JButton ConfirmButton;
    private JLabel balance1;
    private JLabel BalanceLabel;
    private JButton backButton;

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    static JFrame frame= new JFrame("Transfer");


    public Transfer() {
        Path MyBalanceOutput = Path.of("MyBalance.txt");
        String MyBalance = null;
        try {
            MyBalance = Files.readString(MyBalanceOutput);
            balance1.setText(MyBalance);
        } catch (IOException e) {
            e.printStackTrace();
        }

            /*try {
                File f = new File("transferAccount.txt");
                FileOutputStream fos;
                fos = new FileOutputStream(f);
                PrintWriter pw = new PrintWriter(fos);
                pw.write((InputAccountTextField.getText()));
                pw.flush();
                fos.close();
                pw.close();

                File f1 = new File("Amount.txt");
                FileOutputStream fos1;

                fos1 = new FileOutputStream(f1);
                PrintWriter pw1 = new PrintWriter(fos1);
                pw1.write((InputAmountTextField.getText()));
                pw1.flush();
                fos1.close();
                pw1.close();
            }
             catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }*/

        ConfirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) throws NumberFormatException {
                /*Path transferAccountOutput = Path.of("transferAccount.txt");
                Path AmountOutput = Path.of("Amount.txt");*/

                /*String contentOf_transferAccountOutput = Files.readString(transferAccountOutput);
                s2 = new Service( (Double.parseDouble(Files.readString(AmountOutput))), contentOf_transferAccountOutput);
                */
                try {
                    Service s3 = new Service();
                    if (!(s3.isValid(InputAccountTextField.getText())))
                        throw new InputMismatchException();
                    double amount = Double.valueOf(InputAmountTextField.getText());
                    s2 = new Service(amount, InputAccountTextField.getText());

                    if (s2.transferMoney() == "true") {
                        JOptionPane.showMessageDialog(null, "Your Transfer Done Successfully");
                    }
                /*else if (InputAmountTextField.getText() == null || InputAccountTextField.getText() == null)
                {
                    JOptionPane.showMessageDialog(null, "Your Transfer is incorrect");

                }*/
                    else {
                        JOptionPane.showMessageDialog(null, "Your Transfer is incorrect");
                    }
                }
                catch(InputMismatchException exception)
                {
                    JOptionPane.showMessageDialog(null, "Incorrect Transfer account");
                }
                catch (NumberFormatException exception) {
                    JOptionPane.showMessageDialog(null, "Your Transfer is incorrect");
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
        frame.setContentPane(new Transfer().getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700,700);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setVisible(true);
    }
}
