package ourpackage;

import java.io.*;
import java.lang.String;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.time.LocalDateTime;
public class Request {
    private double amountofcert;
    private LocalDateTime timing;
    private User user=new User();
    private double creditcardlimit;
    private double debitcardcode;


    public Request() {
    }

    public  double getAmountofcert() {
        return amountofcert;
    }

    public  void setAmountofcert(double amountofcert) {this.amountofcert = amountofcert;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String requestCertificate(){
        double amount= getAmountofcert();
        String output= "false";
        if(amount >= 1000){ // minimum 1000  LE to request a certificate
            if((user.getBalance())>=amount)
            {
                double newbalance= (user.getBalance())-amount;
                user.setBalance(newbalance);
                Calendar cal = Calendar.getInstance();
                Date today = cal.getTime();
                user.createCertificate(amount,today);
                output="true";
            }
        }else {
        output="false";}
        return output;
    }

    public double getCreditcardlimit() {
        return creditcardlimit;
    }

    public void setCreditcardlimit(double creditcardlimit) {
        this.creditcardlimit = creditcardlimit;
    }
    public String requestCreditCard (){
        User user=getUser();
        double creditcardlimit = getCreditcardlimit();
        String output ="false";
        if(user.getBalance() >= 0.3*creditcardlimit){
            Random rnd = new Random();
            String creditcardcode = String.format("%04d", rnd.nextInt(10000));
            user.setCreditcardcode(creditcardcode);
            File f = new File("CreditCardCode.txt");
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream(f);
                PrintWriter pw = new PrintWriter(fos);
                pw.write(creditcardcode);
                pw.flush();
                fos.close();
                pw.close();} catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            output="true";
        }
        return output;
    }
    public String requestDebitCard (){
        User user=getUser();
        String output ="false";
        if(user.getBalance() > 0 ){
            Random rnd = new Random();
            String debitcardcode = String.format("%04d", rnd.nextInt(10000));
            user.setDebitcardcode(debitcardcode);
            File f = new File("DebitCardCode.txt");
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream(f);
                PrintWriter pw = new PrintWriter(fos);
                pw.write(debitcardcode);
                pw.flush();
                fos.close();
                pw.close();} catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            output="true";
        }
        return output;
    }

}
