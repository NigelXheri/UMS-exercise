import java.time.LocalDate;

public class Student {

    // 1. Attributes
    private static int baseId = 100;
    private final int studentId;
    private String name;
    private double gpa;
    private final int enrollmentYear;

    // 2. Constructors
    public Student(){
        this.studentId = baseId++;
        this.name = "";
        this.gpa = 0.0;
        this.enrollmentYear = LocalDate.now().getYear();
    }
    public Student(String name, double gpa, int enrollmentYear){
        if (gpa < 0.0 || gpa > 4.0) throw new IllegalArgumentException("GPA value is invalid.");
        this.studentId = baseId++;
        this.name = name;
        this.gpa = gpa;
        this.enrollmentYear = enrollmentYear;
    }

    // 3. Getters / Setters
    public int getStudentId() {
        return studentId;
    }

    public String getName(){
        return name;
    }

    public double getGpa(){
        return gpa;
    }

    public int getEnrollmentYear(){
        return enrollmentYear;
    }

    public void setName(String name){
        this.name = name;
    }

    // 4. toString()
    @Override
    public String toString(){
        return "Student: " + name + " with id " + studentId + " enrolled in " + enrollmentYear + " has a GPA of " + gpa;
    }

    // 5. Other Methods
    private boolean isGpaValid(){
        return (gpa >= 0.0 && gpa <= 4.0);
    }

    public boolean updateGpa(double gpa){
        if (!isGpaValid()){ return false;}
        this.gpa = gpa;
        return true;
    }

    public void calculateAcademicStanding(){
        if (!isGpaValid()){
            System.out.println("GPA is invalid");
        }
        else if (gpa >= 2.0){
            System.out.println("Good Standing");
        }
        else if (gpa >= 1.5) {
            System.out.println("Academic Probation");
        }
        else{
            System.out.println("Academic Warning");
        }
    }


}
