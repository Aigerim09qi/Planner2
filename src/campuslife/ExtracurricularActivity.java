package campuslife;

public class ExtracurricularActivity extends ScheduleItem {

    public ExtracurricularActivity(String title, int daysRemaining, int estimatedHours) {
        super(title, daysRemaining, estimatedHours);
    }

    @Override
    public String getType() {
        return "Activity";
    }

    @Override
    public int calculatePriority() {
        if (completed) return 0;
        return daysRemaining <= 2 ? 5 : 1;
    }

    @Override
    public String getInfo() {
        return "⭐ " + super.getInfo();
    }
}