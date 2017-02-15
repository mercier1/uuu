package Module03.Home3_3;

public class CollegeStudent extends Student {
    private String collegeName;
    private int rating;
    private long id;

    public CollegeStudent(String firstName, String lastName, int group, Course[] coursesTaken, int age) {
        super(firstName, lastName, group, coursesTaken, age);
    }

    public CollegeStudent(String collegeName, int rating, long id) {
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    public CollegeStudent() {

    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}


