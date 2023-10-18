package bit_manipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlightBookingTest {

    @Test
    void BookingTest() {
        int bookings = 0;
        for (int i = 0; i < 31; i++) {
            boolean actual = FlightBooking.isSeatAvailable(bookings, i);
            boolean expect = false;

            assertEquals(expect,actual);

            bookings = FlightBooking.bookSeat(bookings,i);

            actual = FlightBooking.isSeatAvailable(bookings, i);
            expect = true;

            assertEquals(expect,actual);
        }
    }
}