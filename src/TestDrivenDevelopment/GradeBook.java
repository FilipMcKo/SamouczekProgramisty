package TestDrivenDevelopment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class GradeBook {
    private Set<Subject> subjects;
    private int id;
    private static int counter = 0;

    public GradeBook() {
        this.subjects = new HashSet<>();
        this.id = ++counter;
    }

    public void addGrade(Integer grade, Subject subject){
        subject.addGrade(grade);
    }

    public void addSubject(Subject subject){
        subjects.add(subject);
    }

    public boolean contains(Subject subject){
        return subjects.contains(subject);
    }

    public Subject getSubject(String subjectName){
        for (Subject subject : subjects) {
            if(subject.name.equals(subjectName)) return subject;
        }
        throw new IllegalArgumentException("No such subject in this gradebook");
    }

    public double calculateAverage(){
        List<Integer> collect = subjects.stream().flatMap(subject -> subject.getGrades().stream()).collect(Collectors.toList());
        double average = (collect.stream().mapToDouble(i -> i.doubleValue()).sum()) / collect.size()*100;
        average = Math.round(average);
        return average/100;
    }


}
