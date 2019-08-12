package models;
import javax.persistence.*;

@Entity
public class AssignmentType{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    public Long assignmentId;
    public String color, description;
}