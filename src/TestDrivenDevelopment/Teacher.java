package TestDrivenDevelopment;

public class Teacher {
    GradeBook gradeBook = new GradeBook();


    public static void main(String[] args) {
        Subject math = new Subject("Math");
        Subject physics = new Subject("Physics");
        Subject chemistry = new Subject("Chemistry:");
        math.addGrade(5);
        math.addGrade(5);
        math.addGrade(1);
        physics.addGrade(5);
        physics.addGrade(5);
        physics.addGrade(4);
        chemistry.addGrade(4);
        System.out.println("Math: " + math.calculateAverage());
        System.out.println("Physics: " + physics.calculateAverage());
        System.out.println("Chemistry: " + chemistry.calculateAverage());
    }
}
