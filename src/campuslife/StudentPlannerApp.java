package campuslife;

import java.util.ArrayList;
import java.util.List;

public class StudentPlannerApp {

    public static void main(String[] args) {

        List<ScheduleItem> planner = new ArrayList<>();

        planner.add(new CourseworkTask("Java OOP Project", 3, 6));
        planner.add(new ExamStudySession("Math Midterm", 5, 10));
        planner.add(new ExtracurricularActivity("Debate Club Meeting", 1, 2));

        System.out.println("=== All Schedule Items ===");
        for (ScheduleItem item : planner) {
            System.out.println(item.getInfo());
        }

        planner.get(0).markCompleted();

        System.out.println("\n=== After Completing First Item ===");
        for (ScheduleItem item : planner) {
            System.out.println(item.getInfo());
        }

        int totalRemaining = 0;
        for (ScheduleItem item : planner) {
            if (!item.isCompleted()) {
                totalRemaining += item.getEstimatedHours();
            }
        }

        System.out.println("\nTotal remaining hours: " + totalRemaining);

        ScheduleItem mostImportant = null;
        int highestPriority = -1;

        for (ScheduleItem item : planner) {
            if (!item.isCompleted() && item.calculatePriority() > highestPriority) {
                highestPriority = item.calculatePriority();
                mostImportant = item;
            }
        }

        if (mostImportant != null) {
            System.out.println("Most urgent item: " + mostImportant.getInfo());
        }
    }
}
