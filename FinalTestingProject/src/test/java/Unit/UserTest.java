package Unit;

import org.junit.Test;
import ourpackage.User;

import java.util.InputMismatchException;

import static org.junit.Assert.*;

public class UserTest {
    //TC1
    @Test
    public void checkusername1() throws Exception {
        User test= new User("ALAaaa","AMA123",123567);
        assertEquals("true",test.checkusername());
    }
    //TC2
    @Test
    public void checkusername2() throws Exception {
        User test= new User("1ab321","AMA123",123567);
        assertEquals("Your UserName is incorrect",test.checkusername());

        /*assertThrows(InputMismatchException.class,() -> {
            test.checkusername();
        });*/
    }
    //TC2
    @Test
    public void checkusername3() throws Exception {
        User test= new User("12b321","AMA123",123567);
        assertEquals("Your UserName is incorrect",test.checkusername());

        /*assertThrows(InputMismatchException.class,() -> {
            test.checkusername();
        });*/
    }
    //TC3
    @Test
    public void checkusername4() throws Exception {
        User test= new User("123321","AMA123",123567);
        assertEquals("Your UserName is incorrect",test.checkusername());

        /*assertThrows(InputMismatchException.class,() -> {
            test.checkusername();
        });*/
    }
    //TC4
    @Test
    public void checkusername5() throws Exception {
        User test= new User("abcb21","AMA123",123567);
        assertEquals("Your UserName is incorrect",test.checkusername());

        /*assertThrows(InputMismatchException.class,() -> {
            test.checkusername();
        });*/
    }
    //TC5
    @Test
    public void checkusername6() throws Exception {
        User test= new User("abcbb1","AMA123",123567);
        assertEquals("Your UserName is incorrect",test.checkusername());

        /*assertThrows(InputMismatchException.class,() -> {
            test.checkusername();
        });*/
    }
    //TC6
    @Test
    public void checkusername7() throws Exception {
        User test= new User("bcbbd","AMA123",123567);
        assertEquals("Your UserName is incorrect",test.checkusername());

        /*assertThrows(InputMismatchException.class,() -> {
            test.checkusername();
        });*/
    }
    //TC7
    @Test
    public void checkusername8() throws Exception {
        User test= new User("##","AMA123",123567);
        assertEquals("Your UserName is incorrect",test.checkusername());

        /*assertThrows(InputMismatchException.class,() -> {
            test.checkusername();
        });*/
    }
    //TC8
    @Test
    public void checkusername9() throws Exception {
        User test= new User("","AMA123",123567);
        assertEquals("Your UserName is incorrect",test.checkusername());

        /*assertThrows(InputMismatchException.class,() -> {
            test.checkusername();
        });*/
    }
    //TC9
    @Test
    public void checkusername10() throws Exception {
        User test= new User("jghnrydlms","AMA123",123567);
        assertEquals("Your UserName is incorrect",test.checkusername());

        /*assertThrows(InputMismatchException.class,() -> {
            test.checkusername();
        });*/
    }
    //TC1
    @Test
    public void checkpassword1(){
        User test= new User("abcbbd","12345678",123567);
        assertEquals("Your Password is incorrect",test.checkpassword());
        /*assertThrows(InputMismatchException.class,() -> {
            test.checkpassword();
        });*/
    }
    //TC2
    @Test
    public void checkpassword2(){
        User test= new User("abcbbd","12345678",123567);
        assertEquals("Your Password is incorrect",test.checkpassword());
    }
    //TC3
    @Test
    public void checkpassword3(){
        User test= new User("abcbbd","Cap89iEi",123567);
        assertEquals("true",test.checkpassword());
    }
    //TC4
    @Test
    public void checkpassword4(){
        User test= new User("abcbbd","CCCCCCCC",123567);
        assertEquals("Your Password is incorrect",test.checkpassword());
    }
    //TC5
    @Test
    public void checkpassword5(){
        User test= new User("abcbbd","112",123567);
        assertEquals("Your Password is incorrect",test.checkpassword());
        /*assertThrows(InputMismatchException.class,() -> {
            test.checkpassword();
        });*/
    }
    //TC6
    @Test
    public void checkpassword6(){
        User test= new User("abcbbd","",123567);
        assertEquals("Your Password is incorrect",test.checkpassword());
        /*assertThrows(InputMismatchException.class,() -> {
            test.checkpassword();
        });*/
    }
    //TC7
    @Test
    public void checkpassword7(){
        User test= new User("abcbbd","&%$#",123567);
        assertEquals("Your Password is incorrect",test.checkpassword());
        /*assertThrows(InputMismatchException.class,() -> {
            test.checkpassword();
        });*/
    }
    //TC8
    @Test
    public void checkpassword8(){
        User test= new User("abcbbd","1hf5f5f5f5f5fr",123567);
        assertEquals("Your Password is incorrect",test.checkpassword());
        /*assertThrows(InputMismatchException.class,() -> {
            test.checkpassword();
        });*/
    }
    //TC1
    @Test
    public void changepassword1(){
        User test= new User("abcbbd","Alaaham1",123567);
        assertEquals("Your Password is incorrect",test.changepassword("12345679000"));
        /*
        assertThrows(InputMismatchException.class,() -> {
            test.changepassword("12345679");
        });*/
    }
    //TC2
    @Test
    public void changepassword2(){
        User test= new User("abcbbd","Alaaham21",123567);
        assertEquals("Your Password is incorrect",test.changepassword("12345679"));
        /*
        assertThrows(InputMismatchException.class,() -> {
            test.changepassword("12345679");
        });*/
    }
    //TC3
    @Test
    public void changepassword3(){
        User test= new User("abcbbd","Alaaham21",123567);
        assertEquals("true",test.changepassword("Cap89iEi"));

        /*assertThrows(InputMismatchException.class,() -> {
            test.changepassword("Cap89iEi");
        });*/

    }
    //TC4
    @Test
    public void changepassword4(){
        User test= new User("abcbbd","Alaaham21",123567);
        assertEquals("Your Password is incorrect",test.changepassword("CCCCCCCC"));
        /*
        assertThrows(InputMismatchException.class,() -> {
            test.changepassword("CCCCCCCC");
        });*/
    }
    //TC5
    @Test
    public void changepassword5(){
        User test= new User("abcbbd","Alaaham21",123567);
        assertEquals("Your Password is incorrect",test.changepassword("112"));

        /*assertThrows(InputMismatchException.class,() -> {
            test.changepassword("112");
        });*/}
    //TC6
    @Test
    public void changepassword6(){
        User test= new User("abcbbd","Alaaham21" ,123567);
        assertEquals("Your Password is incorrect",test.changepassword(""));
        /*
                assertThrows(InputMismatchException.class,() -> {
                    test.changepassword("");
                });*/
        }
    //TC7
    @Test
    public void changepassword7(){
        User test= new User("abcbbd","Alaaham21",123567);
        assertEquals("Your Password is incorrect",test.changepassword("&%$#"));

        /*assertThrows(InputMismatchException.class,() -> {
                    test.changepassword("&%$#");
                });*/
        }
    //TC8
    @Test
    public void changepassword8(){
        User test= new User("abcbbd","Alaaham21",123567);
        assertEquals("Your Password is incorrect",test.changepassword("1hf5f5f5f5f5fr"));

        /*assertThrows(InputMismatchException.class,() -> {
            test.changepassword("1hf5f5f5f5f5fr");
        });*/
        }

    //TC1
    @Test
    public void checkphone1(){
        User test= new User();
        test.setPhone("0102");
        assertEquals("Your Phone is incorrect",test.checkphone());

        /*assertThrows(InputMismatchException.class,() -> {
            test.checkphone();
        });*/
    }
    //TC2
    @Test
    public void checkphone2(){
        User test= new User();
        test.setPhone("01023561492");
        assertEquals("true",test.checkphone());
    }
    //TC3
    @Test
    public void checkphone3(){
        User test= new User();
        test.setPhone("");
        assertEquals("Your Phone is incorrect",test.checkphone());

        /*assertThrows(InputMismatchException.class,() -> {
            test.checkphone();
        });*/
    }
    //TC4
    @Test
    public void checkphone4(){
        User test= new User();
        test.setPhone("dhyr");
        assertEquals("Your Phone is incorrect",test.checkphone());

        /*assertThrows(InputMismatchException.class,() -> {
            test.checkphone();
        });*/
    }
    //TC5
    @Test
    public void checkphone5(){
        User test= new User();
        test.setPhone("&$#");
        assertEquals("Your Phone is incorrect",test.checkphone());

        /*assertThrows(InputMismatchException.class,() -> {
            test.checkphone();
        });*/
    }
    //TC6
    @Test
    public void checkphone6(){
        User test= new User();
        test.setPhone("01814253678");
        assertEquals("Your Phone is incorrect",test.checkphone());

        /*assertThrows(InputMismatchException.class,() -> {
            test.checkphone();
        });*/
    }
    //TC7
    @Test
    public void checkphone7(){
        User test= new User();
        test.setPhone("01020105254125525512");
        assertEquals("Your Phone is incorrect",test.checkphone());

        /*assertThrows(InputMismatchException.class,() -> {
            test.checkphone();
        });*/
    }
    //TC1
    @Test
    public void changephone1(){
        User test= new User();
        test.setPhone("01023561492");
        assertEquals("Your Phone is incorrect",test.changephone("01023"));
    }
    //TC2
    @Test
    public void changephone2(){
        User test= new User();
        test.setPhone("01023561492");
        assertEquals("true",test.changephone("01023614995"));
    }
    //TC3
    @Test
    public void changephone3(){
        User test= new User();
        test.setPhone("01023561492");
        assertEquals("Your Phone is incorrect",test.changephone(""));

        /*assertThrows(InputMismatchException.class,() -> {
            test.changephone("");
        });*/
    }
    //TC4
    @Test
    public void changephone4(){
        User test= new User();
        test.setPhone("01023561492");
        assertEquals("Your Phone is incorrect",test.changephone("dhyr"));

        /*assertThrows(InputMismatchException.class,() -> {
            test.changephone("dhyr");
        });*/
    }
    //TC5
    @Test
    public void changephone5(){
        User test= new User();
        test.setPhone("01023561492");
        assertEquals("Your Phone is incorrect",test.changephone("&$#"));

        /*assertThrows(InputMismatchException.class,() -> {
            test.changephone("&$#");
        });*/
    }
    //TC6
    @Test
    public void changephone6(){
        User test= new User();
        test.setPhone("01023561492");
        assertEquals("Your Phone is incorrect",test.changephone("01814253678"));

        /*assertThrows(InputMismatchException.class,() -> {
            test.changephone("01814253678");
        });*/
    }
    //TC7
    @Test
    public void changephone7(){
        User test= new User();
        test.setPhone("01020105254125525512");
        assertEquals("Your Phone is incorrect",test.changephone("01020105254125525512"));

        /*assertThrows(InputMismatchException.class,() -> {
            test.changephone("01020105254125525512");
        });*/
    }
    //TC1
    @Test
    public void checkemail1(){
        User test= new User();
        test.setEmail("alaahamdy001@gmail.com");
        assertEquals("true",test.checkemail());
    }
    //TC2
    @Test
    public void checkemail2(){
        User test= new User();
        test.setEmail("alaahamdy001mail.com");
        assertEquals("Your Email is incorrect",test.checkemail());
    /*
        assertThrows(InputMismatchException.class,() -> {
            test.checkemail();
        });*/
    }
    //TC3
    @Test
    public void checkemail3(){
        User test= new User();
        test.setEmail("alaahamdy001mail");
        assertEquals("Your Email is incorrect",test.checkemail());
    /*
        assertThrows(InputMismatchException.class,() -> {
            test.checkemail();
        });*/
    }
    //TC4
    @Test
    public void checkemail4(){
        User test= new User();
        test.setEmail("");
        assertEquals("Your Email is incorrect",test.checkemail());
    /*
        assertThrows(InputMismatchException.class,() -> {
            test.checkemail();
        });*/
    }
    //TC5
    @Test
    public void checkemail5(){
        User test= new User();
        test.setEmail("alaah");
        assertEquals("Your Email is incorrect",test.checkemail());
    /*
        assertThrows(InputMismatchException.class,() -> {
            test.checkemail();
        });*/
    }
    //TC6
    @Test
    public void checkemail6(){
        User test= new User();
        test.setEmail("$#@!#@");
        assertEquals("Your Email is incorrect",test.checkemail());
    /*
        assertThrows(InputMismatchException.class,() -> {
            test.checkemail();
        });*/
    }
    //TC7
    @Test
    public void checkemail7(){
        User test= new User();
        test.setEmail("alaahamdy@@@@001mail.com");
        assertEquals("Your Email is incorrect",test.checkemail());
    /*
        assertThrows(InputMismatchException.class,() -> {
            test.checkemail();
        });*/
    }
    //TC8
    @Test
    public void checkemail8(){
        User test= new User();
        test.setEmail("123647");
        assertEquals("Your Email is incorrect",test.checkemail());
    /*
        assertThrows(InputMismatchException.class,() -> {
            test.checkemail();
        });*/
    }
    //TC1
    @Test
    public void changemail1(){
        User test= new User();
        test.setEmail("alaahamdy001@gmail.com");
        assertEquals("Your Email is incorrect",test.changeemail("alaahamdy"));

        /*assertThrows(InputMismatchException.class,() -> {
            test.changeemail("alaahamdy");
        });*/
    }
    //TC2
    @Test
    public void changemail2(){
        User test= new User();
        test.setEmail("alaahamdy001@gmail.com");
        assertEquals("Your Email is incorrect",test.changeemail(""));

        /*assertThrows(InputMismatchException.class,() -> {
            test.changeemail("");
        });*/
    }
    //TC3
    @Test
    public void changemail3(){
        User test= new User();
        test.setEmail("alaahamdy001@gmail.com");
        assertEquals("Your Email is incorrect",test.changeemail("$#@"));

        /*assertThrows(InputMismatchException.class,() -> {
            test.changeemail("$#@");
        });*/
    }
    //TC4
    @Test
    public void changemail4(){
        User test= new User();
        test.setEmail("alaahamdy001@gmail.com");
        assertEquals("Your Email is incorrect",test.changeemail("12365"));

        /*assertThrows(InputMismatchException.class,() -> {
            test.changeemail("12365");
        });*/
    }
    //TC5
    @Test
    public void changemail5(){
        User test= new User();
        test.setEmail("alaahamdy001@gmail.com");
        assertEquals("true", test.changeemail("kokohend81@gmail.com"));
    }
    //TC1
    @Test
    public void checkaddress1(){
        User test= new User();
        test.setAddress("123,Street");
        assertEquals("true",test.checkAddress());
    }
    //TC2
    @Test
    public void checkaddress2(){
        User test= new User();
        test.setAddress("123 Street");
        assertEquals("true",test.checkAddress());
    }
    //TC3
    @Test
    public void checkaddress3(){
        User test= new User();
        test.setAddress("16, AbdelhamidBadawy, Sheraton");
        assertEquals("true",test.checkAddress());
    }
    //TC4
    @Test
    public void checkaddress4(){
        User test= new User();
        test.setAddress("$1, North Street, Chennai @ 11");
        assertEquals("Your Address is incorrect",test.checkAddress());

        /*assertThrows(InputMismatchException.class,() -> {
            test.checkAddress();
        });*/
    }
    //TC5
    @Test
    public void checkaddress5(){
        User test= new User();
        test.setAddress("");
        assertEquals("Your Address is incorrect",test.checkAddress());

        /*assertThrows(InputMismatchException.class,() -> {
            test.checkAddress();
        });*/
    }
    //TC1
    @Test
    public void changeaddress1(){
        User test= new User();
        test.setAddress("16, AbdelhamidBadawy, Sheraton");
        assertEquals("true",test.changeAddress("18 , Elbostan"));
    }
    //TC2
    @Test
    public void changeaddress2(){
        User test= new User();
        test.setAddress("16, AbdelhamidBadawy, Sheraton");

        assertEquals("Your Address is incorrect",test.changeAddress("$1, North Street, Chennai @ 11"));

        /*assertThrows(InputMismatchException.class,() -> {
            test.changeAddress("$1, North Street, Chennai @ 11");
        });*/
    }
    //TC3
    @Test
    public void changeaddress3(){
        User test= new User();
        test.setAddress("16, AbdelhamidBadawy, Sheraton");
        assertEquals("Your Address is incorrect",test.changeAddress(""));
        /*assertThrows(InputMismatchException.class,() -> {
            test.changeAddress("");
        });*/
    }
    //TC4
    @Test
    public void changeaddress4(){
        User test= new User();
        test.setAddress("16, AbdelhamidBadawy, Sheraton");
        assertEquals("Your Address is incorrect",test.changeAddress("$$$$^"));

        /*assertThrows(InputMismatchException.class,() -> {
            test.changeAddress("$$$$^");
        });*/
    }
    //TC5
    @Test
    public void changeaddress5(){
        User test= new User();
        test.setAddress("16, AbdelhamidBadawy, Sheraton");
        assertEquals("true",test.changeAddress("12, Mazhar Ashour, El Nozha"));
    }

}
