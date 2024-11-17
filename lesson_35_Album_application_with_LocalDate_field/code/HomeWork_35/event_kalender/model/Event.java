package HomeWork_35.event_kalender.model;

import java.time.LocalDate;
import java.util.Objects;

public class Event {

    private String eventId;
    private String title;
    private String url;
    private LocalDate data;

    public Event(String eventId, String title, String url, LocalDate data) {
        this.eventId = eventId;
        this.title = title;
        this.url = url;
        this.data = data;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event event)) return false;
        return Objects.equals(eventId, event.eventId) && Objects.equals(data, event.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, data);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Event{");
        sb.append("eventId='").append(eventId).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
