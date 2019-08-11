package repository;

import models.Course;
import models.Teacher;
import models.Schedule;

public class courseRepository {
    private static Double classTime;

    public static Course getCourse (){
        Course c = new Course();
        c.className = "Class name";
        c.classTime = classTime;
        c.schedule = "schedule";
        c.teacher = new Teacher ();
        return c;
    }

    public static void addCourse (Course course) {
    }

    public static void deleteCourse () {
    }

    public static void updateCourse (Course course) {
    }
}
