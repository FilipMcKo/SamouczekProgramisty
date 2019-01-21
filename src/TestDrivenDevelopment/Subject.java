package TestDrivenDevelopment;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    public String name;
    private List<Integer> grades;

    public Subject(String name) {
        this.name = name;
        grades =new ArrayList<>();
    }

    public boolean addGrade(Integer grade){
        return grades.add(grade);
    }

    public List<Integer> getGrades(){
        return grades;
    }

    public double calculateAverage(){
        double average = grades.stream().mapToDouble(i -> i.doubleValue()).sum() / grades.size()*100;
        average = Math.round(average);
        return average/100;
    }
}
