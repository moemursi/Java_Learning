import java.sql.Date;

//Appointment class
public class Appointment {
    private String description;
    private String location;
    private String contact;
    private String url;
    private Date start;
    private Date end;
    
    public Appointment(String description, String location, String contact, String url, Date start, Date end) {
        this.description = description;
        this.location = location;
        this.contact = contact;
        this.url = url;
        this.start = start;
        this.end = end;
    }
    
    public String getDescription() {
        return description;
    }
    
    public String getLocation() {
        return location;
    }
    
    public String getContact() {
        return contact;
    }
    
    public String getUrl() {
        return url;
    }
    
    public Date getStart() {
        return start;
    }
    
    public Date getEnd() {
        return end;
    }
    
    public String toString() {
        return description + " (" + start + "-" + end + ")";
    }
    
}
