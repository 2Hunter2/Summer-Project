package repository;

import models.Schedule;
import models.Teacher;

public class teacherRepository {
    public static Teacher getTeacher (int id) {
        Teacher t = new Teacher();
        t.id = id;
        t.name = "name";
        t.email = "email";
        t.tSchedule = new Schedule();
        return t;
    }

    public static void addTeacher (Teacher teacher) {
    }

    public static void deleteTeacher (int id) {
    }

    public static void updateTeacher (Teacher teacher) {
    }


}
