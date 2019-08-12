package repository;

import models.AssignmentType;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class assignmentTypeRepository {
    private static EntityManager entityManager;
    public void assignmentTypeRepository (){
        entityManager = Persistence.createEntityManagerFactory("assignmentType").createEntityManager();
    }
    public static AssignmentType getAssignment (Long assignmentId) {
    return entityManager.find(AssignmentType.class, assignmentId);
    }

    public static void addAssignmentType (AssignmentType assignmentType) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(assignmentType);
        transaction.commit();
    }

    public static void deleteAssignmentType (Long assignmentId) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        AssignmentType at = entityManager.find(AssignmentType.class, assignmentId);
        entityManager.remove(at);
        transaction.commit();
    }

    public static void updateAssignmentType (AssignmentType assignmentType) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        AssignmentType at = entityManager.find(AssignmentType.class, assignmentType.assignmentId);
        at.color = assignmentType.color;
        at.description = assignmentType.description;
        entityManager.merge (at);
        transaction.commit();
    }
}