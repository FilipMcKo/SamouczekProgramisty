package test.TestDrivenDevelopment;

import TestDrivenDevelopment.GradeBook;
import TestDrivenDevelopment.Subject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeBookTest {
    GradeBook gradebook;
    Subject math;

    @BeforeEach
    public void setUp() {
        gradebook = new GradeBook();
        math = new Subject("Math");
        gradebook.addSubject(math);
    }

    @Test
    void shouldCheckIfGradeBookContainsSubject() {
        assertTrue(gradebook.contains(math));
    }

    @Test
    void shouldGetSubjectFromGradeBookByName(){
        assertEquals(gradebook.getSubject("Math"), math);
    }

    @Test
    void shouldntReturnSubjectIfNameIsWrong(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                ()-> gradebook.getSubject("Physics"));
        assertEquals("No such subject in this gradebook", exception.getMessage());
    }

    @Test
    void shouldCalculateAverageGradeOfAllSubjectsInGradeBook(){
        Subject physics = new Subject("Physics");
        gradebook.addSubject(physics);
        Subject chemistry = new Subject("Chemistry:");
        gradebook.addSubject(chemistry);
        math.addGrade(1);
        math.addGrade(4);
        math.addGrade(3);
        physics.addGrade(5);
        physics.addGrade(1);
        physics.addGrade(2);
        chemistry.addGrade(4);
        assertEquals(2.86, gradebook.calculateAverage());
    }

}