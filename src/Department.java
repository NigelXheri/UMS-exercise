public class Department {

    // 1. Attributes
    private String departmentName;
    private String location;
    private int numberOfFaculty;
    private String departmentHead;

    // 2. Constructors
    public Department() {
        this.departmentName = "";
        this.location = "";
        this.numberOfFaculty = 0;
        this.departmentHead = "";
    }

    public Department(String departmentName, String location, int numberOfFaculty, String departmentHead) {
        this.departmentName = departmentName;
        this.location = location;
        this.numberOfFaculty = numberOfFaculty;
        this.departmentHead = departmentHead;
    }

    // 3. Getters / Setters
    public String getDepartmentName() {
        return departmentName;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfFaculty() {
        return numberOfFaculty;
    }

    public String getDepartmentHead() {
        return departmentHead;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNumberOfFaculty(int numberOfFaculty) {
        this.numberOfFaculty = numberOfFaculty;
    }

    public void setDepartmentHead(String departmentHead) {
        this.departmentHead = departmentHead;
    }

    // 4. toString()
    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", location='" + location + '\'' +
                ", numberOfFaculty=" + numberOfFaculty +
                ", departmentHead='" + departmentHead + '\'' +
                '}';
    }

    // 5. Other Methods
    public void addFaculty(){
        numberOfFaculty++;
    }

    public boolean removeFaculty(){
        if (numberOfFaculty <= 0){
            System.out.println("Cannot remove faculty because there isn't any");
            return false;
        }
        numberOfFaculty--;
        return true;
    }

    public boolean isLargeDepartment(){
        return numberOfFaculty > 20;
    }

}
