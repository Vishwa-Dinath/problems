package bit_manipulation;

public class FlightBooking {

    public static void main(String[] args) {
        int bookings = 0;
//        System.out.println(isSeatAvailable(bookings,5));;
//        bookings=bookSeat(bookings, 5);
//        System.out.println(isSeatAvailable(bookings,5));
        System.out.println(isSeatAvailable(bookings,30));
        bookings = bookSeat(bookings, 30);
        System.out.println(isSeatAvailable(bookings,30));
    }

    public static boolean isSeatAvailable(int bookings, int seat) {
        int shifted = bookings >> seat;
        return (shifted & 1) == 1;
    }

    public static int bookSeat(int bookings, int seat) {
        int mask = 1 << seat;
        return bookings | mask;
    }
}
