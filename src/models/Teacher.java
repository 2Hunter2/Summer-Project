package models;
import javax.persistence.*;

@Entity
public class Teacher {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    public Long teacherId;
    public String name, email;
    public Schedule tSchedule;
}