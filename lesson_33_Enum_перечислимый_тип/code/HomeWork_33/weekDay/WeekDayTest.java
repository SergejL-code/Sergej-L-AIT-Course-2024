package HomeWork_33.weekDay;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekDayTest {

    WeekDay[] days = WeekDay.values();


    @Test
    public void testprintWeekend() {
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }
    }

    @Test
    void testFindDay() {
        // expect : Tuesday( adding 1 )
assertEquals (WeekDay.TUE,WeekDay.MON.findDay(1));


    }
}