public class Course {

    // 1. Attributes
    private String courseCode;
    private String courseName;
    private int credits;
    private String semester;
    private Professor instructor;
    private Classroom location;

    // 2. Constructors
    public Course(){
        this.courseCode = "";
        this.courseName = "";
        this.credits = 0;
        this.semester = "";
        this.instructor = null;
    }
    public Course(String courseCode, String courseName, int credits, String semester){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.semester = semester;
        this.instructor = null;
        this.location = null;
    }
    public Course(String courseCode, String courseName, int credits, String semester, Professor instructor){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.semester = semester;
        this.instructor = instructor;
        this.location = null;
    }
    public Course(String courseCode, String courseName, int credits, String semester, Professor instructor, Classroom location){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.semester = semester;
        this.instructor = instructor;
        this.location = location;
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

    public Professor getInstructor() {
        return instructor;
    }

    public Classroom getClassroom(){
        return location; // getClassroom() gets variable location
    }

    // 4. toString()
    @Override
    public String toString(){
        return "This is course " + courseName + " of the " + semester + " semester codenamed " + courseCode + " with " + credits + " ECTS - instructed by " + instructor.getName() + " in classroom " + location;
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

    public void assignProfessor(Professor p){
        this.instructor = p;
    }

    public String getInstructorName(){
        if (instructor == null) return "Not Assigned";
        return instructor.getName();
    }

    public void assignClassroom(Classroom c){
        this.location = c;
    }

    public String getClassroomLocation(){
        return location.getFullLocation();
    }

}
