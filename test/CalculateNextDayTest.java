import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculateNextDayTest {

    @Test
    void getNextDay() {
        Date today = new Date(2018, Calendar.JANUARY , 31);
        Date expected = new Date(2018, Calendar.FEBRUARY, 1);


        Date result = CalculateNextDay.getNextDay(today);
        assertEquals(expected.toString(), result.toString());
    }
    @Test
    void getNextDay1() {
        Date today = new Date(2018, 2 , 28);
        Date expected = new Date(2018,3, 1);


        Date result = CalculateNextDay.getNextDay(today);
        assertEquals(expected.toString(), result.toString());
    }
    @Test
    void getNextDay2() {
        Date today = new Date(2018,1 , 1);
        Date expected = new Date(2018,1, 2);


        Date result = CalculateNextDay.getNextDay(today);
        assertEquals(expected.toString(), result.toString());
    }
    @Test
    void getNextDay3() {
        Date today = new Date(2018, 4 , 30);
        Date expected = new Date(2018, 5, 1);


        Date result = CalculateNextDay.getNextDay(today);
        assertEquals(expected.toString(), result.toString());
    }
}