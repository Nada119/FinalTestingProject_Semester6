package Unit;

import org.junit.Test;
import ourpackage.Request;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RequestTest {
    @Test
    public void requestCertificate(){
        Request testing= new Request();
        testing.getUser().setBalance(20000);
        testing.setAmountofcert(3000);
        assertEquals("true",testing.requestCertificate());
    }
    @Test
    public void requestCertificate2(){
        Request testing= new Request();
        testing.getUser().setBalance(7000);
        testing.setAmountofcert(8000);
        assertEquals("false",testing.requestCertificate());
    }
    @Test
    public void requestCertificate3(){
        Request testing= new Request();
        testing.getUser().setBalance(0);
        testing.setAmountofcert(1500);
        assertEquals("false",testing.requestCertificate());
    }
    @Test
    public void requestCertificate4(){
        Request testing= new Request();
        testing.getUser().setBalance(2000);
        testing.setAmountofcert(2000);
        assertEquals("true",testing.requestCertificate());
    }
    @Test
    public void requestCertificate5(){
        Request testing= new Request();
        testing.getUser().setBalance(10000);
        testing.setAmountofcert(5000);
        assertEquals("true",testing.requestCertificate());
    }
    @Test
    public void requestCertificate6(){
        Request testing= new Request();
        testing.getUser().setBalance(10000);
        testing.setAmountofcert(1000);
        assertEquals("true",testing.requestCertificate());
    }
     /*
    @Test
   public void requestCertificate4(){
        ourpackage.User user = new ourpackage.User();
        Date datetest = new Date(2021,05,01);
        user.setBalance(1400);
        user.createCertificate(1000,datetest);
        assertEquals("true",user.generateinterests());
    }*/
    //TC1
     @Test
     public void requestCreditCard(){
         Request testing= new Request();
         testing.getUser().setBalance(0);
         testing.setCreditcardlimit(3000);
         assertEquals("false",testing.requestCreditCard());
     }
     //TC2
    @Test
    public void requestCreditCard2(){
        Request testing= new Request();
        testing.getUser().setBalance(900);
        testing.setCreditcardlimit(3000);
        assertEquals("true",testing.requestCreditCard());
    }
    //TC3
    @Test
    public void requestCreditCard3(){
        Request testing= new Request();
        testing.getUser().setBalance(10000);
        testing.setCreditcardlimit(3000);
        assertEquals("true",testing.requestCreditCard());
    }
    //TC4
    @Test
    public void requestCreditCard4(){
        Request testing= new Request();
        testing.getUser().setBalance(1000);
        testing.setCreditcardlimit(3000);
        assertEquals("true",testing.requestCreditCard());
    }
    //TC5
    @Test
    public void requestCreditCard5(){
        Request testing= new Request();
        testing.getUser().setBalance(800);
        testing.setCreditcardlimit(3000);
        assertEquals("false",testing.requestCreditCard());
    }
    //TC6
    @Test
    public void requestCreditCard6(){
        Request testing= new Request();
        testing.getUser().setBalance(500);
        testing.setCreditcardlimit(3000);
        assertEquals("false",testing.requestCreditCard());
    }

    //TC1
    @Test
    public void requestDebitCard1(){
        Request testing= new Request();
        testing.getUser().setBalance(0);
        assertEquals("false",testing.requestDebitCard());
    }
    //TC2
    @Test
    public void requestDebitCard2(){
        Request testing= new Request();
        testing.getUser().setBalance(1000);
        assertEquals("true",testing.requestDebitCard());
    }
    //TC3
    @Test
    public void requestDebitCard3(){
        Request testing= new Request();
        testing.getUser().setBalance(1);
        assertEquals("true",testing.requestDebitCard());
    }
    //TC4
    @Test
    public void requestDebitCard4(){
        Request testing= new Request();
        testing.getUser().setBalance(-1);
        assertEquals("false",testing.requestDebitCard());
    }
    //TC5
    @Test
    public void requestDebitCard5(){
        Request testing= new Request();
        testing.getUser().setBalance(20000);
        assertEquals("true",testing.requestDebitCard());
    }
    /*
    @Test
    public void CreditCardpassword(){
        Request testing= new Request();
        testing.getUser().setBalance(10000);
        testing.getUser().setCreditcardpassword("4444");
        assertEquals("false",testing.getUser().createcreditcardpassword());
    }

   @Test
   public void CreditCardpassword2(){
       Request testing= new Request();
       testing.getUser().setBalance(10000);
       testing.setCreditcardlimit(5000);
       testing.requestCreditCard();
       testing.getUser().setCreditcardpassword("4444");
       assertEquals("true",testing.getUser().createcreditcardpassword());
   }

   @Test
   public void DebitCardpassword(){
       Request testing= new Request();
       testing.getUser().setBalance(10000);
       testing.requestDebitCard();
       testing.getUser().setDebitcardpassword("4444");
       assertEquals("true",testing.getUser().createdebitcardpassword());
   }

   @Test
   public void DebitCardpassword2(){
       Request testing= new Request();
       testing.getUser().setBalance(10000);
       testing.getUser().setDebitcardpassword("4444");
       assertEquals("false",testing.getUser().createdebitcardpassword());
   }*/
    @Test
    public void Certificate(){
         Request testing= new Request();
         testing.getUser().setBalance(200000);
         testing.setAmountofcert(1200);
         assertEquals("true",testing.requestCertificate());
    }
    @Test
    public void Certificate2(){
        Request testing= new Request();
        testing.getUser().setBalance(200000);
        testing.setAmountofcert(500);
        assertEquals("false",testing.requestCertificate());
    }
    @Test
    public void Certificate3(){
        Request testing= new Request();
        testing.getUser().setBalance(200000);
        testing.setAmountofcert(1000);
        assertEquals("true",testing.requestCertificate());
    }
    @Test
    public void Certificate4(){
        Request testing= new Request();
        testing.getUser().setBalance(200000);
        testing.setAmountofcert(300000);
        assertEquals("false",testing.requestCertificate());
    }
    @Test
    public void Certificate5(){
        Request testing= new Request();
        testing.getUser().setBalance(0);
        testing.setAmountofcert(1000);
        assertEquals("false",testing.requestCertificate());
    }
    @Test
    public void Certificate6(){
        Request testing= new Request();
        testing.getUser().setBalance(2000);
        testing.setAmountofcert(1500);
        assertEquals("true",testing.requestCertificate());
    }

}