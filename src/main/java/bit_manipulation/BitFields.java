package bit_manipulation;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class BitFields {
    static int LOG_DATE = 0x01; // 0b00000001;
    static int LOG_TIME = 0x02; //0b00000010;
    static int LOG_ID =   0x04; // 0b00000100;  <--- we use hex values to easily represent binary values in the code. 

    public static void main(String[] args) {
        logMessage("Hello",1); // <- no need to hard code 
        logMessage("hello test", LOG_DATE); // use the constant 
        logMessage("How are you",2);
        logMessage("Hello test 3", LOG_DATE | LOG_ID); // we can also combine options together via the 'or' operator 
        logMessage("Hi..!",3);
        logMessage("dddddddd",4);
        logMessage("dddddddd",5);
        logMessage("dddddddd",7);
    }

     public static boolean checkBit(int options, int option){
        return (options & option) > 0;
    }
    
    public static void logMessage(String msg,int options) {
        /*if ((options & LOG_DATE)==1){  // <-- this comparision is not needed 
            System.out.print(LocalDate.now()+" ");
        }*/ 
  
        if (checkBit(options, LOG_DATE))  //<-- this is more clear (try to spot duplicating logic/comparisons and creat a function to capture them, so we can re-use)  
            System.out.print(LocalDate.now() + " ");  //<-- much more clear if you use the StringBuilder class to build the log message 
        
        if ((options & LOG_TIME)==2){ //<-- don't hard code 
            System.out.print(LocalTime.now()+" ");
        }
        if ((options & LOG_ID) == 4) {
            System.out.print("ID ");
        }
        System.out.print(msg);
        System.out.println();
    }
}
