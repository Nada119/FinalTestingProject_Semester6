package Unit;

import org.junit.Test;
import ourpackage.Service;

import java.util.InputMismatchException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class ServiceTest {
    //TC1
    @Test
    public void withdraw1(){
        Service testing= new Service();
        testing.getUser().setBalance(1200);
        testing.setAmount(1000);
        assertEquals("true",testing.withdrawMoney());
    }
    //TC2
    @Test
    public void withdraw2(){
        Service testing= new Service();
        testing.getUser().setBalance(1400);
        testing.setAmount(0);
        assertEquals("true",testing.withdrawMoney());
    }
    //TC3
    @Test
    public void withdraw3(){
        Service testing= new Service();
        testing.getUser().setBalance(1400);
        testing.setAmount(2000);
        assertEquals("false",testing.withdrawMoney());
    }

    //TC1
    @Test
    public void deposit1(){
        Service testing= new Service();
        testing.getUser().setBalance(1400);
        testing.setAmount(2000);
        assertEquals("true",testing.depositMoney());
    }
    //TC2
    @Test
    public void deposit2(){
        Service testing= new Service();
        testing.getUser().setBalance(1400);
        testing.setAmount(0);
        assertEquals("true",testing.depositMoney());
    }
    //TC3
    @Test
    public void deposit3(){
        Service testing= new Service();
        testing.getUser().setBalance(1400);
        testing.setAmount(100);
        assertEquals("true",testing.depositMoney());
    }
    //TC1
    @Test
    public void transfer1(){
        Service testing= new Service();
        testing.getUser().setBalance(1400);
        testing.setAmount(1000);
        testing.setTransferaccount("12345");
        assertEquals("true",testing.transferMoney());
    }
    //TC2
    @Test
    public void transfer2(){
        Service testing= new Service();
        testing.getUser().setBalance(1400);
        testing.setAmount(2000);
        testing.setTransferaccount("12345");
        assertEquals("Your Transfer is incorrect",testing.transferMoney());

        /*assertThrows(InputMismatchException.class,() -> {
            testing.transferMoney();
        });*/
    }
    //TC3
    @Test
    public void transfer3(){
        Service testing= new Service();
        testing.getUser().setBalance(1400);
        testing.setAmount(1400);
        testing.setTransferaccount("12345");
        assertEquals("true",testing.transferMoney());

    }
    //TC4
    @Test
    public void transfer4(){
        Service testing= new Service();
        testing.getUser().setBalance(1400);
        testing.setAmount(1000);
        testing.setTransferaccount("");
        assertEquals("Your Transfer is incorrect",testing.transferMoney());

        /*assertThrows(InputMismatchException.class,() -> {
            testing.transferMoney();
        });*/
    }
    //TC5
    @Test
    public void transfer5(){
        Service testing= new Service();
        testing.getUser().setBalance(1400);
        testing.setAmount(1000);
        testing.setTransferaccount("hddhd");
        assertEquals("Your Transfer is incorrect",testing.transferMoney());

        /*assertThrows(InputMismatchException.class,() -> {
            testing.transferMoney();
        });*/ }
    //TC6
    @Test
    public void transfer6(){
        Service testing= new Service();
        testing.getUser().setBalance(1400);
        testing.setAmount(1000);
        testing.setTransferaccount("12");
        assertEquals("Your Transfer is incorrect",testing.transferMoney());

        /*assertThrows(InputMismatchException.class,() -> {
            testing.transferMoney();
        });*/    }
    //TC7
    @Test
    public void transfer7(){
        Service testing= new Service();
        testing.getUser().setBalance(1400);
        testing.setAmount(1000);
        testing.setTransferaccount("%#@");
        assertEquals("Your Transfer is incorrect",testing.transferMoney());

        /*assertThrows(InputMismatchException.class,() -> {
            testing.transferMoney();
        });*/    }
    //TC8
    @Test
    public void transfer8(){
        Service testing= new Service();
        testing.getUser().setBalance(1400);
        testing.setAmount(Double.parseDouble("jjll"));
        testing.setTransferaccount("%#@");
        assertEquals("Your Transfer is incorrect",testing.transferMoney());
        /*assertThrows(InputMismatchException.class,() -> {
            testing.transferMoney();
        }); */   }
    //TC9
    @Test
    public void transfer9(){
        Service testing= new Service();
        testing.getUser().setBalance(1400);
        testing.setAmount(Double.parseDouble(""));
        testing.setTransferaccount("%#@");
        assertEquals("Your Transfer is incorrect",testing.transferMoney());
        /*assertThrows(InputMismatchException.class,() -> {
            testing.transferMoney();
        }); */   }
    //TC10
    @Test
    public void transfer10(){
        Service testing= new Service();
        testing.getUser().setBalance(1400);
        testing.setAmount(Double.parseDouble("4$#^"));
        testing.setTransferaccount("%#@");
        assertEquals("Your Transfer is incorrect",testing.transferMoney());
        /*assertThrows(InputMismatchException.class,() -> {
            testing.transferMoney();
        }); */   }



}