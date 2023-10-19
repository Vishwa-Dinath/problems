package bit_manipulation;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class BitFields {
    static int LOG_DATE = 0b00000001;
    static int LOG_TIME = 0b00000010;
    static int LOG_ID =   0b00000100;

    public static void main(String[] args) {
        logMessage("Hello",1);
        logMessage("How are you",2);
        logMessage("Hi..!",3);
        logMessage("dddddddd",4);
        logMessage("dddddddd",5);
        logMessage("dddddddd",7);
    }

    public static void logMessage(String msg,int options) {
        if ((options & LOG_DATE)==1){
            System.out.print(LocalDate.now()+" ");
        }
        if ((options & LOG_TIME)==2){
            System.out.print(LocalTime.now()+" ");
        }
        if ((options & LOG_ID) == 4) {
            System.out.print("ID ");
        }
        System.out.print(msg);
        System.out.println();
    }
}
