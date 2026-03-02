package campuslife;

public abstract class ScheduleItem {

    protected String title;
    protected int daysRemaining;
    protected int estimatedHours;
    protected boolean completed;

    public ScheduleItem(String title, int daysRemaining, int estimatedHours) {
        this.title = title;
        this.daysRemaining = daysRemaining;
        this.estimatedHours = estimatedHours;
        this.completed = false;
    }

    public void markCompleted() {
        this.completed = true;
    }

    public boolean isCompleted() {
        return completed;
    }

    public int getEstimatedHours() {
        return estimatedHours;
    }

    public int getDaysRemaining() {
        return daysRemaining;
    }

    public abstract String getType();
    public abstract int calculatePriority();

    public String getInfo() {
        return "[" + getType() + "] " + title +
                " | Days left: " + daysRemaining +
                " | Hours: " + estimatedHours +
                " | Priority: " + calculatePriority() +
                " | Completed: " + completed;
    }
}
