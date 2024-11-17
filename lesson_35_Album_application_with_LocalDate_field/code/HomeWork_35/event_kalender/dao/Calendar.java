package HomeWork_35.event_kalender.dao;

import ClassWork_035.album.model.Photo;
import HomeWork_35.event_kalender.model.Event;

import java.time.LocalDate;

public interface Calendar {
    boolean addEvent(Event event);
    boolean removeEvent(int eventId);
    boolean updateEvent(int eventId);
    Photo getEventFromCalendar(int eventId);
    Event[] getAllEventFromCalendar(int eventId);
  Event[] getEventBeetwenDate(LocalDate dateFrom, LocalDate dateTo);
    int size();
}
