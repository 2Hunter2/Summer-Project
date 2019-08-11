package repository;

import models.AssignmentType;

public class assignmentTypeRepository {
    public static AssignmentType getAssignment (String assignmentId) {
        AssignmentType a = new AssignmentType();
        a.assignmentId = assignmentId;
        a.color = "color";
        a.description = "description";
        return a;
    }

    public static void addAssignmentType (AssignmentType assignmenttype) {
    }

    public static void deleteAssignmentType (String assignmentId) {
    }

    public static void updateAssignmentType (AssignmentType assignmenttype) {
    }
}
