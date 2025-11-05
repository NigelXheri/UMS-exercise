public class Professor {

    // 1. Attributes
    private static int baseId = 1;
    private int employeeID;
    private String name;
    private String specialization;
    private int yearsOfExperience;

    // 2. Constructors
    public Professor() {
        this.employeeID = baseId++;
        this.name = "";
        this.specialization = "";
        this.yearsOfExperience = 0;
    }
    public Professor(String name, String specialization, int yearsOfExperience){
        this.employeeID = baseId++;
        this.name = name;
        this.specialization = specialization;
        this.yearsOfExperience = yearsOfExperience;
    }

    // 3. Getters / Setters
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    // 4. toString()
    @Override
    public String toString(){
        return "Employee " + name + " specialized in " + specialization + " has " + yearsOfExperience +" years of experience.";
    }

    // 5. Other Methods
    public boolean isExpreienced(){
        return yearsOfExperience > 5;
    }

    public String getAcademicTitle(){
        if (isExpreienced()){
            return (yearsOfExperience <= 10) ?  "Associate Professor" : "Professor";
        }
        return "Assistant Professor";
    }


}
