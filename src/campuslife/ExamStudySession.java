package campuslife;

public class ExamStudySession extends ScheduleItem {

    public ExamStudySession(String title, int daysRemaining, int estimatedHours) {
        super(title, daysRemaining, estimatedHours);
    }

    @Override
    public String getType() {
        return "Exam Study";
    }

    @Override
    public int calculatePriority() {
        if (completed) return 0;
        return (estimatedHours * 2) / Math.max(daysRemaining, 1);
    }
}
