package ourpackage;

import java.util.Calendar;
import java.util.Date;

public class Certificate {
    private double amountofcert;
    private Date timing;
    private final double interest = 0.18;


    public Certificate(double amountofcert, Date timing) {
        this.amountofcert = amountofcert;
        this.timing = timing;
    }



    public void setTiming(Date timing) {
        this.timing = timing;
    }

    public double getAmountofcert() {
        return amountofcert;
    }

    public void setAmountofcert(double amountofcert) {
        this.amountofcert = amountofcert;
    }

    public Date getTiming() {
        return timing;
    }
    public Date calculateTiming(Certificate certificate ,Date timing){
        Calendar cal = Calendar.getInstance();
        Date today = timing;
        cal.add(Calendar.YEAR, 1); // to get previous year add -1
        Date nextYear = cal.getTime();
        return nextYear;
    }

    public double getInterest() {
        return interest;
    }
}
