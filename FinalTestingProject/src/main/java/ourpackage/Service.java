package ourpackage;

import javax.swing.*;
import java.lang.String;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Service {
    private double amount;
    static private String receipt;
    private String transferaccount;
    private String[] transactions;
    private Date date;
    private User user = new User();

    public Service() {
    }

    public Service(double amount, String transferaccount) {
        this.amount = amount;
        this.transferaccount = transferaccount;
    }

    public Service(double amount, String transferaccount, String[] transactions, Date date) {
        this.amount = amount;
        this.transferaccount = transferaccount;
        this.transactions = transactions;
        this.date = date;
    }

    public Service(double amount) {
        this.amount = amount;
    }

    public static String getReceipt() {
        return receipt;
    }

    public static void setReceipt(String receipt) {
        Service.receipt = receipt;
    }

    public String getTransferaccount() {
        return transferaccount;
    }

    public void setTransferaccount(String transferaccount) {

        this.transferaccount = transferaccount;
    }

    public String[] getTransactions() {
        return transactions;
    }

    public void setTransactions(String[] transactions) {
        this.transactions = transactions;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public  double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String withdrawMoney(){
        double amountneeded = getAmount();
        String output= "false";
        if( (user.getBalance()) >= amountneeded) {
            double newbalance= (user.getBalance())-amountneeded;
            user.setBalance(newbalance);
            output="true";
        }
        else{
           output="false";
        }
        if(output=="true"){
            String amount1 = Double.toString(amountneeded);
            Calendar cal = Calendar.getInstance();
            Date today = cal.getTime();
            user.setBankstatement("Withdrawed" + amount1 + "on" + today);
        }
        return output;
     }
    public String depositMoney(){ // make this function print new balance fel gui
        double amountneeded = getAmount();
        double newbalance= (user.getBalance())+amountneeded;
        String output= "false";
        user.setBalance(newbalance);
        if (user.getBalance() == newbalance){
            output="true";
        }
        else{
            throw new InputMismatchException("Your Transfer is incorrect");
            }
        if(output=="true"){
            String amount1 = Double.toString(amountneeded);
            Calendar cal = Calendar.getInstance();
            Date today = cal.getTime();
            user.setBankstatement("Deposited" + amount1 +"on" + today);
        }
        return output;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public  boolean isValid(String s) {
        Pattern p = Pattern.compile("[0-9]{5}");

        Matcher m = p.matcher(s);
        return (m.find() && m.group().equals(s));
    }
    public String transferMoney(){
        double amount= getAmount();
        String output="false";
        String account = getTransferaccount();
        boolean accountvalid =isValid(account);
        //System.out.print("here1");
        try{
        if(accountvalid){
            if( (user.getBalance()) >= amount) {
                double newbalance= (user.getBalance())-amount;
                user.setBalance(newbalance);
                output="true";
                //System.out.print("here3");
            }
            else{
                throw new InputMismatchException("Your Transfer unsuccesful due to insufficient balance");
                //System.out.print("here2");
            }
            if(output=="true"){
                String amount1 = Double.toString(amount);
                Calendar cal = Calendar.getInstance();
                Date today = cal.getTime();
                user.setBankstatement("Transfered" + amount1 + "to" + account + "on" + today);
            }

        }
        else{
            throw new InputMismatchException("Your Transfer account is incorrect");
            //System.out.print("here2");
        }}
        catch (InputMismatchException e)
        {
            return  "Your Transfer is incorrect";
        }
        catch (NumberFormatException e)
        {
            return  "Your Transfer is incorrect";
        }


        return output;
    }

}
