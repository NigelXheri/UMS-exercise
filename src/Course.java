public class Course {

    // 1. Attributes
    private String courseCode;
    private String courseName;
    private int credits;
    private String semester;

    // 2. Constructors
    public Course(){
        this.courseCode = "";
        this.courseName = "";
        this.credits = 0;
        this.semester = "";
    }
    public Course(String courseCode, String courseName, int credits, String semester){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.semester = semester;
    }

    // 3. Getters / Setters
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    // 4. toString()
    @Override
    public String toString(){
        return "This is course " + courseName + " of the " + semester + " semester codenamed " + courseCode + " with " + credits + " ECTS ";
    }

    // 5. Other Methods
    public void displayCourseInfo(){
        System.out.println(this.toString());
    }

    public boolean isFullCourse(){
        return credits >= 3;
    }

    public String getFullCourseName(){
        return courseCode + ": " + courseName + " | " + credits + " ECTS";
    }

}
