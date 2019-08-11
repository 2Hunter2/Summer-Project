package repository;

import models.AssignmentType;
import models.Assignment;

public class assignmentRepository {
    public static Assignment getAssignment () {
        Double dueTime = null;
        Double eworkTime = null;
        Double aWorkTime = null;
        double weight = 0;
        Assignment as = new Assignment();
        as.aTitle = "Title";
        as.aDescription = "Description";
        as.dueDay = "Due date";
        as.materials = "Materials";
        as.workDay = "Work day";
        as.eGrade = "Expected grade";
        as.aGrade = "Actual grade";
        as.completion = "Completion";
        as.dueTime = dueTime;
        as.eWorkTime = eworkTime;
        as.aWorkTime = aWorkTime;
        as.weight = weight;
        as.aType = new AssignmentType ();
        return as;
    }

    public static void addAssignment () {
    }

    public static void deleteAssignment () {
    }

    public static void updateAssignment () {
    }


}
