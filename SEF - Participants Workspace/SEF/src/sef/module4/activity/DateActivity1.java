package activity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateActivity1 {
    public static void main(String[] args) {
        Date d = new Date();
        //Display today's date
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Today's date is: " + formatter.format(d));

    }


}
