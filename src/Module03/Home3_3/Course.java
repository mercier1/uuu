package Module03.Home3_3;

public class Course {
    private int startDate;
    private  String name;
    private int hoursDuration;
    private String teacherName;

    public Course(int startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }

    public Course(int hourseDuration, String name, String teacherName) {
        this.hoursDuration = hourseDuration;
        this.name = name;
        this.teacherName = teacherName;
    }

    public Course() {
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
