package models;
import javax.persistence.*;

@Entity
public class Schedule {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    public Long scheduleId;
    public String classDay;
}
