import java.time.LocalDate;

public class Student {

    private static int baseId = 100;
    private final int studentId;
    private String name;
    private double gpa;
    private final int enrollmentYear;


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

    public String toString(){
        return "Student: " + this.name + " with id " + studentId + " enrolled in " + enrollmentYear + " has a GPA of " + this.gpa;
    }


    public boolean updateGpa(double gpa){
        if (gpa < 0.0 || gpa > 4.0) return false;
        this.gpa = gpa;
        return true;
    }

    public void calculateAcademicStanding(){
        if (this.gpa < 0.0 || this.gpa > 4.0) {
            System.out.println("GPA is invalid");
        }
        else if (this.gpa >= 2.0){
            System.out.println("Good Standing");
            return;
        }
        else if (this.gpa >= 1.5 && this.gpa < 2.0) {
            System.out.println("Academic Probation");
        }
        else{
            System.out.println("Academic Warning");
        }


    }


}
