package models;
import javax.persistence.*;

@Entity
public class Assignment {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    public Long aId;
    public String aTitle, aDescription, dueDay, materials, workDay, eGrade, aGrade, completion;
    public double dueTime, eWorkTime, aWorkTime, weight;
    public AssignmentType aType;
}