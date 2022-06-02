package Integration;
import ourpackage.User;
import ourpackage.Service;
import ourpackage.Request;


public class DriverClass {
    public DriverClass() {
    }
    public String Driver_changephone()  {
        User u1= new User();
        u1.setPhone("01023561492");
        return u1.checkphone();
    }
    public String Driver_changemail()  {
        User u1= new User();
        u1.setEmail("alaahamdy001@gmail.com");
        return u1.checkemail();
    }
    public String Driver_changeaddress()  {
        User u1= new User();
        u1.setAddress("16, AbdelhamidBadawy, Sheraton");
        return u1.checkAddress();
    }
    public double Driver_deposit_1()  {
        Service u1= new Service();
        u1.getUser().setBalance(1200);
        return u1.getUser().getBalance();
    }
    public double Driver_deposit_2()  {
        Service u1= new Service();
        u1.setAmount(1200);
        return u1.getAmount();
    }
    public double Driver_withdraw_1()  {
        Service u1= new Service();
        u1.getUser().setBalance(1200);
        return u1.getUser().getBalance();
    }
    public double Driver_withdraw_2()  {
        Service u1= new Service();
        u1.setAmount(1200);
        return u1.getAmount();
    }
    public double Driver_transfer_1()  {
        Service u1= new Service();
        u1.getUser().setBalance(1200);
        return u1.getUser().getBalance();
    }
    public double Driver_transfer_2()  {
        Service u1= new Service();
        u1.setAmount(1200);
        return u1.getAmount();
    }
    public boolean Driver_transfer_3()  {
        Service u1= new Service();
        return u1.getUser().isValid(String.valueOf(55555));
    }
    public double Driver_requestCertificate_1()  {
        Request u1= new Request();
        u1.getUser().setBalance(1200);
        return u1.getUser().getBalance();
    }
    public double Driver_requestCertificate_2()  {
        Request u1= new Request();
        u1.setAmountofcert(1200);
        return u1.getAmountofcert();
    }
    public double Driver_requestCreditCard_1()  {
        Request u1= new Request();
        u1.getUser().setBalance(1200);
        return u1.getUser().getBalance();
    }
    public double Driver_requestCreditCard_2()  {
        Request u1= new Request();
        u1.setAmountofcert(1200);
        return u1.getAmountofcert();
    }
    public double Driver_requestDebitCard_1()  {
        Request u1= new Request();
        u1.getUser().setBalance(1200);
        return u1.getUser().getBalance();
    }
    public double Driver_requestDebitCard_2()  {
        Request u1= new Request();
        u1.setAmountofcert(1200);
        return u1.getAmountofcert();
    }

}
