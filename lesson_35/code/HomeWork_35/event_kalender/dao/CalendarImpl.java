package HomeWork_35.event_kalender.dao;

import ClassWork_035.album.model.Photo;
import HomeWork_35.event_kalender.model.Event;

import java.time.LocalDate;

public class CalendarImpl implements Calendar {

    @Override
    public boolean addEvent(Event event) {
        return false;
    }

    @Override
    public boolean removeEvent(int eventId) {
        return false;
    }

    @Override
    public boolean updateEvent(int eventId) {
        return false;
    }

    @Override
    public Photo getEventFromCalendar(int eventId) {
        return null;
    }

    @Override
    public Event[] getAllEventFromCalendar(int eventId) {
        return new Event[0];
    }

    @Override
    public Event[] getEventBeetwenDate(LocalDate dateFrom, LocalDate dateTo) {
        return new Event[0];
    }

    @Override
    public int size() {
        return size();
    }
}
