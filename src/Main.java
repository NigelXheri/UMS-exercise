import org.w3c.dom.ls.LSOutput;

public class Main{

    public static void main(String[] args){

        System.out.println(
            " _   _       _                    _ _          ___  ___                                                  _     _____           _                 \n" +
            "│ │ │ │     (_)                  (_) │         │  ╲╱  │                                                 │ │   ╱  ___│         │ │                \n" +
            "│ │ │ │_ __  ___   _____ _ __ ___ _│ │_ _   _  │ .  . │ __ _ _ __   __ _  __ _  ___ _ __ ___   ___ _ __ │ │_  ╲ `──. _   _ ___│ │_ ___ _ __ ___  \n" +
            "│ │ │ │ '_ ╲│ ╲ ╲ ╱ ╱ _ ╲ '__╱ __│ │ __│ │ │ │ │ │╲╱│ │╱ _` │ '_ ╲ ╱ _` │╱ _` │╱ _ ╲ '_ ` _ ╲ ╱ _ ╲ '_ ╲│ __│  `──. ╲ │ │ ╱ __│ __╱ _ ╲ '_ ` _ ╲ \n" +
            "│ │_│ │ │ │ │ │╲ V ╱  __╱ │  ╲__ ╲ │ │_│ │_│ │ │ │  │ │ (_│ │ │ │ │ (_│ │ (_│ │  __╱ │ │ │ │ │  __╱ │ │ │ │_  ╱╲__╱ ╱ │_│ ╲__ ╲ ││  __╱ │ │ │ │ │\n" +
            " ╲___╱│_│ │_│_│ ╲_╱ ╲___│_│  │___╱_│╲__│╲__, │ ╲_│  │_╱╲__,_│_│ │_│╲__,_│╲__, │╲___│_│ │_│ │_│╲___│_│ │_│╲__│ ╲____╱ ╲__, │___╱╲__╲___│_│ │_│ │_│\n" +
            "                                         __╱ │                            __╱ │                                       __╱ │                      \n" +
            "                                        │___╱                            │___╱                                       │___╱                       \n" +
            "================================================================================================================================================="
        );

        // ============================= ACTUAL CODE =============================


        Course cPhy = new Course("PHY151", "Physics 1", 6, "Fall 2025");
        Course cMth = new Course("MTH151", "Calculus 1", 6, "Fall 2025");
        System.out.println(cPhy.getFullCourseName());
        cMth.displayCourseInfo();

        Student sEni = new Student("Eni Mera", 3.5, 2025);
        Student sHysni = new Student("Hysni Bega", 2.8, 2025);
        System.out.println(sEni);
        System.out.println(sHysni);
        sHysni.updateGpa(1.0);
        System.out.println(sHysni);
        sHysni.updateGpa(-3.8);
        System.out.println(sHysni);

        Professor pAlan = new Professor("Alan Turing", "Cryptography", 90);
        Professor pCharles = new Professor("Charles Babbage", "Mathematics", 6);
        System.out.println(pAlan);
        System.out.println(pAlan.getAcademicTitle());
        System.out.println(pCharles);

        Classroom a1 = new Classroom("A1", "G3", 120, true);
        Classroom c1 = new Classroom("C1", "G3", 15, true);
        System.out.println(a1);
        System.out.println(c1);
        c1.displayClassroomInfo();
        if (c1.isLargeRoom())   System.out.println("This classroom is large");
        else System.out.println("This classroom is small");

        Department dep1 = new Department("Engineering", "Building 2", 4, "Linus Torvalds");
        dep1.addFaculty();
        System.out.println("The nubmer of faculty is now " + dep1.getNumberOfFaculty());
        int iterations = dep1.getNumberOfFaculty();
        for (int i = 0; i <= iterations; i++){
            dep1.removeFaculty();
            System.out.println(dep1.getNumberOfFaculty()); // Tries to remove one more than there are available
        }



    }
}