package PerformanceTesting;

import ourpackage.User;
import ourpackage.Service;
import ourpackage.Request;


public class Tester {
    public static void main(String[] args) throws Exception {
        User u1 = new User("AAAaaa", "Alaa1234", 123567);
        Service s1 = new Service();
        Request r1= new Request();
        for (int i = 0; i < 1000; i++) {
                u1.checkusername();
                u1.getBalance();
                u1.changepassword("Alaa1234");
                u1.changephone("01062112449");
                u1.changeemail("kokohend81@gmail.com");
                s1.getUser().setBalance(1400);
                s1.setAmount(1000);
                s1.setTransferaccount("55555");
                s1.transferMoney();
                s1.depositMoney();
                s1.withdrawMoney();
                r1.getUser().setBalance(20000);
                r1.setAmountofcert(3000);
                r1.requestCertificate();
                r1.requestCreditCard();
                r1.requestDebitCard();
        }
    }

}
