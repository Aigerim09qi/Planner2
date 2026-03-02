package campuslife;

public class CourseworkTask extends ScheduleItem {

    public CourseworkTask(String title, int daysRemaining, int estimatedHours) {
        super(title, daysRemaining, estimatedHours);
    }

    @Override
    public String getType() {
        return "Coursework";
    }

    @Override
    public int calculatePriority() {
        if (completed) return 0;
        return estimatedHours / Math.max(daysRemaining, 1);
    }
}
