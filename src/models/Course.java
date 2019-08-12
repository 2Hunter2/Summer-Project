package models;
import javax.persistence.*;

@Entity
public class Course {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    public Long courseId;
    public String className;
    public Double classTime;
    public String schedule;
    public Teacher teacher;
}