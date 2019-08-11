package repository;

import models.Schedule;

public class scheduleRepository {
    public static Schedule getSchedule () {
        Schedule s = new Schedule();
        s.classDay = "classDay";
        return s;
    }

    public static void addSchedule (Schedule schedule) {
    }

    public static void deleteSchedule () {
    }

    public static void updateSchedule (Schedule schedule) {
    }
}
